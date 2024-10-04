package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	

		public static void skrivUt(int[] tabell) {
			 
			if (tabell.length == 0) {
				System.out.println("[]");
				return;
			}
			
			System.out.println("[");
			
			for( int i= 0; i< tabell.length; i++) {
				System.out.println(tabell[i]);
				
				if(i< tabell.length-1) {
					
					System.out.println(",");
					
				}
			}
			
						
			}


	// b)
		public static String tilStreng(int[] tabell) {
	        // Hvis tabellen er tom, returner en tom array representasjon
	        if (tabell.length == 0) {
	            return "[]";
	        }

	        // Start strengen med en åpningsklamme
	        StringBuilder resultat = new StringBuilder("[");
	        
	        // Gå gjennom hvert element i tabellen
	        for (int i = 0; i < tabell.length; i++) {
	            // Legg til elementet i strengen
	            resultat.append(tabell[i]);
	            
	            // Hvis det ikke er det siste elementet, legg til komma
	            if (i < tabell.length - 1) {
	                resultat.append(",");
	            }
	        }

	        // Legg til lukkeklammen
	        resultat.append("]");
	        
	        // Returner den ferdige strengen
	        return resultat.toString();
	    }

	    public static void main(String[] args) {
	        // Eksempel på en tabell
	        int[] tabell = {42, 67, 89};

	        // Kall metoden og skriv ut resultatet
	        System.out.println(tilStreng(tabell));  // Forventer utskrift: [42,67,89]
	    }
		
	// c)
	    public static int summer(int[] tabell) {
	    	 
			int sum= 0;
			
			for( int i= 0; i<tabell.length; i++) {
				sum += tabell[i];	
			}
				
			return sum;
			
			
		}

	// d)
	    public static boolean finnesTall(int[] tabell, int tall) {
	    	 
			
			for( int i= 0; i < tabell.length; i ++) {
				if(tabell[i] == tall) {
					return true;
					
					}
			}
			
						return false;
					}

	// e)
	    public static int posisjonTall(int[] tabell, int tall) {
	    	 
			
			if (tabell.length == 0) {
				return -1;
			}
			
		for (int i = 0; i< tabell.length; i++) {
			
		if (tabell[i]== tall) {
			return  i;
			}
				
			
			
		}
		return -1;
		
		}

	// f)
	    public static int[] reverser(int[] tabell) {
	        
	        if (tabell.length == 0) {
	            return new int[0]; 
	        }

	        
	        if (tabell.length == 1) {
	            return new int[]{tabell[0]}; 
	        }

	      
	        int[] reversert = new int[tabell.length];

	        
	        for (int i = 0; i < tabell.length; i++) {
	            reversert[i] = tabell[tabell.length - 1 - i];
	        }

	        return reversert; 
	    }



	// g)
	    public static boolean erSortert(int[] tabell) {
	       
	        if (tabell == null || tabell.length <= 1) {
	            return true; 
	        }

	        // Gå gjennom tabellen for å sjekke sortering
	        for (int i = 0; i < tabell.length - 1; i++) {
	            if (tabell[i] > tabell[i + 1]) {
	                return false;
	            }
	        }

	        return true;
	    }


	// h)
	   public static int[] settSammen(int[] tabell1, int[] tabell2) {
		   
			
			int [] sammensatttabell= new int[tabell1.length+ tabell2.length];
			
			
			// TODO
			for ( int i=0; i<tabell1.length; i++) {
				
	sammensatttabell [i]= tabell1[i];
	 
			
	 
		}
			for ( int i =0; i<tabell2.length; i++) {
				sammensatttabell[tabell1.length + i]= tabell2[i];
				
			}
			return sammensatttabell;
	 
			
		}
		}
		