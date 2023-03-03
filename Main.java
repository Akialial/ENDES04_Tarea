/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadFinanciera;

public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;

        objetoCuenta = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es" + saldoActual);
    }

    public static void probarIngresar(CCuenta c, int cantidad) throws Exception {
        try {
            c.ingresar(cantidad);
        } catch (Exception e) {
            System.err.println("Ha ocurrido una excepción: " + e.getMessage());
            throw e;
        }
    }

    public static void probarRetirar(CCuenta c, int cantidad) throws Exception {
        try {
            c.retirar(cantidad);
        } catch (Exception e) {
            System.err.println("Ha ocurrido una excepción: " + e.getMessage());
            throw e;
        }
    }
}