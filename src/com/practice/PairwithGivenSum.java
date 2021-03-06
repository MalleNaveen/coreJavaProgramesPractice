package com.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PairwithGivenSum {

	
	// Function to find a pair in an array with a given sum using hashing
    public static void findPair(int[] A, int sum)
    {
        // create an empty HashMap
        Map<Integer, Integer> map = new HashMap<>();
 
        // do for each element
        for (int i = 0; i < A.length; i++)
        {
            // check if pair (A[i], sum-A[i]) exists
 
            // if the difference is seen before, print the pair
            if (map.containsKey(sum - A[i]))
            {
                System.out.println("Pair found at index " +
                                map.get(sum - A[i]) + " and " + i);
                return;
            }
 
            // store index of the current element in the map
            map.put(A[i], i);
        }
 
        // No pair with the given sum exists in the array
        System.out.println("Pair not found");
    }
    //this is best approach o(n)
    public static int numberOfPairs(Integer[] array, int sum) {
        Set<Integer> set = new HashSet<>(Arrays.asList(array));

        // this set will keep track of the unique pairs.
        Set<String> uniquePairs = new HashSet<String>();

        for (int i : array) {
            int x = sum - i;
            if (set.contains(x)) {
                int[] y = new int[] { x, i };
               // System.out.println("pair=" +Arrays.toString(y));
                Arrays.sort(y);
                uniquePairs.add(Arrays.toString(y));
            }
            
        }
        

        System.out.println(uniquePairs);
        return uniquePairs.size();
    }
 
    public static void main (String[] args)
    {
        int[] A = { 8, 7, 2, 5, 3, 1 };
        Integer[] b = { 8, 7, 2, 5, 3, 1 };
        int sum = 10;
        int out=numberOfPairs(b,sum);
        System.out.println(out);
        findPair(A, sum);
    }
}
