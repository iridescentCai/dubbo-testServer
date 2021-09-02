package com.caicai;

/**
 * @author caicai
 * @Date 2021/7/16 下午3:23
 */

public class TestInterfaceFallBack implements TestInterface {
    @Override
    public String test() {
        return "Mock实现类-服务降级了";
    }
}

    

