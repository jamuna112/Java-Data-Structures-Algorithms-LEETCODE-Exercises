package org.example.hashtables;

import java.lang.reflect.Array;
import java.util.*;

public class HashTable {

    private int size = 5;
    private Node[] dataMap;

    class Node{
         int value;
         String key;
         Node next;

         Node(String key, int value){
             this.key = key;
             this.value = value;
         }
    }

    public HashTable(){
        dataMap = new Node[size];
    }

    public void printTable(){
        for(int i = 0; i < dataMap.length; i++){
            System.out.println(i + " : ");
            Node temp = dataMap[i];
            while(temp != null ){
                System.out.println(" {" + temp.key + " = " + temp.value);
                temp = temp.next;
            }
        }
    }

    private int hash(String key){
        int hash  = 0;
        char[] keyChars = key.toCharArray();
        for(int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    public void set(String key, int value){
        int index = hash(key);
        Node newNode = new Node(key, value);

        if (dataMap[index] == null){
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }

    }

    public int get(String key){
        int index = hash(key);

        Node temp = dataMap[index];
        while(temp != null){
            if(temp.key == key){
                return temp.value;
            }
            temp = temp.next;
        }
        return 0;
    }

    public ArrayList keys(){
        ArrayList<String> allKeys = new ArrayList<>();

        for(int i = 0; i < dataMap.length; i++){
            Node temp = dataMap[i];
            while(temp != null){
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }

    public boolean itemInCommon(int[] array1, int[] array2){
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();

        for(int i: array1){
            myHashMap.put(i, true);
        }
        for(int j: array2){
            if(myHashMap.get(j) != null){
                return true;
            }
        }
        return false;
    }

    public List<Integer> duplicates(int[] nums){
        HashMap<Integer, Integer> numCounts = new HashMap<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        for(int i: nums){
            numCounts.put(i, numCounts.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: numCounts.entrySet()){
            if(entry.getValue() > 1){
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }

    public Character firstNonRepeatingChar(String word){
        HashMap<Character, Integer> charCount = new HashMap<>();

        for(int i = 0; i < word.length(); i++){
            char cha = word.charAt(i);
            charCount.put(cha, charCount.getOrDefault(cha, 0)+1);
        }
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(charCount.get(c) == 1){
                return c;
            }
        }
        return null;
    }
    public List<List<String>> groupAnagrams(String[] strings){
        HashMap<String, List<String>> anagramsGroup = new HashMap<>();

        for(String string: strings) {
            char[] chars = string.toCharArray();
            Arrays.sort(chars);

            String canonical = new String(chars);
            System.out.println("stings "+ canonical);
            if(anagramsGroup.containsKey(canonical)){
                anagramsGroup.get(canonical).add(string);
            } else {
                List<String> group = new ArrayList<>();
                group.add(string);
                anagramsGroup.put(canonical, group);
            }
        }
        return new ArrayList<>(anagramsGroup.values());
    }

}
