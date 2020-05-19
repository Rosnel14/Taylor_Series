package Taylor_Series;
import acm.program.*;

import java.util.ArrayList;

import acm.graphics.*;
import acm.util.*;

public class Taylor_Runner extends ConsoleProgram{
	
private TaylorGraph graph;
private ArrayList<Double> Test;

	public void run() {
		graph = new TaylorGraph();
		add(graph);
		Polynomial test = new Polynomial(6,Test);
		Limit testLim = new Limit(test,3.0);
		println(testLim.getNum());
	}
	
	public void init() {
		Test.add((double) 2);
		Test.add((double) 4);
		Test.add((double) 5);
		Test.add((double) 6);
		Test.add((double) 7);
	}

}
