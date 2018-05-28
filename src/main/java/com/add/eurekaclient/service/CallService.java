package com.add.eurekaclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by THLiu on 5/23/2018.
 *
 */
@Service
public class CallService {

    private static String appServiceUrl = "http://MICRO-SERVICE/";
    private static String appService2Url = "http://MICRO-SERVICE2/";
    @Autowired
    RestTemplate restTemplate;

    public String callString(){
        return restTemplate.getForObject(appServiceUrl+"api/client",String.class);

    }

    public String callService2(){
       return restTemplate.getForObject(appService2Url+"api/resource",String.class);
    }
}
