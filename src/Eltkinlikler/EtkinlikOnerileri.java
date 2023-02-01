package Eltkinlikler;
import java.util.Scanner;
public class EtkinlikOnerileri {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;

        int heat ;

        System.out.print ( "Sıcaklığı giriniz : " ) ;
        heat = sc.nextInt() ;

        if ( heat < 5) {

            System.out.println ( "Kayak yapabilirsiniz." ) ;

        } else if ( heat <= 15  ) {

            System.out.println ( "Sinemaya gidebilirsiniz" ) ;

        } else if ( heat <= 25) {

            System.out.println ( "Piknik yapmaya gidebilirsiniz" ) ;

        } else {

            System.out.println ( "Yüzmeye gidebilirsiniz" ) ;

        }

    }
}
