package io.design.pattern.main;

import io.design.pattern.proxy.Image;
import io.design.pattern.proxy.ProxyImage;

public class ProxyPatternMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Image image = new ProxyImage("test.jpg");

		// image will be loaded from disk
		image.display();
		System.out.println("---");

		// image will not be loaded from disk
		image.display();
	}

}