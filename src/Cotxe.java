public class Cotxe extends Vehiculo{
    protected int num_puertas;

    public Cotxe(String matricula, double velocidadInicial, int num_puertas) throws DemasiadoRapidoException {
        super(matricula, velocidadInicial);
        this.num_puertas = num_puertas;
    }

    public int getNum_puertas() {
        return num_puertas;
    }
}
