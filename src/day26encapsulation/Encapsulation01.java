package day26encapsulation;

public class Encapsulation01 {

	private String kimlikNo = "34212367512"; // 1. Adım. Data private olacak
	private int krediKartNo = 12345678;
	private boolean soguk = true;

	public static void main(String[] args) {
//		Encapsulation, data saklama yöntemidir (data-hiding)
//		Encapsulation iki stepte yapılır:
//		1) Data'yi (variable, method) private yapılmalı(bu şekilde datalarımı saklamış oluyorum.) 
//		2) public olan getter() ve setter() methodlar üretmeliyiz(Bu methodlar üzerinden private datalara ulaşabileceğim )
//		getter(), data'yi sadece okumamıza yarar. getter() methodu data'da değişiklik yapamaz
//		setter(), data'yi değiştirmemize yarar.

	}

//		getter() üretmek için;	1) Acces Modifier public olmalı
//								2) Retrun type variable'in return type'i ile aynı olmalı
//								3) Method ismi "get + variable ismi" seklinde olmalı

	public String getKimlikNo() {// 2. Adım. Ben burada void kullanamam. void ekrana birşey yazdırmak için.
			return kimlikNo;     //ama benim derdim, datayi getter dan almak ve üzerinde değişiklik yapmak.
//									o yüzden void olamaz.
	
	}

	public int getKrediKartNo() {
		return krediKartNo;
	}

	public boolean isSoguk() { // Return type boolean ise, getter() method ismi "is" ile başlar. get ile
								// başlamaz
		return soguk;
	}

//	setter() uretmek icin;	1) Access modifier public olmali
//							2) Return type void olmali
//							3) Method ismi "set + variable name" seklinde olmali
//							4) Parametre olmali(genelde)
//							5) setter() methodlarin ismi booleanlar icin de "set" ile baslar
	
	public void setKimlikNo(String kimlikNo) { // setter'larin data tipi her zaman void olur.
		this.kimlikNo = kimlikNo;
	}

	public void setKrediKartNo(int krediKartNo) {
		this.krediKartNo = krediKartNo;
	}

	public void setSoguk(boolean soguk) {
		this.soguk = soguk;
	}

}
