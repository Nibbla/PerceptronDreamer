import java.util.Random;

import Pentomino.Interfaces.Control.Buttons;


public class OutputNeuron extends Neurons{

	private Buttons button;
	
	protected Buttons getButton() {
		return button;
	}

	public OutputNeuron(Buttons buttons) {
		this.button = buttons;
	}
	
	public boolean isFiring(){
		Random r = new Random();
		return r.nextBoolean();
	}

}
