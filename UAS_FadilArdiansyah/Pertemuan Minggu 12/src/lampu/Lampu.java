/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lampu;

/**
 *
 * @author Fadhilansyah25
 */
public class Lampu implements interfaceLampu{
    int statusLampu;

    public void hidupkan(){
        if ( this.statusLampu == keadaanMati ){
            System.out.println(this.statusLampu);
            this.statusLampu = keadaanHidup;
            System.out.println("Hidupkan Lampu! --> Lampu Hidup");
        }else{
            System.out.println("Hidupkan Lampu! --> Lampu Sudah Hidup Kok");
        }
    }

    public void matikan(){
        if ( this.statusLampu == keadaanHidup ) {
            System.out.println(this.statusLampu);
            this.statusLampu = keadaanMati;
            System.out.println("Matikan Lampu! --> Lampu Mati");
        } else {
            System.out.println("Matikan Lampu! --> Lampu Sudah Mati Kok");
        }
    }
}
