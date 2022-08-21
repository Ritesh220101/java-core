package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.IEmotionable;
import com.aurionpro.model.IMannerable;
import com.aurionpro.model.Man;

public class InterfaceTest {

	public static void main(String[] args) {
		Man man = new Man();
		Boy boy = new Boy();
		atTheParty(man);
		atTheMovie(man);
		atTheParty(boy);
//		atTheMovie(boy); this gives an error beacuse boy implements only IMannerable but the atTheMovie method is of IEmotionable interface reference
		

	}

	private static void atTheMovie(IEmotionable person) {
		person.cry();
		person.laugh();
	}

	private static void atTheParty(IMannerable person) {
		person.greet();
		person.depart();	
	}

}
