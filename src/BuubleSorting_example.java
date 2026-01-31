
public class BuubleSorting_example {

	
	public void bubbleSort(String[] data)
	{
		int n = data.length;
	
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n-i-1;j++) {
				
				if(data[j].compareTo(data[j+1])>0) {
					
					String temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuubleSorting_example bobj = new BuubleSorting_example();

		
		String data[] = {"Snehal","Sakshi","Anuhska"};
		
		
		
		
		
//		int data[] = {6,5,2,8,9};
		System.out.println("Array before Sorting:");
		
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]+ " ");
			
		}
		bobj.bubbleSort(data);
		System.out.println("\nArray After sorting : ");
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]+ " ");
		}
	}

}
