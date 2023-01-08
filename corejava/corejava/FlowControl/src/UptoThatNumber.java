import java.util.Scanner;

public class UptoThatNumber {
    public static void main(String[] args) {
        System.out.println("Entrer un nombre");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        for (int i = 0; i < n; i++) {
            if(i%10 !=0){
                System.out.println(i);
            }
            if(i == 100) {
                break;
            }
            
        }
    }
}
