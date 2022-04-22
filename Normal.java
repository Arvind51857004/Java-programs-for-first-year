package demo1;

public class Normal {
	
	int value=100;
	static int king=20;
	
	public void feature() {
		Abnormal ab=new Abnormal();
		 ab.test();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Normal n=new Normal();
			 Abnormal ab=n.new Abnormal(); 
			 ab.test();
			 n.feature();
			 System.out.println(n.value); 
			 System.out.println(ab.value1);
			 
            n.secondclass();
            
	}
	
	//Normal Innerclass
	public class Abnormal{
		
        int value1=300;
		 public void test() {
			 System.out.println("I'm from inner class");
			 Normal n1=new Normal();
				System.out.println(this.value1);
				System.out.println(Normal.this.value);
		 }
	};
	
	
	
	//Method Inner class
	 public void secondclass() {
		 class King{
			 static int k;
			public void king() {
				System.out.println("I'm from method inner class");
			}
		 };
		 
		 King k1=new King();
		 k1.king();
		 System.out.println(k1.k);
		
		 
	 }

}
