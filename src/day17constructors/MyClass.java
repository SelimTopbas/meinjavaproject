package day17constructors;

public class MyClass {
	

    int x=3;
    int y=5;
    
    MyClass (){
        x+=1;
        System.out.println("-x" +x);  //3+1=4
    }
    
    MyClass (int i){
        this();                       // 1. constructoru cagirir.x=4
        this.y =i;                    // y=3 olur
        x+=y;                         // x=4+3=7
        System.out.println("-x" +x);  //
    }
    
    MyClass (int i, int i2){          // (4,3)
        this(3);                      // 2. constructori cagirir x=7
        this.x-=4;                    // x=7-4=3
        System.out.println("-x" +x);
    }
    public static void main(String[] args) {
        MyClass mc1 = new MyClass(4,3);
    }


}
