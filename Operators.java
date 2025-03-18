package program;

public class Operators {
	
public static void main(String[] args) {
	
	//Arithmetic 
	int a=10,b=12;
	System.out.println("Addition:"+(a+b));
	System.out.println("Subtraction:"+(a-b));
	System.out.println("Multiplication:"+(a*b));

    //Relational
	System.out.println("Equal to:"+(a==b));
	System.out.println("Not equal to:"+(a!=b));
	System.out.println("Greater than:"+(a>b));
	System.out.println("Less than:"+(a<b));

    //Logical
	boolean c1=true , c2=false;
	System.out.println("Logical and:"+(c1 && c2));
	System.out.println("Logical or:"+(c1 || c2));
	System.out.println("Logical not:"+(!c1));
    
	//Unary
	System.out.println("Unary negation or Bitwise NOT:"+(~a));
	System.out.println("Pre increment:"+(a++));
	System.out.println("Post increment:"+(++a));
	System.out.println("Value:"+a);
	System.out.println("Pre decrement:"+(a--));
	System.out.println("Post decrement:"+(--a));
	
	//Assignment
	a+=5;
	System.out.println("+=:"+a);
	a-=4;
	System.out.println("-=:"+a);
	
	//Ternary
	String res=(a<b)? "a is greater than b" : "B is greater than A";
	System.out.println("Result:"+res);
	
	//Bitwise
	System.out.println(a);
	System.out.println(b);
	System.out.println("Bitwise AND:"+(a&b));
	System.out.println("Bitwise OR:"+(a|b));
	System.out.println("Bitwise XOR:"+(a^b));
	
	//Shift
	a = 5;
	b = 3;
	System.out.println(a>>2);
	System.out.println(b<<1);

}

}
