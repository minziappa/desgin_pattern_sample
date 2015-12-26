package io.design.pattern.main;

import io.design.pattern.facade.ShapeMaker;

public class FacadePatternMain {

	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();

	}

}
