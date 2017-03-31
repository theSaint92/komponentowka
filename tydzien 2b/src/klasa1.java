import java.util.Arrays;
import java.util.Date; 
import javax.swing.*;

public class klasa1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

int i;
int j;		
		// Deklaracja tablicy
		int tab[] =new int[10];
		
		// Wypelnianie tablicy takimi samymi wartosciami
		System.out.println(" Wypelnianie tablicy takimi samymi wartosciami");
		for (i=1; i<10; i=i+1) 
			tab[i] = 5; 
		
		// Drukowanie zawartosci tablicy
		for (i=1; i<10; i=i+1) 
			System.out.print(tab[i]+" ");
		
		System.out.println("");  // wydruk pustego wiersza
		
		// Wypelnianie tablicy wartosciami zaleznymi od `i' 
		System.out.println("  Wypelnianie tablicy wartosciami zaleznymi od `i'");
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
		System.out.println("Wypelnianie tablicy liczbami losowymi");
		for (i=0; i< rozmiar; i++) 
			tablica_inna[i] = (int)(Math.random()*20);
		
		for (i=0; i< rozmiar; i++)
			System.out.print(tablica_inna[i]+" "); 
				
		System.out.println("");
		
		
		
		// Wypelnianie tablicy liczbami losowymi z dynamicznie ustalanego zakresu
		System.out.println("Wypelnianie tablicy liczbami losowymi z dynamicznie ustalanego zakresu");
		int zakres = 30; 
		for (i=0; i< rozmiar; i++) 
			tablica_inna[i] = (int)(Math.random()*zakres);
		
		for (i=0; i< rozmiar; i++)
			System.out.print(tablica_inna[i]+" "); 
				
		System.out.println("");
		
		////////////////////////////////////////////////////
		int poczatkowa=5;
		int liczba_nieparzystych= (int)Math.ceil(poczatkowa/2.0);
		int tabN[] =new int[liczba_nieparzystych];
		//liczbami nieparzystymi w porzadku malejacym
		System.out.println("liczbami nieparzystymi w porzadku malejacym");
		for (i=poczatkowa, j=0; i>0; i--) 
		{	
			if (i%2!=0)
			{
				tabN[j]=i;
				j++;
			}
		}
		for (i=0; i< liczba_nieparzystych; i++)
			System.out.print(tabN[i]+" "); 
		System.out.println("");
		
		///////////////////////////////////////////////
		int tabM[] =new int[20];
		//liczbami ktore przy dzieleniu przez 5 daja reszte 2
		System.out.println("liczbami ktore przy dzieleniu przez 5 daja reszte 2");
		for (i=0, j=0; i<100; i++) 
		{	
			if (i%5==2)
			{
				tabM[j]=i;
				j++;
			}
		}
		for (i=0; i< rozmiar; i++)
			System.out.print(tabM[i]+" "); 
		System.out.println("");
		
		///////////////////////////////////////////////
		//Zadeklaruj tablice o dynamicznie ustalanym rozmiarze i wypelniona liczbami losowymi
		System.out.println("dynamicznie ustalanym rozmiarze i wypelniona liczbami losowymi");
		// Tablice o dynamicznie ustalanym rozmiarze 
				int r = 11; //
				int tablica_dyn[] =new int[r];
				
				// Wypelnianie tablicy liczbami losowymi
				for (i=0; i< r; i++) 
					tablica_dyn[i] = (int)(Math.random()*20);
				
				for (i=0; i< r; i++)
					System.out.print(tablica_dyn[i]+" "); 
						
				System.out.println("");
				
		//////////////////////////////////////////////////////
		//Wypelnij liczbami losowymi tablice o rozmiarze pobieranym poprzez okienko dialogowe
				System.out.println("liczbami losowymi tablice o rozmiarze pobieranym poprzez okienko dialogowe");		
				
				
				// Wprowadzanie liczb przez okna dialogowe
				String txt1; //deklaracja zmiennej tekstowej
				txt1 = JOptionPane.showInputDialog("Wprowadz wielkosc tablicy");

				int	rozmiar_tablicy = Integer.parseInt(txt1); 
			
				// Tablice o dynamicznie ustalanym rozmiarze 
				int tablica_dyn2[] =new int[rozmiar_tablicy];
						
				// Wypelnianie tablicy liczbami losowymi
				for (i=0; i< rozmiar_tablicy; i++) 
					{tablica_dyn2[i] = (int)(Math.random()*20);
					System.out.print(tablica_dyn2[i]+" "); 
					}	
				System.out.println("");		
				
				/////////////////////////////////////////////////////////////////////////////////////
				//Wypelnij tablice liczbami losowymi z zakresu pobieranego jako argument wywolania programu
				System.out.println("tablice liczbami losowymi z zakresu pobieranego jako argument wywolania programu");		
				// Zabezpieczenie przed niewlasciwa iloscia argumentow
					int min, max;
				
				if (args.length !=2)
					System.err.print("Podana ilosc argumentow jest niewlasciwa");
				else
					{	min = Integer.parseInt(args[0]);
						max = Integer.parseInt(args[1]);
							
				// Tablice 
				int tablica2[] =new int[20];
						
				// Wypelnianie tablicy liczbami losowymi
				for (i=0; i< 20; i++) {
					tablica2[i] = (int)(Math.random()*(max-min))+min;
				}
				
				for (i=0; i< r; i++)
					System.out.print(tablica2[i]+" "); 
						
				System.out.println("");		}
				
		/////////////////////////////////////////////
		//sortowanie babelkowe
				Date przed = new Date();
				System.out.println ("babelki");
				// Tablice o dynamicznie ustalanym rozmiarze 
				 r = 11; 
				
				// Wypelnianie tablicy liczbami losowymi
				for (i=0; i< r; i++) 
					{tablica_dyn[i] = (int)(Math.random()*20);
					System.out.print(tablica_dyn[i]+" "); 
					}	
				System.out.println("");
				
				for( j=0; j<r; j++)
				{
					for( i=0; i<r-1; i++)
					{
						if(tablica_dyn[i]> tablica_dyn[i+1])
						{
							int temp= tablica_dyn[i];
							tablica_dyn[i]=tablica_dyn[i+1];
							tablica_dyn[i+1]=temp;
						}
					}
				}
				
				for (i=0; i< r; i++) 
				System.out.print(tablica_dyn[i]+" "); 
				System.out.println();
				Date po = new Date();
				System.out.println("Czas operacji babelkowe "+(po.getTime() - przed.getTime()) +"ms");
				
				///////////////////////////////////////////////////
				Date przed2 = new Date();
				System.out.println ("sortowanie klasa");
				
				int wielkosc=15;
				int tablica_sort[] =new int[wielkosc];

				// Wypelnianie tablicy liczbami losowymi
				for (i=0; i< r; i++) 
					{tablica_sort[i] = (int)(Math.random()*56);
					System.out.print(tablica_sort[i]+" "); 
					}	
				System.out.println("");
				
				Arrays.sort(tablica_sort);
				for (i=0; i< r; i++) 
				System.out.print(tablica_sort[i]+" "); 
				System.out.println();
				Date po2 = new Date();
				System.out.println("Czas operacji arrays "+(po2.getTime() - przed2.getTime()) +"ms");
				}	
	}	
	


