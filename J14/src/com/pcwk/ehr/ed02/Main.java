package com.pcwk.ehr.ed02;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	public static void main(String[] args) {
		//Dog dog = new Dog();
		//dog.sound();
		Animal myDog = new Dog(); //업캐스팅
		Animal myCat = new Cat(); //업캐스팅
		
		myDog.sound();//Dog sound() 메서드 호출
		myCat.sound();//Cat sound() 메서드 호출
	}

}
