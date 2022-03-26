package cuentas;

/**
 * Clase CCuenta Define los objetos necesarios para la representacion de una
 * cuenta bancaria
 *
 */
public class CCuenta {

    /**
     * Devuelve valor de la variable nombre
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Recibe un parametro de tipo String para cambiar el valor de la varibale
     * nombre
     *
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el valor de la variable cuenta
     *
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Recibe un parametro de tipo String para cambiar el valor de la varibale
     * cuenta
     *
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el valor de la variable radio
     *
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Recibe un parametro de tipo double para cambiar el valor de la varibale
     * saldo
     *
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el valor de la variable tipoInteres
     *
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Recibe un parametro de tipo double para cambiar el valor de la varibale
     * tipoInteres
     *
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor CCuenta vacio.
     * Genera un objeto sin parametros
     */
    public CCuenta() {
    }

    /**
     * Constructor CCuenta con parametros
     * Genera un objeto que recibe parametros de tipo String y double
     * @param nom
     * @param sal
     * @param cue
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Metodo que devuelve valor obtenido del metodo getSaldo()
     * @return devuelve el saldo de la cuenta
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Metodo que recibe por parametro una variable de tipo double
     * @param cantidad
     * @throws java.lang.Exception
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Metodo que recibe por parametro una variable de tipo double
     * @param cantidad
     * @throws java.lang.Exception
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }
}
