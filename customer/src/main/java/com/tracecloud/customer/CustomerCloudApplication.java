package com.tracecloud.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * @Description
 * @Version V1.0
 */
@Slf4j
@RestController
@SpringBootApplication
public class CustomerCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerCloudApplication.class, args);
    }

    @RequestMapping("/api/customer")
    public Object customer() throws Exception {
        log.info("http request customer ...");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(new URI("http://127.0.0.1:8081/api/producer")).GET().build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
