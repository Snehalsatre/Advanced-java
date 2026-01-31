import java.util.Scanner;
 class illigalException extends Exception {
	public static final long serialVersionUID = 11;
		public illigalException()
		{
			System.out.println("Illigal Data Type...");
			
		}
}

public class illigal_exception {

	
	int checkDataType(String num)throws illigalException
	{
		return Integer.parseInt(num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		illigal_exception tobj = new illigal_exception();
		Scanner sc = new Scanner(System.in);
		String numm = sc.nextLine();
		try {
			int nummm = checkDataType(numm);
		}catch(illigalException e)
		{
			
		}
	}

}
