class ArrayPractise{
	public static void main(String args[]){


		//declare and initilaize a string array with three elements
		String[]str = {"Much", "More","Java"};


		//declare an empty integer array with three elements
		int[]num = new int[3];

		//Assign values to the first two integer array elements
		num[0] = 100;
		num[1] = 200;

		//Assign a new value tot he second string array element
		str[1] = "Better";

		//output the length of each array and the content of all elemetns in each aray
		System.out.println("String array length is "+str.length);
		System.out.println("Integer array length is "+num.length);
		System.out.println(num[0] + "," +num[1]+","+num[2]);
		System.out.println(str[0]+str[1]+str[2]);



	}



}