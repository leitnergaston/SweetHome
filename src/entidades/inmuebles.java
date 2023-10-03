
package entidades;

public class inmuebles {
    private String usodelocal;
    private String zona;
    private int superficiemínima;
    private int precioaproximado;

    public inmuebles() {
    }

    public inmuebles(String usodelocal, String zona, int superficiemínima, int precioaproximado) {
        this.usodelocal = usodelocal;
        this.zona = zona;
        this.superficiemínima = superficiemínima;
        this.precioaproximado = precioaproximado;
    }

    public String getUsodelocal() {
        return usodelocal;
    }

    public void setUsodelocal(String usodelocal) {
        this.usodelocal = usodelocal;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getSuperficiemínima() {
        return superficiemínima;
    }

    public void setSuperficiemínima(int superficiemínima) {
        this.superficiemínima = superficiemínima;
    }

    public int getPrecioaproximado() {
        return precioaproximado;
    }

    public void setPrecioaproximado(int precioaproximado) {
        this.precioaproximado = precioaproximado;
    }
    
    private void buscarInmuebledisponibles(){
        
    }
    @Override
    public String toString() {
        return "inmuebles{" + "usodelocal=" + usodelocal + ", zona=" + zona + ", superficiem\u00ednima=" + superficiemínima + ", precioaproximado=" + precioaproximado + '}';
    }
    
    
}
