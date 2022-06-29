public class Alumno extends Persona
{

    protected Matricula matricula;

    public Alumno(String nombre, String apellido, int dni, int fechaNacimiento,String matri) {
        super(nombre, apellido, dni, fechaNacimiento);
        this.matricula = new Matricula(matri);

    }
    @Override
   int calcularEdad() {
       int calcularEdad;
       calcularEdad= 2022-getFechaNacimiento();
       return calcularEdad;
    }
@Override
   public void mostrar(){
       System.out.println("\tnombre de Alumno: "+ getNombre());
       System.out.println("\tApellidos: "+ getApellido());
       System.out.println("\tDni: "+ getDni());
       System.out.println("\tFecha de Nacimiento: "+ getFechaNacimiento());
       System.out.println("\tllevando el curso de: "+ matricula.mostrar());

   }


}
