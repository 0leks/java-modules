package _03_tea_maker;

/*
 * Look at TeaMaker.java for instructions
 */

public class Kettle {
	
	Water water;
	
	Kettle(Water water){
		this.water = water;
	}

	Water getWater() {
		return water;
	}

	void boil() {
		this.water.isHot = true;
	}
	
}
