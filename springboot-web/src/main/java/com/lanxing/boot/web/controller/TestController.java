package com.lanxing.boot.web.controller;

import com.lanxing.boot.web.annotation.LoginCheck;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaofan
 * @version 1.0
 * @date 2017/7/21 下午3:44
 * @desc 功能描述
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Value("${testsss}")
    private String test;

    @RequestMapping("test")
    @LoginCheck
    public Address test() {
        Address address = new Address();
        address.setName("高凡");
        address.setPhone("1233");

        return address;
    }

    @RequestMapping("testt")
    public String testt(){
        return test;
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public Address testInsert(@RequestBody Address address){
        System.out.println(address.toString());
        return address;
    }
}

@Data
class Address{
    private String name;
    private String phone;
}
