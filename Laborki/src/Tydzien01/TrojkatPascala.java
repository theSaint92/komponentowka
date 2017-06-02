package Tydzien01;
import javax.swing.*;


public class TrojkatPascala {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Wprowadzanie liczb przez okna dialogowe
		String txt1; //deklaracja zmiennej tekstowej
		txt1 = JOptionPane.showInputDialog("Wprowadz n - liczbe poziomow dla drzewka Pascala:");
		int	n = Integer.parseInt(txt1); 
		
		int tab[] = new int[n];
		
		for (int i=0; i<n ; i++) {
			tab[i]=1;
			
			int temptab[] = new int[i+1];
			for (int j=0; j<=i ; j++) {
				temptab[j] = tab[j];
			}
			
			for (int j=1; j<i ; j++) {
				tab[j] = temptab[j] + temptab[j-1];
			}
			
			for (int j=0; j<=i ; j++) {
				System.out.print(tab[j] + " ");
			}
			System.out.print("\n");
		}

	}
}
