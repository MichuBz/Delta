import java.util.Random;
import java.util.Random;
import java.util.Scanner;

public class Chuck {


    public static void main(String[] args) {
        System.out.println("Hello");
        int x = getRandomInt();
        sprawdz(x);

    }


        public static  void sprawdz(int x){
            int liczba = getNumber();
            if (x == getNumber()) {
                System.out.println("Sukces");
            }
            if (x > getNumber()) {
                System.out.println("K jest mniejsze");
            }


            if (x < getNumber()) {
                System.out.println("K jest wieksze");
            }
        }


public static int getRandomInt(){
        Random random = new Random();
        return random.nextInt(100);
}

public static int getNumber() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbę:");
    int number = scanner.nextInt();
    return scanner.nextInt();
}

}




