package rpc.test;

public class HelloImp implements HelloService {
    
    public String SayHello(String name) {
        // TODO Auto-generated method stub

        return "你好:" + name;
    }
}
