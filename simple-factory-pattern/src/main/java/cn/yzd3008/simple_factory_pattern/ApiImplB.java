package cn.yzd3008.simple_factory_pattern;

public class ApiImplB implements Api {
    @Override
    public void operation(String arg) {
        System.out.println("ApiImplB#operation(" + arg + ")");
    }
}
