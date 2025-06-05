/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * Class Name: Ed02UpperBoundwildCard.java <br/>
*/
package com.pcwk.ehr.ed02;

import java.util.List;

public class Ed02UpperBoundwildCard {
	//상한 제한 와일드 카드는 특정 타입의 하위 클래스나 그 타입 자체를 허용 함. 
	//즉, 상위 클래스에 대한 제한을 둠. 
	
	public static void printAnimals(List<? extends Animal>animals) {
		for(Animal animal : animals) {
			System.out.println(animal.getClass().getSimpleName());
		}
	}
	public static void main(String[] args) {
		
		List<Dog> dogList = List.of(new Dog(),new Dog());
		List<Cat> catList = List.of(new Cat(),new Cat());
		List<Animal> animalList = List.of(new Animal(),new Animal());
		
		printAnimals(dogList);
		printAnimals(catList);
		printAnimals(animalList);
	}

}
