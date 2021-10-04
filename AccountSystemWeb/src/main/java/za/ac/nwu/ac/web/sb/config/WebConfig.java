package za.ac.nwu.ac.web.sb.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = {
        "za.ac.nwu.ac.web.sb.Controller",
        "za.ac.nwu.ac.web.sb.Exception"
})
public class WebConfig {
}
