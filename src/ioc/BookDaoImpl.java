package ioc;

import org.springframework.stereotype.Repository;

/**
 * @author Zqx
 *
 * 实现接口BookDao
 */
@Repository("bookDao")
public class BookDaoImpl implements BookDao  {

    @Override
    public void say() {
        System.out.print("BookDao say Hello Spring!");
    }
}
