/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apriliadewi.pkg14111014.encapintegration;

/**
 *
 * @author ADe25
 */
public class Enkapsulasi {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
	   RegularPagi pagi = new RegularPagi();
	   RegularMalam malam = new RegularMalam();
           Mahasiswa2  m = new Mahasiswa2() {};
	   pagi.getJadwal();
	   System.out.println(pagi.Jadwal);
           m.setNama("Aprilia");
           System.out.println(m.getNama());
	  	   pagi.getKelas();
	   System.out.println(pagi.Kelas);
	   pagi.getJurusan();
	   System.out.println(pagi.Jurusan);
	   
	    malam.getKerja();
	    System.out.println(malam.Kerja);
	  
	   }
    
}
