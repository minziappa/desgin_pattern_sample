package io.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		// This is the method which notify the members. 
		notifyAllObservers();
	}

	public void attach(Observer observer){
		observers.add(observer);		
	}

	public void notifyAllObservers() {
		
		// But if there are a lot of members, how much time does it take?
		// Use Thread ?
		for (Observer observer : observers) {
			observer.update();
		}
	}

}