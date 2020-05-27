package Taylor_Series;

public class Limit {

	private double evaluation;
	private String Eval;
	
	public Limit(Polynomial f, double approach) {
		this.evaluation = evaluateLimit(f,approach);
	}

	public String getVal() {
		return Eval;
	}
	
	public double getNum() {
		return evaluation;
	}
	
	private double evaluateLimit(Polynomial f, double approach) {
		double temp = 0;
		for (int i=0; i <= f.getCoefSize()-1; i++) {
			temp += Math.pow(f.getCoef(i), f.getDeg()-i);
		}
		return temp;
	}
}
