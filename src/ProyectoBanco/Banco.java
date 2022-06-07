package ProyectoBanco;

import java.util.ArrayList;
import java.util.HashSet;

public class Banco {
    private String nombre;
    ArrayList<CuentaBancaria> cuentaBancarias = new ArrayList<>();

    public Banco(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<CuentaBancaria> getCuentaBancarias() {
        return cuentaBancarias;
    }

    public void setCuentaBancarias(ArrayList<CuentaBancaria> cuentaBancarias) {
        this.cuentaBancarias = cuentaBancarias;
    }

    public CuentaBancaria getCuentaNum(Integer nroCuenta){
        CuentaBancaria cta = null;
        for (CuentaBancaria c: this.cuentaBancarias){
            if (c.getNumCuenta().equals(nroCuenta)){
                cta = c;
            }
        }
        return cta;
    }

    public void transferir(Integer nroCta1, Integer nroCta2, double monto){
        this.getCuentaNum(nroCta1).transferir(this.getCuentaNum(nroCta2),monto);
    }

    public void retirar(Integer nroCta, double monto){
        this.getCuentaNum(nroCta).retirar(monto);
    }

    public void depositar(Integer nroCta, double monto){
        this.getCuentaNum(nroCta).depositar(monto);
    }

    public void imprimirMontoporDni(){
        HashSet<String> agruPordni = new HashSet<>();

        for (CuentaBancaria c: this.getCuentaBancarias()){
            agruPordni.add(c.getDni());
        }

        for (String dni: agruPordni){
                double total = 0.0;

                for (CuentaBancaria c: this.getCuentaBancarias()) {
                    if (c.getDni().equals(dni)) {
                        total += c.getMonto();
                    }
                }
            System.out.println("DNI: "+dni+", Total: "+total);
        }
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
    }

    public void totalBanco(){
        double total = 0.0;
        for (CuentaBancaria c: this.getCuentaBancarias()){
            total += c.getMonto();

        }
        System.out.println("Total Banco "+nombre+": $"+total);
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
    }

    public void montoporCuenta(){
        for (CuentaBancaria c: this.getCuentaBancarias()){
            System.out.println(c);
        }
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");

    }
}
