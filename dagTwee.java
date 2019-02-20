package dagTwee;

class dagTwee{
	public static void main(String[] args) {
		System.out.println("het werkt");
		Dier dier1 = new Dier("Simba");
		dier1.boot = new Tanden();
		System.out.println(dier1.naam);
		dier1.tanden();
		dier1.tanden();
		Gaatje.geenGaatje = true;
		dier1.tanden();
		System.out.println(dier1.boot.aantal);
		
	}
}
class Dier{
	String naam;
	Tanden boot;
	Dier(String deNaam){
		naam = deNaam;
	}
	void tanden() {
		if(Gaatje.geenGaatje) {
		Tand tand = new Tand(32);
		boot.aantal += tand.aantalGaatjes;
			System.out.println("Tanden zijn in orde");
		}else {
			System.out.println("Er zijn gaatjes");
		}
	}
}
class Tanden{
	int aantal;
}
class Tand{
	int aantalGaatjes;
	Tand(int gaatjes){
		aantalGaatjes = gaatjes;
	}
}
class Gaatje{
	static boolean geenGaatje;
}
