public class Camion extends Vehiculo{
    Remolque R1;

    public Camion(String matricula, double velocidadInicial) throws DemasiadoRapidoException {
        super(matricula, velocidadInicial);
    }

    public void ponRemolque(Remolque R1){
            this.R1=R1;
    }
    public void quitaRemolque(){
            this.R1=null;
        }

        public void acelerar(double acelerar) throws DemasiadoRapidoException{
        try{
            if(R1!=null && velocidadInicial+acelerar>=100){
                throw new DemasiadoRapidoException("Vas demasiado rápido");
            }else {
                velocidadInicial+=acelerar;
            }
        }catch (DemasiadoRapidoException E){
            System.out.println(E.getMessage());
        }
        }
    @Override
    public String toString() {
        if(this.R1!=null && velocidadInicial<100){
            return "CAMIÓN: {MATRICULA: " +matricula+ ". La velocidad es :" +velocidadInicial+" KM/H. Además lleva un remolque de: " + R1+" KG}";
        }else{
            return "CAMIÓN: {MATRICULA: " +matricula+ ". La velocidad es :" +velocidadInicial+" KM/H}";
        }
    }
}
