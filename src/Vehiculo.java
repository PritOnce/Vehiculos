public class Vehiculo {
    protected String matricula;
    protected double velocidadInicial=0;


    public Vehiculo() {
    }

    public Vehiculo(String matricula, double velocidadInicial) {
        this.matricula = matricula;
        acelerar(velocidadInicial);

    }

    public double acelerar (double velocidad){
        velocidadInicial+=velocidad;
        return velocidadInicial;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", velocidadInicial=" + velocidadInicial +
                '}';
    }
}
