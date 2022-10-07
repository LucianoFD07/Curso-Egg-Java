/*
 que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés
 */
package EntidadCuentaBancaria;

/**
 *
 * @author lf531
 */
public class CuentaBancaria {
    int numeroCuenta,SaldoActual, interes;
    double DNI;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, int SaldoActual, double DNI) {
        this.numeroCuenta = numeroCuenta;
        this.SaldoActual = SaldoActual;
        this.DNI = DNI;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getSaldoActual() {
        return SaldoActual;
    }

    public double getDNI() {
        return DNI;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldoActual(int SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    public void setDNI(double DNI) {
        this.DNI = DNI;
    }

    public double setSaldoActual() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
