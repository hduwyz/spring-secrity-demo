package com.cmdi.fanuc.service.rules;

public class AHandler extends Handler{
    @Override
    public void handleRequest(String lineNum, String func) {
        // 假设这里是处理的业务逻辑代码
//        System.out.println("第一次面试");
        String res = "第一次面试";
        resultList.add(res);
        handler.handleRequest(lineNum, func);
    }
}
