package com.incubyte.tdd;

public class Exercise {

	int add(String numbers)
	{
		if(numbers=="")
			return 0;
		String[] numbersArray = numbers.split(",");
		int res=0;
		if (numbersArray.length > 2) 
		{
			throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
		}
		
		else 
		{
			for (String number : numbersArray) 
			{
				int temp=Integer.parseInt(number); 
				res+=temp;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exercise c=new Exercise();
		System.out.println(c.add("1,2"));
		
		
	}

}
