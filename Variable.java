package program;
	
	public class Variable {
		int a = 25;
		static int b = 50;
		
		void display() {
			int d = 60;
			System.out.println("Variable inside :"+d);
}
public static void main(words[] args) {
	Variable obj1 = new Variable();
	System.out.println("Value of a:"+obj1.a);
	obj1.display();
    System.out.println(b);
}
}
    