import java.util.StringTokenizer;
import static javax.swing.JOptionPane.*;
class Tekstbehandling{
	private String tekst;

	public Tekstbehandling(String tekst){
		this.tekst = tekst;
	}// slutt konstruktør

	// tell antall ord
	public int getAntOrd(String tekst){
		StringTokenizer  analyse = new StringTokenizer(tekst, " .,!?");
		int antOrd = analyse.countTokens();
		return antOrd;
	}


	public int getAntTegn(String tekst){
			StringTokenizer  analyse = new StringTokenizer(tekst, ".,!?");
			int antTegnIPeriode = analyse.countTokens();
			return antTegnIPeriode;
	}

	//finner gjennomsnittlig lengde på ord
		public double gjennomsnittLengdeOrd(){
			double antBoks = 0;
			double antOrd = getAntOrd(tekst);
			StringTokenizer  analyse = new StringTokenizer(tekst, " .,!?");
			while (analyse. hasMoreTokens()){
				String ord = analyse.nextToken();
				antBoks += ord.length();
			}
			double gjennomsnittOrdLengde = antBoks / antOrd;
			return gjennomsnittOrdLengde;
		}

	//finner gjennomsnittlig lende per perode
		public double gjennomsnittPerPeriode(){
			double antOrd = getAntOrd(tekst);
			double antPeriode = getAntTegn(tekst);
			double gjennomsnittTegnPeriode = antOrd / antPeriode;
			return gjennomsnittTegnPeriode;
		}


	// gjør alt til store bokstaver
	public String getStoreBokstaver(String tekst){
		String storeBokstaver = tekst.toUpperCase();
		return storeBokstaver;
	}


	//bytter ut et ord med et annet
	public String byttUtOrd(String tekst){
		String nyTekst = tekst.replace("finnes","fins");
		return nyTekst;
	}

	//Klientprogramm

	public static void main(String[] args){

		String tekstLest = showInputDialog("Sett inn tekst:");
		String tekst = tekstLest;

		Tekstbehandling minTekst = new Tekstbehandling(tekst);

		System.out.println(tekst);
		System.out.println(minTekst.getStoreBokstaver(tekst));
		System.out.println("Byttet ut ordet finnes med fins: " + minTekst.byttUtOrd(tekst));
		System.out.println("Antall ord er " + minTekst.getAntOrd(tekst));
		System.out.println("Hvert ord har gjennomsnittlig " + minTekst.gjennomsnittLengdeOrd() + " bokstaver");
		System.out.println("Hver periode har gjennomsnittlig " + minTekst.gjennomsnittPerPeriode() + " ord");
	}


} //slutt class



























































































