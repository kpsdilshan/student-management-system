
package uoc;

import javax.swing.table.AbstractTableModel;
import java.util.*;

/**
 *
 * @author kpsdilshan
 */
public class DegreeDetails extends AbstractTableModel {

    private static final String[] COLUMN_NAMES = {"Degree ID", "Degree","Duration"};
    private static ArrayList<Degree> list;

    DegreeDetails(ArrayList<Degree> digList) {
        list = digList;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }
    //TO GIVE NAMES TO TABLE
    public String getColumnName(int clumnIndex){
        return COLUMN_NAMES[clumnIndex];
    }
    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:    return list.get(rowIndex).getDegreeID();
            case 1:    return list.get(rowIndex).getName();
            case 2:    return list.get(rowIndex).getDuration();           
            default: return "Error";

        }
    }

}
