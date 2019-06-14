package dev.kuca.kubedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@PropertySources({
        @PropertySource("classpath:app.properties"),
        @PropertySource(value = "file:///opt/etc/demo/app.properties", ignoreResourceNotFound = true)})
@SpringBootApplication
public class KubedemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KubedemoApplication.class, args);
    }

}
