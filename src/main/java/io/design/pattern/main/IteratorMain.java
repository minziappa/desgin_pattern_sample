package io.design.pattern.main;

import io.design.pattern.iterator.Iterator;
import io.design.pattern.iterator.NameRepository;

public class IteratorMain {

	public static void main(String[] args) {
		NameRepository namesRepository = new NameRepository();

//		for(Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
//			String name = (String)iter.next();
//			System.out.println("Name : " + name);
//		}

		Iterator iter = namesRepository.getIterator();
		while (iter.hasNext()) { 
			String name = (String)iter.next();
			System.out.println("Name : " + name);
		}
	}

}