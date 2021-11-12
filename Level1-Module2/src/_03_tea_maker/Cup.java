package _03_tea_maker;

/*
 * Look at TeaMaker.java for instructions
 */

public class Cup {

	private TeaBag teabag;

	void makeTea(TeaBag teabag, Water hotWater) {
		this.teabag = teabag;
		if (hotWater.isHot())
			System.out.println("Making hot " + teabag.getFlavor() + " tea.");
		else
			System.out.println("Can't make tea with cold water! ");
	}

}
