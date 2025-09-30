package basic.java;

import java.util.Scanner;

public class AdditionScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("Addition of a="+a+" and b ="+b+" is "+c);

}

}
