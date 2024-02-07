package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What number to check up to?");
		int n = in.nextInt();
		
		int[] numbers = new int [n+1];
		for(int j=2 ; j<=n ; j++) {
			if(numbers[j]==0) {
				for(int i=j ; i<=n ; i++) {
					numbers[j*i]=1;
					
				}
			}
		}
		for(int k = 2 ; k<=n ; k++) {
			if(numbers[k]==0)
				System.out.println(k);
		}
		}
	}

