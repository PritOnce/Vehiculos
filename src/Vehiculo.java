public class Vehiculo {
    protected String matricula;
    protected double velocidadInicial=0;


    public Vehiculo() {
    }

    public Vehiculo(String matricula, double velocidadInicial) throws DemasiadoRapidoException{
        this.matricula = matricula;
        acelerar(velocidadInicial);

    }

    public void acelerar (double acelerar) throws DemasiadoRapidoException {
        velocidadInicial+=acelerar;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", velocidadInicial=" + velocidadInicial +
                '}';
    }
}
