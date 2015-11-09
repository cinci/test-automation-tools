package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by jcincera on 09/11/15.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        final SpringApplication app = new SpringApplication(Application.class);
        app.run(args);
    }
}
