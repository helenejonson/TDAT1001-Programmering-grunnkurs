import static javax.swing.JOptionPane.*;
class Studentkatalog{
	public static void main(String[] args){


		Oppgaveoversikt oversikt = new Oppgaveoversikt(4);
		int teller = 0;
		while(teller < 2){

		String muligheter = showInputDialog("1 = Register ny student \n 2 = Endre antall oppgaver for student");
		switch (muligheter){
			case "1":

				String navn = showInputDialog("Navn på studenten:");
				String antOppLest = showInputDialog("Antall oppgaver studenten har løs:");
				int antOppg = Integer.parseInt(antOppLest);
				oversikt.nyStud(navn, antOppg);

				showMessageDialog(null, oversikt.toString());
				break;
			case "2":
				  navn = showInputDialog("Navn på studenten:");
				 while (navn != null){
					 antOppLest = showInputDialog("Antall oppgaver studenten har løs:");
					 antOppg = Integer.parseInt(antOppLest);
					int antall = oversikt.okOppgForStud(navn, antOppg);
					System.out.println(oversikt.finnAntOppgForStud(navn));
					showMessageDialog(null, navn + " har løst " + antall);
				}
				break;
		}
		teller++;
	}
	}
}


