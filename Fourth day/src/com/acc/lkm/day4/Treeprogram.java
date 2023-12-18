package com.acc.lkm.day4;
import java.util.*;
public class Treeprogram {

	public static void main(String[] args) {
		NavigableMap<String,Integer> set=new TreeMap<>();
		set.put("manoj", 33);
		set.put("anvesh", 44);
		set.put("sukumar", 55);
        set.put("vinay", 66);
        /*for(Map.Entry m1:set.entrySet()) {
        	System.out.println(m1.getKey()+" "+m1.getValue());
        }
        System.out.println(set);
        set.remove("vinay");
        System.out.println(set);*/
        System.out.println(set.descendingMap());
        System.out.println(set.headMap("manoj",true));
        System.out.println(set.tailMap("sukumar",true));
        System.out.println(set.subMap("anvesh ",false,"vinay",true));
	}

}
