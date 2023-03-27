package testproject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class Testproject extends JFrame implements ActionListener {

    JLabel studentReport, adminlogin, name, password, adminsection,
            addassistant, name2, password2, email, contentNo, id, name3, password3, email2, contactNo, assistantLogin, name4, password4, assistantSection, labtime,
            addstudent2, name5, faculty, course, ID, level, clas,
            Rollno, name6, faculty2, course2, id2, level2, clas2;
    JButton addlogin, asslogin, login, addass,
            viewass, logout, addassist, back, login2, back2, addStu, viewStu, editStu, delStu, logout2,
            addStu2, back3;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8,
            t9, t10, t11, t12, t13, t14, t15, t16;
    JComboBox labTimeT, lab_time;
    int lenght, rollno;

    public Testproject() {
        setSize(350, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        studentReport = new JLabel("Student Report");

        studentReport.setBounds(115, 5, 100, 100);

        addlogin = new JButton("Admin Login");
        addlogin.setBounds(95, 90, 140, 30);
        addlogin.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                JFrame f = new JFrame();
                f.setSize(350, 350);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setLayout(null);

                adminlogin = new JLabel("Admin Login");

                adminlogin.setBounds(115, 5, 100, 100);
                name = new JLabel("Name: ");
                name.setBounds(15, 100, 50, 50);
                t1 = new JTextField(12);
                t1.setBounds(100, 115, 150, 25);
                password = new JLabel("Password: ");
                password.setBounds(15, 150, 100, 50);
                t2 = new JTextField(12);
                t2.setBounds(100, 165, 150, 25);
                login = new JButton("Login");
                login.setBounds(130, 220, 90, 50);
                login.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent arg0) {
                        JFrame f2 = new JFrame();
                        f2.setSize(350, 350);
                        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        f2.setLayout(null);
                        adminsection = new JLabel("Admin Section");

                        adminsection.setBounds(115, 5, 100, 100);

                        addass = new JButton("Add Assistent");
                        addass.setBounds(95, 90, 140, 30);
                        addass.addActionListener(new ActionListener() {

                            public void actionPerformed(ActionEvent arg0) {
                                JFrame f3 = new JFrame();
                                f3.setSize(420, 500);
                                f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                f3.setLayout(null);
                                addassistant = new JLabel("Add Assitant");

                                addassistant.setBounds(115, 5, 100, 100);
                                name2 = new JLabel("Name: ");
                                name2.setBounds(15, 100, 50, 50);
                                t3 = new JTextField(12);
                                t3.setBounds(100, 115, 190, 25);
                                password2 = new JLabel("Password: ");
                                password2.setBounds(15, 150, 100, 50);
                                t4 = new JTextField(12);
                                t4.setBounds(100, 165, 190, 25);
                                email = new JLabel("Email: ");
                                email.setBounds(15, 200, 150, 50);
                                t5 = new JTextField(12);
                                t5.setBounds(100, 215, 190, 25);
                                contentNo = new JLabel("Content No: ");
                                contentNo.setBounds(15, 250, 200, 50);
                                t6 = new JTextField(12);
                                t6.setBounds(100, 265, 190, 25);
                                addassist = new JButton("Add Assistant");
                                addassist.setBounds(110, 310, 120, 50);
                                addassist.addActionListener(new ActionListener() {

                                    public void actionPerformed(ActionEvent arg0) {
                                        if (t3.getText().isEmpty() || t4.getText().isEmpty() || t5.getText().isEmpty() || t6.getText().isEmpty()) {
                                            JOptionPane.showMessageDialog(null, "sorry, unable to Assistant!");
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Assistant added successfully!");
                                            lenght++;
                                        }

                                    }
                                });
                                back = new JButton("Back");
                                back.addActionListener(new ActionListener() {

                                    public void actionPerformed(ActionEvent arg0) {
                                        f2.setVisible(true);
                                        f3.setVisible(false);

                                    }
                                });
                                back.setBounds(290, 310, 70, 30);
                                f3.add(addassistant);
                                f3.add(name2);
                                f3.add(t3);
                                f3.add(password2);
                                f3.add(t4);
                                f3.add(email);
                                f3.add(t5);
                                f3.add(contentNo);
                                f3.add(t6);
                                f3.add(addassist);
                                f3.add(back);

                                f3.setVisible(true);
                            }
                        });
                        viewass = new JButton("View Assistent");
                        viewass.setBounds(95, 150, 140, 30);
                        viewass.addActionListener(new ActionListener() {

                            public void actionPerformed(ActionEvent arg0) {
                                JFrame f4 = new JFrame();
                                f4.setSize(500, 350);
                                f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                f4.setLayout(new FlowLayout());

                                String[] columns = new String[]{
                                    "id", "name3", "password3", "email2", "contactNo"
                                };
                                //actual data for the table in a 2d array
                                Object[][] data = new Object[][]{
                                    {lenght, t3.getText(), t4.getText(), t5.getText(), t6.getText()},};
                                //create table with data

                                JTable table = new JTable(data, columns);
//                              Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
                                id = new JLabel();
//                                id.setBounds(5, 5,150, 30);
//                                id.setBorder(border);
                                name3 = new JLabel();
//                                
//                                name3.setBorder(border);
//                                name3.setBounds(5, 5, 150, 30);
                                password3 = new JLabel();
//                                password3.setBounds(5, 5, 150, 30);
//                                password3.setBorder(border);
                                email2 = new JLabel();
//                                email2.setBounds(5, 5, 80, 30);
//                                email2.setBorder(border);
                                contactNo = new JLabel();
//                                contactNo.setBounds(5, 5, 150, 30);
//                                contactNo.setBorder(border);
                                f4.add(id);
                                f4.add(name3);
                                f4.add(password3);
                                f4.add(email2);
                                f4.add(contactNo);
                                f4.add(table);
                                f4.setVisible(true);
                                table.setBounds(20, 20, 100, 30);
                                System.out.println("loop" + table);
                            }

                        });
                        logout = new JButton("logout");
                        logout.setBounds(95, 210, 140, 30);
                        logout.addActionListener(new ActionListener() {

                            public void actionPerformed(ActionEvent arg0) {
                                f.setVisible(false);
                                f2.setVisible(false);

                            }
                        });
                        f2.add(adminsection);
                        f2.add(addass);
                        f2.add(viewass);
                        f2.add(logout);
                        f2.setVisible(true);
                    }
                });
                f.add(name);
                f.add(password);
                f.add(adminlogin);
                f.add(t1);
                f.add(t2);
                f.add(login);
                f.setVisible(true);
            }
        });
        asslogin = new JButton("assistent login");
        asslogin.setBounds(95, 150, 140, 30);
        asslogin.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                JFrame f5 = new JFrame();
                f5.setSize(380, 350);
                f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f5.setLayout(null);
                assistantLogin = new JLabel("Assitant login");

                assistantLogin.setBounds(115, 5, 100, 100);
                name4 = new JLabel("Name: ");
                name4.setBounds(15, 100, 50, 50);
                t7 = new JTextField(12);
                t7.setBounds(100, 115, 190, 25);
                password4 = new JLabel("Password: ");
                password4.setBounds(15, 150, 100, 50);
                t8 = new JTextField(12);
                t8.setBounds(100, 165, 190, 25);

                login2 = new JButton("Login");
                login2.setBounds(110, 220, 100, 40);
                login2.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent arg0) {
                        if (t3.getText().equals(t7.getText()) && t4.getText().equals(t8.getText())) {
                            JFrame f6 = new JFrame();
                            f6.setSize(420, 420);
                            f6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            f6.setLayout(null);
                            assistantSection = new JLabel("Assistant Section");

                            assistantSection.setBounds(140, 5, 200, 100);
                            addStu = new JButton("Add Student");
                            addStu.setBounds(70, 130, 130, 40);
                            addStu.addActionListener(new ActionListener() {

                                public void actionPerformed(ActionEvent arg0) {
                                    JFrame f7 = new JFrame();
                                    f7.setSize(450, 650);
                                    f7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                    f7.setLayout(null);
                                    addstudent2 = new JLabel("Add Student");

                                    addstudent2.setBounds(115, 5, 100, 100);
                                    name5 = new JLabel("Name: ");
                                    name5.setBounds(15, 100, 50, 50);
                                    t9 = new JTextField(12);
                                    t9.setBounds(100, 115, 190, 25);
                                    faculty = new JLabel("Faculty: ");
                                    faculty.setBounds(15, 150, 100, 50);
                                    t10 = new JTextField(12);
                                    t10.setBounds(100, 165, 190, 25);
                                    course = new JLabel("Course: ");
                                    course.setBounds(15, 200, 150, 50);
                                    t11 = new JTextField(12);
                                    t11.setBounds(100, 215, 190, 25);
                                    ID = new JLabel("ID: ");
                                    ID.setBounds(15, 250, 200, 50);
                                    t12 = new JTextField(12);
                                    t12.setBounds(100, 265, 190, 25);
                                    level = new JLabel("Level: ");
                                    level.setBounds(15, 300, 250, 50);
                                    t13 = new JTextField(12);
                                    t13.setBounds(100, 315, 190, 25);
                                    clas = new JLabel("Class: ");
                                    clas.setBounds(15, 350, 300, 50);
                                    t14 = new JTextField(12);
                                    t14.setBounds(100, 365, 190, 25);
                                    labtime = new JLabel("Lab Time: ");
                                    labtime.setBounds(15, 400, 350, 50);
                                    labTimeT = new JComboBox();
                                    labTimeT.setBounds(100, 415, 190, 25);
                                    labTimeT.addItem("sunday 8-10");
                                    labTimeT.addItem("sunday 8-10");
                                    labTimeT.addItem("sunday 8-10");
                                    labTimeT.addItem("sunday 8-10");
                                    labTimeT.addItem("sunday 8-10");
                                    addStu2 = new JButton("Add Student");
                                    addStu2.setBounds(140, 500, 150, 40);
                                    addStu2.addActionListener(new ActionListener() {

                                        public void actionPerformed(ActionEvent arg0) {
                                            if (t9.getText().isEmpty() && t10.getText().isEmpty() && t11.getText().isEmpty() && t12.getText().isEmpty() && t13.getText().isEmpty() && t14.getText().isEmpty()) {

                                            } else {
                                                JOptionPane.showMessageDialog(rootPane, "Student is Added Successfully");
                                            }
                                            rollno++;
                                        }

                                    });

                                    back3 = new JButton("Back");
                                    back3.setBounds(310, 500, 100, 30);
                                    back3.addActionListener(new ActionListener() {

                                        public void actionPerformed(ActionEvent arg0) {
                                            f7.setVisible(false);
                                            f6.setVisible(true);
                                        }
                                    });

                                    f7.add(addstudent2);
                                    f7.add(name5);
                                    f7.add(t9);
                                    f7.add(faculty);
                                    f7.add(t10);
                                    f7.add(course);
                                    f7.add(t11);
                                    f7.add(ID);
                                    f7.add(t12);
                                    f7.add(level);
                                    f7.add(t13);
                                    f7.add(clas);
                                    f7.add(t14);
                                    f7.add(labtime);
                                    f7.add(labTimeT);
                                    f7.add(addStu2);
                                    f7.add(back3);

                                    f7.setVisible(true);

                                }
                            });
                            viewStu = new JButton("View Student");
                            viewStu.setBounds(230, 130, 130, 40);
                            viewStu.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent arg0) {
                                    JFrame f8 = new JFrame();
                                    f8.setSize(500, 350);
                                    f8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                    f8.setLayout(new FlowLayout());

//                              Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
                                    Rollno = new JLabel();
//                                Rollno.setBounds(0, 0,150, 30);
//                                Rollno.setBorder(border);
                                    name6 = new JLabel();
//                                
//                                name6.setBorder(border);
//                                name6.setBounds(0, 0, 150, 30);
                                    faculty2 = new JLabel();
//                                faculty2.setBounds(150, 0, 150, 30);
//                                faculty2.setBorder(border);
                                    course2 = new JLabel();
//                                course2.setBounds(300, 0, 80, 30);
//                                course2.setBorder(border);
                                    id2 = new JLabel();
//                                id2.setBounds(450, 0, 150, 30);
//                                id2.setBorder(border);
                                    level2 = new JLabel();
//                                level2.setBounds(600, 0, 150, 30);
//                                level2.setBorder(border);
                                    clas2 = new JLabel();
//                                clas2.setBounds(750, 0, 150, 30);
//                                clas2.setBorder(border);
//                                
                                    lab_time = new JComboBox(labTimeT.getModel());
//                                lab_time.setBounds(900, 0, 150, 30);
//                                lab_time.setBorder(border);

                                    String[] columns = new String[]{"Rollno", "name6", "faculty2", "course2",
                                        "id2", "level2", "clas2", "lab_time"};
                                    Object[][] data = new Object[][]{
                                        {rollno, t9.getText(), t10.getText(), t11.getText(), t12.getText(), t13.getText(), t14.getText(), labTimeT.getModel()}};
                                    pack();

                                    JTable table = new JTable(data, columns);
                                    add(new JScrollPane(table));
                                    f8.add(Rollno);
                                    f8.add(name6);
                                    f8.add(faculty2);
                                    f8.add(course2);
                                    f8.add(id2);
                                    f8.add(level2);
                                    f8.add(clas2);
                                    f8.add(table);
                                    f8.add(lab_time);

                                    f8.setVisible(true);
                                }
                            });
                            editStu = new JButton("Edit Student");
                            editStu.setBounds(70, 210, 130, 40);
                            delStu = new JButton("delete Student");
                            delStu.setBounds(230, 210, 130, 40);
                            logout2 = new JButton("logoutt");
                            logout2.setBounds(140, 300, 130, 40);
                            f6.add(assistantSection);
                            f6.add(addStu);
                            f6.add(viewStu);
                            f6.add(editStu);
                            f6.add(delStu);
                            f6.add(logout2);
                            f6.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "sorry, username or password error!", "login errer", JOptionPane.ERROR_MESSAGE);
                        }

                    }
                });
                back2 = new JButton("Back");
                back2.setBounds(270, 220, 80, 30);
                f5.add(assistantLogin);
                f5.add(name4);
                f5.add(t7);
                f5.add(password4);
                f5.add(t8);
                f5.add(login2);
                f5.add(back2);
                f5.setVisible(true);
            }
        });

        add(studentReport);
        add(addlogin);
        add(asslogin);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Testproject();
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
