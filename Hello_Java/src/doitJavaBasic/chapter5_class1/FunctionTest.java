package doitJavaBasic.chapter5_class1;

public class FunctionTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int sum = add(num1, num2);  // add() 함수 호출
        System.out.println(num1 + " + " + num2 + " = " + sum + "입니다.");
    }
    public static int add(int n1, int n2) {  /* add() 함수*/
        int result = n1 + n2;
        return result;  // 결괏값 반환
    }
}
