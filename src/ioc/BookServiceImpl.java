package ioc;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("bookService")
public class BookServiceImpl implements BookSerVice {
    @Resource(name = "bookDao")
     private BookDao bookDao;
    public void say() {
        this.bookDao.say();
        System.out.println("业务逻辑层调用数据访问层say()方法");
    }
}
