package uoc;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author kpsdilshan
 */
public class MainFrame extends javax.swing.JFrame {

    ArrayList<Student> stList;
    ArrayList<Lecturer> lecList;
    ArrayList<Degree> digList;
    DBOperations dbops = new DBOperations();

    public MainFrame() {
        initComponents();
        loadStudent();
        loadLecturer();
        loadDegree();
    }
    
    void loadDegree() {
        digList = dbops.getDegree();
        DegreeDetails stDetails = new DegreeDetails(digList);
        tblDegrees.setModel(stDetails);
    }
    void loadStudent() {
        stList = dbops.getStudent();
        StudentDetails stDetails = new StudentDetails(stList);
        tblStudents.setModel(stDetails);
    }

    void loadLecturer() {
        lecList = dbops.getLecturer();
        LecturerDetails lecDetails = new LecturerDetails(lecList);
        tblLecturers.setModel(lecDetails);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnAddStudent = new javax.swing.JButton();
        btnDeleteStudent = new javax.swing.JButton();
        btnViewStudent = new javax.swing.JButton();
        btnUpdateStudent = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnAddLecturer = new javax.swing.JButton();
        btnViewLecturer = new javax.swing.JButton();
        btnUpdateLecturer = new javax.swing.JButton();
        btnDeleteLecturer = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLecturers = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnAddDegree = new javax.swing.JButton();
        btnViewDegree = new javax.swing.JButton();
        btnUpdateDegree = new javax.swing.JButton();
        btnDeleteDegree = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDegrees = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Management System -  UOC");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("University of Colombo");
        jLabel2.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Management System");
        jLabel1.setToolTipText("");

        btnAddStudent.setText("Add Student");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });

        btnDeleteStudent.setText("Delete Student");
        btnDeleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteStudentActionPerformed(evt);
            }
        });

        btnViewStudent.setText("View Student");
        btnViewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStudentActionPerformed(evt);
            }
        });

        btnUpdateStudent.setText("Update Student");
        btnUpdateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStudentActionPerformed(evt);
            }
        });

        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblStudents);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnViewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnUpdateStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnDeleteStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Student", jPanel1);

        btnAddLecturer.setText("Add Lecturer");
        btnAddLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLecturerActionPerformed(evt);
            }
        });

        btnViewLecturer.setText("View Lecturer");
        btnViewLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewLecturerActionPerformed(evt);
            }
        });

        btnUpdateLecturer.setText("Update Lecturer");
        btnUpdateLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateLecturerActionPerformed(evt);
            }
        });

        btnDeleteLecturer.setText("Delete Lecturer");
        btnDeleteLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteLecturerActionPerformed(evt);
            }
        });

        tblLecturers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblLecturers);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAddLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnViewLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnUpdateLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnDeleteLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lecturers", jPanel2);

        btnAddDegree.setText("Add Degree");
        btnAddDegree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDegreeActionPerformed(evt);
            }
        });

        btnViewDegree.setText("View Degree");
        btnViewDegree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDegreeActionPerformed(evt);
            }
        });

        btnUpdateDegree.setText("Update Degree");
        btnUpdateDegree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDegreeActionPerformed(evt);
            }
        });

        btnDeleteDegree.setText("Delete Degree");
        btnDeleteDegree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDegreeActionPerformed(evt);
            }
        });

        tblDegrees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblDegrees);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAddDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnViewDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnUpdateDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnDeleteDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 460, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Degree Programs", jPanel3);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uoc/UoC_logo_small.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jMenu1.setText("File");

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(172, 172, 172))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)))
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteLecturerActionPerformed
            try {
            DeleteLecturer dl = new DeleteLecturer();
            dl.setVisible(true);
            dl.setFields(lecList.get(tblLecturers.getSelectedRow()));
            dl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dl.addWindowListener(new WindowListener() {
                @Override
                public void windowOpened(WindowEvent e) {

                }

                @Override
                public void windowClosing(WindowEvent e) {

                }

                @Override
                public void windowClosed(WindowEvent e) {
                    loadLecturer();
                }

                @Override
                public void windowIconified(WindowEvent e) {

                }

                @Override
                public void windowDeiconified(WindowEvent e) {

                }

                @Override
                public void windowActivated(WindowEvent e) {

                }

                @Override
                public void windowDeactivated(WindowEvent e) {

                }
            });
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDeleteLecturerActionPerformed

    private void btnUpdateLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateLecturerActionPerformed
        try {
            UpdateLecturer us = new UpdateLecturer();
            us.setVisible(true);
            us.setFields(lecList.get(tblLecturers.getSelectedRow()));
            us.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            us.addWindowListener(new WindowListener() {
                @Override
                public void windowOpened(WindowEvent e) {

                }

                @Override
                public void windowClosing(WindowEvent e) {

                }

                @Override
                public void windowClosed(WindowEvent e) {
                    loadLecturer();
                }

                @Override
                public void windowIconified(WindowEvent e) {

                }

                @Override
                public void windowDeiconified(WindowEvent e) {

                }

                @Override
                public void windowActivated(WindowEvent e) {

                }

                @Override
                public void windowDeactivated(WindowEvent e) {

                }
            });
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnUpdateLecturerActionPerformed

    private void btnViewLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewLecturerActionPerformed
        try {
            ViewLecturer vs = new ViewLecturer();
            vs.setVisible(true);
            vs.setFields(lecList.get(tblLecturers.getSelectedRow()));
            vs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnViewLecturerActionPerformed

    private void btnAddLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLecturerActionPerformed
        AddLecturer ad = new AddLecturer();
        ad.setVisible(true);
        ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ad.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {

            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadLecturer();
            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
    }//GEN-LAST:event_btnAddLecturerActionPerformed

    private void btnUpdateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStudentActionPerformed
        try {
            UpdateStudent us = new UpdateStudent();
            us.setVisible(true);
            us.setFields(stList.get(tblStudents.getSelectedRow()));
            us.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            us.addWindowListener(new WindowListener() {
                @Override
                public void windowOpened(WindowEvent e) {

                }

                @Override
                public void windowClosing(WindowEvent e) {

                }

                @Override
                public void windowClosed(WindowEvent e) {
                    loadStudent();
                }

                @Override
                public void windowIconified(WindowEvent e) {

                }

                @Override
                public void windowDeiconified(WindowEvent e) {

                }

                @Override
                public void windowActivated(WindowEvent e) {

                }

                @Override
                public void windowDeactivated(WindowEvent e) {

                }
            });
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnUpdateStudentActionPerformed

    private void btnViewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStudentActionPerformed
        try {
            ViewStudent vs = new ViewStudent();
            vs.setVisible(true);
            vs.setFields(stList.get(tblStudents.getSelectedRow()));
            
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnViewStudentActionPerformed

    private void btnDeleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteStudentActionPerformed
        try {
            DeleteStudent ds = new DeleteStudent();
            ds.setVisible(true);
            ds.setFields(stList.get(tblStudents.getSelectedRow()));
            ds.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ds.addWindowListener(new WindowListener() {
                @Override
                public void windowOpened(WindowEvent e) {

                }

                @Override
                public void windowClosing(WindowEvent e) {

                }

                @Override
                public void windowClosed(WindowEvent e) {
                    loadStudent();
                }

                @Override
                public void windowIconified(WindowEvent e) {

                }

                @Override
                public void windowDeiconified(WindowEvent e) {

                }

                @Override
                public void windowActivated(WindowEvent e) {

                }

                @Override
                public void windowDeactivated(WindowEvent e) {

                }
            });
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDeleteStudentActionPerformed

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        AddStudent ad = new AddStudent();
        ad.setVisible(true);
        ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ad.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {

            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadStudent();
            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void btnAddDegreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDegreeActionPerformed
        AddDegree ad = new AddDegree();
        ad.setVisible(true);
        ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ad.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {

            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadDegree();
            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });   
    }//GEN-LAST:event_btnAddDegreeActionPerformed

    private void btnViewDegreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDegreeActionPerformed
        try {
            ViewDegree vs = new ViewDegree();
            vs.setVisible(true);
            vs.setFields(digList.get(tblDegrees.getSelectedRow()));
            vs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnViewDegreeActionPerformed

    private void btnUpdateDegreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDegreeActionPerformed
          try {
            UpdateDegree us = new UpdateDegree();
            us.setVisible(true);
            us.setFields(digList.get(tblDegrees.getSelectedRow()));
            us.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            us.addWindowListener(new WindowListener() {
                @Override
                public void windowOpened(WindowEvent e) {

                }

                @Override
                public void windowClosing(WindowEvent e) {

                }

                @Override
                public void windowClosed(WindowEvent e) {
                    loadDegree();
                }

                @Override
                public void windowIconified(WindowEvent e) {

                }

                @Override
                public void windowDeiconified(WindowEvent e) {

                }

                @Override
                public void windowActivated(WindowEvent e) {

                }

                @Override
                public void windowDeactivated(WindowEvent e) {

                }
            });
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnUpdateDegreeActionPerformed

    private void btnDeleteDegreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDegreeActionPerformed
        try {
            DeleteDegree ds = new DeleteDegree();
            ds.setVisible(true);
            ds.setFields(digList.get(tblDegrees.getSelectedRow()));
            ds.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ds.addWindowListener(new WindowListener() {
                @Override
                public void windowOpened(WindowEvent e) {

                }

                @Override
                public void windowClosing(WindowEvent e) {

                }

                @Override
                public void windowClosed(WindowEvent e) {
                    loadDegree();
                }

                @Override
                public void windowIconified(WindowEvent e) {

                }

                @Override
                public void windowDeiconified(WindowEvent e) {

                }

                @Override
                public void windowActivated(WindowEvent e) {

                }

                @Override
                public void windowDeactivated(WindowEvent e) {

                }
            });
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDeleteDegreeActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int input= JOptionPane.showConfirmDialog(this,"Are you sure that you want to exit ....?","Exit",JOptionPane.YES_NO_OPTION);
        
        if(input==JOptionPane.YES_OPTION) System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDegree;
    private javax.swing.JButton btnAddLecturer;
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnDeleteDegree;
    private javax.swing.JButton btnDeleteLecturer;
    private javax.swing.JButton btnDeleteStudent;
    private javax.swing.JButton btnUpdateDegree;
    private javax.swing.JButton btnUpdateLecturer;
    private javax.swing.JButton btnUpdateStudent;
    private javax.swing.JButton btnViewDegree;
    private javax.swing.JButton btnViewLecturer;
    private javax.swing.JButton btnViewStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblDegrees;
    private javax.swing.JTable tblLecturers;
    private javax.swing.JTable tblStudents;
    // End of variables declaration//GEN-END:variables
}
