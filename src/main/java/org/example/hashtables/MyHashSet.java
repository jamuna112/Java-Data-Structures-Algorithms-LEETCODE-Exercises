package org.example.hashtables;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyHashSet {

    public void createHashSet(){
        Set<Integer> mySet = new HashSet<>();
        Set<Integer> otherSet = new HashSet<>();

        mySet.add(10);
        mySet.add(20);
        mySet.add(30);
        mySet.add(20);

        if(mySet.contains(20)){
            System.out.println("Found duplicates in the set.");
        }

        otherSet.add(40);
        otherSet.add(50);
        otherSet.add(40);

        Set<Integer> unionSet = new HashSet<>(mySet);
        unionSet.addAll(otherSet);
        System.out.println(unionSet);
    }
    public List<Integer> removeDuplicates(List<Integer> myList){
        Set<Integer> setList = new HashSet<>(myList);

        return new ArrayList<>(setList);
    }

    public boolean hasUniqueChars(String string){
        Set<Character> charSet = new HashSet<>();

        //for(char ch : string.toCharArray()){
        for(int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            if (charSet.contains(ch)){
                return false;
            }
            charSet.add(ch);
        }
        return true;
    }
    public List<int[]> findPairs(int[] arr1, int[] arr2, int target){
        Set<Integer> mySet = new HashSet<>();
        List<int[]> arrayList = new ArrayList<>();

        for(int num: arr1){
            mySet.add(num);
        }
        for(int num: arr2){
            int needed = target - num;
            if(mySet.contains(needed)){
                arrayList.add(new int[]{needed, num});
            }
        }
        return arrayList;
    }
}
