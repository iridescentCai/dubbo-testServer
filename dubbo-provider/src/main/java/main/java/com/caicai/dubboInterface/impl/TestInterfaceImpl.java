package main.java.com.caicai.dubboInterface.impl;

import com.caicai.TestInterface;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author caicai
 * @Date 2021/6/25 下午2:01
 */

// 注意：只有 group，interface，version 是服务的匹配条件，三者决定是不是同一个服务，其它配置项均为调优和治理参数。
@DubboService(version = "1.0.0", group = "DubboTest", timeout = 300, retries = 2, loadbalance = "roundrobin", actives = 5)
public class TestInterfaceImpl implements TestInterface {

    @Value("${spring.application.name}")
    String name;

    public String test() {
        return name;
    }
}

    

