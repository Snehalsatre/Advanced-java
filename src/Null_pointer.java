//public class student
//{
//	String city;
//}

public class Null_pointer {
	
	public void checkNumber(int num)throws Exception
	{
		if(num > 0)
		{
			System.out.println("Number is positive");
		}
		else
		{
			//System.out.print("Number is Negative");
			throw new Exception();
		}
	}
	
	public static void main(String args[]) throws NullPointerException{
		Null_pointer obj = new Null_pointer();
		try
		{
			obj.checkNumber(-10);
		}catch(Exception e){
			e.printStackTrace();
		}
	
//	String s = null;
//	
//	try {
//		System.out.println(s.length());
//		
//		NullPointerException e = new NullPointerException();
//		throw e;
//		
//		throw new NullPointerException();
//		
//	}catch(NullPointerException e)
//	{
//		e.printStackTrace();
//	}
		
	}
}

