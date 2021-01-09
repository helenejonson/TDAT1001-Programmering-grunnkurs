
class spill100{
	public static void main (String[] args){
		int teller = 0;
		int sumA = 0;
		int sumB = 0;
		Spill ASpill = new Spill(0);
		Spill BSpill = new Spill(0);

		while(sumA<100 && sumB<100){

			ASpill.kastTerningen();
			int poengsumA = ASpill.getSumPoeng();
			sumA = poengsumA;
			teller ++;

			BSpill.kastTerningen();
			int poengsumB = BSpill.getSumPoeng();
			sumB = poengsumB;
			teller ++;
		}
		if (sumA>100 && sumB<100){
			System.out.println("Spiller A vant, med poengsummen "  + sumA + " i runde " + teller);
		}
		if (sumA<100 && sumB>100){
			System.out.println("Spiller B vant, med poengsummen " + sumB + " i runde " + teller);
		}
		if (sumA>100 && sumB>100){
			System.out.println("Spillerne ble ferdige samtidig , med poengsummene " + sumA + " for spiller A, og " + sumB + " for spiller B " + " i runde " + teller);
		}
	}
}
