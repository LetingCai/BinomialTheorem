import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n, r;
        System.out.print("Welcome to Combination and Permutation Calculator. \nWhat is n (total number of objects)? ");
        n = scan.nextInt();
        System.out.print("\nWhat is r (number of objects selected)? ");
        r = scan.nextInt();
        BinomialTheorem calc = new BinomialTheorem(n, r);
        System.out.println(calc);
    }
}
