package com.archelo.wine;

import com.archelo.wine.storage.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class WineReviewsApplication {

    public static void main(String[] args) {
        SpringApplication.run(WineReviewsApplication.class, args);
    }
}
