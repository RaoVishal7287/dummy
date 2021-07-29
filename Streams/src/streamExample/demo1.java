package streamExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> nameList = Arrays.asList("Dinesh", "Ross", "Kagiso", "Steyn"); 
		
		nameList.forEach(System.out::println);

		Stream<String> stream = nameList.stream(); 
		
//		stream.forEach(System.out::println); 
//		stream.forEach(System.out::println); 
//		
//		
		List<String> names = new ArrayList<String>(); 
//
		names.add("David"); 
		names.add("Johnson"); 
		names.add("Samontika"); 
		names.add("Brijesh"); 
		names.add("John");  
//		//Normal Execution 
		names.stream().filter((String name) -> name.length() >= 8).forEach(System.out::println); 

		names.stream().filter((String name) -> name.length() >= 8).forEach(System.out::println);
		
	}

}
