package kz.zhabassov.intro;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("intro.xml");
        D d = (D) ctx.getBean("D");
        E e = (E) ctx.getBean("E");
        B b = (B) ctx.getBean("B");
        C c = (C) ctx.getBean("C");
        A a = (A) ctx.getBean("App");



        a.printInfo();
        b.printInfo();
        c.printInfo();
        d.printInfo();
        e.printInfo();

    }
}
