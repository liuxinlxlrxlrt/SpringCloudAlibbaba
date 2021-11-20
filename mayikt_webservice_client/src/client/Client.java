package client;

import com.mayikt.service.UserService;
import com.mayikt.service.UserServiceServiceLocator;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args) throws ServiceException, RemoteException {
        UserServiceServiceLocator userServiceServiceLocator = new UserServiceServiceLocator();
        UserService userService = userServiceServiceLocator.getUserServicePort();
        //远程实现rpc调用，采用代理技术返回我们的结果
        String result = userService.getUser(10L);
        System.out.println("result:" + result);
    }
}
