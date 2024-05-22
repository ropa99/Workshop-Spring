package se.lexicon.SpringWorkshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import se.lexicon.SpringWorkshop.data_access.impl.ScannerDaoImpl;

@Configuration
@ComponentScan(basePackages = "se.lexicon")

public class ComponentScanConfig {

    @Bean
    public ScannerDaoImpl scannerDao(){
        return new ScannerDaoImpl();
    }

}
