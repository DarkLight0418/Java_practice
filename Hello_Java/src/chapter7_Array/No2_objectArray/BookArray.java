package chapter7_Array.No2_objectArray;

public class BookArray {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }
    }
}
