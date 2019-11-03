
package uoc;

import javax.swing.table.AbstractTableModel;
import java.util.*;

/**
 *
 * @author kpsdilshan
 */
public class LecturerDetails extends AbstractTableModel {

    private static final String[] COLUMN_NAMES = {"Reg ID", "Name","Faculty"};
    private static ArrayList<Lecturer> list;

    LecturerDetails(ArrayList<Lecturer> lecList) {
        list = lecList;
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
            case 0:    return list.get(rowIndex).getRegID();
            case 1:    return list.get(rowIndex).getName();
            case 2:    return list.get(rowIndex).getFaculty();           
            default: return "Error";

        }
    }

}
