import static javax.swing.JOptionPane.*;
class gangetabellenny {
	public static void main(String[] args){
		boolean stillRunning = true;

		while(stillRunning){
			try{
				String tabellLest=showInputDialog("tabell:");
				int tall = Integer.parseInt(tabellLest);
				System.out.println(tall + "-gangen:");


				for(int i = 1; i <= 10; i++){
						int sum = tall*i;
						System.out.println(tall +"*" + i + "=" + sum);
				}

			}
			catch(Exception  e){
				stillRunning = false;
		 	}
		}

	}
}

