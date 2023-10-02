
package accesoADatos;


public class Entrevista {
    private int dnidelgarante;
    private int CUIT;
    private String nombrecompleto; 
    private String lugardetrabajo;
    private String nombregarante; 

    public Entrevista() {
    }

    public Entrevista(int dnidelgarante, int CUIT, String nombrecompleto, String lugardetrabajo, String nombregarante) {
        this.dnidelgarante = dnidelgarante;
        this.CUIT = CUIT;
        this.nombrecompleto = nombrecompleto;
        this.lugardetrabajo = lugardetrabajo;
        this.nombregarante = nombregarante;
    }

    public int getDnidelgarante() {
        return dnidelgarante;
    }

    public void setDnidelgarante(int dnidelgarante) {
        this.dnidelgarante = dnidelgarante;
    }

    public int getCUIT() {
        return CUIT;
    }

    public void setCUIT(int CUIT) {
        this.CUIT = CUIT;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public String getLugardetrabajo() {
        return lugardetrabajo;
    }

    public void setLugardetrabajo(String lugardetrabajo) {
        this.lugardetrabajo = lugardetrabajo;
    }

    public String getNombregarante() {
        return nombregarante;
    }

    public void setNombregarante(String nombregarante) {
        this.nombregarante = nombregarante;
    }

    @Override
    public String toString() {
        return "Entrevista{" + "dnidelgarante=" + dnidelgarante + ", CUIT=" + CUIT + ", nombrecompleto=" + nombrecompleto + ", lugardetrabajo=" + lugardetrabajo + ", nombregarante=" + nombregarante + '}';
    }
    
    
}
