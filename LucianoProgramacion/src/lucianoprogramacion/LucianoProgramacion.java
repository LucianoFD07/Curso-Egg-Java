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
public class LucianoProgramacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double y =3;
      double dolar = 500;
       double are = circuArea(y);
        System.out.println(are);
        System.out.println( esferaArea(y));
        System.out.println( volumenEsfera(y));
        System.out.println();
          comvDolar(dolar);
    }
    
    public static double circuArea(double r){
        return Math.PI * Math.pow(r,2);
    }
    public static double esferaArea(double r){
        return 4*Math.PI*Math.pow(r,2);
        
    }
    public static double volumenEsfera(double r){
        return (4/3)* Math.PI* Math.pow(r,3);
    }
    
    public static double comvDolar(double cuanta , String moneda){
        switch(moneda){
            case "PARG":
                cuanta = cuanta * 280.0;
                break;
            case "pra":
                cuanta = cuanta * 350.0;
                break;
            
        }    
        return cuanta;
         
        
    }

    private static void comvDolar(double dolar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
