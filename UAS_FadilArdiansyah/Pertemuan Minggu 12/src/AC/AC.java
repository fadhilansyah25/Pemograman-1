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
public class AC implements ACinterface{
    int statusAC;
    int suhuAC = minSuhuAC;

    public void matikanAC() {
        if (this.statusAC == statusHidup) {
            this.statusAC = statusMati;
            System.out.println(this.statusAC+" AC Telah dimatikan");
        } else {
            System.out.println("AC sudah dalam keadaan Mati");
        }
    }

    public void hidupkanAC() {
        if (this.statusAC == statusMati) {
            this.statusAC = statusHidup;
            System.out.println(this.statusAC+ " AC Telah dihidupkan");
        } else {
            System.out.println("AC sudah dalam keadaan hidup");
        }
    }

    public void panaskanAC() {
        if (this.statusAC == statusHidup) {
            if (this.suhuAC >= maxSuhuAC) {
                System.out.println("Suhu AC sudah maximal");
            } else {
                this.suhuAC++;
                System.out.println(this.suhuAC+" suhu AC bertambah 1");
            }
        } else {
            System.out.println("AC masih dalam keadaan mati");
        }
    }

    public void dinginkanAC() {
        if (this.statusAC == statusHidup) {
            if (this.suhuAC <= minSuhuAC) {
                System.out.println("Suhu AC sudah maximal");
            } else {
                this.suhuAC--;
                System.out.println(suhuAC+" suhu AC berkurang 1");
            }
        } else {
            System.out.println("AC masih dalam keadaan mati");
        }
    }
}
