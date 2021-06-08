package cn.yzd3008.simple_factory_pattern;

public class ApiImplA implements Api {
    @Override
    public void operation(String arg) {
        System.out.println("ApiImplA#operation(" + arg + ")");
    }
}
