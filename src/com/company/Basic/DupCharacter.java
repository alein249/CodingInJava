package com.company.Basic;

import java.util.HashMap;
import java.util.Map;

public class DupCharacter {
    public static void main(String[] args) {
        String str = "geeksforgeeksjava";
        char[] charArray = str.toCharArray();
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(char c : charArray){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }
            else{
                map.put(c, 1);
            }
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }
}
