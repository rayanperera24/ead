/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.Testify.Dashboard;

import com.formdev.flatlaf.FlatLightLaf;
import com.Testify.DataBaseConn.DBConnection;
import com.Testify.FunctionForms.CreateQuestionsForm;
import com.Testify.FunctionForms.RegisterUserForm;
import com.Testify.FunctionForms.ModifyUserForm;
import com.Testify.Main;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author itsth
 */
public class AdminPortal extends javax.swing.JFrame {
    private DefaultTableModel tableModel;
  
    /**
     * Creates new form aDashboard
     */
    public AdminPortal() {
        initComponents();
        
        setTitle("Testify >> Admin Portal");
        
        // Fonts
        setLocationRelativeTo(null);
      
        
        // Table Things :)
        
        // User Table
        
        DefaultTableModel tableModel = new DefaultTableModel(new String[]{"ID", "USERNAME", "ROLE"}, 0);
        usersTable.setModel(tableModel);
        JTableHeader tableHeader = usersTable.getTableHeader();
        
        
        // Cell Centering + Cell Fonts
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        for (int i = 0; i < usersTable.getColumnCount(); i++) {
            usersTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        
        
        // Table Options
        
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tableModel = (DefaultTableModel) usersTable.getModel();
        tableModel.setRowCount(0);
        loadTableData();
        updateUsersCount();
        
        // Quiz Table
        
        DefaultTableModel quizTableModel = new DefaultTableModel(new String[]{"ID", "NAME"}, 0);
        quizTable.setModel(quizTableModel);
        JTableHeader quizTableHeader = quizTable.getTableHeader();
        

        // Cell Centering + Cell Fonts for Quiz Table
        DefaultTableCellRenderer quizCenterRenderer = new DefaultTableCellRenderer();
        quizCenterRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < quizTable.getColumnCount(); i++) {
            quizTable.getColumnModel().getColumn(i).setCellRenderer(quizCenterRenderer);
        }
        
        quizTableModel.setRowCount(0);
        loadQuizTable();
        updateQuizCount();
        qLoadTableData();
        
        
        
        
        
        
        
        DefaultTableModel tableModel2 = new DefaultTableModel(new String[]{"Quiz Code", "Quiz Name"}, 0);
        quizResultTable.setModel(tableModel2);
        JTableHeader tableHeader2 = quizResultTable.getTableHeader();
        
        
        // Cell Centering + Cell Fonts
        
        DefaultTableCellRenderer centerRenderer2 = new DefaultTableCellRenderer();
        for (int i = 0; i < quizResultTable.getColumnCount(); i++) {
            quizResultTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer2);
        }
        
        
        // Table Options
        
        centerRenderer2.setHorizontalAlignment(JLabel.CENTER);
        tableModel2 = (DefaultTableModel) quizResultTable.getModel();
        tableModel2.setRowCount(0);
        qloadTableData();
        
        
        
        
        
        
        
        
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DashboardPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        usersCount = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        quizCount = new javax.swing.JLabel();
        UsersPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        lf = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        printListButton = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        QuizPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        quizNameField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        createQuizButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        quizDescArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        quizTable = new javax.swing.JTable();
        deleteQuizButton = new javax.swing.JButton();
        addQuestionsButton = new javax.swing.JButton();
        qt = new javax.swing.JLabel();
        ReportsPanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        quizResultTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        refreshQbutton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        MenuPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dashboardClick = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        usersClick = new javax.swing.JLabel();
        QuizClick = new javax.swing.JLabel();
        reportsClick = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        TAB = new javax.swing.JTabbedPane();

        DashboardPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin pic.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("USERS");

        usersCount.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        usersCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usersCount.setText("NaN");
        usersCount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersCountMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("QUIZ");

        quizCount.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        quizCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quizCount.setText("NaN");

