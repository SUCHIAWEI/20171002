
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
                char c1 =scn.next().charAt(0);
                if (c1-'A'>=0 && c1 -'A'<26) {System.out.println("uppercase"); }

                else if (c1-'a'>=0 && c1 - 'a' <26) { System.out.println("lowercase"); }
                else { System.out.println(" special character");}

}}
