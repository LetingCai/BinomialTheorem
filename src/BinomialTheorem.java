public class BinomialTheorem {
    //Instance Variables
    private int r, n;

    //Constructors
    public void changeN(int x){
        n=x;
    }
    public void changeR(int x){
        r=x;
    }
    public BinomialTheorem(int totalNumberOfObjects, int numberOfObjectsSelected){
        n = totalNumberOfObjects;
        r = numberOfObjectsSelected;
    }
    public BinomialTheorem(){
    }

    //Methods
    public int nFactorial(){
        int ans=1;
        for (int nF=n; nF>0; nF--){
            ans*=nF;
        }
        return ans;
    }
    public static int nFactorial(int n){
        int ans=1;
        for (int nF=n; nF>0; nF--){
            ans*=nF;
        }
        return ans;
    }

    public int rFactorial(){
        int ans=1;
        for (int rF=r; rF>0; rF--){
            ans*=rF;
        }
        return ans;
    }
    public static int rFactorial(int r){
        int ans=1;
        for (int rF=r; rF>0; rF--){
            ans*=rF;
        }
        return ans;
    }

    public int nMinusRFactorial(){
        int ans=1;
        for (int nrF=(n-r); nrF>0; nrF--){
            ans*=nrF;
        }
        return ans;
    }
    public static int nMinusRFactorial(int n, int r){
        int ans=1;
        for (int nrF=(n-r); nrF>0; nrF--){
            ans*=nrF;
        }
        return ans;
    }

    public int combination(){
        return permutation() / rFactorial();}
    public static int combination(int n, int r){return permutation(n, r)/rFactorial(r);}

    public int permutation(){
        return nFactorial()/nMinusRFactorial();
    }
    public static int permutation(int n, int r){
        return nFactorial(n)/nMinusRFactorial(n,r);}

    public static String pascalsTriangle(int n) {
        int a = n-1;
        StringBuilder returnString = new StringBuilder();
        for (int i = 0; i<=n; i++ ){
            returnString.append(" ".repeat(a + 1));
            for (int e = 0; e <=i;e++){
                returnString.append(combination(i, e)).append(" ");
            }
            a--;
            returnString.append("\n");
        }
        return returnString.toString();
    }
    public static double probability(int numberOfSuccess, int numberOfFailures, double probabilityOfSuccess){
        return Math.pow(probabilityOfSuccess,numberOfSuccess)*Math.pow(1-probabilityOfSuccess,numberOfFailures)*combination(numberOfFailures+numberOfSuccess,numberOfSuccess);
    }

    public String toString(){
        return "Combination: "+n+"C"+r+" = "+combination()+"\nPermutation: "+n+"P"+r+" = "+permutation();
    }
}
