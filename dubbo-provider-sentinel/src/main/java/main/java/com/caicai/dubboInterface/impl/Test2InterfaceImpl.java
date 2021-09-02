package main.java.com.caicai.dubboInterface.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.caicai.Test2Interface;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author caicai
 * @Date 2021/7/16 下午1:47
 */
@DubboService(version = "1.0.0", group = "DubboTestSentinel2", timeout = 300, retries = 2, loadbalance = "random", actives = 5)
@SentinelResource
public class Test2InterfaceImpl implements Test2Interface {
    @Override
    public String test2() {
        return "this is test2";
    }
}

    

