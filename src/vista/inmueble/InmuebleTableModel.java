package vista.inmueble;

import entidades.Inmueble;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class InmuebleTableModel extends AbstractTableModel {
    private ArrayList<Inmueble> inmuebles;
    private String[] columnNames = { "ID", "Tipo", "Superficie", "Precio", "Zona" };

    public InmuebleTableModel(ArrayList<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }
    
    public InmuebleTableModel(){
        
    }

    @Override
    public int getRowCount() {
        return inmuebles.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int row, int column) {
        Inmueble inmueble = inmuebles.get(row);

        switch (column) {
            case 0:
                return inmueble.getIdInmueble();
            case 1:
                return inmueble.getTipo();
            case 2:
                return inmueble.getSuperficie();
            case 3:
                return inmueble.getPrecio();
            case 4:
                return inmueble.getZona();
            default:
                return null;
        }
    }

    public Inmueble getInmuebleAtRow(int row) {
        return inmuebles.get(row);
    }
}
