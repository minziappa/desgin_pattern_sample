package io.design.pattern.main;

import io.design.pattern.prototype.Shape;
import io.design.pattern.prototype.ShapeCache;

public class PrototypeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Start time >> " );

		ShapeCache.loadCache();

		Shape clonedShape = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape.getType());

		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());

		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape3.getType());
	}

}