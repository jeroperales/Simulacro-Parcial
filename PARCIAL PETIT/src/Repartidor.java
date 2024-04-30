public class Repartidor implements Pago{


     final static Integer pago = 3;
     static Integer kilometro;

    public Repartidor() {
    }

    public static Integer getKilometro() {
        return kilometro;
    }

    public static void setKilometro(Integer kilometro) {
        Repartidor.kilometro = kilometro;
    }

    @Override
    public double calcularPago() {
        return pago * getKilometro();
    }


}
