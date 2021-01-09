import java.util.Random;
class MinRandom{
	//private int nesteHeltall;
	//private double nesteDesimaltall;


	public MinRandom(){
	}

	public int nesteHeltall(int nedre, int ovre){
		Random heltall = new Random();
		int nyTall = heltall.nextInt(ovre);
		nyTall = nyTall + 1;
		int nesteHeltall = nyTall;
		return nesteHeltall;
	}

	public double nesteDesiamaltall(double nedre, double ovre){
		java.util.Random desimaltall = new java.util.Random();
		double nyTall = desimaltall.nextDouble();
		double nesteDesimaltall = nyTall;
		return nesteDesimaltall;
	}


	public static void main(String[] args){

		MinRandom tall = new MinRandom();

		System.out.println(tall.nesteHeltall(0,10));
		System.out.println(tall.nesteDesiamaltall(0.0,1.0));

	}
}