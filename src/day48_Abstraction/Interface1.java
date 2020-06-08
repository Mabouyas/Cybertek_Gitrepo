package day48_Abstraction;

public interface Interface1 {
	
	//  public Interface2(){ }
	
	// public void method1(){ }
	
	// { }
	
	int a = 100;
	
	public static void main(String[] args) {
		System.out.println(a);// by default static
		//  a = 200; // by default final
		
		System.out.println( Interface1.a );
		Interface1.method4();
		
	}
	
	static void method4(){ }
	
	void method5();
	
	default void method6(){
		System.out.println("Default method");
	}
	
	
}
