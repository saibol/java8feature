package com.sai.java8.foreach;

import java.util.function.Consumer;

class PrintPassbook implements Consumer<Passbook>{

	@Override
	public void accept(Passbook passbook) {
		System.out.println("Printing passbook ["+passbook.getNumber()+"]");
	}
	
}
