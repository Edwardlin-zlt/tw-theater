package com.thoughtworks.tw_theater;

import com.alibaba.fastjson.JSONArray;
import org.junit.jupiter.api.Test;

public class JsonParseDemo {

    private static final String Array_String = "['中国大陆', '中国香港']";
    private static final String Object_Json = "{'small': 'http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2219011938.jpg', 'large': 'http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2219011938.jpg', 'medium': 'http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2219011938.jpg'}";
    @Test
    public void testJSONStrToJSONArray() {

        JSONArray jsonArray = JSONArray.parseArray(Array_String);
        String replace = Object_Json.replace("'", "\\\"");
        System.out.println(replace);

        //遍历方式1
//        int size = jsonArray.size();
//        for (int i = 0; i < size; i++) {
//
//            JSONObject jsonObject = jsonArray.getJSONObject(i);
//            System.out.println("studentName:  " + jsonObject.getString("studentName") + ":" + "  studentAge:  "
//                + jsonObject.getInteger("studentAge"));
//        }
//
//        //遍历方式2
//        for (Object obj : jsonArray) {
//
//            JSONObject jsonObject = (JSONObject) obj;
//            System.out.println("studentName:  " + jsonObject.getString("studentName") + ":" + "  studentAge:  "
//                + jsonObject.getInteger("studentAge"));
//        }
    }

    /**
     * JSONArray到json字符串-数组类型的转换
     */
    @Test
    public void testJSONArrayToJSONStr() {

        //已知JSONArray,目标要转换为json字符串
        JSONArray jsonArray = JSONArray.parseArray(Array_String);
        //第一种方式
        String jsonString = JSONArray.toJSONString(jsonArray);

        // 第二种方式
        //String jsonString = jsonArray.toJSONString(jsonArray);
        System.out.println(jsonString);
    }
}
