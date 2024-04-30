import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sindicato {
    private ArrayList<Empleado> lista = new ArrayList();

    public Sindicato(ArrayList<Empleado> lista) {
        this.lista = lista;
    }

    public ArrayList<Empleado> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Empleado> lista) {
        this.lista = lista;
    }

    public void agregar(Empleado e) {
        lista.add(e);
    }

    public void eliminar(Empleado e) {
        lista.remove(e);
    }

public Empleado buscarPorLegajo(int anioDeNacimiento)
{
    int i;
    Empleado e;
    for(i=0;i<lista.size();i++)
    {
        e = lista.get(i);
        if(anioDeNacimiento == e.getAnioNacimiento()){
            System.out.println("SE ENCONTRO!!!!!");
            return e;
        }

    }
    return null;

}

public int contarEmpleados()
{
    return lista.size();

}

public Empleado devolverListado()
{

    for(Empleado e : lista){
        System.out.println(e.toString());
    }
    return null;
}

public boolean eliminarListado(int anioDeNacimiento) {

        int i = -1;
        for (Empleado e : lista) {
            i++;
            if (e.getAnioNacimiento() == anioDeNacimiento) {

                lista.remove(i);
                return true;
            }
        }
        return false;
}



}
