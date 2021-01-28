package nunez.emman.footballdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FootballDataServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FootballDataServiceApplication.class, args);
    }

}
