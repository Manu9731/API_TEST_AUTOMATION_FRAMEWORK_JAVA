package com.api.test;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;


public class ReadJsonFile {
    public static void main(String[] args){
        try{
            JSONParser jsonParser = new JSONParser();
            FileReader reader = new FileReader(".\\DataJson\\employee.json");
            JSONObject obj = (JSONObject) jsonParser.parse(reader);
            System.out.println(obj.get("address"));

            Map<Integer, Integer> map = new HashMap<>();
            List<Integer> integers = new ArrayList<>(Arrays.asList(2, 7, 11, 15));
            int target = 9;

            for (int i = 0; i < integers.size(); i++) {
                int complement = target - integers.get(i);

                if (map.containsKey(complement)) {
                    System.out.println(complement);
                    System.out.println(integers.get(i));
                    break;
                } else {
                    map.put(integers.get(i), 1);
                }
            }

//            System.out.println(map.get(2));
//            System.out.println(map.keySet());

            int[] num = new int[]{1, 2};




        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
