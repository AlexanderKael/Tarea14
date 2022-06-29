public class main
{
    public static void main(String[] args) {

        Alumno alumno = new Alumno("bob","wheleer",9153123,2005,"Programacion");
        alumno.mostrar();
        System.out.println("La edad es: "+alumno.calcularEdad());
        Docente docente= new Docente("diego","forlan",94153156,1994,"Programacion");
        docente.mostrar();
        System.out.println("La edad es: "+docente.calcularEdad());

    }
}
