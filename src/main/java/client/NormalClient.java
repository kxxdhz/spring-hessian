package client;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;

import service.Isay;

/**
 * 使用HessianProxyFactory  Hessian代理工厂直接调用
 * @author lvpeng
 * @date 2017年5月17日 下午3:44:34
 */
public class NormalClient {

	public static void main(String[] args) throws MalformedURLException {  
        //Spring Hessian代理Servelet  
        String url = "http://localhost:8080/hessian/hessian/isay";  
        HessianProxyFactory factory = new HessianProxyFactory();  
        Isay isay = (Isay) factory.create(Isay.class, url);  
  
        System.out.println(isay.sayHello("lp"));  
    }  
	
	
}
