import java.util.ArrayList;
import java.util.Timer;

import Pentomino.Board;
import Pentomino.Controller;
import Pentomino.Interfaces.Control;
import Pentomino.Interfaces.TetrisGame;

import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Hirn extends ArrayList<Neurons> implements KeyListener {
	ArrayList<OutputNeuron> op;
	ArrayList<ColorNeuron> screenZeugs;
	ArrayList<InputNeuron> ip;
	Control control;
	private javax.swing.Timer outputTimer;
	
	public Hirn(int i) {
		super(i);
	}

	public void addInput(final Control control, Canvas p) {
		this.control = control;
		//tetrisGame.addInputListener(inputChanged);
		ip = new ArrayList<InputNeuron>(Control.Buttons.values().length);
		for (int i = 0; i<Control.Buttons.values().length; i++){
			ip.add(new InputNeuron(Control.Buttons.values()[i]));
			
		}
		p.addKeyListener(this);


	   
		
	}

	public void addInputScreen(Board board) {
		screenZeugs = new ArrayList<ColorNeuron>(Control.Buttons.values().length);
		
		//this.addAc();
	}

	public void addOutput(TetrisGame tetrisGame) {
		
		op = new ArrayList<OutputNeuron>(Control.Buttons.values().length);
		for (int i = 0; i<Control.Buttons.values().length; i++){
			op.add(new OutputNeuron(Control.Buttons.values()[i]));
			
		}
		
		//hirn.addOutput(p.getGame());
		// this.addAll(tetrisGame);
		
	}

	public boolean isReadyToLearn() {
		if (ip.size()!= 0 && screenZeugs.size()!=0 ) return true;
		return false;
	}

	public boolean hasInput() {
		if (ip.size()!= 0 && screenZeugs.size()!=0 ) return true;
		return false;
	}

	public void learn() {
		ActionListener screenChanged = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		//tetrisGame.addScreenListener(screenChanged);
	}

	public void play() {
		outputTimer = new javax.swing.Timer(100, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < op.size(); i++) {
					control.overRideButton(op.get(i).getButton(),op.get(i).isFiring());
				}
				
				
			}
		});
		outputTimer.start();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (ip==null)return;
		for (int i = 0; i<ip.size(); i++){
			if (control.isButtonPressed(Control.Buttons.values()[i])){
				ip.get(i).setOn();
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
