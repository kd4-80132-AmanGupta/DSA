package com.sunbeam;

public class Main5 {
	public static void main(String[] args) {
		
//	3. find the first non-repeating element:
//		Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 }
//		Ouput: 3
		
	int arr[] = {1,2,2,1, 0, 4, -1, 7, 8 };
	for(int i=0;i<arr.length;++i) {
		boolean flag = false;
		
		for(int j=0;j<arr.length;++j) {
			
			if(arr[i] == arr[j] && i!=j) {
				flag=true;
				break;
			}
			
		}
		if(!flag) {
			System.out.println("first non repeating element is : "+arr[i]);
		    break;
		}
		
      }
	
	
	
	}

	
	

}
