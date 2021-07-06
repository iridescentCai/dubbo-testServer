package main.java.com.caicai;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author caicai
 * @Date 2021/6/25 上午11:58
 */
@SpringBootApplication
@DubboComponentScan
public class DubboProviderApplication {
    public static void main(String[] args){
        SpringApplication.run(DubboProviderApplication.class, args);
    }
}

    

