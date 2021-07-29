package LambdaDemos;

@FunctionalInterface //we write this to inform other developers that what follows is a functional interface

interface myLambdaDemo{
	public String add(String str1, String str2);
	
	//also allowded in java interface
//	public static void demo() {
//		System.out.println("hello");
//	}
//	
//	public default void demo1() {
//		
//	}
//		
}

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myLambdaDemo d = (String s1,String s2) -> {return s1.concat(s2);};
		
		System.out.println(d.add("vishal","rao"));
		
	}

}
