package _04_popcorn;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */


/* Your mission and you have to accept it:
 * 
 * Create a PopcornMaker class (in the popcorn package) and add a main method to it. 
 * The main method should create a bag of Popcorn and cook it in the microwave.
 * Ask the user for the flavor of the popcorn and the number of minutes to cook it.
 * Look through the code of the Popcorn and Microwave classes.
 * Don't change the existing methods.
 */

public class Popcorn {

	private int kernels = 20;
	private String flavor;
	private boolean isCooked = false;

	Popcorn(String flavor) {
		this.flavor = flavor;
		System.out.println("Popcorn says: making package of " + this.flavor + " popcorn.");
	}

	public void eat() {
		if (isCooked) {
			System.out.println("Popcorn says: Time to eat popcorn!");
		} else {
			System.out.println("Don't eat the popcorn. Not all the kernels have popped!");
		}
	}
	
	public void applyHeat() {
		pause();

		if (kernels == 0) {
			isCooked = true;
		} else {
			System.out.println("POP!" + kernels);
			kernels--;
		}
	}

	private void pause() {
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}


