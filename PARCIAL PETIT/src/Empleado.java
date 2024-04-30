public class Empleado {
    public String nombre;
    public String direccion;
    public int anioNacimiento;

    public Empleado(String nombre, String direccion, int anioNacimiento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.anioNacimiento = anioNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", anioNacimiento=" + anioNacimiento +
                '}';
    }


}
