package Tydzien02;

public class Arguments {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// drukowanie Pierwszego argumentu wywolania
		//System.out.println(args[0]); 
		
		// drukowanie DRUGIEGO i TRZECIEGO argumentu wywolania 
		//System.out.println(args[1]+" | "+args[2]);
		
	
		
		// Zabezpieczenie przed niewlasciwa iloscia argumentow
		//if (args.length <3)
		//	System.err.print("Za malo argumentow");
		//else
		//	System.out.println(" * " + args[0]+" ** "+args[1]+" *** "+args[2]); 

		
		
		// Drukowanie kazdej podanej ilosci argumentow
		int i;
		for (i=0; i<args.length; i++) // ilosc argumentow jako ograniczenie gorne petli
			System.out.println(args[i]);
		

	}

}
