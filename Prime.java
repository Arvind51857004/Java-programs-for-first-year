package test;

import java.math.BigInteger;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=10;
		int rem=2;
		boolean prime=true;
		
		while(rem<number) {
		
		if(number%rem==0) {
			//System.out.println("the given no is not a prime number: "+number);
			prime=false;
			rem++;
		}
		}
		
		//boolean flow=BigInteger.valueOf(number).isProbablePrime(1);
		//System.out.println(flow);
		
		if(prime) {
			System.out.println("it's not a number");
		}else {
			System.out.println("it's prime number");
		}

	}

}
