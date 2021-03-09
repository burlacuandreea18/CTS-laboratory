package ro.se.cts.g1092.refactoring.phase3;

import ro.se.cts.g1092.refactoring.exceptions.InvalidValueException;

public class SalesStrategy{
	
	public static final int FIDELITY_YEARS_THRESHOLD=10;
	public static final float MAX_FIDELITY_DISCOUNT=0.15f;
	
	public static float getFidelityDiscount(int yearsSinceRegistration) {
		return (yearsSinceRegistration>FIDELITY_YEARS_THRESHOLD)? MAX_FIDELITY_DISCOUNT: (float)yearsSinceRegistration/100;;
	}

	public static float getPriceDiscount(float initialPrice, ProductType,)
	
	public float ComputeFinalPrice(
			ProductType productType, float initialPrice, int yearsSinceRegistration) throws InvalidValueException 
	  {
		
		if(initialPrice<=0 || yearsSinceRegistration<0) {
			throw new InvalidValueException();
		}
		
		
	    float finalResult = 0;
	    float fidelityDiscount = (yearsSinceRegistration > FIDELITY_YEARS_THRESHOLD) ? MAX_FIDELITY_DISCOUNT : (float)yearsSinceRegistration/100; 
	    
	    switch(productType) {
	    case NEW:
	    	finalResult = initialPrice;
	    	break;
	    case DISCOUNT:
	    	finalResult = (initialPrice - (ProductType.DISCOUNT.getDiscount() * initialPrice)) - fidelityDiscount * (initialPrice - (ProductType.DISCOUNT.getDiscount() * initialPrice));
	 	   	break;
	    case LIMITED_STOCK:
	    	finalResult = (initialPrice - (ProductType.LIMITED_STOCK.getDiscount()* initialPrice)) - fidelityDiscount * (initialPrice - (ProductType.LIMITED_STOCK.getDiscount()* initialPrice));
	 	   	break;
	    case LEGACY:
	    	finalResult = (initialPrice - (ProductType.LEGACY.getDiscount() * initialPrice)) - fidelityDiscount * (initialPrice - (ProductType.LEGACY.getDiscount() * initialPrice));
	 	   	break;
	 	default:
	 		throw new UnsupportedOperationException("Type not managed");	
	    }
	    return finalResult;
	  }
}
