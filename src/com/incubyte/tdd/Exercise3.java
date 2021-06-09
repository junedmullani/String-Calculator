package com.incubyte.tdd;

public class Exercise3 {

	int add(String numbers)
	{
		if(numbers=="")
			return 0;
		String[] numbersArray = numbers.split("\n");
		
		int res=0;
		if(numbersArray[numbersArray.length-1].endsWith(","))
			throw new RuntimeException("Input is not ok");

			for (String number : numbersArray) 
			{

				
				String s[]=number.split(",");
				for(String g:s)
				{
					int temp=Integer.parseInt(g); 
					res+=temp;
				}
			}
	
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exercise3 e=new Exercise3();
		System.out.println(e.add("1\n2,3"));
	}

}
