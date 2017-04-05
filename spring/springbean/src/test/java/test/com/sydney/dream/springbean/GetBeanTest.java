package test.com.sydney.dream.springbean;

import com.sydney.dream.springbean.Car;
import com.sydney.dream.springbean.Dog;
import com.sydney.dream.springbean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Sydney on 2017/4/2.
 */
public class GetBeanTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-bean.xml");
    @Test
    public void getDog01BeanTest(){
        Dog dog01 = (Dog) context.getBean("dog01");
        // 还有另一种获取bean 的方式，不过这种方式下，要求bean 在xml 配置中是唯一的。
       // Dog dog02 = context.getBean(Dog.class);
        // 还有一种，
        Dog dog03 = context.getBean("dog01",Dog.class);
        System.out.println(dog01);

    }

    @Test
    public void getDog02BeanTest(){
        Dog dog02 = context.getBean("dog02",Dog.class);
        System.out.println(dog02);
    }

    @Test
    public void getDog03BeanTest(){
        Dog dog03 = context.getBean("dog03",Dog.class);
        System.out.println(dog03);
    }

    @Test
    public void getPersonXiaohong(){
        Person xiaohong = context.getBean("xiaohong",Person.class);
        System.out.println(xiaohong);
    }

    @Test
    public void getPersionXiaoming(){
        Person xiaoming = context.getBean("xiaoming",Person.class);
        System.out.println(xiaoming);
    }

    @Test
    public void getPersionXiaoliang(){
        Person xiaoliang = context.getBean("xiaoqing",Person.class);
        System.out.println(xiaoliang);
    }

    @Test
    public void getCarBeanWithParentAttribute(){
        Car car02 = context.getBean("car02", Car.class);
        System.out.println(car02);
    }
}
