package psb.webshop.prototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("")
@SpringBootApplication
public class PsbWebshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(PsbWebshopApplication.class, args);
    }

}
