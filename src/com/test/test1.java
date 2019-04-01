package com.test;
import java.util.*;
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		int a[] = {3,1,2,4};
		int result[] = sortArrayByParity(a);

	}
	 
public static int[] sortArrayByParity(int[] A) {
		int result[] =new int[A.length];
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int i=0;i<A.length;i++) {
			if(A[i]%2==0) {
				res.add(A[i]);
			}
		}
		for(int i=0;i<A.length;i++) {
			if(A[i]%2!=0) {
				res.add(A[i]);
			}
		}
		for(int j=0;j<res.size();j++) {
			result[j]=res.get(j);
		}
		return result;
	        
}
//机器人能否回到原点
 public boolean judgeCircle(String moves) {
	return false;
        
 }
}