        javax.swing.GroupLayout DashboardPanelLayout = new javax.swing.GroupLayout(DashboardPanel);
        DashboardPanel.setLayout(DashboardPanelLayout);
        DashboardPanelLayout.setHorizontalGroup(
            DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardPanelLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DashboardPanelLayout.createSequentialGroup()
                        .addGroup(DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                                .addGroup(DashboardPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(253, 253, 253)))
                            .addGroup(DashboardPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(usersCount, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(260, 260, 260)))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DashboardPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(quizCount, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194))))
        );
        DashboardPanelLayout.setVerticalGroup(
            DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardPanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usersCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quizCount))
                .addGap(82, 82, 82)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        UsersPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(usersTable);

        jScrollPane2.setViewportView(jScrollPane1);

        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(146, 227, 169));
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        lf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lf.setForeground(new java.awt.Color(255, 51, 51));
        lf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        printListButton.setBackground(new java.awt.Color(146, 227, 169));
        printListButton.setForeground(new java.awt.Color(255, 255, 255));
        printListButton.setText("PRINT LIST");
        printListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printListButtonActionPerformed(evt);
            }
        });

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("\"Testify users provide and access reliable testimonies for validation.\"");

        javax.swing.GroupLayout UsersPanelLayout = new javax.swing.GroupLayout(UsersPanel);
        UsersPanel.setLayout(UsersPanelLayout);
        UsersPanelLayout.setHorizontalGroup(
            UsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsersPanelLayout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(lf, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsersPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(UsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsersPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsersPanelLayout.createSequentialGroup()
                        .addGroup(UsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(printListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(UsersPanelLayout.createSequentialGroup()
                                .addComponent(deleteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateButton)))
                        .addGap(254, 254, 254))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsersPanelLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsersPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(293, 293, 293))))
        );
        UsersPanelLayout.setVerticalGroup(
            UsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsersPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addGroup(UsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(printListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lf, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        QuizPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText(" Details");

        jLabel12.setText("Quiz Title");

        jLabel16.setText("Quiz Description");

        createQuizButton.setBackground(new java.awt.Color(146, 227, 169));
        createQuizButton.setForeground(new java.awt.Color(255, 255, 255));
        createQuizButton.setText("Create Quiz");
        createQuizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createQuizButtonActionPerformed(evt);
            }
        });

        quizDescArea.setColumns(20);
        quizDescArea.setRows(5);
        jScrollPane3.setViewportView(quizDescArea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12)
                        .addComponent(quizNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(229, 229, 229))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(createQuizButton, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(274, 274, 274))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(15, 15, 15)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quizNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createQuizButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        quizTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(quizTable);

        deleteQuizButton.setText("Delete Quiz");
        deleteQuizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteQuizButtonActionPerformed(evt);
            }
        });

        addQuestionsButton.setText("Add Questions");
        addQuestionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQuestionsButtonActionPerformed(evt);
            }
        });

        qt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout QuizPanelLayout = new javax.swing.GroupLayout(QuizPanel);
        QuizPanel.setLayout(QuizPanelLayout);
        QuizPanelLayout.setHorizontalGroup(
            QuizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuizPanelLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(QuizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(QuizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuizPanelLayout.createSequentialGroup()
                                .addComponent(qt, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(317, 317, 317))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuizPanelLayout.createSequentialGroup()
                                .addComponent(addQuestionsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteQuizButton)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuizPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuizPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(402, 402, 402))))
        );
        QuizPanelLayout.setVerticalGroup(
            QuizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuizPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addGap(48, 48, 48)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(QuizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addQuestionsButton)
                    .addComponent(deleteQuizButton))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        ReportsPanel.setBackground(new java.awt.Color(255, 255, 255));

        quizResultTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(quizResultTable);

        refreshQbutton.setText("REFRESH");
        refreshQbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshQbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReportsPanelLayout = new javax.swing.GroupLayout(ReportsPanel);
        ReportsPanel.setLayout(ReportsPanelLayout);
        ReportsPanelLayout.setHorizontalGroup(
            ReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportsPanelLayout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addGroup(ReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReportsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(321, 321, 321))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReportsPanelLayout.createSequentialGroup()
                        .addGroup(ReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refreshQbutton))
                        .addGap(14, 14, 14))))
        );
        ReportsPanelLayout.setVerticalGroup(
            ReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportsPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refreshQbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Testify");

        dashboardClick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboardClick.setText("Dashboard");
        dashboardClick.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dashboardClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardClickMouseClicked(evt);
            }
        });

        usersClick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usersClick.setText("Users");
        usersClick.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        usersClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersClickMouseClicked(evt);
            }
        });

        QuizClick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuizClick.setText("Quiz");
        QuizClick.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        QuizClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuizClickMouseClicked(evt);
            }
        });

        reportsClick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportsClick.setText("Quiz Details");
        reportsClick.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        reportsClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportsClickMouseClicked(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        logoutButton.setBackground(new java.awt.Color(146, 227, 169));
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("LOGOUT");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardClick, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(usersClick, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(QuizClick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reportsClick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dashboardClick, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuizClick, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportsClick, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usersClick, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        TAB.setBackground(new java.awt.Color(255, 255, 255));
        TAB.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        TAB.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        TAB.addTab("sss", DashboardPanel);
        TAB.addTab("", UsersPanel);
        TAB.addTab("", QuizPanel);
        TAB.addTab("", ReportsPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1076, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 860, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(TAB, javax.swing.GroupLayout.DEFAULT_SIZE, 1076, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(TAB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardClickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardClickMouseClicked
        // TODO add your handling code here:
        TAB.setSelectedIndex(0);
    }//GEN-LAST:event_dashboardClickMouseClicked

    private void QuizClickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizClickMouseClicked
        // TODO add your handling code here:
        TAB.setSelectedIndex(2);
    }//GEN-LAST:event_QuizClickMouseClicked

    private void reportsClickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsClickMouseClicked
        // TODO add your handling code here:
        TAB.setSelectedIndex(3);
    }//GEN-LAST:event_reportsClickMouseClicked

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void usersCountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersCountMouseClicked
        // TODO add your handling code here:
        updateUsersCount();
    }//GEN-LAST:event_usersCountMouseClicked

    
    public void qloadTableData() {
        // Ensure the DefaultTableModel is linked to the JTable
        DefaultTableModel tableModel = (DefaultTableModel) quizResultTable.getModel();

        // Clear existing rows in the table
        tableModel.setRowCount(0);

        // Load data from the database
        try (Connection conn = DBConnection.getConnection()) {
            // Updated query to select all quiz_codes and quiz_names
            String query = "SELECT q.quiz_code, q.quiz_name " +
                           "FROM quizzes q";

            PreparedStatement pst = conn.prepareStatement(query);

            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String quizCode = rs.getString("quiz_code");
                    String quizName = rs.getString("quiz_name");
                    tableModel.addRow(new Object[]{quizCode, quizName});
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
    private void createQuizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createQuizButtonActionPerformed
        // TODO add your handling code here:
        try {
            // Check if either the quiz name or description fields are empty
            String quizName = quizNameField.getText().trim();
            String quizDesc = quizDescArea.getText().trim();

            if (quizName.isEmpty() || quizDesc.isEmpty()) {
                // If any field is empty, show a warning message and return
//                JOptionPane.showMessageDialog(this, "Both quiz name and description are required.", "Error", JOptionPane.WARNING_MESSAGE);
                qt.setText("\" Both quiz name and description are required! \"");
                return; // Exit the method if fields are empty
            }

            // Call the createQuiz method if validation passes
            createQuiz(quizName, quizDesc);
        } catch (Exception e) {
            e.printStackTrace();
//            JOptionPane.showMessageDialog(this, "Error creating quiz: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_createQuizButtonActionPerformed

    private void deleteQuizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteQuizButtonActionPerformed
        // TODO add your handling code here:
        deleteQuiz();
    }//GEN-LAST:event_deleteQuizButtonActionPerformed

    private void addQuestionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQuestionsButtonActionPerformed
        // TODO add your handling code here:
        openAddQuestionsFrame();
    }//GEN-LAST:event_addQuestionsButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        deleteUser();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        updateUser();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        //        addUser();
        // Instantiate the AddUserComponent
        RegisterUserForm addUserComponent = new RegisterUserForm();
        // Set it to visible
        addUserComponent.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void usersClickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersClickMouseClicked
        // TODO add your handling code here:
        loadTableData();
        TAB.setSelectedIndex(1);
    }//GEN-LAST:event_usersClickMouseClicked

    private void printListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printListButtonActionPerformed
        // TODO add your handling code here:
        try {
            Connection conn = DBConnection.getConnection();
            String reportPath = "src/main/resources/reports/users.jrxml"; //"D:\\ListUsers.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(reportPath);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
            conn.close();
            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_printListButtonActionPerformed

    private void refreshQbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshQbuttonActionPerformed
        // TODO add your handling code here:
        qLoadTableData();
    }//GEN-LAST:event_refreshQbuttonActionPerformed
        
    
    public void qLoadTableData() {
        // Ensure the DefaultTableModel is linked to the JTable
        DefaultTableModel tableModel = (DefaultTableModel) quizResultTable.getModel();

        // Clear existing rows in the table
        tableModel.setRowCount(0);

        // Load data from the database
        try (Connection conn = DBConnection.getConnection()) {
            // Updated query to select all quiz_codes and quiz_names
            String query = "SELECT q.quiz_code, q.quiz_name " +
                           "FROM quizzes q";

            PreparedStatement pst = conn.prepareStatement(query);

            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String quizCode = rs.getString("quiz_code");
                    String quizName = rs.getString("quiz_name");
                    tableModel.addRow(new Object[]{quizCode, quizName});
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
    // >>>>>>>>>>>>    Dashboard    <<<<<<<<<<<
    
    
    private void updateUsersCount() {
        DefaultTableModel tableModel = (DefaultTableModel) usersTable.getModel();
        int rowCount = tableModel.getRowCount();
        usersCount.setText("" + rowCount);
    }
    
    private void updateQuizCount() {
        DefaultTableModel quizTableModel = (DefaultTableModel) quizTable.getModel();
        int rowCount = quizTableModel.getRowCount();
        quizCount.setText("" + rowCount);
    }

    
    private void updateUser() {
        DefaultTableModel tableModel = (DefaultTableModel) usersTable.getModel();

        // Ensure there is a model attached to the table
        if (tableModel == null) {
//      JOptionPane.showMessageDialog(this, "Table model is not initialized!");
            lf.setText("\" Table model is not initialized! \"");
            return;
        }

        // Check if a row is selected
        int selectedRow = usersTable.getSelectedRow();
        if (selectedRow == -1) {
            lf.setText("Please select a user to update!");
            return;
        }

        // Retrieve the current user details
        int userId = (int) tableModel.getValueAt(selectedRow, 0); // ID column
        String currentUsername = (String) tableModel.getValueAt(selectedRow, 1); // Username column
        String currentRole = (String) tableModel.getValueAt(selectedRow, 2); // Role column

        // Open the UpdateUserFrame and pass the user details
        ModifyUserForm uuc = new ModifyUserForm(userId, currentUsername, currentRole);
        uuc.setVisible(true);
    }
    
    private void deleteUser() {
        DefaultTableModel tableModel = (DefaultTableModel) usersTable.getModel();

        // Ensure there is a model attached to the table
        if (tableModel == null) {
        // JOptionPane.showMessageDialog(this, "Table model is not initialized!");
            lf.setText("\" Table model is not initialized! \"");
            return;
        }

        // Check if a row is selected
        int selectedRow = usersTable.getSelectedRow();
        if (selectedRow == -1) {
            lf.setText("Please select a user to delete!");
            return;
        }

        // Retrieve the current user details
        int userId = (int) tableModel.getValueAt(selectedRow, 0); // ID column
        String currentUsername = (String) tableModel.getValueAt(selectedRow, 1); // Username column
        String currentRole = (String) tableModel.getValueAt(selectedRow, 2); // Role column
        
        // Confirmation popup with custom font
        JLabel confirmationLabel = new JLabel("Are you sure you want to delete the user?");
        
        int result = JOptionPane.showConfirmDialog(
                this,
                confirmationLabel,
                "Testify >> Delete User",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );

        // If user confirms deletion
        if (result == JOptionPane.YES_OPTION) {
            try (Connection conn = DBConnection.getConnection()) {
                // Delete query
                String query = "DELETE FROM users WHERE user_id = ?";
                try (PreparedStatement stmt = conn.prepareStatement(query)) {
                    stmt.setInt(1, userId);
                    stmt.executeUpdate();
                }

                // Remove row from the table
                tableModel.removeRow(selectedRow);

                // Show success message
                JLabel successLabel = new JLabel("User deleted successfully!");
                
                JOptionPane.showMessageDialog(this, successLabel, "Testify >> Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                ex.printStackTrace();
                JLabel errorLabel = new JLabel("Error deleting user: " + ex.getMessage());
                
                JOptionPane.showMessageDialog(this, errorLabel, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private String generateRandomPassword(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder(length);
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < length; i++) {
            password.append(characters.charAt(random.nextInt(characters.length())));
        }
        return password.toString();
    }
    
    private void addUser() {
        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JComboBox<String> roleComboBox = new JComboBox<>(new String[]{"Admin", "Student", "Lecturer"});
 
        Object[] fields = {
            "Username:", usernameField,
            "Password:", passwordField,
            "Role:", roleComboBox
        };
 
        int result = JOptionPane.showConfirmDialog(this, fields, "Add User", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            String role = (String) roleComboBox.getSelectedItem();
            

 
            try (Connection conn = DBConnection.getConnection()) {
                String query = "INSERT INTO users (username, password, role) VALUES (?, ?, ?)";
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, username);
                stmt.setString(2, password); // Store as plain text (encryption can be added later)
                stmt.setString(3, role);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "User added successfully!");
                loadTableData();
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error adding user!");
            }
        }
    }
    
    public void loadTableData() {
        // Ensure the DefaultTableModel is linked to the JTable
        DefaultTableModel tableModel = (DefaultTableModel) usersTable.getModel();

        // Clear existing rows in the table
        tableModel.setRowCount(0);

        // Load data from the database
        try (Connection conn = DBConnection.getConnection()) {
            String query = "SELECT user_id, username, role FROM users";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Iterate through the ResultSet and add rows to the table model
            while (rs.next()) {
                int id = rs.getInt("user_id");
                String username = rs.getString("username");
                String role = rs.getString("role");
                tableModel.addRow(new Object[]{id, username, role});      
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
//            JOptionPane.showMessageDialog(this, "Error loading data into the table!");
        }
    }
    

    // >>>>>>>>>>>>    Quiz    <<<<<<<<<<<
    
    
    public String generateQuizCode() {
        int randomDigits = (int) (Math.random() * 900000) + 100000; 
        return "T" + randomDigits;
    }
    
    public void createQuiz(String quizName, String quizDesc) {
        String quizCode = generateQuizCode(); // Generate unique code
        try (Connection conn = DBConnection.getConnection()) {
            String query = "INSERT INTO quizzes (quiz_code, quiz_name, quiz_desc) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, quizCode);
            stmt.setString(2, quizName);
            stmt.setString(3, quizDesc); 
            stmt.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Quiz created! Code: " + quizCode);
            qt.setText("\" Quiz created! Code: \"" + quizCode);
            loadQuizTable();
        } catch (Exception ex) {
            ex.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Error creating quiz!");
        }
    }
    
    public void loadQuizzes(DefaultTableModel tableModel) {
        tableModel.setRowCount(0); 
        try (Connection conn = DBConnection.getConnection()) {
            String query = "SELECT quiz_code, quiz_name, quiz_desc FROM quizzes";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String quizCode = rs.getString("quiz_code");
                String quizName = rs.getString("quiz_name");
//                String quizDesc = rs.getString("quiz_desc");
                tableModel.addRow(new Object[]{quizCode, quizName});
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading quizzes!");
        }
    }
    
    private void openAddQuestionsFrame() {
        DefaultTableModel tableModel1 = (DefaultTableModel) quizTable.getModel();

        // Ensure there is a model attached to the table
        if (tableModel1 == null) {
            qt.setText("\" Table model is not initialized! \"");
            return;
        }

        // Check if a row is selected
        int selectedRow = quizTable.getSelectedRow();
        if (selectedRow == -1) {
            qt.setText("\" Please select a quiz to add questions! \"");
            return;
        }

        // Retrieve the selected quiz details
        String quizCode = (String) tableModel1.getValueAt(selectedRow, 0); // QUIZ CODE column
        String quizName = (String) tableModel1.getValueAt(selectedRow, 1); // QUIZ CODE column

        // Open the AddQuestionsFrame and pass the quizCode
        CreateQuestionsForm aqf = new CreateQuestionsForm(quizCode, quizName);
        aqf.setVisible(true);
}


//    private void loadQuizTable() {
//        DefaultTableModel tableModel1 = (DefaultTableModel) quizTable.getModel();
//        tableModel.setRowCount(0); // Clear existing rows
//
//        try (Connection conn = DBConnection.getConnection()) {
//            String query = "SELECT quiz_code, quiz_name, quiz_desc FROM quizzes";
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//
//            while (rs.next()) {
//                String quizCode = rs.getString("quiz_code");
//                String quizName = rs.getString("quiz_name");
//                String quizDesc = rs.getString("quiz_desc");
//                tableModel.addRow(new Object[]{quizCode, quizName, quizDesc});
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            JOptionPane.showMessageDialog(this, "Error loading quizzes: " + ex.getMessage());
//        }
//    }

    public void loadQuizTable() {
        // Ensure the DefaultTableModel is linked to the JTable
        DefaultTableModel tableModel1 = (DefaultTableModel) quizTable.getModel();

        // Clear existing rows in the table
        tableModel1.setRowCount(0);

        // Load data from the database
        try (Connection conn = DBConnection.getConnection()) {
            String query = "SELECT quiz_code, quiz_name, quiz_desc FROM quizzes";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Iterate through the ResultSet and add rows to the table model
            while (rs.next()) {
                String quizCode = rs.getString("quiz_code");
                String quizName = rs.getString("quiz_name");
                tableModel1.addRow(new Object[]{quizCode, quizName});     
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading data into the table!");
        }
    }
    
    private void deleteQuiz() {
    // Retrieve the table model
    DefaultTableModel tableModel1 = (DefaultTableModel) quizTable.getModel();

    // Ensure the table model is initialized
    if (tableModel1 == null) {
//        JOptionPane.showMessageDialog(this, "Table model is not initialized!", "Error", JOptionPane.ERROR_MESSAGE);
        qt.setText("\" Table model is not initialized! \"");
        return;
    }

    // Check if a row is selected
    int selectedRow = quizTable.getSelectedRow();
    if (selectedRow == -1) {
//        JOptionPane.showMessageDialog(this, "Please select a quiz to delete!", "Error", JOptionPane.WARNING_MESSAGE);
        qt.setText("\" Please select a quiz to delete! \"");
        return;
    }

    // Retrieve quiz details from the selected row
    String quizCode = (String) tableModel1.getValueAt(selectedRow, 0); // QUIZ CODE column
    String quizName = (String) tableModel1.getValueAt(selectedRow, 1); // QUIZ NAME column

    // Confirm deletion
    JLabel confirmationLabel1 = new JLabel("Are you sure you want to delete the quiz \"" + quizName + "\"?");
 
    int result = JOptionPane.showConfirmDialog(
            this,
            confirmationLabel1,
            "Testify >> Delete Quiz",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE
    );

    if (result == JOptionPane.YES_OPTION) {
        try (Connection conn = DBConnection.getConnection()) {
            // Execute delete query
            String query = "DELETE FROM quizzes WHERE quiz_code = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, quizCode);
                stmt.executeUpdate();
            }

            // Remove the row from the table
            tableModel1.removeRow(selectedRow);

            // Success message
            JLabel successLabel1 = new JLabel("Quiz \"" + quizName + "\" deleted successfully!");
 
            JOptionPane.showMessageDialog(this, successLabel1, "Testify >> Success", JOptionPane.INFORMATION_MESSAGE);
            loadQuizTable();
        } catch (Exception ex) {
            ex.printStackTrace();
            JLabel errorLabel1 = new JLabel("Error deleting quiz: " + ex.getMessage());
    
            JOptionPane.showMessageDialog(this, errorLabel1, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}


    
    
    public static void main(String args[]) {
        
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DashboardPanel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JLabel QuizClick;
    private javax.swing.JPanel QuizPanel;
    private javax.swing.JPanel ReportsPanel;
    public javax.swing.JTabbedPane TAB;
    private javax.swing.JPanel UsersPanel;
    private javax.swing.JButton addButton;
    private javax.swing.JButton addQuestionsButton;
    private javax.swing.JButton createQuizButton;
    private javax.swing.JLabel dashboardClick;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deleteQuizButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lf;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton printListButton;
    private javax.swing.JLabel qt;
    private javax.swing.JLabel quizCount;
    private javax.swing.JTextArea quizDescArea;
    private javax.swing.JTextField quizNameField;
    private javax.swing.JTable quizResultTable;
    private javax.swing.JTable quizTable;
    private javax.swing.JButton refreshQbutton;
    private javax.swing.JLabel reportsClick;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel usersClick;
    private javax.swing.JLabel usersCount;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
