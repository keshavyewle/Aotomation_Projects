package myCoreJavaProject;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// print all the numbers from 1 to 10
		// while loop
		
		System.out.println(" Using while *************************");
		int num1=1;
		while(num1<=10) {
			System.out.println(num1);
			num1=num1+1;
		}
	
		System.out.println("Using while in descending order *************************");
		
		// print all the numbers from 10 to 1
		// while loop
		
		int num2=10;
		while(num2>=1) {
			System.out.println(num2);
			num2=num2-1;
		}
		
		System.out.println("Using for loop *************************");
		// print all the numbers from 1 to 10
		// for loop
		for(int num3=1;num3<=10;num3++) {
			
			System.out.println(num3);
		}
		
		System.out.println("Even numbers Using for loop *************************");
		
		// Find even numbers between 1 to 50 using for loop
		for(int num4=2;num4<=50;num4+=2) {
			
			System.out.println(num4);
		}
		
		// for each loop
		System.out.println("Using for each loop *************************");
		
		int[] arr1 = {50,54,12,23,43,90};
		int sum = 0;
		for(int value:arr1) {
			
			System.out.println(value);
			sum+=value;
			
		}
		System.out.println("Sum is " + sum);
		
		//**************************************
		
		String str = "Automation testing using selenium and Java";
		
		
		// solution 1
		int count=1;
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		
		System.out.println("Total num of words are " + count);
		 
		
		//solution2
		
		System.out.println("Total num of words are " + str.split(" ").length);
			
		
	}

}
