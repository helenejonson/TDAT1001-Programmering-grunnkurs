import java.util.Random;
class Spill{
	private int sumPoeng;

	public Spill(int sumPoeng){
		this.sumPoeng = sumPoeng;
	}

	public int getSumPoeng(){
		return sumPoeng;
	}

	public void kastTerningen(){
		Random terning = new Random();
		int terningkast = terning.nextInt(6);
		terningkast = terningkast + 1;
		if (terningkast ==1){
			sumPoeng = 0;
		}else{
		sumPoeng += terningkast;
		}
	}
}

