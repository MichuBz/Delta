public class Delta {


    public static  void  main(String[] args) {

        System.out.println(sprawdz(delta(4, 5, 6)));
        System.out.println(sprawdz(delta(2, -1, 4)));

    }


    public static int delta(int a, int b, int c) {

        return b * b - 4 * a * c;
    }


    public static void sprawdz(int delta) {
        String result = "";
        if (delta == 0) {
            result = "JEDNO MIESJCE";

        }

        if (delta > 0) {
            result = "DWA MIESJCE";
        }
        if (delta < 0) {
            result = "BRAK MIEJSC";
        }

    }


}
