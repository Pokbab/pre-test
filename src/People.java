
/*
 * @(#)People.java $version 2015. 5. 30.
 *
 * Copyright 2015 NHN Ent. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author Kanghoon Choi
 */
public class People {
	
	private State state;

	public void drink(Alcohol alcohol) {
		if (alcohol.getProof() > 10) {
			state = State.꽐라;
		} else {
			state = State.멀쩡;
		}
	}
	
	public void speak() {
		if (state == State.꽐라) {
			System.out.println("왈왈!");
		} else {
			System.out.println("야야 정신차려");
		}
	}
}
