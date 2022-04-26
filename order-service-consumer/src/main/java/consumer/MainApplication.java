package consumer;

import dubboapi.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tanxy
 * @version 1.0.0
 * @ClassName MainApplication.java
 * @Description TODO
 * @createTime 2022年04月08日 14:10:00
 */
public class MainApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService bean = applicationContext.getBean(OrderService.class);
        System.out.println("消费者开始请求");
        bean.initial("asdfasdfa");
    }
}
