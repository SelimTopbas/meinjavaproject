package day28overriding;

public class Mammal extends Animal {
	public boolean birth = true;
	public String name = "Kedi";

	public static void main(String[] args) {

		Mammal mammal = new Mammal();//Benim notum: Child classindan obje olusturup calistirirsam ilk once 
										//Parent classlardaki constructorlari calistirir. 
	}

	public void feed() {
		System.out.println("Yavrularini besler");
	}

	public Mammal() {
		// this, icinde bulunulan classtaki variable ve methodlara ulasmamizi saglar
		System.out.println(this.birth);
		this.feed();
		// child parent iliskisi varsa this kullanarak parent class'larin variable
		// ve methodlara da ulasilabilir
		// ama parent classlardaki variable ve methodlara ulasmak icin this
		// kullanilmamali.
		// cunku child ve parent daki ayni isimli variable ve methodlarda problem
		// yasanabilir
		// genel kullanimda this class icindekiler icin super parent classlar icin
		// kullanilir.
		// farklilik yapip insanlari sasirtmayin
		System.out.println(this.age);
		System.out.println(this.name); 
		this.move();

		// Parantezsiz super, sadece parentlerdeki variable ve methodlara ulasmamizi
		// saglar
		// icinde bulunulan clastakilere ulasamaz
		// Parentdakilere super kullanarak ulasmak daha guvenilirdir

		System.out.println(super.age);
		System.out.println(this.name);
		super.move();

	}
	

}
