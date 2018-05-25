package com.add.eurekaclient.controller;

import com.add.eurekaclient.service.CallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by THLiu on 5/23/2018.
 *
 */
@RestController
public class CallServiceController {

    @Autowired
    CallService callService;

    @RequestMapping(value = "api/call", method = RequestMethod.GET)
    public String getCall(){
        return callService.callString();
    }


    @RequestMapping(value = "api/call2", method = RequestMethod.GET)
    public String getCall2(){
        return callService.callService2();
    }
}
