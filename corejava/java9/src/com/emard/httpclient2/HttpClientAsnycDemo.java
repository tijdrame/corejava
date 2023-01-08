package com.emard.httpclient2;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HttpClientAsnycDemo {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException, ExecutionException {
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder(new URI(
                "https://fakerestapi.azurewebsites.net/api/v1/Activities"))
                .POST(BodyPublishers.ofString("{\n" +
                        "  \"id\": 245,\n" +
                        "  \"title\": \"Hey You\",\n" +
                        "  \"dueDate\": \"2023-01-06T18:35:37.599Z\",\n" +
                        "  \"completed\": true\n" +
                        "}")).header("Content-Type", "application/json")
                .build();
        CompletableFuture<HttpResponse<String>> response = client.sendAsync(
                request, BodyHandlers.ofString());
        Integer status = response.thenApply(HttpResponse::statusCode).get();
        String body = response.thenApply(HttpResponse::body).get();
        System.out.println("status= "+status);
        System.out.println("body= "+body);
    }
}
