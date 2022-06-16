package ru.neoflex.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.neoflex.model.Order;
import ru.neoflex.repository.impl.OrderRepositoryImpl;
import ru.neoflex.service.impl.OrderServiceImpl;

@Configuration
@PropertySource("classpath:application.properties")
public class SpringConfig {
    @Bean
    OrderRepositoryImpl orderRepository() {
     return new OrderRepositoryImpl();
    }

    @Bean
    OrderServiceImpl orderService() {
        return new OrderServiceImpl(orderRepository());
    }
}
