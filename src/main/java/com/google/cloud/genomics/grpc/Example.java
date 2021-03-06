package com.google.cloud.genomics.grpc;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.util.Utils;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.auth.oauth2.UserCredentials;
import com.google.genomics.v1.ReferenceServiceV1Grpc;
import com.google.genomics.v1.ReferenceServiceV1Grpc.ReferenceServiceV1BlockingStub;
import com.google.genomics.v1.ReferenceSet;
import com.google.genomics.v1.SearchReferenceSetsRequest;
import com.google.genomics.v1.SearchReferenceSetsResponse;
import com.google.genomics.v1.StreamVariantsRequest;
import com.google.genomics.v1.StreamVariantsResponse;
import com.google.genomics.v1.StreamingVariantServiceGrpc;
import com.google.genomics.v1.StreamingVariantServiceGrpc.StreamingVariantServiceBlockingStub;

import io.grpc.Channel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

public class Example {
  private static GoogleCredentials getCreds() throws FileNotFoundException, IOException {
      final String clientSecretsJson = "client_secrets.json";
    try {
      final File userDir = new File(
          System.getProperty("user.home"),
          String.format(".store/%s", "gRPCExample"));
      final GoogleClientSecrets secrets = GoogleClientSecrets.load(
          Utils.getDefaultJsonFactory(), 
          new FileReader(clientSecretsJson));
      final GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow
          .Builder(
              Utils.getDefaultTransport(),
              Utils.getDefaultJsonFactory(),
              secrets,
              Arrays.asList("https://www.googleapis.com/auth/genomics"))
          .setDataStoreFactory(new FileDataStoreFactory(userDir))
          .setAccessType("offline")
          .setApprovalPrompt("force")
          .build();
      final AuthorizationCodeInstalledApp authCode = 
          new AuthorizationCodeInstalledApp(flow, new LocalServerReceiver());
      Credential cred = authCode.authorize(System.getProperty("user.name"));
      cred.refreshToken();
      UserCredentials userCredentials = new UserCredentials(
          secrets.getInstalled().getClientId(),
          secrets.getInstalled().getClientSecret(),
          cred.getRefreshToken());
      
      return userCredentials;
    } catch (FileNotFoundException fex) {
      System.out.println("Expecting to find " + clientSecretsJson +
          " file in " + 
          "this directory and use it for authentication.\n" +
          "Please make sure your project is whitelisted for gRPC access and\n" +
          "generate and download JSON key for your service account.\n" +
          "You can do that in API & Auth section of the Developer Console.");
      return null;
    }
  }
  
  public static void main(String[] args) throws Exception {
    GoogleCredentials creds = getCreds();
    if (creds == null) {
      return;
    }
    
    Channel channel = Channels.fromCreds(creds);

    // Regular RPC example: list all reference set assembly ids.
    ReferenceServiceV1BlockingStub refStub =
        ReferenceServiceV1Grpc.newBlockingStub(channel);
    SearchReferenceSetsRequest request =
        SearchReferenceSetsRequest.newBuilder().build();
    SearchReferenceSetsResponse response = refStub.searchReferenceSets(request);
    for (ReferenceSet rs : response.getReferenceSetsList()) {
      System.out.println(rs.getAssemblyId());
    }

    // Streaming RPC example: request the variants within BRCA1 for the Platinum Genomes variant set.
    StreamingVariantServiceBlockingStub varStub =
        StreamingVariantServiceGrpc.newBlockingStub(channel);
    StreamVariantsRequest varRequest = StreamVariantsRequest.newBuilder()
        .setVariantSetId("3049512673186936334")
        .setReferenceName("chr17")
        .setStart(41196311)
        .setEnd(41277499)
        .build();
    Iterator<StreamVariantsResponse> iter = varStub.streamVariants(varRequest);
    while (iter.hasNext()) {
      StreamVariantsResponse varResponse = iter.next();
      System.out.println("Response:");
      System.out.println(varResponse.toString());
      System.out.println();
    }
    System.out.println("Done");
    System.exit(0);
  }
}
