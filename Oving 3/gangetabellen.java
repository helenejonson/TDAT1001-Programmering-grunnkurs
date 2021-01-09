import static javax.swing.JOptionPane.*;
class gangetabellen {
	public static void main (String[] args){
		String tabellLest=showInputDialog("tabell:");
		int tall = Integer.parseInt(tabellLest);
		System.out.println(tall + "-gangen:");


		for(int ganger=0; ganger<11; ganger++){
			int sum = tall*ganger;
			System.out.println(tall +"*" + ganger + "=" + sum);
		}
	}
}
