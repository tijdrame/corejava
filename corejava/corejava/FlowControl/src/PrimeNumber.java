import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Entrer un nombre");
        Scanner scanner = new Scanner(System.in);
        boolean primeFlag = true;
        int n = Integer.parseInt(scanner.next());
        for (int i = 2; i < n/2; i++) {
            if(n % i == 0){
                primeFlag = false;
                break;
            }
        }
        System.out.println("The number "+n+" is "+primeFlag);
    }
}
