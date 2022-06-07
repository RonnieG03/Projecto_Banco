package ProyectoBanco;

import java.util.HashSet;

public class Principal {
    public static void main(String[] args) {

        Banco bco = new Banco("ICBC");

        bco.getCuentaBancarias().add(new CuentaBancaria(1,"11111111",200.0));
        bco.getCuentaBancarias().add(new CuentaBancaria(2,"22222222",150.0));
        bco.getCuentaBancarias().add(new CuentaBancaria(3,"22222222",300.0));
        bco.getCuentaBancarias().add(new CuentaBancaria(4,"11111111",500.0));
        bco.getCuentaBancarias().add(new CuentaBancaria(5,"33333333",350.0));
        bco.getCuentaBancarias().add(new CuentaBancaria(6,"33333333",5.0));
        bco.getCuentaBancarias().add(new CuentaBancaria(7,"44444444",25.0));
        bco.getCuentaBancarias().add(new CuentaBancaria(8,"44444444",20.0));
        bco.getCuentaBancarias().add(new CuentaBancaria(9,"33333333",30.0));
        bco.getCuentaBancarias().add(new CuentaBancaria(10,"33333333",80.0));
        bco.getCuentaBancarias().add(new CuentaBancaria(11,"44444444",200.0));

        bco.transferir(1,6,50.0);
        bco.transferir(5,9,200.00);
        bco.retirar(7,10.0);
        bco.depositar(10,1000.0);

        bco.montoporCuenta();
        bco.imprimirMontoporDni();
        bco.totalBanco();

    }

}
