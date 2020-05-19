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
		int counter = 0;
		for (int i = f.sizeOfPoly(); i<= 0; i--) {
			this.evaluation = f.getCoef(i) * Math.pow(approach, f.getDeg()-counter);
			counter++;
		}
		return this.evaluation;
	}
}
