/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan28.gantikata;

import java.util.Scanner;

/**
 * @author
 * Nama                 : Garry Prang
 * NIM                  : 10116147
 * Kelas                : PBO-2
 * Deskripsi Program    : Program untuk mengubah kata tertentu pada kalimat.
 */

public class PBO10116147Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        Scanner scanner = new Scanner(System.in);
        System.out.println("======= PROGRAM GANTI KATA =======");
        System.out.print("Masukkan kalimat\t: ");
        String kalimat = scanner.nextLine();
        System.out.print("Ganti kata\t\t: ");
        String ganti = scanner.next();
        System.out.print("Menjadi kata\t\t: ");
        String jadi = scanner.next();
        System.out.println();
        System.out.println("======== HASIL FORMATING ========");
        System.out.println("Kalimat awal\t: " + kalimat);
        System.out.println("Kalimat baru\t: " + kalimat.replace(ganti, jadi));
        System.out.println("\nDeveloped by Garry Prang");
    }
    
}
