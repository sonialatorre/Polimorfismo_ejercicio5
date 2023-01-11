public class Main {
    public static void main(String[] args) {
         Animal perro1= new Perro("Fruna", "Concentrado", "French Poodle",5 );
         perro1.alimento();
         perro1.datos();

         Animal gato1=new Gato("Gatito", "concentrado","criollo",3 );
         gato1.alimento();
         gato1.datos();

         Animal caballo1=new Caballo("Caballo", "concentrado","puro", 7);
         caballo1.alimento();
         caballo1.datos();
    }


}