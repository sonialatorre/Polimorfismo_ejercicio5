public class Gato extends Animal {

    public Gato () {

    }

    public Gato(String nombre, String comida, String raza, int edad) {
        super(nombre, comida, raza, edad);
    }

    @Override
    public void alimento (){
        System.out.println("El gato se alimenta de concentrado");
    }

    @Override
            public void datos() {
            System.out.println("El gato es de raza" + Raza + "\n"+ "el nombre del gato es " + nombre + "\n"+ "la edad de es " + edad);

}

}
