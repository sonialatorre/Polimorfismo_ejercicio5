public class Caballo extends Animal {

    public Caballo (){

    }

    public Caballo(String nombre, String comida, String raza, int edad) {
        super(nombre, comida, raza, edad);
    }

    @Override
    public void alimento (){
        System.out.println("El caballo se alimenta de vegetales");

    }

    @Override
    public void datos (){
        System.out.println("El caballo es de raza" + Raza + "\n"+ "el nombre del caballo es " + nombre + "\n"+ "la edad de es " + edad);

    }

}



