package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ioc/FirstSpring.xml");
        BookController bookController=(BookController) applicationContext.getBean("bookController");
        bookController.say();
    }
}
