/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadFinanciera;

/**
 *
 * @author Alicia
 *
 * @version v0.1 marzo_2023
 */
public class Main {

    /**
     *
     * Punto de entrada del programa. Crea una instancia de CCuenta, la utiliza
     * para obtener el estado actual de la cuenta y lo imprime por consola.
     *
     * @param args los argumentos de línea de comandos (no se utilizan en este
     * método)
     */
    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;

        objetoCuenta = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es" + saldoActual);
    }

    /**
     *
     * Ingresa una cantidad en una cuenta y comprueba que el saldo de la cuenta
     * es igual a la cantidad esperada.
     *
     * @param c la cuenta en la que se va a ingresar la cantidad
     * @param cantidad la cantidad que se va a ingresar
     * @param cantidadEsperada la cantidad que se espera que tenga la cuenta
     * después de la operación
     * @throws Exception si el saldo de la cuenta no es igual a la cantidad
     * esperada
     */
    public static void probarIngresar(CCuenta c, int cantidad, int cantidadEsperada) throws Exception {
        try {
            c.ingresar(cantidad);
            if (c.getSaldo() != cantidadEsperada) {
                throw new Exception("Error: La cantidad ingresada no es la esperada.");
            }
        } catch (Exception e) {
            System.err.println("Ha ocurrido una excepción: " + e.getMessage());
            throw e;
        }
    }

    /**
     *
     * Retira una cantidad de una cuenta y comprueba que el saldo de la cuenta
     * es igual a la cantidad esperada.
     *
     * @param c la cuenta de la que se va a retirar la cantidad
     * @param cantidad la cantidad que se va a retirar
     * @param cantidadEsperada la cantidad que se espera que tenga la cuenta
     * después de la operación
     * @throws Exception si el saldo de la cuenta no es igual a la cantidad
     * esperada
     */
    public static void probarRetirar(CCuenta c, int cantidad, int cantidadEsperada) throws Exception {
        try {
            c.retirar(cantidad);
            if (c.getSaldo() != cantidadEsperada) {
                throw new Exception("Error: La cantidad retirada no es la esperada.");
            }
        } catch (Exception e) {
            System.err.println("Ha ocurrido una excepción: " + e.getMessage());
            throw e;
        }
    }
}
