package com.incubyte.tdd;

public class Exercise2 {

	int add(String numbers)
	{
		if(numbers=="")
			return 0;
		String[] numbersArray = numbers.split(",");
		int res=0;

			for (String number : numbersArray) 
			{
				int temp=Integer.parseInt(number); 
				res+=temp;
			}
	
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise2 e=new Exercise2();
		System.out.println(e.add("1,2,3,4,5"));

	}

}
