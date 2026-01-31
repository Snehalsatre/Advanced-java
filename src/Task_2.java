
public class Task_2{
	
	public void  checkoddnumber(int num)throws Exception
	{
		if(num % 2 == 0)
		{
			System.out.println("Number is even");
		}else {
			throw new Exception("Number should be is odd");
		}
	}
	public static void main(String [] args)
	{
		Task_1 tobj = new Task_1();
		try
		{
			tobj.checkoddnumber(11);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
