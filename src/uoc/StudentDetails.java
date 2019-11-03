
package uoc;

import javax.swing.table.AbstractTableModel;
import java.util.*;

/**
 *
 * @author kpsdilshan
 */
public class StudentDetails extends AbstractTableModel {

    private static final String[] COLUMN_NAMES = {"Reg ID", "First Name","Last Name","Faculty","YearOfReg"};
    private static ArrayList<Student> list;

    StudentDetails(ArrayList<Student> lecList) {
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
            case 1:    return list.get(rowIndex).getFirstName();
            case 2:    return list.get(rowIndex).getLastName();           
            case 3:    return list.get(rowIndex).getFaculty();
            case 4:    return list.get(rowIndex).getYearOfReg();     
            default: return "Error";

        }
    }

}
