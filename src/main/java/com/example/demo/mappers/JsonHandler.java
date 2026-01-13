package com.example.demo.mappers;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.example.demo.intrmObj.weatherObj;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import org.springframework.core.io.ClassPathResource;

public class JsonHandler<T> {

    public void write(T userD,String fileName) throws JsonProcessingException {
        ObjectMapper objMap = new ObjectMapper();
        String data = objMap.writeValueAsString(userD);
        OutputStream os = null;
        try {
            os = new FileOutputStream(new File("src/main/resources/templates/" + fileName));
            os.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public weatherObj getWeatherObject() throws IOException{
        ClassPathResource resource = new ClassPathResource("templates/weathStore.json");
        try (InputStream inputStream = resource.getInputStream()) {
            byte[] jsonData = inputStream.readAllBytes();
            ObjectMapper objectMap =  new ObjectMapper();
            weatherObj us = objectMap.readValue(jsonData,weatherObj.class);
            return us;
        }catch (Exception e){
            return null;
        }
//        byte[] jsonData = Files.readAllBytes(Paths.get("src/main/resources/templates/weathStore.json"));
    }

    public void deleteData(String fileName){
        String filePath = "src/main/resources/templates/" + fileName;
        
        // Create an empty JSON object
        JsonObject emptyJsonObject = new JsonObject();
        
        // Write the empty JSON object to the file
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(emptyJsonObject.toString());
            System.out.println("JSON file contents deleted.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}