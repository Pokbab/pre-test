
/*
 * @(#)Main.java $version 2015. 5. 30.
 *
 * Copyright 2015 NHN Ent. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author Kanghoon Choi
 */
public class Main {

	public static void main(String[] args) {
		People 친구1 = new People();
		People 친구2 = new People();
		
		친구1.drink(new Soju());
		친구2.drink(new Beer());
		
		친구1.speak();
		친구2.speak();
	}
}
