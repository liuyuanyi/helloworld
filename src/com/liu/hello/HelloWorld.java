package com.liu.hello;

public class HelloWorld {
    public String getHello(HelloEntity helloEntity){
        String str=null;
        switch (helloEntity.getMeth()){
            case 1:str="hello11111";
            case 2:str="hello22222";
            default:str="hello33333";
        }
        return str;
    }

}
