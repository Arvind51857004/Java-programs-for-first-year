package nullpointerexception;

import java.util.Optional;

public class Optiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] name=new String[5];
       
       Optional<String> ab=Optional.ofNullable(name[1]);
       
       if(ab.isPresent()) {
    	   System.out.println(name[1]);
       }else {
    	   System.out.println("data not present");
       }
	}

}
