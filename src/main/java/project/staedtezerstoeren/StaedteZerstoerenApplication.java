package project.staedtezerstoeren;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StaedteZerstoerenApplication {

    public static void main(String[] args) {
        SpringApplication.run(StaedteZerstoerenApplication.class, args);

        DrawUtil sad = new DrawUtil();
    }

}
