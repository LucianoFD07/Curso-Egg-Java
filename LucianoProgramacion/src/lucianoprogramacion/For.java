/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucianoprogramacion;

/**
 *
 * @author lf531
 */
public class For {
static boolean estaPrendido = false;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        lamparaPrendida();
        for (int i = 1; i < 10; i++) {
            sos();
        }
    }
    public static void sos(){
        System.out.println(". . . _ _ _ . . .");
}
    public static boolean lamparaPrendida(){
        estaPrendido = (estaPrendido)?false:true;
    return estaPrendido;
}
}
