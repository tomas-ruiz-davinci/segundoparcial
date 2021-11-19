import java.util.ArrayList;

public class Profesor extends Usuario{

    //ATRIBUTOS

    private ArrayList<String> comisiones = new ArrayList<String>();

    //CONSTRUCTOR

    public Profesor(int dni, String nombre, String apellido, ArrayList<String> comisiones) {
        super(dni, nombre, apellido);
        this.comisiones = comisiones;
    }


    //GETTER SETTER


    public ArrayList<String> getComisiones() {
        return comisiones;
    }

    public void setComisiones(ArrayList<String> comisiones) {
        this.comisiones = comisiones;
    }

    //METODO

    public String imprimirComisiones(){
        return "Comisiones" + getComisiones();
    }
}
