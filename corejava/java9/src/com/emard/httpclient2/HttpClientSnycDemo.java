package com.emard.httpclient2;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpClientSnycDemo {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder(new URI(
                "https://fakerestapi.azurewebsites.net/api/v1/Activities"))
                .GET().build();
        HttpResponse<String> response = client.send(
                request, BodyHandlers.ofString());
        System.out.println("status= "+response.statusCode());
        System.out.println("body= "+response.body());

        request = HttpRequest.newBuilder(new URI(
                "https://fakerestapi.azurewebsites.net/api/v1/Activities"))
                .POST(BodyPublishers.ofString("{\n" +
                        "  \"id\": 245,\n" +
                        "  \"title\": \"Hey You\",\n" +
                        "  \"dueDate\": \"2023-01-06T18:35:37.599Z\",\n" +
                        "  \"completed\": true\n" +
                        "}")).header("Content-Type", "application/json")
                .build();
        response = client.send(
                request, BodyHandlers.ofString());
        System.out.println("status= "+response.statusCode());
        System.out.println("body= "+response.body());
        System.out.println(response.headers().map());
    }
}
