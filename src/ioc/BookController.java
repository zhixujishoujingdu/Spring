package ioc;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("bookController")
public class BookController {
    @Resource(name = "bookService")
    private BookSerVice bookSerVice;
    public void say() {
        this.bookSerVice.say();
        System.out.println("控制层调用业务逻辑层say()方法");
    }
}
