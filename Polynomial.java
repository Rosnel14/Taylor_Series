package Taylor_Series;

import java.util.ArrayList;

public class Polynomial {

	private int degree;
	private double[] coefficients; //Gonna change to an array 
	
	public Polynomial(int degree, double[] coefficients {
		this.degree = degree;
		for (int i=0; i<= coefficients.size()-1; i++) {
			this.coefficients.add(coefficients.get(i));
		}
		
	}
	
	public int getDeg() {
		return degree;
	}
	
	public double getCoef(int index) {
		return this.coefficients.get(index);
	}
	
<<<<<<< HEAD
	public int getCoefSize() {
		return this.coefficients.size();
=======
	public int sizeOfPoly() {
		return coefficients.size();
>>>>>>> 387785ed4b3034f2034e214ec320e556fabf2048
	}
}
