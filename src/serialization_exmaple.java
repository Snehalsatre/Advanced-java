import java.io.Serializable;

public class serialization_exmaple implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	int rollno;
	double percentage;
	
	serialization_exmaple(String name,int rollno,double percentage){
		
		this.rollno = rollno;
		this. name =  name;
		this.percentage = percentage;
	}
	{
		
	}
}
