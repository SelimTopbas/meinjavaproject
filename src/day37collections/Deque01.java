package day37collections;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {

	public static void main(String[] args) {
		// Dequeue: Doble Ended Queue(Iki uçlu Queue)
		// Queue'larda ekleme sona yapılır, silme bastan yapılır
		// Dequeue kullanırsak, eklemeyi hem başa hem de sona yapabiliriz,
		// aynı şekilde silmeyi de hem baştan hem de sondan yapabiliriz
		// Dequeue'da FIFO var, bunun yanında LIFO(Last In First Out) da var.
		
		// Queue'lara eleman olarak null eklenebilir ama Deque'lara null eleman olarak eklenemez
		
		Deque<String> dq = new LinkedList<>();
		
		dq.add("Son1");
		dq.addFirst("Bas1");//en başa ekleme yapar
		dq.addLast("Son2");//en sona ekleme yapar
		dq.push("Bas2");//en başa ekleme yara
		dq.offer("Son3");
		dq.offerFirst("Baş3");//en başa ekleme yapar
		dq.offerLast("Son4");
		System.out.println(dq);
		
		
		//pop() methodu deque'larda bastaki elemani siler ve sildigi elemani return eder
		
		System.out.println(dq.pop());//Baş3
		System.out.println(dq);//Bas2, Bas1, Son1, Son2, Son3, Son4]
		
		System.out.println(dq.removeLast());//Son4
		System.out.println(dq);//[Bas2, Bas1, Son1, Son2, Son3]
		
		System.out.println(dq.removeFirst());//Bas2
		System.out.println(dq);//[Bas1, Son1, Son2, Son3]
		

	}

}
