import java.io.Serializable;
import java.util.Objects;

public class EmpleadoAdministrativo extends Empleado implements Pago {

    private String area; //Finanzas, ventas, marketing

    public EmpleadoAdministrativo(String nombre, String direccion, int anioNacimiento, String area) {
        super(nombre, direccion, anioNacimiento);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "EmpleadoAdministrativo{" +
                "area='" + area + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpleadoAdministrativo that = (EmpleadoAdministrativo) o;
        return Objects.equals(area, that.area);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(area);
    }

    public double calcularPago(){
        return pagoAdministrativo;
    }
}
