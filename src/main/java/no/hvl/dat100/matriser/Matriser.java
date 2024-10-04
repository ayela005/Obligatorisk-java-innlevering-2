package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	
	    public static void skrivUt(int[][] matrise) {
	        // Utvidet for-løkke for å gå gjennom hver rad i matrisen
	        for (int[] rad : matrise) {
	            // Utvidet for-løkke for å gå gjennom hvert element i raden
	            for (int element : rad) {
	                // Skriv ut hvert element etterfulgt av et mellomrom
	                System.out.print(element + " ");
	            }
	            // Linjeskift etter hver rad
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        // Eksempel på en matrise
	        int[][] matrise = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        // Kall metoden for å skrive ut matrisen
	        skrivUt(matrise);
	    }
	


	// b)
	
	    public static int[][] skaler(int tall, int[][] matrise) {
	        // Hent antall rader og kolonner fra matrisen
	        int rader = matrise.length;
	        int kolonner = matrise[0].length;

	        // Opprett en ny matrise med samme dimensjoner som den opprinnelige
	        int[][] nyMatrise = new int[rader][kolonner];

	        // Gå gjennom hver rad og kolonne og multipliser elementene med 'tall'
	        for (int i = 0; i < rader; i++) {
	            for (int j = 0; j < kolonner; j++) {
	                nyMatrise[i][j] = matrise[i][j] * tall;
	            }
	        }

	        // Returner den skalerte matrisen
	        return nyMatrise;
	    }

	    public static void main(String[] args) {
	        // Eksempel på bruk av metoden
	        int[][] matrise = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int skaleringsTall = 3;

	        // Kall metoden og skriv ut resultatet
	        int[][] skalertMatrise = skaler(skaleringsTall, matrise);

	        // Skriv ut resultatet
	        for (int i = 0; i < skalertMatrise.length; i++) {
	            for (int j = 0; j < skalertMatrise[i].length; j++) {
	                System.out.print(skalertMatrise[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	


	// c)
	
	    public static int[][] skaler(int tall, int[][] matrise) {
	        // Hent antall rader og kolonner i den opprinnelige matrisen
	        int rader = matrise.length;
	        int kolonner = matrise[0].length;

	        // Opprett en ny matrise med samme dimensjoner som den opprinnelige
	        int[][] nyMatrise = new int[rader][kolonner];

	        // Gå gjennom hver rad og kolonne og multipliser elementene med 'tall'
	        for (int i = 0; i < rader; i++) {
	            for (int j = 0; j < kolonner; j++) {
	                nyMatrise[i][j] = matrise[i][j] * tall;
	            }
	        }

	        // Returner den skalerte matrisen
	        return nyMatrise;
	    }

	    public static void main(String[] args) {
	        // Eksempel på bruk av metoden
	        int[][] matrise = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int skaleringsTall = 2;

	        // Kall metoden og skriv ut resultatet
	        int[][] skalertMatrise = skaler(skaleringsTall, matrise);

	        for (int i = 0; i < skalertMatrise.length; i++) {
	            for (int j = 0; j < skalertMatrise[i].length; j++) {
	                System.out.print(skalertMatrise[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	


	// d)
	    
	        public static boolean erLik(int[][] mat1, int[][] mat2) {
	            // Sjekk om de har samme antall rader og kolonner
	            if (mat1.length != mat2.length) {
	                return false;
	            }

	            for (int i = 0; i < mat1.length; i++) {
	                if (mat1[i].length != mat2[i].length) {
	                    return false;
	                }
	                // Sjekk om alle elementene er like
	                for (int j = 0; j < mat1[i].length; j++) {
	                    if (mat1[i][j] != mat2[i][j]) {
	                        return false;
	                    }
	                }
	            }

	            // Hvis vi har sjekket alle elementene og de er like, returner true
	            return true;
	        }

	        public static void main(String[] args) {
	            // Eksempel på bruk av metoden
	            int[][] matrise1 = {
	                {1, 2, 3},
	                {4, 5, 6},
	                {7, 8, 9}
	            };

	            int[][] matrise2 = {
	                {1, 2, 3},
	                {4, 5, 6},
	                {7, 8, 9}
	            };

	            int[][] matrise3 = {
	                {1, 2, 3},
	                {4, 5, 0},
	                {7, 8, 9}
	            };

	            // Sjekk om matrise1 og matrise2 er like
	            System.out.println(erLik(matrise1, matrise2)); // true

	            // Sjekk om matrise1 og matrise3 er like
	            System.out.println(erLik(matrise1, matrise3)); // false
	        }
	    
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
