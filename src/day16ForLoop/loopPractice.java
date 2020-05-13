package day16ForLoop;

public class loopPractice {
    public static void main(String[] args) {
        String name = "berelek";
        for (int i = 1; i <= name.length()-1 ; i++)
            if (i % 3 == 0 && i % 5 ==0)
            System.out.println(i);
    }
}
