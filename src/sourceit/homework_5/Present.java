package sourceit.homework_5;

import java.util.Arrays;

public class Present {
	
	private static final int DEFAULT_GIFT_CAPACITY = 10;
	private Sweet[] sweets;
	private int lastIndexAdded;
	
	{
		sweets = new Sweet[DEFAULT_GIFT_CAPACITY]; 
	}
	
	// the method filters sweets by sugar weight inclusively 
	public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
		int matchSweetAmount = 0;
		for (Sweet sweet : sweets) {
			if(sweet != null && (sweet.getSugarWeight()<=minSugarWeight) 
					&& (sweet.getSugarWeight()>=maxSugarWeight)){
				matchSweetAmount++;
			}
		}
		
		Sweet[] filteredSweets = new Sweet[matchSweetAmount];
		int index = 0;
		for (Sweet sweet : sweets) {
			if(sweet != null && (sweet.getSugarWeight()<=minSugarWeight) 
					&& (sweet.getSugarWeight()>=maxSugarWeight)) {
				filteredSweets [index] = sweet;
			}
			
		}
		return filteredSweets;
	}

	// the method calculates total weight of the present
	public double calculateTotalWeight() {
		double sumWeight = 0;
		for(Sweet sweet : sweets) {
			if(sweet != null) {
				sumWeight += sweet.getWeight();
			}
		}
		return sumWeight;
	}

	// the method that adds sweet to the present
	public void addSweet(Sweet sweet) {
		if(sweets == null) {
			return;
		}
		if(sweets.length <= lastIndexAdded) {
			sweets = Arrays.copyOf(sweets, sweets.length*2);
		}
		sweets[lastIndexAdded++] = sweet;
	}

	// the method returns copy of the Sweet[] array so that nobody could 
	// modify state of the present without addSweet() method. 
	// Also array shouldn’t contain null values.
	public Sweet[] getSweets() {
		int nonNullSweetsAmount = 0;
		for (Sweet sweet : sweets) {
			if(sweet != null) {
				nonNullSweetsAmount++;
			}
		}
		
		Sweet[] nonNullSweets = new Sweet[nonNullSweetsAmount];
		int index = 0;
		for (Sweet sweet : this.sweets) {
			if (sweet != null) {
				nonNullSweets[index++] = sweet;
			}
		}

		return nonNullSweets;
	}

}
