package com.sideproject.spsnotice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SpsNoticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpsNoticeApplication.class, args);
	}
	@GetMapping("/notice/info")
    public String info(@Value("${server.port}") String port) {
        return "this is notice";
    }

}
