import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author tanxy
 * @version 1.0.0
 * @ClassName MainApplication.java
 * @Description TODO
 * @createTime 2022年04月08日 11:48:00
 */
public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml" );
        ioc.start();
        System.in.read();
    }
}
