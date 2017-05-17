package client;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;

import service.Isay;

/**
 * ʹ��HessianProxyFactory  Hessian������ֱ�ӵ���
 * @author lvpeng
 * @date 2017��5��17�� ����3:44:34
 */
public class NormalClient {

	public static void main(String[] args) throws MalformedURLException {  
        //Spring Hessian����Servelet  
        String url = "http://localhost:8080/hessian/hessian/isay";  
        HessianProxyFactory factory = new HessianProxyFactory();  
        Isay isay = (Isay) factory.create(Isay.class, url);  
  
        System.out.println(isay.sayHello("lp"));  
    }  
	
	
}
