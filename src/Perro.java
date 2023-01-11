public class Perro extends Animal {

    public Perro (){

    }

    public Perro(String nombre, String comida, String raza, int edad) {
        super(nombre, comida, raza, edad);
    }
    @Override
    public void alimento(){
        System.out.println("El perro se alimenta de concentrado");
    }
@Override
    public void datos() {
        System.out.println("El perro es de raza" + Raza + "\n"+ "el nombre del perro es " + nombre + "\n"+ "la edad de es " + edad);

}
}
