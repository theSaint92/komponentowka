package Tydzien02;

//import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Date; 

public class TabliceZadania {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int rozmiar = 10000;
		int tab[] = new int[rozmiar];
		int tab2[] = new int[rozmiar];
		
		
		// Wypelnianie tablicy liczbami losowymi z ustalanego zakresu (Okno Dialogowe)
		//String txt;
		//txt = JOptionPane.showInputDialog("Wprowadz zakres losowania");
		//int	zakres = Integer.parseInt(txt);
		
		// Wypelnianie tablicy liczbami losowymi z ustalanego zakresu (Argumenty)
		int zakres = Integer.parseInt(args[0]);
		
		for (int i=0; i< rozmiar; i++) 
			tab[i] = (int)(Math.random()*zakres);
		
		//WYSWIETLANIE TABLICY
		//for (int i=0; i< rozmiar; i++)
		//	System.out.print(tab[i]+" "); 	
		//System.out.println("");
		
		//Kopiowanie tab[] do tab2[]
		for (int i=0; i< rozmiar; i++)
			tab2[i] = tab[i];	
		
		//SORTOWANIE BABELKOWE
		Date beforeBabelkowe = new Date();
		boolean isSorted = false;
		while(isSorted == false) {
			isSorted = true;
			for (int i=0; i< rozmiar-1; i++) {
				if (tab[i] > tab[i+1]) {
					int temp = tab[i];
					tab[i] = tab[i+1];
					tab[i+1] = temp;
					isSorted = false;
				}
			}
		}
		Date afterBabelkowe = new Date();
		
		//WYSWIETLANIE TABLICY
		//for (int i=0; i< rozmiar; i++)
		//	System.out.print(tab[i]+" "); 	
		//System.out.println("");
		
		Date beforeArraysSort = new Date(); 
		Arrays.sort(tab2);
		Date afterArraysSort = new Date();
		//WYSWIETLANIE TABLICY
		//for (int i=0; i< rozmiar; i++)
		//	System.out.print(tab2[i]+" "); 	
		//System.out.println("");
		
		System.out.println("Sortowanie babelkowe zajelo: " + (afterBabelkowe.getTime()-beforeBabelkowe.getTime()));
		System.out.println("Sortowanie Arrays.sort zajelo: " + (afterArraysSort.getTime()-beforeArraysSort.getTime()));
		
	}

}
