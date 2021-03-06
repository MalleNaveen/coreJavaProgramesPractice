package com.practice;

public class TwoElementSumInArray {

	public static void main(String[] args) {
		TwoElementSumInArray arrySum=new TwoElementSumInArray();
int[] array={-1,1,3,2,5,5,4};
arrySum.sumTwoElementsArry(array);
		
	}

	
	public void sumTwoElementsArry(int[] arr){
	 
		int count=0;
		
		for(int i=0;i<arr.length;i++){
			int sum;
			if((i+1)!=arr.length){
			sum=arr[i]+arr[i+1];
			}else{
				break;
			}
			
		    int repeated = 0;
			for(int j=0;j<arr.length;j++){				
			while(sum==arr[j])
			{
				count++;	
				repeated=arr[j];
				
				j++;
				if(arr.length==j){
                break;
				}
			}
			
			}
			if(count >=1){
			System.out.println(repeated +"="+count);
			count=0;
			}
			}
		
	}
}
