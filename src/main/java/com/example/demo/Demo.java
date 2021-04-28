package com.example.demo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Auther: yuewenbo971@hellobike.com
 * @Date: 2021/4/7 18:25
 * @Description:
 */
public class Demo {
    @SneakyThrows
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("03-16.json"));
        StringBuilder builder = new StringBuilder();
        String line = reader.readLine();
        while (line != null) {
            builder.append(line);
            // read next line
            line = reader.readLine();
        }
        reader.close();
        JSONObject jsonObject = JSONObject.parseObject(builder.toString());
        JSONArray items = jsonObject.getJSONArray("items");
        double ans = 0.0, delivery = 0.0;
        for (Object item : items) {

        }
    }
}