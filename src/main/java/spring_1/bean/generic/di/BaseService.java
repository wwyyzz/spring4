package spring_1.bean.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: spring4
 * @description: base
 * @author: Jun Wang
 * @create: 2019-03-07 12:24
 */
public class BaseService<T> {
    @Autowired
    protected BaseRepository<T> repository;

    public void add(){
        System.out.println("add...");
        System.out.println(repository);
    }
}
