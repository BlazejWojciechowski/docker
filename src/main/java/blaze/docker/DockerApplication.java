package blaze.docker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerApplication {
    @Value("${user}")
    private String user;
    @GetMapping("/")
    public String get() {
        return "Hello! " + user;
    }
    public static void main(String[] args) {
        SpringApplication.run(DockerApplication.class, args);
    }

}
