import static javax.swing.JOptionPane.*;
class skuddaar {
	public static void main (String[] args){
		String aarLest = showInputDialog("Aar:");
		int aar = Integer.parseInt(aarLest);

		if(aar%400==0){
			System.out.println(aar + " er et skudd�r.");
		}else{
			if(aar%4==0 && aar%100!=0){
				System.out.println(aar + " er et skudd�r.");
			}else{
				System.out.println(aar + " er  ikke et skudd�r.");
			}
		}
	}
}


