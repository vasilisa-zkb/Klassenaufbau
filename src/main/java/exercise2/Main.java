package exercise2;

public class Main {
    public static void main(String[] args) {

        Patient patient01 = new Patient("vasilisa",16,168,49,"w","ocd");
        Patient patient02 = new  Patient("julia",16,160,55,"w","cold");
        System.out.println(patient01);
        System.out.println(patient02);

        patient01.setName("ugly");

        System.out.println(patient01.toString());
        //Main Method
    }
}
