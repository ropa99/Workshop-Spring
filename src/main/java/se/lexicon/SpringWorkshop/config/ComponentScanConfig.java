package se.lexicon.SpringWorkshop.config;

import java.util.Scanner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan(basePackages = "se.lexicon")

public class ComponentScanConfig {

    @Bean
    public Scanner scanner(){
        return new Scanner(System.in);
    }

}
