package org.enthusa.askdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author henry
 * @date 2023/6/22
 */
@RestController
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("============启动成功=============");
    }

    @GetMapping("/")
    public String hi() {
        return "Hello world!";
    }
}
