import static javax.swing.JOptionPane.*;
class Arbeider1{
	public static void main(String[] args){

		Person person = new Person ("Helene", "Jonson", 1998);
		ArbTaker arbeider = new ArbTaker(person, 23000, 40, 1234, 2016);

		String premie�rLest = showInputDialog("�r:");
		int �r = Integer.parseInt(premie�rLest);

		System.out.println(person.toString());
		System.out.println("Tekk i m�neden: " + arbeider.skatteTrekkM�ned());
		System.out.println("Brutol�nn i �ret: " + arbeider.brutoL�nn());
		System.out.println("Trekk per �r: " + arbeider.skatteTrekk�r());
		System.out.println("Navn: " + arbeider.navn());
		System.out.println("Antall �r i bedriften: " + arbeider.�rIBedrift());
		System.out.println("Har de v�rt ansatt mer enn 5 �r? " + arbeider.merEnX�r(�r));
	}
}
