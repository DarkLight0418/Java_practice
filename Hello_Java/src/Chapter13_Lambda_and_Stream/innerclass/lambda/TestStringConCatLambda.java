package Chapter13_Lambda_and_Stream.innerclass.lambda;

public class TestStringConCatLambda {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
        concat2.makeString(s1, s2);
    }
}
