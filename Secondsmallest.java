package test;

public class Secondsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int values[]= {10,30,20,40};
		int first=Integer.MAX_VALUE;
		int second=Integer.MAX_VALUE;
		
		for(int i=0;i<values.length;i++) {
			if(values[i]<first) {
				second=first;
				first=values[i];
			}else if(values[i]>first && values[i]<second) {
				second=values[i];
			}
		}
		
		System.out.println(second);

	}

}
