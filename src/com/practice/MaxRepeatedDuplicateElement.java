package com.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxRepeatedDuplicateElement {

	public static void main(String[] args) {
		MaxRepeatedDuplicateElement max=new MaxRepeatedDuplicateElement();
		int[] arr={4, 1, 5, 2, 1, 5, 9, 8, 6, 5, 3, 2, 4, 7};;
		max.getMaxDupliEliment(arr);
		//max.getMaxDupl();
		//System.out.println(max.getMaxDupliEliment(new Integer(10)));
		int [] arr1= {4, 1, 5, 2, 1, 5, 9, 8, 6, 5, 3, 2, 4, 7};
		
		 int arrA[] = {2, 3, 3, 5, 3, 4, 1, 7}; 
	        int n = arr.length; 
	        int k=8; 
	        /*System.out.println("Maximum repeating element is: " + 
	                           maxRepeating(arr1,n,k)); */
	       // max.maxRepeatingElementUsingMap(arrA);
	}
	
public void getMaxDupliEliment(int arr[]){
	
	
	List<Integer> listStreams = Arrays.stream(arr).boxed().collect(Collectors.toList());
	System.out.println(listStreams.stream().filter(i -> Collections.frequency(listStreams, i) >1)
    .collect(Collectors.toSet()).stream().sorted(Comparator.reverseOrder()).findFirst());
}

public double getMaxDupliEliment(Integer i){
	
long l=i;
return l;

}

public double getMaxDupliEliment(Object i){
	
double l = 12;
return l;

}


public  void getMaxDupl(){
	int[] inputArray = { 4, 4, 10, 4, 10 };
    Map<Integer, Integer> hMap = new HashMap<Integer, Integer>();
    HashSet<Integer> hSet = new HashSet<Integer>();
    for (int i : inputArray) {
        if (hSet.add(i)) {
            hMap.put(i, 1);
        } else {
            hMap.put(i, hMap.get(i) + 1);
        }
    }
    Iterator<Integer> iter = hMap.values().iterator();
    int temp = 0;
    while (iter.hasNext()) {
        int max = iter.next();
        if (max > temp) {
            temp = max;
        }
    }
    System.out.println(temp);
}
// Returns maximum repeating element in arr[0..n-1]. 
// The array elements are in range from 0 to k-1 
static int maxRepeating(int arr[], int n, int k) 
{ 
    // Iterate though input array, for every element 
    // arr[i], increment arr[arr[i]%k] by k 
    for (int i = 0; i< n; i++) 
        arr[(arr[i]%k)] += k; 

    // Find index of the maximum repeating element 
    int max = arr[0], result = 0; 
    for (int i = 1; i < n; i++) 
    { 
        if (arr[i] > max) 
        { 
            max = arr[i]; 
            result = i; 
        } 
    } 

    /* Uncomment this code to get the original array back 
    for (int i = 0; i< n; i++) 
      arr[i] = arr[i]%k; */

    // Return index of the maximum element 
    return result; 
}
public void maxRepeatingElementUsingMap(int [] arrA){
    //Will store each character and it's count
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i <arrA.length; i++) {
        if(map.containsKey(arrA[i])){
            map.put(arrA[i],map.get(arrA[i])+1);
        }else{
            map.put(arrA[i], 1);
        }
    }

    //traverse the map and track the element which has max count
    Iterator entries = map.entrySet().iterator();
    int maxCount = 0;
    int element =arrA[0];
    while(entries.hasNext()){
        Map.Entry entry = (Map.Entry) entries.next();
        int count = (Integer)entry.getValue();
        if(maxCount<count){
            maxCount = count;
            element = (Integer)entry.getKey();
        }
    }
    System.out.println("Element repeating maximum no of times: " + element + ", maximum count: " + maxCount);
}
}
