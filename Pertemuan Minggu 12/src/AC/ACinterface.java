/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AC;

/**
 *
 * @author Fadhilansyah25
 */
interface ACinterface {
    public static final int statusHidup = 1;
    public static final int statusMati = 0;
    public static final int minSuhuAC = 16;
    public static final int maxSuhuAC = 30;

    public abstract void matikanAC();
    public abstract void hidupkanAC();
    public abstract void dinginkanAC();
    public abstract void panaskanAC();
}
