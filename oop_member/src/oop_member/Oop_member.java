/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_member;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm BSD
 */
class Toko{
int kuantitas,harga,bayar,kembali,jumlah,kode_barang;
String nama,sttusanggota,barang,status;
Scanner input = new Scanner(System.in);

public Toko (){
barang="";
kuantitas=0;
harga=0;
bayar=0;
kembali=0;
nama="";
sttusanggota="";
jumlah=0;
}
public void input(){
        
        System.out.print("Nama : ");
        nama= input.nextLine();
        System.out.print("Status [Member/Non] : ");
        sttusanggota= input.nextLine();
        System.out.print ("Pembelian Barang [Kulkas,TV,Motor] :");
        barang= input.nextLine();
        System.out.print("Kuantitas : ");
        kuantitas= input.nextInt();
    }
public int harga(){
    switch(barang){
            case "Kulkas" :
                if("Non".equals(sttusanggota))
                {
                harga = 3500000;
                }
                if  ("Member".equals(sttusanggota))
                        {
                            harga=3500000-3500000*10/100;
                        }
                break;
            case "TV": 
                if("Non".equals(sttusanggota))
                {
                harga = 2100000;
                }
                if  ("Member".equals(sttusanggota))
                        {
                            harga=2100000-2100000*10/100;
                        }
                
                break;
            case "Motor":
                if("Non".equals(sttusanggota))
                {
                harga = 15000000;
                }
                if  ("Member".equals(sttusanggota))
                        {
                            harga=15000000-15000000*10/100;
                        }
                break;
            default:
    harga=0;       
    break;

}
    return harga;
}

public int total(){
    switch(sttusanggota){
            case "Member":
         jumlah=harga*kuantitas;
                break;
            case "Non":
               jumlah=harga*kuantitas;
                break; 
    }    
        return jumlah;
}
public void output(){
     total ();
        System.out.println("Total : "+ jumlah);
        input_bayar();
        kembalian();
        System.out.println("Kembalian : "+kembali);
        System.out.println("Terimakasih telah membeli");
}

  public void input_bayar(){
        System.out.print("Bayar : ");
        bayar= input.nextInt();
    } 
public int kembalian(){
    
        kembali = bayar-jumlah; 
        return kembali;
}
}
public class Oop_member {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toko bli = new Toko();
        
        bli.input();
        bli.harga();
        bli.total();
        bli.output();
            
        
                
    }
    
}
