package com.guoyutec.DGAfamilies.Handler;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

import com.guoyutec.DGAfamilies.Entity.DGAEntity;

public class DomainHandler {
    String username = "user";  // Replace with you own username
    String password = "pass";  // Replace with you own password

    public String checkDomainByRegex(String domain) {
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

    public String checkDomainByQuery(String domain) {
        String url = "https://dgarchive.caad.fkie.fraunhofer.de/r/";
        String responseString;

        try {
            URL apiUrl = new URL(url + domain);
            HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
            connection.setRequestMethod("GET");

            String credentials = this.username + ":" + this.password;
            String encodedCredentials = Base64.getEncoder().encodeToString(credentials.getBytes());
            connection.setRequestProperty("Authorization", "Basic " + encodedCredentials);

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();

            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            responseString = response.toString();
            connection.disconnect();
        } catch (IOException e) {
            responseString = e.toString();
        }
        return responseString;
    }

    public String checkMultiQueries(String domains) {
        String url = "https://dgarchive.caad.fkie.fraunhofer.de/reverse";
        String responseString;

        try {
            URL apiUrl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
            connection.setRequestMethod("POST");

            String credentials = this.username + ":" + this.password;
            String encodedCredentials = Base64.getEncoder().encodeToString(credentials.getBytes());
            connection.setRequestProperty("Authorization", "Basic " + encodedCredentials);

            connection.setDoInput(true);
            connection.setDoOutput(true);

            connection.setRequestProperty("Content-Type", "text/plain");

            DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
            outputStream.writeBytes(domains);
            outputStream.flush();
            outputStream.close();

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();

            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            responseString = response.toString();
            connection.disconnect();
        } catch (IOException e) {
            responseString = e.toString();
        }

        return responseString;
    }
}
