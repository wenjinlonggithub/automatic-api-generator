package xyz.chaobei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("xyz.chaobei.mapper")
public class DefaultApplication {
    public static void main(String[] args) {
        SpringApplication.run(DefaultApplication.class, args);
    }
}