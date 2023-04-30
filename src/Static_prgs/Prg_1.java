
package Static_prgs;

class test{
	static int a,b,c; //static variable
	int m,n,o;  //non static variable
	
	//static block
	static {
		a=10;b=20;c=30;
	//	m=10; n=45;g=56; //error we cannot access not static variabels in the static block
	}
	
	//non static block
	{
		m=45;n=67;o=90;
		a=101;b=201;c=301;   //we can access the static variables in non static block
	}
	
	//static method
	static void display() {
		System.out.println(a+"--"+b+"--"+c);
		
	//	System.out.println(m+"--"+n+"--"+o); // error we cannot access the non static reference 
		
		
	}
	
	//non static method
	void display2() {
		System.out.println(m+"--"+n+"--"+o);
		System.out.println(a+"--"+b+"--"+c);//we can access the static variables in non static method
		
	}
	
}
public class Prg_1 {

	public static void main(String[] args) {
		System.out.println("Before object creation & before value assignment="+test.a+"--"+test.b+"--"+test.c);
		test.a=1001;
		test.b=2001;
		test.c=3001;
		test.display();
		
		System.out.println("Before object creation & after value assignment="+test.a+"--"+test.b+"--"+test.c);
		
		test t1 =new test();
		t1.m=12;
		t1.n=15;
		t1.o=33;
		t1.display2();
	}

}

//Output:-
//Before object creation & before value assignment=10--20--30
//1001--2001--3001
//Before object creation & after value assignment=1001--2001--3001
//12--15--33
//101--201--301

