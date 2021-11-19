import java.util.ArrayList;

public class Estudiante extends Usuario {

    //ATRIBUTOS
    private String carrera;
    private ArrayList<String> materiasAprobadas = new ArrayList<String>();
    private ArrayList<String> materiasIscriptas = new ArrayList<String>();

    //CONSTRUCTOR

    public Estudiante(int dni, String nombre, String apellido, String carrera) {
        super(dni, nombre, apellido);
        this.carrera = carrera;
    }


    //GETTER Y SETTER

    public String getCarrera() {
        return carrera;
    }

    public ArrayList<String> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public ArrayList<String> getMateriasIscriptas() {
        return materiasIscriptas;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setMateriasAprobadas(ArrayList<String> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public void setMateriasIscriptas(ArrayList<String> materiasIscriptas) {
        this.materiasIscriptas = materiasIscriptas;
    }

    //METODOS

    public String imprimirMateriasAprobadas(){
        return "Materias aprobadas" + getMateriasAprobadas();
    }

    public String imprimirMateriasInscriptas(){
        return "Materias inscriptas" + getMateriasIscriptas();
    }




}
