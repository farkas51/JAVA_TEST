package ru.stqa.pft.sandbox;

public class FirstProgram {
    public static void main(String[] args){
        String s = "User";
        hello(s);
        Sqare sa = new Sqare(5);
        sa.l = 5.0;
        System.out.println(area(sa));
    }
    public static void hello(String s){
        System.out.println("wwowow, "+ s);
    }
    public static double area(Sqare s){
        return s.l*s.l;
    }
}
