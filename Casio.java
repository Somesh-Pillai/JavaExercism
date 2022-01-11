class Calculator {
    int num1, num2;
    static String brand; // we make static if that variable is shared among many objects and one update is applicable to all other objects.
    Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;

    }
    public int add() {
        return num1 + num2;
    }
    public void show(){
        System.out.println(num1 + " + " + num2 + " = " + add());
        System.out.println("Brand: " + brand);
    }
}
public class Casio {
    public static void main(String []args){
        Calculator obj1 = new Calculator(4, 7);
        Calculator.brand = "Casio";  //class name can be used no object needed.
        Calculator obj2 = new Calculator(12, 34);
//        obj2.brand = "Casio";   //shared the value even without specifying
        obj1.show();
        obj2.show();
        obj2.brand = "Rado";   //object used
        obj2.show();
        obj1.show();
    }
}
