package Tydzien01;
import javax.swing.*;

public class WprowadzanieDanychKonwersje {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		
		// Wprowadzanie liczb przez okna dialogowe
		String txt1; //deklaracja zmiennej tekstowej
		txt1 = JOptionPane.showInputDialog("Wprowadz pierwsza liczbe");
		
		String txt2; //deklaracja zmiennej tekstowej
		txt2 = JOptionPane.showInputDialog("Wprowadz druga liczbe");
		
		System.out.println(txt1 + txt2); // ???
		
		
		
		// Konwersja tekstu na liczbe
		double 	liczba1 = Double.parseDouble(txt1);
		int		liczba2 = Integer.parseInt(txt2); 
			
		System.out.println(liczba1 + liczba2);	

	}

}
