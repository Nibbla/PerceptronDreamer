import java.awt.Color;
import java.util.Random;
import java.util.Scanner;



import Pentomino.Board;
import Pentomino.ColorE;
import Pentomino.PentominoMain;
import Pentomino.Square;
import Pentomino.Interfaces.Display;


 

/**
 * @author Nibbla
 *
 */
public class Perceptron {
	static int countMethod20 = 0;
	static int x = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PentominoMain.main(null);
		Display a = PentominoMain.getDisplayInstance();
		Board Data = new Board(4*5,12*5);
		
		a.setData(Data);
		a.refresh();
		System.out.println("Please press <someKey> + enter");
		Scanner sc = new Scanner(System.in);
		sc.hasNext();
		Square[][] extracted = Data.getFullBoard();
		extracted = Data.getFullBoardShadow().get(0);
		method(extracted);
		if (review(extracted)){
			Data.setFullBoard(extracted);
		}
		Data.setFullBoard(extracted);
		a.setData(Data);
		a.refresh();
		
		
		extracted = Data.getFullBoard();
		extracted = Data.getFullBoardShadow().get(0);
		
		int i =3;
		while(i==3){
		method2(extracted);
			if (review(extracted)){
				System.out.print("reviewPassed");
				Data.setFullBoard(extracted);
				//sc.hasNextInt();
			}
			
			
		Data.setFullBoard(extracted);
		a.setData(Data);
		a.refresh();
		System.out.println("Please press 3 + enter");
		i=3;//sc.nextInt();
		
		}
		sc.close();
		a.close();
	}

	private static boolean review(Square[][] extracted) {
		// TODO Auto-generated method stub
		return true;
	}

	private static void method(Square[][] extracted) {
		int W = extracted.length;
		int H = extracted[0].length;
		for (int w = 0; w<W;w++){
			for (int h = 0; h<H;h++){
				
				extracted[w][h].setC(ColorE.colorM());
			}
			
		}
			
		
	}
	private static void method2(Square[][] extracted) {
		countMethod20++;
		int W = 20;//extracted[0].length; //5*20
		int H = 60;//extracted.length; //15*20
		for (int w = 0; w<W;w=w+1){  //5*12 wollte ich haben... das hat 3...
			for (int h = 0; h<H;h=h+1){
				Color m = ColorE.colorM();
				printLn(extracted, w, h, m, 60);
				
			}
			
		}
			
		
	}

	private static void printLn(Square[][] extracted, int w, int h, Color m, int X) {
		System.out.println(extracted.length); //5*20
		System.out.println(extracted[0].length);
		System.out.println(x);
		int H = extracted.length; //15*20
		
		//int x=0%60;  //why 3 and 5? 3 and 20 would be right. where was the transverse? 5*20
		
		extracted[(h+countMethod20+(x++))%60][(w+countMethod20+(x++))%20].setC(m); //3 if RGB. eine line ist 60
		extracted[(h+countMethod20+(x++))%60][(w+countMethod20+(x++))%20].setC(m);
		extracted[(h+countMethod20+(x++))%60][(w+countMethod20+(x++))%20].setC(m);
		extracted[(h+countMethod20+(x++))%60][(w+countMethod20+(x++))%20].setC(m);
		extracted[(h+countMethod20+(x++))%60][(w+countMethod20+(x++))%20].setC(m);
		
		
		
		countMethod20+=1;
		extracted[(h+countMethod20+(x++))%60][(w+countMethod20+(x++))%20].setC(m);
		extracted[(h+countMethod20+(x++))%60][(w+countMethod20+(x++))%20].setC(m);
		extracted[(h+countMethod20+(x++))%60][(w+countMethod20+(x++))%20].setC(m);
		extracted[(h+countMethod20+(x++))%60][(w+countMethod20+(x++))%20].setC(m);
		extracted[(h+countMethod20+(x++))%60][(w+countMethod20+(x++))%20].setC(m);
		
		
		countMethod20+=1;
		extracted[(h+countMethod20+(x++))%60][(w+countMethod20+(x++))%20].setC(m);
		extracted[(h+countMethod20+(x++))%60][(w+countMethod20+(x++))%20].setC(m);
		extracted[(h+countMethod20+(x++))%60][(w+countMethod20+(x++))%20].setC(m);
		extracted[(h+countMethod20+(x++))%60][(w+countMethod20+(x++))%20].setC(m);
		extracted[(h+countMethod20+(x++))%60][(w+countMethod20+(x++))%20].setC(m);
		
		
		countMethod20+=1;
		extracted[(h+countMethod20+(x++))%60][(w+countMethod20+(x++))%20].setC(m);
		extracted[(h+countMethod20+(x++))%60][(w+countMethod20+(x++))%20].setC(m);
		extracted[(h+countMethod20+(x++))%60][(w+countMethod20+(x++))%20].setC(m);
		extracted[(h+countMethod20+(x++))%60][(w+countMethod20+(x++))%20].setC(m);
		extracted[(h+countMethod20+(x++))%60][(w+countMethod20+(x++))%20].setC(m);
		
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		System.out.println(((countMethod20+(x++))%60));
		
		System.out.println(w+(countMethod20+(x++))%20);
		System.out.println(w+(countMethod20+(x++))%20);
		System.out.println(w+(countMethod20+(x++))%20);
		System.out.println(w+(countMethod20+(x++))%20);
		System.out.println(w+(countMethod20+(x++))%20);
		
		System.out.println(w+(countMethod20+(x++))%20);
		System.out.println(w+(countMethod20+(x++))%20);
		System.out.println(w+(countMethod20+(x++))%20);
		System.out.println(w+(countMethod20+(x++))%20);
		System.out.println(w+(countMethod20+(x++))%20);
		
		System.out.println(w+(countMethod20+(x++))%20);
		System.out.println(w+(countMethod20+(x++))%20);
		System.out.println(w+(countMethod20+(x++))%20);
		System.out.println(w+(countMethod20+(x++))%20);
		System.out.println(w+(countMethod20+(x++))%20);
		
		System.out.println(w+(countMethod20+(x++))%20);
		System.out.println(w+(countMethod20+(x++))%20);
		System.out.println(w+(countMethod20+(x++))%20);
		System.out.println(w+(countMethod20+(x++))%20);
		System.out.println(w+(countMethod20+(x++))%20);
		
		System.out.println(w+(countMethod20+(x++))%20);
		System.out.println(w+(countMethod20+(x++))%20);
		System.out.println(w+(countMethod20+(x++))%20);
		System.out.println(w+(countMethod20+(x++))%20);
		System.out.println(w+(countMethod20+(x++))%20);
		
	}

}
