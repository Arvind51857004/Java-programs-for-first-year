package test;

public class Secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int values[]= {10,30,20,40};
		
		int first=0,second=0;
		
		for(int i=0;i<values.length;i++) {
			if(values[i]>first) {
				second=first;
				first=values[i];
			}else if (values[i]>second && values[i]!=first) {
				second=values[i];
			}
		}
		
		System.out.println(second);
		

	
		

}
}
