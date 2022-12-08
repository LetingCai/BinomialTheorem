import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BinomialTheorem calc = new BinomialTheorem();
        String str;
        int x;
        System.out.print("Welcome to Combination and Permutation Calculator!\n\nEnter nCr for combination (fill in variable n and r)\nEnter nPr for permutation (fill in variable n and r)\nEnter 1 for Pascal's triangle\nEnter 2 for Binomial probability\n");
        str = scan.nextLine();
        try{
            x = Integer.parseInt(str);
            if (x==1){
                System.out.println("How many rows? ");
                System.out.println(BinomialTheorem.pascalsTriangle(scan.nextInt()));
            } else if(x==2){
                System.out.println("What is the probability of success? (in in decimal form)");
                double p = scan.nextDouble();
                System.out.println("Number of success?");
                int n1 = scan.nextInt();
                System.out.println("Number of failures?");
                int n2 = scan.nextInt();
                System.out.println("Probability: "+calc.probability(n1, n2,p));
            }
        } catch(Exception e){
            if(str.charAt(1) == 'C'){
                System.out.println(BinomialTheorem.combination(Integer.parseInt(str.substring(0,1)),Integer.parseInt(str.substring(2))));
            } else if(str.charAt(1) == 'P'){
                System.out.println(BinomialTheorem.permutation(Integer.parseInt(str.substring(0,1)),Integer.parseInt(str.substring(2))));
            }
        }
    }
}
