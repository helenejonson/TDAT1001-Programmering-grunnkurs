class SekunderTilAlt {
	public static void main(String [] args) {
		int totSek = 3661;
		int timer = totSek/3600;
		int minutter = (totSek - timer*3600) / 60;
		int sekunder =(totSek - timer*3600 - minutter*60);
		System.out.println("Det blir " + timer + " timer," + minutter + " minutter og " + sekunder + " sekunder");
	}
}