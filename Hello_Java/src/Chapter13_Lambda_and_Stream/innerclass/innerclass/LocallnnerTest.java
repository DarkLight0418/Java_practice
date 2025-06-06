package Chapter13_Lambda_and_Stream.innerclass.innerclass;

class Outer {
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {
        int num = 100; // 지역 변수

        class MyRunnable implements Runnable {  // 지역 내부 클래스
            int localNum = 10;  // 지역 내부 클래스의 인스턴스 변수

            @Override
            public void run() {
                //num = 200;  지역 변수는 상수로 바뀌므로 값을 변경할 수 없어 오류 발생
                //i = 100;

                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);
                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outer.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
            }
        }
        return new MyRunnable();
    }
}

public class LocallnnerTest {
    public static void main(String[] args) {
        Outer out = new Outer();
        Runnable runner = out.getRunnable(10);  // 메서드 호출 / getRunnable() 메서드의 호출이 끝남
        runner.run();  // run()이 실행 되면서 getRunnable() 메서드의 지역 변수가 사용됨
    }
}
