/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadFinanciera;

/**
 *
 * Clase que representa una cuenta bancaria.
 */
public class CCuenta {

    /**
     * Nombre de la persona titular
     */
    private String nombre;
    /**
     *
     * Cadena de caracteres que forman la cuenta.
     */
    private String cuenta;
    /**
     *
     * Saldo de la cuenta.
     */
    private double saldo;
    /**
     *
     * Tipo de interés que se aplica a la cuenta.
     */
    private double tipoInterés;
    /**
     *
     * Mensaje de error que se muestra cuando se intenta ingresar una cantidad
     * negativa.
     */
    private final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";
    /**
     *
     * Constructor vacío.
     */
    public CCuenta() {
    }
    /**
     *
     * Constructor que inicializa los atributos de la cuenta.
     *
     * @param nom el nombre de la persona titular de la cuenta.
     * @param cue cuenta.
     * @param sal el saldo de la cuenta.
     * @param tipo el tipo de interés que se aplica a la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    /**
     *
     * Devuelve el saldo actual de la cuenta.
     *
     * @return el saldo actual de la cuenta.
     */
    public double estado() {
        return this.saldo;
    }
    /**
     *
     * Ingresa una cantidad en la cuenta.
     *
     * @param cantidad la cantidad a ingresar.
     * @throws Exception lanza una excepción si se intenta ingresar una cantidad
     * negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }
    /**
     *
     * Retira una cantidad de la cuenta.
     *
     * @param cantidad la cantidad a retirar.
     * @throws Exception lanza una excepción si se intenta retirar una cantidad
     * negativa o si no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (saldo < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }
    /**
     *
     * Devuelve el nombre de la persona titular de la cuenta.
     *
     * @return el nombre de la persona titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     *
     * Establece el nombre de la persona titular de la cuenta.
     *
     * @param nombre el nombre de la persona titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     *
     * Devuelve los caracteres que conforman la cuenta.
     *
     * @return la cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }
    /**
     *
     * Establece los caracteres que conforman la cuenta.
     *
     * @param cuenta la cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    /**
     *
     * Devuelve el saldo de la cuenta.
     *
     * @return saldo.
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     *
     * Establece el saldo.
     *
     * @param saldo.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     *
     * Devuelve el tipo de interés de la cuenta.
     *
     * @return getTipoInterés.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }
    /**
     *
     * Establece tipo de interés de la cuenta.
     *
     * @param tipoInterés.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    public String getERRORCANTIDADNEGATIVA() {
        return ERRORCANTIDADNEGATIVA;
    }
}
