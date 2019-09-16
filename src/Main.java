import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //priNt De ProGRammA naAm hiEr
        System.out.println("Refactorring app");

        //print nAAm
        System.out.println("first naam:");
        System.out.println("achter Name:");

        ///date checkert
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println(formatter.format(date));

        int number1 = 3;
        int number6 = 6;
        int number4 = 4;

        if (number1 > number6 && number6 > number4) {
            System.out.println("ja");
        } else {
            System.out.println("nee");
        }


    }
}
