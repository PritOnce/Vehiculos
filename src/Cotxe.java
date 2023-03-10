public class Cotxe extends Vehiculo{
    protected int num_puertas;

    public Cotxe(String matricula, double velocidadInicial, int num_puertas) throws DemasiadoRapidoException {
        super(matricula, velocidadInicial);
        this.num_puertas = num_puertas;
    }

    public int getNum_puertas() {
        return num_puertas;
    }

    @Override
    public String toString() {
        return "COTXE: {MATRICULA: " +matricula+ ". La velocidad es :" +velocidadInicial+" KM/H. Num.Puertas :" +num_puertas;
    }
}
