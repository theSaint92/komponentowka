
import javax.swing.*;
public class klasa1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// drukowanie Pierwszego argumentu wywolania
		//System.out.println(args[0]); 
				
		// drukowanie DRUGIEGO i TRZECIEGO argumentu wywolania 
		//System.out.println(args[1]+" | "+args[2]);

		// Zabezpieczenie przed niewlasciwa iloscia argumentow

		if (args.length <3)
			System.err.print("Za malo argumentow");
		else
			//System.out.println(" * " + args[0]+" ** "+args[1]+" *** "+args[2]); 
		// Drukowanie kazdej podanej ilosci argumentow
		{int i;
		for (i=0; i<args.length; i++) // ilosc argumentow jako ograniczenie gorne petli
			System.out.println(args[i]);}
		
		//////////////////////////
	// Wprowadzanie liczb przez okna dialogowe
			String txt1; 			//deklaracja zmiennej tekstowej
			txt1 = JOptionPane.showInputDialog("Wprowadz pierwsza liczbe");
			
			String txt2; //deklaracja zmiennej tekstowej
			txt2 = JOptionPane.showInputDialog("Wprowadz druga liczbe");
			
			String txt3; //deklaracja zmiennej tekstowej
			txt3 = JOptionPane.showInputDialog("Wprowadz znak + * : -");
			
			// Konwersja tekstu na liczbe
			double 	liczba1 = Double.parseDouble(txt1);
			double 	liczba2 = Double.parseDouble(txt2);
			
			if (txt3.equals("+"))
				System.out.println(liczba1 + liczba2);	
			else if (txt3.equals("-"))
				System.out.println(liczba1 - liczba2);		    
			else if (txt3.equals("*"))
				System.out.println(liczba1 * liczba2);	
			else if (txt3.equals(":"))
				System.out.println(liczba1/liczba2);
			else 
				System.out.println("nie wprowadzono znaku");
			}

}

