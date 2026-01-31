
public class Array_outof_bound {
	public static void main(String [] args)
	{
		int arr[] = {10,20,30,40,50};
		System.out.println("Array:"+arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		
		try{
			arr[5] = 6;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Message:"+e.getMessage());
			System.err.println("Message 2: "+e.getMessage());
		}
		
	}
}
