package com.kodtodya.practice.httpClient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodySubscribers;
import java.nio.charset.Charset;
import java.util.concurrent.CompletableFuture;

public class HttpClientGetDemo {

    private static final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2).build();

    public static void main(String[] args) {
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://reqres.in/api/users?page=2"))
                .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
                .build();

        // ----------------- sync execution ----------------------//
        HttpHeaders headers = null;
        HttpResponse<String> response = null;
        try {
            response = httpClient.send(request,
                    responseInfo -> responseInfo.statusCode() == 200 ?
                            BodySubscribers.ofString(Charset.defaultCharset()) :
                            BodySubscribers.replacing("Something went wrong here..!")
            );
            headers = response.headers();
        } catch (IOException | InterruptedException exception) {
            System.err.println("Exception observed : " + exception.getMessage());
        }

        // print response headers
        System.out.println();
        System.out.println(System.lineSeparator());
        System.out.println("// ----------------- sync execution ----------------------//");
        headers.map().forEach((key, value) -> System.out.println(key + ":" + value));

        // print status code
        System.out.println("Sync execution response code : " + response.statusCode());

        // print response body
        System.out.println("Sync execution response body:\n" + response.body());
        System.out.println();
        System.out.println(System.lineSeparator());
        System.out.println("// ----------------- async execution ----------------------//");
        // ----------------- async execution ----------------------//

        CompletableFuture<HttpResponse<String>> responseFuture = null;
        try {
            responseFuture = httpClient.sendAsync(request,
                    responseInfo -> responseInfo.statusCode() == 200 ?
                            BodySubscribers.ofString(Charset.defaultCharset()) :
                            BodySubscribers.replacing("Something went wrong here..!"));

        } catch (Exception exception) {
            System.err.println("Exception observed : " + exception.getMessage());
        }
        responseFuture.thenApply(HttpResponse::body)
                .exceptionally(exception -> "Something went wrong again..!!")
                .thenAccept(System.out::println)
                .join();

        // print status code
        System.out.println("Async execution future response :" + responseFuture.isDone());

    }
}
