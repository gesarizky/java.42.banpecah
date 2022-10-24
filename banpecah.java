
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gesa Rizky Nugraha
 */
public class banpecah {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(" *************************************************************");
        System.out.println(" *Masukkan Nilai a (dari pecahan  a/b dengan c/d)");
        System.out.println(" *************************************************************");

        int a = sc.nextInt();

        System.out.println(" ************************************************************* ");
        System.out.println(" *Masukkan Nilai b (dari pecahan " + a + "/b dengan c/d)");
        System.out.println(" ************************************************************* ");

        int b = sc.nextInt();

        System.out.println(" ************************************************************* ");
        System.out.println(" *Masukkan Nilai c (dari pecahan " + a + "/" + b + " dengan c/d)");
        System.out.println(" ************************************************************* ");

        int c = sc.nextInt();

        System.out.println(" ************************************************************* ");
        System.out.println(" *Masukkan Nilai d (dari pecahan " + a + "/" + b + " dengan " + c + "/d)");
        System.out.println(" ************************************************************* ");

        int d = sc.nextInt();

        int kpk = 0;
        for (int x = 1; x <= d; x++) {

            kpk = (kpk + b);

            if (kpk % d == 0) {

                break;

            }
        }

        int a1 = (kpk / b) * a;
        int c1 = (kpk / d) * c;

        System.out.println(" *********************************************************** ");
        System.out.println(" *Maka Perbandingan dari pecahan " + a + "/" + b + " dengan " + c + "/" + d);
        System.out.println(" *Dengan KPK Pecahan  = " + kpk);
        System.out.println(" *Setelah disederhanakan menjadi  = " + a1 + "/" + kpk + " dengan " + c1 + "/" + kpk);
        if (a1 == c1) {
            System.out.println(" *Maka Kesimpulan " + a1 + "/" + kpk + " sama dengan " + c1 + "/" + kpk);
        } else if (a1 < c1) {
            System.out.println(" *Maka Kesimpulan " + a1 + "/" + kpk + " lebih kecil " + c1 + "/" + kpk);
        } else {
            System.out.println(" *Maka Kesimpulan " + a1 + "/" + kpk + " lebih besar " + c1 + "/" + kpk);
        }

        System.out.println(" ********************************************************** ");
    }

}
