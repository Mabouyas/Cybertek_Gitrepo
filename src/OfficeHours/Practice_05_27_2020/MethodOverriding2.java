package OfficeHours.Practice_05_27_2020;

public class MethodOverriding2 {
	void method1(){
	
	}
	
	public static void method2(){  }
	
	public MethodOverriding2(){ }
	
}

class TestClass extends MethodOverriding2 {
	
	@Override
	protected void method1(){
	
	}
	
	//   @Override
//    public static void method2(){ }

//    public methodOverriding2(){ }

}
