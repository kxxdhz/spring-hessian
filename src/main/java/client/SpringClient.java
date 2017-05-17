package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.Isay;

/**
 * 使用HessianProxyFactoryBean Hessian代理工厂Bean来完成接口调用.
 * @author lvpeng
 * @date 2017年5月17日 下午5:51:05
 */
public class SpringClient {

	 public static void main(String[] args) {  
        ApplicationContext context = new ClassPathXmlApplicationContext("remote-client.xml");  
        Isay isay = (Isay) context.getBean("clientSpring");  
        ((ClassPathXmlApplicationContext) context).close();
        System.out.println(isay.sayHello("lp"));  
	 }  
}
