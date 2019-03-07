package spring_1.bean.generic.di;

/**
 * @program: spring4
 * @description: base
 * @author: Jun Wang
 * @create: 2019-03-07 12:23
 */
public class BaseRepository<T> {

    private void save(){
        System.out.println("save...");
    }
}
