
package cuentabancaria;

public class CuentaBancaria {
  String numeroCuenta;
    int saldo;
    String tipoCuenta;
public CuentaBancaria(){}

public CuentaBancaria(String numeroCuenta, String tipoCuenta){
    this.numeroCuenta = numeroCuenta;
    this.tipoCuenta = tipoCuenta;
   
}
public CuentaBancaria(String numeroCuenta, int saldo, String tipoCuenta){
    this.numeroCuenta = numeroCuenta;
    this.saldo = saldo;
    this.tipoCuenta = tipoCuenta;
}

}


