package com.cmdi.fanuc.service.rules;

public class HanderAdapter {

    public Handler warpHandler(){
        //组装规则
        Handler first = new AHandler();
        Handler second = new BHandler();
        first.setHandler(second);
        return first;
    }
}
