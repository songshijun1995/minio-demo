package com.minio;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSwaggerBootstrapUI
@SpringBootApplication
public class MinioDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MinioDemoApplication.class, args);
    }

}
