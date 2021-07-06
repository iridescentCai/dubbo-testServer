package main.com.caicai;

import com.caicai.TestInterface;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caicai
 * @Date 2021/6/25 下午2:45
 */

@SpringBootApplication
@DubboComponentScan
@RestController
public class DubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class, args);
    }

    @DubboReference(version = "1.0.0",group = "DubboTest")
    private TestInterface testInterface;

    @DubboReference(version = "1.0.0",group = "DubboTest2")
    private TestInterface testInterface2;

    @GetMapping("/test")
    public String test(){
        return testInterface.test();
    }

    @GetMapping("/test2")
    public String test2(){
        return testInterface2.test();
    }


}

    

