package cn.yzd3008.simple_factory_pattern;

public class Scene {

    public static void main(String[] args) {

        // 只是知道接口而不知道实现,本质是选择实现

        Api api = ApiFactory.produce("A");
        api.operation("hello");
    }
}
