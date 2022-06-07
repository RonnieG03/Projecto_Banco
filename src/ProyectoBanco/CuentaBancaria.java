package ProyectoBanco;

public class CuentaBancaria {
    private Integer numCuenta;
    private String dni;
    private double monto;

    public CuentaBancaria(Integer numCuenta, String dni, double monto) {
        this.numCuenta = numCuenta;
        this.dni = dni;
        this.monto = monto;
    }

    public Integer getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(Integer numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void transferir(CuentaBancaria destino, double momto){
        destino.setMonto(destino.getMonto() + momto);
        this.monto -= momto;
    }

    public void retirar(double monto){
        this.monto-=monto;
    }

    public void depositar(double monto){
        this.monto += monto;
    }

    @Override
    public String toString() {
        return "Cuenta nro "+numCuenta
                +", dni: "+dni
                +", monto: "+monto;
    }
}
