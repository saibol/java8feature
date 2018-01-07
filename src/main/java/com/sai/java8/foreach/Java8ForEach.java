package com.sai.java8.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;

/**
 * This class demonstrate example of foreach 
 * -------------------------------------------
 * Java 8 has introduced forEach method in java.lang.Iterable interface 
 * so that while writing code we focus on business logic only. forEach method takes 
 * java.util.function.Consumer object as argument, so it helps in having our business 
 * logic at a separate location that we can reuse
 * 
 * forEach method helps in having the logic for iteration and business logic at separate 
 * place resulting in higher separation of concern and cleaner code
 * 
 * @author saibol
 */
public class Java8ForEach {

	/**
	 * This is entry point of application 
	 * @param args
	 */
	public static void main(String[] args) {
		List<Passbook> passbooks = new ArrayList<>();
		
		IntStream.range(0, 10).forEach(x -> passbooks.add(new Passbook(x)));
		
		// approach-1 - with anonymous class
		passbooks.forEach(new Consumer<Passbook>() {
			public void accept(Passbook passbook) {
				System.out.println("validating passbook ["+passbook.getNumber()+"]");
			}
		});
		
		// approach-2 - without anonymous class
		PrintPassbook printPassbook = new PrintPassbook();
		passbooks.forEach(printPassbook);

	}//end-main
}//end-class

