package io.design.pattern.main;

import io.design.pattern.decorator.Circle;
import io.design.pattern.decorator.Rectangle;
import io.design.pattern.decorator.RedShapeDecorator;
import io.design.pattern.decorator.Shape;

public class DecoratorPatternMain {

	public static void main(String[] args) {
		Shape circle = new Circle();

		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		redRectangle.draw();
	}

}
