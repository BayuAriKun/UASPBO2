/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penjualankaos;

import java.util.Scanner;

/**
 *
 * @author Bay Lee
 */
public class PenjualanKaos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pelanggan entityObjk =new Pelanggan();
        QueryKaos tambah = new QueryKaos();
        Scanner input=new Scanner(System.in);
        String nama_pelanggan,alamat_pelanggan,jekel_pelanggan,jwb;
        long id = 0;    
        
        System.out.println("Toko Kaos Distro");
        System.out.println("Apakah anda ingin menambah data ? jawab Y / N");jwb=input.nextLine();
        if(jwb.equals("Y")){
        System.out.println("Masukkan Biodata Anda :");
        System.out.print("Nama Lengkap :");nama_pelanggan = input.nextLine();
        System.out.print("Jenis Kelamin :");jekel_pelanggan=input.nextLine();
        System.out.print("Alamat :");alamat_pelanggan=input.nextLine();
        entityObjk.setNama_Pelanggan(nama_pelanggan);
        entityObjk.setJekel_Pelanggan(jekel_pelanggan);
        entityObjk.setAlamat_Pelanggan(alamat_pelanggan);
        tambah.Add(entityObjk);
        }
        
        System.out.println("Apakah data anda ingin dilihat kan ? jawab Y / N");jwb=input.nextLine();
        if(jwb.equals("Y")){
        tambah.Show();
        }
        
        System.out.println("Apakah data anda ingin di rubah/di hapus kan ?\n"
                + "jawab lanjut : untuk rubah "
                + "\n jawab ok : untuk hapus"
                + "\n jawab tambah : untuk tambah data");
        jwb=input.nextLine();
        
        if(jwb.equals("lanjut")){
            System.out.print("Nama :");nama_pelanggan = input.nextLine();
            System.out.print("Alamat :");alamat_pelanggan = input.nextLine();
            System.out.print("ID :");id=input.nextLong();
            tambah.update(id,nama_pelanggan,alamat_pelanggan);
            tambah.Show();
            
        }else if(jwb.equals("ok")){
            tambah.Show();
            System.out.print("Masukan ID :");id=input.nextLong();
            tambah.hapus(id);
            tambah.Show();
        }else if(jwb.equals("tambah")){
            System.out.print("Nama Lengkap :");nama_pelanggan = input.nextLine();
        System.out.print("Alamat :");alamat_pelanggan=input.nextLine();
        entityObjk.setNama_Pelanggan(nama_pelanggan);
        entityObjk.setAlamat_Pelanggan(alamat_pelanggan);
        tambah.Add(entityObjk);
        
        }
    }
    
}
