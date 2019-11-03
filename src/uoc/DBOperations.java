package uoc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author kpsdilshan
 */
public class DBOperations {

    String url = "jdbc:mysql://localhost:3306/student";
    String userName = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public boolean addStudent(Student st) {
        try {
            con = (Connection) DriverManager.getConnection(url, userName, password);// get the connection
            String query = "INSERT INTO studentdetails  VALUES (?,?,?,?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setInt(1, st.getRegID());
            pst.setString(2, st.getFirstName());
            pst.setString(3, st.getLastName());
            pst.setInt(4, st.getAge());
            pst.setString(5, st.getAddress());
            pst.setString(6, st.getGender());
            pst.setString(7, st.getFaculty());
            pst.setString(8, st.getYearOfReg());

            pst.executeUpdate();//execute the sql query and insert the values to the table  
            return true;

        } catch (Exception e) {
            System.out.println("Exception is " + e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.print("Exception is " + e);
            }
        }
    }

    ArrayList<Student> getStudent() {
        try {
            ArrayList<Student> list = new ArrayList<Student>();
            con = (Connection) DriverManager.getConnection(url, userName, password);// get the connection
            String query = "SELECT * FROM studentdetails";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();

            while (rs.next()) {
                Student s = new Student();
                s.setRegID(rs.getInt(1));
                s.setFirstName(rs.getString(2));
                s.setLastName(rs.getString(3));
                s.setAge(rs.getInt(4));
                s.setAddress(rs.getString(5));
                s.setGender(rs.getString(6));
                s.setFaculty(rs.getString(7));
                s.setYearOfReg(rs.getString(8));
                list.add(s);
            }
            return list;
        } catch (Exception e) {
            System.out.println("Exception is " + e);
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.print("Exception is " + e);
            }
        }
    }

    public boolean updateStudent(Student st) {
        try {
            con = (Connection) DriverManager.getConnection(url, userName, password);// get the connection
            System.out.println("1");
            String query = "UPDATE studentdetails SET firstname='" + st.getFirstName() + "',lastname='" + st.getLastName() + "',age=" + st.getAge() + ",address='" + st.getAddress() + "',gender='" + st.getGender() + "',faculty='" + st.getFaculty() + "',yearofreg='" + st.getYearOfReg() + "' WHERE regid=" + st.getRegID();
            System.out.println("2");
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Exception is " + e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.print("Exception is " + e);
            }
        }
    }

    public boolean deleteStudent(Student st) {
        try {
            con = (Connection) DriverManager.getConnection(url, userName, password);// get the connection
            String query = "DELETE FROM studentdetails WHERE regid=" + st.getRegID();
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Exception is " + e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.print("Exception is " + e);
            }
        }
    }

    ArrayList<Lecturer> getLecturer() {
        try {
            ArrayList<Lecturer> list = new ArrayList<Lecturer>();
            con = (Connection) DriverManager.getConnection(url, userName, password);// get the connection
            String query = "SELECT * FROM lecturerdetails";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();

            while (rs.next()) {
                Lecturer l = new Lecturer();
                l.setRegID(rs.getInt(1));
                l.setName(rs.getString(2));
                l.setAddress(rs.getString(3));
                l.setAge(rs.getInt(4));
                l.setFaculty(rs.getString(5));
                list.add(l);
            }
            return list;
        } catch (Exception e) {
            System.out.println("Exception is " + e);
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.print("Exception is " + e);
            }
        }
    }

    public boolean addLecturer(Lecturer st) {
        try {
            con = (Connection) DriverManager.getConnection(url, userName, password);// get the connection
            String query = "INSERT INTO lecturerdetails  VALUES (?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setInt(1, st.getRegID());
            pst.setString(2, st.getName());
            pst.setString(3, st.getAddress());
            pst.setInt(4, st.getAge());
            pst.setString(5, st.getFaculty());

            pst.executeUpdate();//execute the sql query and insert the values to the table  
            return true;

        } catch (Exception e) {
            System.out.println("Exception is " + e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.print("Exception is " + e);
            }
        }
    }

    public boolean deleteLecturer(Lecturer st) {
        try {
            con = (Connection) DriverManager.getConnection(url, userName, password);// get the connection
            String query = "DELETE FROM lecturerdetails WHERE regid=" + st.getRegID();
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Exception is " + e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.print("Exception is " + e);
            }
        }
    }

    public boolean updateLecturer(Lecturer st) {
        try {
            con = (Connection) DriverManager.getConnection(url, userName, password);// get the connection
            System.out.println("1");
            String query = "UPDATE lecturerdetails SET name='" + st.getName() + "',address='" + st.getAddress() + "',age=" + st.getAge() + ",faculty='" + st.getFaculty() + "' WHERE regid=" + st.getRegID();
            System.out.println("2");
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Exception is " + e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.print("Exception is " + e);
            }
        }
    }

    public boolean addDegree(Degree st) {
        try {
            con = (Connection) DriverManager.getConnection(url, userName, password);// get the connection
            String query = "INSERT INTO degreeprograms  VALUES (?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setInt(1, st.getDegreeID());
            pst.setString(2, st.getName());
            pst.setInt(3, st.getDuration());
            pst.setString(4, st.getDescription());

            pst.executeUpdate();//execute the sql query and insert the values to the table  
            return true;

        } catch (Exception e) {
            System.out.println("Exception is " + e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.print("Exception is " + e);
            }
        }
    }
       public boolean updateDegree(Degree st) {
        try {
            con = (Connection) DriverManager.getConnection(url, userName, password);// get the connection            
            String query = "UPDATE degreeprograms SET degreename='" + st.getName() + "',duration=" + st.getDuration() + ",description='"  + st.getDescription() + "' WHERE degreeid=" + st.getDegreeID();          
            pst = (PreparedStatement) con.prepareStatement(query);
            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Exception is " + e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.print("Exception is " + e);
            }
        }
    }
    public boolean deleteDegree(Degree st) {
        try {
            con = (Connection) DriverManager.getConnection(url, userName, password);// get the connection
            String query = "DELETE FROM degreeprograms WHERE degreeid=" + st.getDegreeID();
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Exception is " + e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.print("Exception is " + e);
            }
        }
    }
    
    ArrayList<Degree> getDegree() {
        try {
            ArrayList<Degree> list = new ArrayList<Degree>();
            con = (Connection) DriverManager.getConnection(url, userName, password);// get the connection
            String query = "SELECT * FROM degreeprograms";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();

            while (rs.next()) {
                Degree d = new Degree();
                d.setDegreeID(rs.getInt(1));
                d.setName(rs.getString(2));
                d.setDuration(rs.getInt(3));
                d.setDescription(rs.getString(4));
                list.add(d);
            }
            return list;
        } catch (Exception e) {
            System.out.println("Exception is " + e);
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.print("Exception is " + e);
            }
        }
    }
}
