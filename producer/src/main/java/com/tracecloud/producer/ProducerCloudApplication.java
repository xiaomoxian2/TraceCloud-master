package com.tracecloud.producer;

import com.tracecloud.producer.service.ProducerCloudService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Version V1.0
 */
@Slf4j
@RestController
@SpringBootApplication
public class ProducerCloudApplication {

    @Resource
    private ProducerCloudService ProducerCloudService;

    public static void main(String[] args) {
        SpringApplication.run(ProducerCloudApplication.class, args);
    }


    @RequestMapping("/api/producer")
    public Object producer() {
        log.info("http request producer ...");
        return ProducerCloudService.list();
    }

}
