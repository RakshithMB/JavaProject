package com.amazon.javaPractice;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		twodimensionalarray();

	}
	
	
	public static void twodimensionalarray()
	
	
	{
		int [][] array1 = new int [3][4];
		
		array1[0][0] = 33;
		array1[0][1] = 44;
		array1[0][2] = 55;
		array1[0][3] = 66;
		array1[1][0] = 77;
		array1[1][1] = 88;
		array1[1][2] = 99;
		array1[1][3] = 22;
		array1[2][0] = 11;
		array1[2][1] = 00;
		array1[2][2] = 111;
		array1[2][3] = 222;
		
		for(int row=0; row<3; row++){
			
		for(int col=0; col<4; col++){
		
		System.out.println(array1[row][col]);
		
		}
		
	}

}
}
