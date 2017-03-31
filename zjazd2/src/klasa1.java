
import javax.swing.*;

public class klasa1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello world <3 Natalia");

		//////////////////////////////////////////////////////
		// dodawanie liczb
				double a=4; // deklaracja zmiennej
				double b=5;
				int c=4;
				
				System.out.println(a+b);
				System.out.println(b-a);
				System.out.println(c*a);

				// dzielenie z instrukcja warunkowa
				if (b!=0)
					System.out.println(a/b);				
				else
					System.out.println("Nie dzielimy przez zero!");	
				
			//////////////////////////////////////////////////////
				// Wprowadzanie liczb przez okna dialogowe
			String txt1; //deklaracja zmiennej tekstowej
			txt1 = JOptionPane.showInputDialog("Wprowadz pierwsza liczbe");
			
			String txt2; //deklaracja zmiennej tekstowej
			txt2 = JOptionPane.showInputDialog("Wprowadz druga liczbe");
			
			// Konwersja tekstu na liczbe
						double 	liczba1 = Double.parseDouble(txt1);
						double	liczba2 = Double.parseDouble(txt2); 
						
			// dzielenie z instrukcja warunkowa
			if (b!=0)
				System.out.println(liczba1/liczba2);				
			else
				System.out.println("Nie dzielimy przez zero!");		
			
			
			////////////////////////////////////////////////////////////////////
			//Trojkat pascala
			int i, j;
			System.out.println ("program wypisuje trojkat Pascala, podaj ilosc wierszy\n");
		    
			String liczba; //deklaracja zmiennej tekstowej
			liczba = JOptionPane.showInputDialog("Wprowadz pierwsza liczbe");
			
			int n = Integer.parseInt(liczba);
			
			int tab[][] = new int[n][n];
			
			for (i=0; i<n; i++)
			{
				for (j=0; j<=i; j++)
				{
					tab[i][j]=0;
				}
			}

		    tab[ 0 ][ 0 ] = 1;
		    tab[ 1 ][ 0 ] = 1;
		    tab[ 1 ][ 1 ] = 1;

			for (i=2; i<n; i++)
			{
				tab[i][0]=1;
				tab[i][i]=1; 
				for (j=1; j<i; j++)
				{
					tab[ i ][ j ] = tab[ i - 1 ][ j - 1 ] + tab[ i - 1 ][ j ];
				}
			}
			
			for (i=0; i<n; i++)
			{
				for (int s = n-i; s>=0; s--){
					System.out.print(" ");
				}
				
				for (j=0; j<=i; j++)
				{
					System.out.print( tab[i][j] );
					System.out.print( " " );
				}
				System.out.println ();			}
	}		
		
	}

