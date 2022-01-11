class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}
public class Casio {
    public static void main(String []args){
        Calculator obj = new Calculator();
        System.out.println(obj.add(3, 7));
    }
}
