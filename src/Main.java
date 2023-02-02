public class Main {
    public static void main(String[] args) throws DemasiadoRapidoException {
        Vehiculo Arr [] = new Vehiculo[4];
        Arr [0] = new Camion("315-TAR",50);
        Arr [1] = new Camion("609-ÑMW",50);
        Arr [2] = new Cotxe("619-MWA",30,4);
        Arr [3] = new Cotxe("709-MHC",10,2);
       Remolque R1 = new Remolque(5000);

       try{
           for (int i = 0; i<Arr.length;i++){
               if(Arr[i] instanceof Camion){
                   ((Camion) Arr[i]).ponRemolque(R1);
               }
           }
           for (int i=0;i< Arr.length;i++){
               if(Arr[i] instanceof Cotxe){
                   Arr[i].acelerar(60);
               }
               if(Arr[i] instanceof Camion){
                   Arr[i].acelerar(60);
               }
               System.out.println(Arr[i]);
           }
       }catch (DemasiadoRapidoException D){
           System.out.println(D.getMessage());
       }

    }
}