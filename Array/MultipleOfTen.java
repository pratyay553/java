package com.Array;

public class MultipleOfTen {

	public static int[] tenRun(int[] nums) {
		  
		  for(int i = 0;i<nums.length;i++)
		   {
		     if(nums[i]==10){
		       for(int j=i+1;nums[j]<10;j++){
		        nums[j]=10;
		        i = j+1;
		       }
		     }else if(nums[i]>10){
		       for(int j=i+1;nums[j]%10==0;i++){
		         nums[j]= nums[i];
		       }
		     }
		   }
		     
		     return nums;
	}
	public static void main(String[] args) {
		int[] a = {2,10,3,4,5,20,5};
		System.out.println(a.toString());

	}

}
