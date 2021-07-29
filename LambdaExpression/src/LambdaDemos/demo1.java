package LambdaDemos;

@FunctionalInterface
interface FunctionalInterfaceEX{
	public String saySomething();
	//public void rao();
}


public class demo1{
	

	
	public static void main(String[] args) {
		
		
		//with lambda
		FunctionalInterfaceEX fi = () -> {return "using lambda";};
		System.out.println(fi.saySomething());
//		
		//without lambda
//		demo1 d1 = new demo1();
//		System.out.println(d1.saySomething());
		
	}
	
//	@Override
//	public String saySomething() {
//		// TODO Auto-generated method stub
//		
//		return "without lambda";
//	}
//


}
