package com.practice;

public class NConsequetiveMaxSum {	

	public static void main(String[] args) {
		/*
		 * input
nums 1 2 54 3 7 -60 34 26

k=2 -> return 60 (34+26)
k=3 -> return 64 (54+3+7)
		 */
		int[] arr= {1,2, 54, 3, 7, -60, 34, 26};
		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
		int sum=getHeavistSum(arr,2);
		System.out.println(sum);
		System.out.println("longest subarry"+maxSubArraySum(a));

	}
	
	public static int getHeavistSum(int[] array, int n) {
		 int largestSum = 0;
		    int previousSum = 0;

		    for (int i = 0; i <= array.length - n; i++)
		    {
		        if (i == 0)
		        {
		            for (int j = 0; j < n; j++)
		            {
		                largestSum += array[j];
		            }

		            previousSum = largestSum;
		        }
		        else
		        {
		            int currentSum = previousSum - array[i - 1] + array[i + n - 1];
		            if (currentSum > largestSum)
		            {
		                largestSum = currentSum;
		            }
		            previousSum = currentSum;
		        }
		    }

		    return largestSum;
	}
	
	static int maxSubArraySum(int a[]) {
		
		return 0;
		
	}
}

