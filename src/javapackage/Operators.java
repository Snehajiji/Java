package javapackage;

public class Operators {

	public static void main(String[] args) 
	{
//Arithmetic Operators
		
		int a=20,b=10;
		System.out.println("a+b = "+(a+b));
		System.out.println("The sum is "+(a+b));
		System.out.println("a-b = "+(a-b));
		System.out.println("a*b = "+(a*b));
		System.out.println("a/b = "+(a/b));
		System.out.println("a%b = "+(a%b));

//Assignment Operators(=,+=,-=)
		
		System.out.println(a=b);  //Value of  b is assigned to a
		System.out.println(a+=10);  //a=a+10
		System.out.println(a-=b);
		
//Relational Operators(<,>,<=,>=,!=,==)
		
		int n1=20,n2=20;
		System.out.println(n1<n2);
		System.out.println(n1>n2);
		
//Logical Operators
		
//      A     B     A&&B     A||B      !A       !B
//		F     F       F       F         T        T
//		T     F       F       T         F        T
//		F     T       F       T         T        F
//		T     T       T       T         F        F
		
		String username="abc";
		String pswd="abc123";
		System.out.println(username=="abc" && pswd=="abc123"); //true
		System.out.println(username=="abc1" || pswd=="abc123"); //true
		
//Unary Operator
	// ++ increment operator   //increment by 1
		  //postincrement b++    //increment by 1
		  //preincrement  ++b
	// -- decrement operator   //decrement by 1	
		
		int d=5;
		System.out.println(d++);  //5
		System.out.println(d);  //6
		System.out.println(++d);  //7
		
// Ternary Operator
		// condition?expression1:expression2;
		
		int num1=20,num2=5;
		int value = num1>num2?num1:num2;
		System.out.println(value);
       
	}

}
