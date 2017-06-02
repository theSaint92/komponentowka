package Tydzien02;

public class Tablice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i;
		
		// Deklaracja tablicy
		int tab[] =new int[10];
		
		// Wypelnianie tablicy takimi samymi wartosciami
		for (i=1; i<10; i=i+1) 
			tab[i] = 5; 
		
		// Drukowanie zawartosci tablicy
		for (i=1; i<10; i=i+1) 
			System.out.print(tab[i]+" ");
		
		System.out.println("");  // wydruk pustego wiersza
		
		// Wypelnianie tablicy wartosciami zaleznymi od `i' 
		for (i=1; i<10; i=i+1) 
			tab[i] = 2*i;
		//  tab[i] = 5*i+3
		// 	tab[i] = 20 -i
		
		
		// Tablice o dynamicznie ustalanym rozmiarze 
		int rozmiar = 15; //
		int tablica_inna[] =new int[rozmiar];
				
		for (i=0; i< rozmiar; i++) {
			tablica_inna[i] = 20-2*i;
			System.out.print(tablica_inna[i]+" "); 
		}
		
		System.out.println("");  
		
		
		// Wypelnianie tablicy liczbami losowymi
		for (i=0; i< rozmiar; i++) 
			tablica_inna[i] = (int)(Math.random()*20);
		
		for (i=0; i< rozmiar; i++)
			System.out.print(tablica_inna[i]+" "); 
				
		System.out.println("");
		
		
		
		// Wypelnianie tablicy liczbami losowymi z dynamicznie ustalanego zakresu
		
		int zakres = 30; 
		for (i=0; i< rozmiar; i++) 
			tablica_inna[i] = (int)(Math.random()*zakres);
		
		for (i=0; i< rozmiar; i++)
			System.out.print(tablica_inna[i]+" "); 
				
		System.out.println("");
		
		

	}

}
