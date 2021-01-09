import static javax.swing.JOptionPane.*;
class NyString{
	private String tekst;
	private String bokstav;

	public NyString(String tekst, String bokstav){
		this.tekst = tekst;
		this.bokstav = bokstav;
	}

	public String getForkort(){
		String resultat = "";
		String tekst1 = tekst;
		String[] ord1 = tekst1.split("[ ]");
		for(int i = 0; i < ord1.length; i++){
			String ordTabell = ord1[i];
			char forsteBokstav = ordTabell.charAt(0);
			resultat = resultat + forsteBokstav;
		}
	 return resultat;
	}

	public String getFjernBokstav(String bokstav){
		String nyTekst = tekst.replace(bokstav,"");
		return nyTekst;
	}

	public String getFjernBokstav(){
		//String tekst2 = tekst;
		String strUtenE = "";
		int i = 0;
		while(i<20){
			strUtenE = tekst;
			int indeks = strUtenE.indexOf('e');
			indeks = strUtenE.indexOf('e', indeks);
			strUtenE = strUtenE.substring(0,indeks)+ strUtenE.substring(indeks+1);
			indeks++;

			i++;
		}
		return strUtenE;
	}

	public static void main(String[] args){

		String tekstLest = showInputDialog("Sett inn tekst:");
		String tekst = tekstLest;

		String bokstavLest = showInputDialog("Bokstav som skal fjernes:");
		String bokstav = bokstavLest;

		NyString minKlasse = new NyString(tekst, bokstav);

		System.out.println("Tekst: " + tekst);
		System.out.println("Forkortes til: " + minKlasse.getForkort());
		System.out.println("Vi fjerner alle " + bokstav + "-er: " + minKlasse.getFjernBokstav(bokstav));

	}
} //Slutter klassen