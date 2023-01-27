public class Camion extends Vehiculo{
    Remolque R1 = new Remolque();
    

    public Camion(String matricula, double velocidadInicial, Remolque r1) {
        super(matricula, velocidadInicial);
        R1 = null;
    }

    private void porRemolque(){
        if(R1!=null){

    }
    private void quitaRemolque(){

        }
    }

    @Override
    public double acelerar(double velocidad) {
        return super.acelerar(velocidad);
    }
}
