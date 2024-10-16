package org.example.clztoolsconsole;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class ClztoolsConsoleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClztoolsConsoleApplication.class, args);
    }

}
