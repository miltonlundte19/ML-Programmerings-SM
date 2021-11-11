public class uppgift2 {

    public static void main(String[] args) {
        int Antalord;
        String Mening;
        System.out.println("Antal ord ?");
        Antalord = Integer.parseInt(System.console().readLine());
        System.out.println("Mening ?");
        Mening = System.console().readLine();
        String[] arrOfStr = splitmen(Mening,Antalord);
        delkortvokaler(arrOfStr);
    }

    private static void delkortvokaler(String[] arrOfStr) {
        char[] vokaler = new char[] {'a','e','i','o','u','y'};
        int x = 0;
        int count = 0;
        while (x != -1) {
            x = arrOfStr[count].indexOf(String.valueOf(vokaler),x);
           // if ( (arrOfStr[count].charAt(x++)).contains(vokaler) )
        }
    }

    private static String[] splitmen(String mening, int antalord) {
        if (antalord == 1 && mening.contains(" ")) {
            return new String[] {mening};
        } else {
            return mening.split(" ");
        }
    }

}
