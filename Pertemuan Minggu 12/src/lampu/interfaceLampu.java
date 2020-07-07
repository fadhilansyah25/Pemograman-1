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
interface interfaceLampu {
    public static final int keadaanHidup = 1;
    public static final int keadaanMati = 0;

    public abstract void hidupkan();
    public abstract void matikan();
}
