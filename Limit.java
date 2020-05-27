package Taylor_Series;

public class Limit {

	private double evaluation;
	private String Eval;

	public Limit(Polynomial f, double approach) {
		this.evaluation = evaluateLimit(f, approach);
	}

	public String getVal() {
		return Eval;
	}

	public double getNum() {
		return evaluation;
	}
<<<<<<< HEAD
	
	private double evaluateLimit(Polynomial f, double approach) {
		double temp = 0;
		for (int i=0; i <= f.getCoefSize()-1; i++) {
			temp += Math.pow(f.getCoef(i), f.getDeg()-i);
		}
		return temp;
=======

	private double evaluateLimit(Polynomial f, double approach) {
		int counter = 0;
		for (int i = f.sizeOfPoly(); i <= 0; i--) {
			this.evaluation = f.getCoef(i) * Math.pow(approach, f.getDeg() - counter);
			counter++;
		}
		return this.evaluation;
>>>>>>> 387785ed4b3034f2034e214ec320e556fabf2048
	}
}
