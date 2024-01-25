package com.base;
import java.util.Arrays;
public class java {
	public static void main(String[]args) {
		
		int[] arr1 = {1, 2, 3, 4, 5};
		 
	      int[] result = new int[arr1.length];

	      for (int i = 0; i < arr1.length; i++) {
	          int product = 1;
	          for (int j = 0; j < arr1.length; j++) {
	              if (i != j) {
	                  product *= arr1[j];
	              }
	          }
	          result[i] = product;
	      }
	System.out.println(Arrays.toString(result));
	}
			}
