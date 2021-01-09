import static javax.swing.JOptionPane.*;
class Arbeider1{
	public static void main(String[] args){

		Person person = new Person ("Helene", "Jonson", 1998);
		ArbTaker arbeider = new ArbTaker(person, 23000, 40, 1234, 2016);

		String premieÅrLest = showInputDialog("År:");
		int år = Integer.parseInt(premieÅrLest);

		System.out.println(person.toString());
		System.out.println("Tekk i måneden: " + arbeider.skatteTrekkMåned());
		System.out.println("Brutolønn i året: " + arbeider.brutoLønn());
		System.out.println("Trekk per år: " + arbeider.skatteTrekkÅr());
		System.out.println("Navn: " + arbeider.navn());
		System.out.println("Antall år i bedriften: " + arbeider.årIBedrift());
		System.out.println("Har de vært ansatt mer enn 5 år? " + arbeider.merEnXår(år));
	}
}
