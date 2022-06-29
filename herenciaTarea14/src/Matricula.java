public class Matricula
{

    protected Curso curso;

public Matricula(String nombreCurso){
    this.curso = new Curso(nombreCurso);

}
    public String mostrar(){
return curso.getNombreCurso();
}



}



