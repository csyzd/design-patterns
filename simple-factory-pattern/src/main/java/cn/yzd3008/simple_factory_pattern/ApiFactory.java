package cn.yzd3008.simple_factory_pattern;

import java.util.Objects;

public class ApiFactory {

    private ApiFactory(){}

    public static Api produce(String condition){

        if(Objects.equals(condition, "A")){
            return new ApiImplA();
        }else if(Objects.equals(condition, "B")){
            return new ApiImplB();
        }

        return null;
    }
}
