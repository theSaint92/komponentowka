package Tydzien02;
import javax.swing.*;

public class Dzialanie {

public static void main(String[] args) {
			
		// Wprowadzanie liczb przez okna dialogowe
		String txt1; //deklaracja zmiennej tekstowej
		String txt2;
		String txt3;
		
		txt1 = JOptionPane.showInputDialog("Jakie dzialanie chcesz wykonac? Do wyboru +,-,*,/" );
		txt2 = JOptionPane.showInputDialog("Wprowadz pierwsza liczbe");
		txt3 = JOptionPane.showInputDialog("Wprowadz druga liczbe");
		
		double 	liczba1 = Double.parseDouble(txt2);
		double 	liczba2 = Double.parseDouble(txt3);
		
		System.out.println("\"" +txt1+"\"");
		
		if(txt1.equals("+")) {
			System.out.println(liczba1 + liczba2);
		}
		else if(txt1.equals("-")) {
			System.out.println(liczba1 - liczba2);
		}
		else if(txt1.equals("*")) {
			System.out.println(liczba1 * liczba2);
		}
		else if(txt1.equals("/")) {
			if (liczba2 == 0) {
				System.out.println("Pamietaj cholero nie dziel przez 0");
			}
			System.out.println(liczba1 / liczba2);
		}
		else {
			System.out.println("Takie dzialanie nie zostalo zdedfiniowane");
		}	
	}
} 