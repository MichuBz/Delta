import java.util.ArrayList;
import java.util.List;
public class tablica {


    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(5);
        lista.add(6);

    }

    public static int getMaxInt(List<Integer> myList) {
        int wynik = 0;
        int i =1;
        int result = 0;
        int size = myList.size();
        for (Integer integer) {

        }

        if (i <= size) {
            if (myList.get(i) < wynik) {
                wynik = myList.get(i);
            }
        }

        return wynik;
    }
}