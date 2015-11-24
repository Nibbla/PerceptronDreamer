import Pentomino.Interfaces.Control.Buttons;


public class InputNeuron extends Neurons {

	private Buttons button;

	public InputNeuron(Buttons buttons) {
		this.button = buttons;
	}
	
	public String toString(){
		return button.name();
		
	}

}
