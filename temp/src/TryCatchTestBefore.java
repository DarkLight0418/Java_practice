import java.util.Scanner;

public class TryCatchTestBefore {
    public static void SIUUU() {
        Scanner sc = new Scanner(System.in); // 스캐너 객체

        System.out.println("a : ");
        int a = sc.nextInt();
        System.out.println("b : ");
        int b = sc.nextInt();
    }

    public static void main(String[] args) {
        try {
            SIUUU();
        }
        catch (Exception e){

        }
    }
}
