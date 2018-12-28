package pnunu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: pnunu
 * @Date: 2018/12/27 21:34
 * @Description:
 */
@SpringBootApplication
public class KafkaApplication {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(KafkaApplication.class, args);

    }
}
