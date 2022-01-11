class Calculator {
    int num1, num2;
    Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public int add() {
        return num1 + num2;
    }
}
public class Casio {
    public static void main(String []args){
        Calculator obj = new Calculator(4, 7);
        System.out.println(obj.add());
    }
}
