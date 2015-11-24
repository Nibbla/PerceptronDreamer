import java.util.ArrayList;

import Pentomino.Controller;
import Pentomino.PentominoMain;
import Pentomino.Interfaces.Control;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean learn = true;
		boolean dream = false;
		boolean feedBackLoop = false;
		boolean outPut = true;
		
		int x = 5;
		int y = 15;
		Hirn hirn = new Hirn(x*y+4+2+1); //Zahl der Neuronen an einer Ebene		
		
		
		PentominoMain.main(null);
		PentominoMain p = PentominoMain.getInstance();
		
		
		
		hirn.addInput(p.getController(), p);
		
		hirn.addInputScreen(p.getBoard());
		hirn.addOutput(p.getGame());
		
		if (learn) if (hirn.isReadyToLearn()) hirn.learn();
		if (dream){
			if (hirn.hasInput()) dream(hirn);//trying to do the perceptronThingy,
		}
		if (outPut) {
			hirn.play();
		}
	}

	

	private static void dream(Hirn hirn) {
		// TODO Auto-generated method stub
		
	}

	private static void learn(ArrayList<Neurons> hirn) {
		// TODO Auto-generated method stub
		
	}

}
