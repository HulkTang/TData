package tester;

import java.util.Date;
import java.util.Scanner;

import stack.AutoStack;
import stack.IStack;
import stack.Stack;

public class StackTester {
	private static Scanner s = new Scanner(System.in);
	public StackTester(){
	}
	
	public static void test(){
		IStack<TestClass> stack = new AutoStack<TestClass>(10,4);
		int order = 0;
		while(true){
			printInfo();
			order = s.nextInt();
			switch(order){
			case 1:
				stack.push(newTestClass());
				break;
			case 2:
				TestClass pop = stack.pop();
				System.out.println(pop.getNumber() + " " + pop.getName() + " " + pop.getDate());
				break;
			case 3:
				stack.grow();
				break;
			case 4:
				stack.grow(5);
				break;
			case 5:
				stack.trimToSize();
				break;
			case 6:
				System.out.println(stack.size());
				break;
			case 7:
				System.out.println(stack.stackSize());
				break;
			}
		}
	}
	
	private static void printInfo(){
		System.out.println("1.push");
		System.out.println("2.pop");
		System.out.println("3.grow");
		System.out.println("4.grow with number");
		System.out.println("5.trim");
		System.out.println("6.size");
		System.out.println("7.stackSize");
	}
	
	private static TestClass newTestClass(){
		int number;
		String name;
		Date date = new Date();
		System.out.println("type number and name:");
		number = s.nextInt();
		name = s.next();
		return new TestClass(number, name, date);
	}

}
