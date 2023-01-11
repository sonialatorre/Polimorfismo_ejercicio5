public abstract  class Animal {
    protected String nombre, comida,Raza;
    protected int edad;

    public Animal (){
    }

    public Animal(String nombre, String comida, String raza, int edad) {
        this.nombre = nombre;
        this.comida = comida;
        Raza = raza;
        this.edad = edad;
    }
    public abstract void alimento();
    public abstract void datos();
}

