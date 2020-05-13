package day05_Urany_ShortandOperators;

public class PostPre {
    public static void main(String[] args)
    {
        int a= 200;
        int b = -a++ + - --a * a-- % 2;
        System.out.println(b);
}
}