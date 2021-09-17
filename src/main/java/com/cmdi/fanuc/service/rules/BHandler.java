package com.cmdi.fanuc.service.rules;

import java.util.List;

public class BHandler extends Handler{
    @Override
    public void handleRequest(String lineNum, String func) {
        String res = "第二次面试，恭喜面试通过，HR会跟你联      系！！！";
        resultList.add(res);
    }

    public static void main(String[] args) {
        HanderAdapter handerAdapter = new HanderAdapter();
        Handler first = handerAdapter.warpHandler();
        // 第一次面试
        first.handleRequest("1", "-----");
        List<String> result = Handler.getResult();
        result.stream().forEach(System.out::println);
        // 第一次面试
        first.handleRequest("2", "-----");
        result = Handler.getResult();
        result.stream().forEach(System.out::println);
    }
}
