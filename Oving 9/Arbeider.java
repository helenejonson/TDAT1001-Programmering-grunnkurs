import static javax.swing.JOptionPane.*;
class Arbeider{
	public static void main(String[] args){

		Person person = new Person ("Helene", "Jonson", 1998);
		ArbTaker arbeider = new ArbTaker(person, 23000, 40, 1234, 2016);
		Meny meny = new Meny(arbeider);

		int valg = meny.lesValg();
		while (valg >= 0){
			meny.utf�rOppg(valg);
			valg = meny.lesValg();
		}
	}
}

class Meny{
	private final String[]ALTERNATIVER = { "Endre m�nedsl�nn", "Endre skatteprosent", "Vis alt", "Avslutt"};
	private final int ENDRE_M�NEDSL�NN = 0;
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

	public void utf�rOppg(int valg){
		switch(valg){
			case ENDRE_M�NEDSL�NN:
				setM�ned();
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

	public void setM�ned(){
		String nyM�nedLest = showInputDialog("Ny m�nedsl�nn:");
		double m�nedsl�nn = Double.parseDouble(nyM�nedLest);
		arbeider.setM�nedsl�nn(m�nedsl�nn);
		System.out.println("Ny m�nedsl�nn er: " + arbeider.getM�nedsl�nn());
	}

	public void setSkattepros(){
		String nySkattLest = showInputDialog("Ny skatteprosent:");
		double skattepros = Double.parseDouble(nySkattLest);
		arbeider.setSkattePros(skattepros);
		System.out.println("Ny skatteprosent er: " + arbeider.getSkattepros());
	}

	public void visAlt(){
		String premie�rLest = showInputDialog("�r:");
		int �r = Integer.parseInt(premie�rLest);

		System.out.println(arbeider.getPersonilla().toString());
		System.out.println("Tekk i m�neden: " + arbeider.skatteTrekkM�ned());
		System.out.println("Brutol�nn i �ret: " + arbeider.brutoL�nn());
		System.out.println("Trekk per �r: " + arbeider.skatteTrekk�r());
		System.out.println("Navn: " + arbeider.navn());
		System.out.println("Antall �r i bedriften: " + arbeider.�rIBedrift());
		System.out.println("Har de v�rt ansatt mer enn 5 �r? " + arbeider.merEnX�r(�r));
	}

}


