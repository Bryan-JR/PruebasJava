public class Nodo {
    private int id;
    private String nombre;
    private double costo;
    private String tipo;
    private Nodo enlace;

    public Nodo() {
        id = 0;
        nombre = "";
        costo = 0;
        tipo = "";
        enlace = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
    
    public String info(){
        return "PRODUCTO "+getId()+".\n"
               +"\nNombre: "+getNombre()
               +"\nCosto: "+getCosto()
               +"\nTipo: "+getTipo()+"\n\n";
    }
}
