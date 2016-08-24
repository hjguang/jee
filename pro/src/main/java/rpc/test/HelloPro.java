package rpc.test;

import rpc.RpcFramework;

public class HelloPro {

    public static void main(String[] args) throws InterruptedException {
        HelloService hello=new HelloImp();
        RpcFramework.regist(hello, 1717, "127.0.0.1");
        System.out.println("starting.........................");
    }

}
