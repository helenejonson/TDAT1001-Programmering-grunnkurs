import static javax.swing.JOptionPane.*;
class Katalog{
	public static void main (String[]args){

		Oppgaveoversikt oversikt = new Oppgaveoversikt(4);

		String navn = showInputDialog("Navn på studenten:");
		while (navn != null){
			String antOppLest = showInputDialog("Antall oppgaver studenten har løs:");
			int antOppg = Integer.parseInt(antOppLest);
			oversikt.nyStud(navn, antOppg);
			showMessageDialog(null, oversikt.toString());
		}


		 String naavn = showInputDialog("Navn på studenten:");
			while (naavn != null){
				String nyAntOppLest = showInputDialog("Antall oppgaver studenten har løs:");
				int nyAntOppg = Integer.parseInt(nyAntOppLest);
				oversikt.okOppgForStud(naavn, nyAntOppg);
			}
			showMessageDialog(null,oversikt.toString());
	}
}