package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.Isay;

/**
 * ʹ��HessianProxyFactoryBean Hessian������Bean����ɽӿڵ���.
 * @author lvpeng
 * @date 2017��5��17�� ����5:51:05
 */
public class SpringClient {

	 public static void main(String[] args) {  
        ApplicationContext context = new ClassPathXmlApplicationContext("remote-client.xml");  
        Isay isay = (Isay) context.getBean("clientSpring");  
        ((ClassPathXmlApplicationContext) context).close();
        System.out.println(isay.sayHello("lp"));  
	 }  
}
