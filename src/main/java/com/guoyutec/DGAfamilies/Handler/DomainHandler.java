package com.guoyutec.DGAfamilies.Handler;

import java.io.IOException;
import java.io.InputStream;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;

import com.guoyutec.DGAfamilies.Entity.DGAEntity;

public class DomainHandler {
    public String checkDomain(String domain) {
        String responseString = "";
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream("Data/DGAfamilies.json");
            String jsonContent = new String(inputStream.readAllBytes());

            JSONObject jsonObject = JSON.parseObject(jsonContent);
            JSONArray entities = jsonObject.getJSONArray(("entities"));

            Boolean matched = false;
            for (int i = 0; i < entities.size(); i++) {
                JSONObject entity = entities.getJSONObject(i);

                String regexString = entity.getString("regex");
                Boolean isMatch = domain.matches(regexString);
                if (isMatch) {
                    matched = true;
                    DGAEntity dgaEntity = new DGAEntity();
                    dgaEntity.setId(entity.getInteger("id"));
                    dgaEntity.setName(entity.getString("name"));
                    dgaEntity.setPeriod(entity.getString("period"));
                    dgaEntity.setCredits(entity.getString("credits"));
                    dgaEntity.setDescription(entity.getString("description"));
                    String entityString = JSON.toJSONString(dgaEntity);
                    responseString = entityString;
                    break;
                }
            }
            if (!matched) {
                responseString = "Not matched with current regex rules.";
            }
        } catch (IOException e) {
            // responseString = "Internal Error!";
            responseString = e.toString();;
        }
        return responseString;
    }
}
