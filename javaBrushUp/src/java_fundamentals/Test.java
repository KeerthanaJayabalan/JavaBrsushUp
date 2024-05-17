package java_fundamentals;

import java.util.Scanner;

class Test {
	public static boolean isPrime(int n){
		if(n<=1){
			return false;
		}
		for(int i=2; i<=Math.sqrt(n); i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		sc.close();
		for(int num=2; num<=n; num++){
			if(isPrime(num)){
				System.out.print(num+" ");
			}
		}

	}

}