package test.automation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jcincera on 30/10/15.
 */
@SpringBootApplication
@RestController
public class Calculator {

    @RequestMapping("/calculator/add")
    public String add(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        return String.valueOf(a + b);
    }

    public static void main(String[] args) {
        final SpringApplication app = new SpringApplication(Calculator.class);
        app.run(args);
    }
}
