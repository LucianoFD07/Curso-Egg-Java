/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NespressEntidades;

/**
 *
 * @author lf531
 */
public class Cafetera {
    private int capMax;
    private int cantAct;

    public Cafetera() {
    }

    public Cafetera(int capMax, int capAct) {
        this.capMax = capMax;
        this.cantAct = capAct;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public int getCantAct() {
        return cantAct;
    }

    public void setCantAct(int capAct) {
        this.cantAct = capAct;
    }
}
