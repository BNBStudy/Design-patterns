package ru.neoflex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.neoflex.config.SpringConfig;
import ru.neoflex.service.OrderService;
import ru.neoflex.service.impl.OrderServiceImpl;

/**
 * InversionOfControl.
 *
 * @author nanikeev
 */

public class InversionOfControl {

    public static void main(String... args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("context-config.xml");
//        OrderService orderService = context.getBean("orderService", OrderServiceImpl.class);
//        orderService.createNew(1L);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
        OrderService orderService = context.getBean("orderService", OrderServiceImpl.class);
        orderService.createNew(1L);
    }
}
