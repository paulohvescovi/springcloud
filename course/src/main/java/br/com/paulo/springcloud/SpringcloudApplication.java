package br.com.paulo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"br.com.paulo.springcloud.model"})
@EnableJpaRepositories({"br.com.paulo.springcloud.repository"})
public class SpringcloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudApplication.class, args);
    }

}
