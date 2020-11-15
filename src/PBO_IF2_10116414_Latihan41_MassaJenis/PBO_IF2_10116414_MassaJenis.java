/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan41_MassaJenis;
import java.util.Scanner;
/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan massa jenis
 */
public class PBO_IF2_10116414_MassaJenis {
    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        Scanner scan = new Scanner (System.in);
        
        System.out.println("======Massa Jenis Kubus======");
        System.out.print("Sisi\t: ");
        int kubus2 = scan.nextInt();
        System.out.print("Massa\t: ");
        int massa = scan.nextInt();
        
        System.out.println("\n======Hasil Perhitungan======");
        System.out.println("Volume\t: "+kubus.hasilVolume(kubus2));
        System.out.println("Massa Jenis\t: "+kubus.hitungMassa(massa,kubus2));
}
}