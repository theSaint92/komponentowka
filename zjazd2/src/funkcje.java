
public class funkcje  {
	
	public static long silnia(int liczba)
	{	long sil=1;
		for (int j=2; j<=liczba; j++ )
		{
			sil*=j;
		}
		return sil;
	}
	
	public static long symbol_newtona(int rzad, int element)
	{
		if(element>=0 && element<=rzad)
		{
			long dwumian= silnia(rzad)/(silnia(element))*silnia(rzad-element); 
			return dwumian;
		}
		else 
			return 0;
			//System.out.println ("podano bledne argumenty");
	}
}
