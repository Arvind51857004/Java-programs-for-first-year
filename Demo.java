package test;


public enum Demo {
	
	Volvo("low"),maruti("high"),ferrari("medium");

    private String action;


private Demo(String action) {
	this.action=action;
}


public static void main(String[] a) {
	
	Demo[] d=Demo.values();
	
	for(Demo k:d) {
		System.out.println("model: "+ k.name() + " cost: "+k.action);
	}
	
	
	


}}
