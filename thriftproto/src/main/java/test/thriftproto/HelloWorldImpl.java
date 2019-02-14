package test.thriftproto;

import org.apache.thrift.TException;

/**
 * Created by Administrator on 2017/3/31.
 */
public class HelloWorldImpl implements HelloWorldService.Iface {

     public HelloWorldImpl() {
     }
 
     @Override
     public String sayHello(String username) throws TException {
         return "Hi,"+username+"Welcome to my blog http://www.cnblogs.com/zfygiser";
     }
 }