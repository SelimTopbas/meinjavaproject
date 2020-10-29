package day32abstraction;

public interface Interface01 {

	// Interface içine concrete method yazılırsa Compile Time Error alınır.
	// Interface'de method oluşturulurken kesinlikle body yazılmamalı.
	// Interface'deki methodlar kesinlikle abstract olmalı.
	// Interface'deki abstract methodları üretirken abstract keyword kullanılsa da
	// olur, kullanılmasa da olur. Çünkü,
	// interface kendi icine yazılan methodları otomatik olarak abstract olarak
	// kabul eder.
	public void add();

	public abstract void subtract();

	// Interface de variable'lar mutlaka public, stati, final olmalı ve mutlaka
	// initialize(değer atanmalı) edilmelidirler
	// Variable oluşturulurken public, static, final keywordleri kullanılsa da olur,
	// kullanılmasa da olur. public, static, final keyword'leri kullanıldığında da,
	// kullanılmadığında da variable public, static ve finaldir.

	public static final int a = 12;
	int b = 11;
	public int c = 3;
	final int d = 6;
	static int e = 8;
	
	
	
}
