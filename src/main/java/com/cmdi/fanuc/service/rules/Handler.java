package com.cmdi.fanuc.service.rules;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Handler {

    protected Handler handler;

    protected static List<String> resultList = new ArrayList<>();

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
    public abstract void handleRequest(String lineNum, String func);

    public static List<String> getResult() {
        return resultList;
    }
}
