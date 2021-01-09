import static javax.swing.JOptionPane.*;
class Tekstanalyse {
	private int[] antallTegn;
	private String tekst = "";


	public Tekstanalyse(int[] antallTegn, String tekst){
		this.antallTegn = antallTegn;
		this.tekst = tekst;

	// får bokstaver til  å få tall verdi
		for(int i = 0; i < tekst.length(); i++){
			char tegn = tekst.charAt(i);
			int verdi = tegn;
			setTabell(charToIndeks(verdi));
		}
	}

	public int charToIndeks(int verdi){
			if(verdi >= 65 && verdi <= 90){
					int indeks = verdi - 65;
					return indeks;
			}
			else if(verdi >= 97 && verdi <= 122){
				int indeks = verdi - 97;
				return indeks;
			}
			else if(verdi == 230 || verdi == 198){
				int indeks = 26;
				return indeks;
			}
			else if(verdi == 248 || verdi == 216){
				int indeks = 27;
				return indeks;
			}
			else if(verdi == 229 || verdi == 197){
				int indeks = 28;
				return indeks;
			}
			else{
				int indeks = 29;
				return indeks;
			}
	}

// putter inn i tabell
	public void setTabell(int indeks){
		antallTegn[indeks]++;
	}

// finner det totale antall bokstaver og tegn
	public int finnAntTot(){
		int totSum = 0;
		for(int i = 0; i < antallTegn.length; i++){
			totSum += antallTegn[i];
		}
		return totSum;
	}

//finner antall forskjellige bokstaver
	public int finnAntForsBoks(){
		int antFors = 0;
		for(int i = 0; i < antallTegn.length - 1; i++){
			if(antallTegn[i] != 0){
				antFors ++ ;
			}
		}
		return antFors;
	}

//finner totalt antall bokstaver
	public int finnAntBoks(){
			int sum = 0;
			for(int i = 0; i < (antallTegn.length - 1); i++){
				sum += antallTegn[i];
			}
			return sum;
		}

// finner % del  ikke bokstaver
	public int finnProsIkkeBoks(){
		int delBoks = finnAntBoks() + antallTegn[29];
		int delTegn = antallTegn[29];

		int gang = delTegn * 100;
		int prosent = gang / delBoks;

		return prosent;
	}



// finn antall av en bestemt
	public int finnAntBestemt(char c){
		int valg = c;
		int nyIndeks = charToIndeks(valg);
		int antBestemt = antallTegn[nyIndeks];
		return antBestemt;
	}

	//finn høyeste verdi av bokstaver
		public int finnAntHøyestVerdi(){
			int maks = 0;
			if(antallTegn.length > 0){
				maks = antallTegn[0];
				for(int j = 1; j < (antallTegn.length - 1); j++){
					if(antallTegn[j] > maks){
						maks = antallTegn[j];
					}
				}
			}
			return maks;
		}

		//hvis flere er maks
		public int finnAntMaks(){
			int antMaks = 0;

			for(int k = 0; k < (antallTegn.length - 1); k++){
				if(antallTegn[k] == finnAntHøyestVerdi()){
					antMaks++;
				}
			}
		return antMaks;
		}


	public static void main(String[] args){
		int[] antallTegn = new int[30];

		String tekstLest = showInputDialog("Sett inn tekst:");
		String tekst = tekstLest;

		Tekstanalyse egenTekst = new Tekstanalyse(antallTegn, tekst);


		System.out.println("Teksten: " + tekst);
		System.out.println("Det er " +  egenTekst.finnAntTot() + " tegn og bokstaver i teksten.");
		System.out.println("Det er " + egenTekst.finnAntBoks() + " bokstaver.");
		System.out.println("Det er " + egenTekst.finnAntForsBoks() + " forskjellige bokstaver.");
		System.out.println("Det er " + antallTegn[29] + " tegn som ikke er bokstaver. Det er " + egenTekst.finnProsIkkeBoks() + " prosent.");
		System.out.println("Bokstaven C dukker opp " + egenTekst.finnAntBestemt('c') + " ganger.");

		if(egenTekst.finnAntMaks() == 1){
			System.out.println("Den  er " + egenTekst.finnAntMaks() + " bokstav som blir burkt mest i teksten. " + egenTekst.finnAntHøyestVerdi() + " ganger.");
		}else{
		System.out.println("Den  er " + egenTekst.finnAntMaks() + " bokstaver som blir burkt mest i teksten. " + egenTekst.finnAntHøyestVerdi() + " ganger.");
		}
	}


}


