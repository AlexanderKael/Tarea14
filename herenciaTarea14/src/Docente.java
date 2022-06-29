public class Docente extends Persona

{
    protected Curso curso;


    public Docente(String nombre, String apellido, int dni, int fechaNacimiento,String nomCurso) {
        super(nombre, apellido, dni, fechaNacimiento);


        this.curso = new Curso(nomCurso);
    }

    @Override
    int calcularEdad()
    {
        int calcularEdad;
        calcularEdad=(2022-getFechaNacimiento());
        return calcularEdad;
    }

    @Override
    public void mostrar(){
        System.out.println("\tnombre del docente: "+ getNombre());
        System.out.println("\tapellido del docente: "+ getApellido());
        System.out.println("\tDni del docente: "+ getDni());
        System.out.println("\tFecha De Nacimiento: "+ getFechaNacimiento());
        System.out.println("\tEnseña el curso de  "+ curso.getNombreCurso());
    }

}
