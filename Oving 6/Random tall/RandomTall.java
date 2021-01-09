import java.util.Random;
class RandomTall{

	int[] antall;

	public RandomTall(int[] antall){
		this.antall = antall;
	}


// lager random
	public int getNesteTall(){
		Random random = new Random();
		int i = random.nextInt(10);
		return i;
	}

// putter inn i tabell
	public void setTabell(int i){
		antall[i]++;
	}

	public static void main(String[] args){

		int[] antall = new int[10];

		RandomTall Tabell = new RandomTall(antall);


		for(int j = 0; j < 10000; j++){
			int i = Tabell.getNesteTall();

			Tabell.setTabell(i);
		}
		for(int k = 0; k < antall.length; k++){
			System.out.println("tallet " + k + " blir generert " + antall[k] + " ganger.");
		}
	}
}