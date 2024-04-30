import java.util.Objects;

public class EmpleadoVendedor extends Empleado implements Pago {

    private double montoMensual;

    public EmpleadoVendedor(String nombre, String direccion, int anioNacimiento, double montoMensual) {
        super(nombre, direccion, anioNacimiento);
        this.montoMensual = montoMensual;
    }

    public double getMontoMensual() {
        return montoMensual;
    }

    public void setMontoMensual(double montoMensual) {
        this.montoMensual = montoMensual;
    }

    @Override
    public String toString() {
        return "EmpleadoVendedor{" +
                "montoMensual=" + montoMensual +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpleadoVendedor that = (EmpleadoVendedor) o;
        return Double.compare(montoMensual, that.montoMensual) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(montoMensual);
    }

    @Override
    public double calcularPago() {

        pagoVendedor = montoMensual * 0.3;

        return pagoVendedor;
    }
}
