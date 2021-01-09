import static javax.swing.JOptionPane.*;
class Arbeider{
	public static void main(String[] args){

		Person person = new Person ("Helene", "Jonson", 1998);
		ArbTaker arbeider = new ArbTaker(person, 23000, 40, 1234, 2016);
		Meny meny = new Meny(arbeider);

		int valg = meny.lesValg();
		while (valg >= 0){
			meny.utførOppg(valg);
			valg = meny.lesValg();
		}
	}
}

class Meny{
	private final String[]ALTERNATIVER = { "Endre månedslønn", "Endre skatteprosent", "Vis alt", "Avslutt"};
	private final int ENDRE_MÅNEDSLØNN = 0;
	private final int ENDRE_SKATTEPROSENT = 1;
	private final int VIS_ALT = 2;
	private final int AVSLUTT = 3;

	private ArbTaker arbeider;


	public  Meny(ArbTaker arbeider){
		this.arbeider = arbeider;
	}

	public int lesValg(){
		int valg = showOptionDialog(null, "Valg", "Operasjon", DEFAULT_OPTION, PLAIN_MESSAGE, null, ALTERNATIVER, ALTERNATIVER[0]);
		if(valg == AVSLUTT){
			valg = -1;
		}
		return valg;
	}

	public void utførOppg(int valg){
		switch(valg){
			case ENDRE_MÅNEDSLØNN:
				setMåned();
				break;
			case ENDRE_SKATTEPROSENT:
				setSkattepros();
				break;
			case VIS_ALT:
				visAlt();
				break;
			case AVSLUTT:
			break;
		}
	}

	public void setMåned(){
		String nyMånedLest = showInputDialog("Ny månedslønn:");
		double månedslønn = Double.parseDouble(nyMånedLest);
		arbeider.setMånedslønn(månedslønn);
		System.out.println("Ny månedslønn er: " + arbeider.getMånedslønn());
	}

	public void setSkattepros(){
		String nySkattLest = showInputDialog("Ny skatteprosent:");
		double skattepros = Double.parseDouble(nySkattLest);
		arbeider.setSkattePros(skattepros);
		System.out.println("Ny skatteprosent er: " + arbeider.getSkattepros());
	}

	public void visAlt(){
		String premieÅrLest = showInputDialog("År:");
		int år = Integer.parseInt(premieÅrLest);

		System.out.println(arbeider.getPersonilla().toString());
		System.out.println("Tekk i måneden: " + arbeider.skatteTrekkMåned());
		System.out.println("Brutolønn i året: " + arbeider.brutoLønn());
		System.out.println("Trekk per år: " + arbeider.skatteTrekkÅr());
		System.out.println("Navn: " + arbeider.navn());
		System.out.println("Antall år i bedriften: " + arbeider.årIBedrift());
		System.out.println("Har de vært ansatt mer enn 5 år? " + arbeider.merEnXår(år));
	}

}


