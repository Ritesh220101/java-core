package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.Infant;
import com.aurionpro.model.Kid;
import com.aurionpro.model.Man;

public class ManBoyTest {

	public static void main(String[] args) {
		case1();// Reference and object is of the type(Parent)
		case2();// Reference and object is of the type(Child)
		case3();// Reference type is of parent and the object type is of child
		case4();// Reference type is of child and the object type is of Parent (it cannot be
				// done).
		case5();//Polymorphism
		case6();//Auto Boxing
	}

	private static void case1() {
		Man man = new Man();
		man.read();
		man.play();
	}

	private static void case2() {
		Kid kid = new Kid();
		kid.read();
		kid.play();
	}

	private static void case3() {
		Man man = new Boy();
		man.read();
		man.play();
	}

	private static void case4() {
		// Infant infant = new Man()//Errror
	}

	private static void case5() {
		atThePark(new Man());
		atThePark(new Kid());
		atThePark(new Boy());
		atThePark(new Infant());
	}

	private static void case6() {
		Object obj;
		obj = 1;
		System.out.println(obj.getClass());
		obj = "Ritesh";
		System.out.println(obj.getClass());
		obj = 1 > 2;
		System.out.println(obj.getClass());

	}

	private static void atThePark(Man man) {
		man.read();
	}
}
