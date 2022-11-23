public class Main {
    public static double Twc(double Ta, double V){
        return Math.round(35.74+(0.6215*Ta)-(Math.pow(V,0.16)*35.75)+(0.4275*Ta*Math.pow(V, 0.16)));
    }
    public static void main(String[] args){
        for (int v = 5; v<=60; v+=5){
            for(int Ta = 40; Ta>=-45; Ta-=5){
                System.out.print(Twc(Ta,v)+" ");
            }
            System.out.println();
        }
    }
}
