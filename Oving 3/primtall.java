import static javax.swing.JOptionPane.*;
class primtall {
	public static void main (String[] args){
		String primtallLest = showInputDialog("Tall:");
		int tall = Integer.parseInt(primtallLest);
		int deler = 2;

		if (tall==1){
			System.out.print(primtallLest + " er ikke et primtall");
		}else{
			while (tall%deler!=0){
				deler++;
			}
			if (tall==deler){
				System.out.println(primtallLest + " er et primtall");
			}else{
				System.out.println(primtallLest + " er ikke et primtall");
			}
		}
	}
}

