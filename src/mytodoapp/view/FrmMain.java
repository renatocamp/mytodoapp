/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mytodoapp.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import mytodoapp.controller.ProjectController;
import mytodoapp.controller.TaskController;
import mytodoapp.model.Project;
import mytodoapp.model.Task;
import mytodoapp.util.TaskTableModel;

/**
 *
 * @author RenatoCampos
 */
public class FrmMain extends javax.swing.JFrame {

    ProjectController projectController;
    TaskController taskController;
    
    DefaultListModel listModel;
    TaskTableModel tasksModel;
    
    public FrmMain() {
        initComponents();
        
        decorateTable();
        initDataController();
        initComponentsModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEmpty = new javax.swing.JPanel();
        txtImg = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        logoPanel = new javax.swing.JPanel();
        txtLogoImg = new javax.swing.JLabel();
        panelProject = new javax.swing.JPanel();
        txtProject = new javax.swing.JLabel();
        txtAddProj = new javax.swing.JLabel();
        panelTask = new javax.swing.JPanel();
        txtTask = new javax.swing.JLabel();
        txtAddTask = new javax.swing.JLabel();
        panelList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        panelMain = new javax.swing.JPanel();
        scroolGridTasks = new javax.swing.JScrollPane();
        tableGrid = new javax.swing.JTable();

        panelEmpty.setBackground(new java.awt.Color(255, 255, 255));

        txtImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lista-de-afazeres (1).png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("GERENCIADOR DE TAREFAS VAZIO");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CLIQUE NO BOTÃO \"+\" PARA ADICIONAR UMA TAREFA");

        javax.swing.GroupLayout panelEmptyLayout = new javax.swing.GroupLayout(panelEmpty);
        panelEmpty.setLayout(panelEmptyLayout);
        panelEmptyLayout.setHorizontalGroup(
            panelEmptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmptyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEmptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelEmptyLayout.setVerticalGroup(
            panelEmptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmptyLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(txtImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        logoPanel.setBackground(new java.awt.Color(50, 67, 118));

        txtLogoImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtLogoImg)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtLogoImg, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        panelProject.setBackground(new java.awt.Color(255, 255, 255));
        panelProject.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtProject.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtProject.setText("PROJETOS");

        txtAddProj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar.png"))); // NOI18N
        txtAddProj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAddProjMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelProjectLayout = new javax.swing.GroupLayout(panelProject);
        panelProject.setLayout(panelProjectLayout);
        panelProjectLayout.setHorizontalGroup(
            panelProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtProject)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAddProj)
                .addContainerGap())
        );
        panelProjectLayout.setVerticalGroup(
            panelProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAddProj, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelTask.setBackground(new java.awt.Color(255, 255, 255));
        panelTask.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtTask.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTask.setText("TAREFAS");

        txtAddTask.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar.png"))); // NOI18N
        txtAddTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAddTaskMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelTaskLayout = new javax.swing.GroupLayout(panelTask);
        panelTask.setLayout(panelTaskLayout);
        panelTaskLayout.setHorizontalGroup(
            panelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTaskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTask)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAddTask)
                .addContainerGap())
        );
        panelTaskLayout.setVerticalGroup(
            panelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTaskLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAddTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelList.setBackground(new java.awt.Color(255, 255, 255));
        panelList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jList1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setFixedCellHeight(25);
        jList1.setSelectionBackground(new java.awt.Color(50, 67, 118));
        jList1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout panelListLayout = new javax.swing.GroupLayout(panelList);
        panelList.setLayout(panelListLayout);
        panelListLayout.setHorizontalGroup(
            panelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelListLayout.setVerticalGroup(
            panelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        panelMain.setBackground(new java.awt.Color(255, 255, 255));
        panelMain.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableGrid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Prazo - Término", "Tarefa Concluída"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableGrid.setRowHeight(35);
        tableGrid.setSelectionBackground(new java.awt.Color(50, 67, 118));
        tableGrid.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableGrid.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableGrid.setShowHorizontalLines(true);
        scroolGridTasks.setViewportView(tableGrid);

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroolGridTasks, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroolGridTasks)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddProjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddProjMouseClicked
        // TODO add your handling code here:
        FrmNewProject newProject = new FrmNewProject(this, rootPaneCheckingEnabled);
        newProject.setVisible(true);
        
        newProject.addWindowListener(new WindowAdapter(){
            
            @Override
            public void windowClosed(WindowEvent e){
                loadProjectModel();
            }
        });
        
    }//GEN-LAST:event_txtAddProjMouseClicked

    private void txtAddTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddTaskMouseClicked
        // TODO add your handling code here:
        FrmNewTask fnt = new FrmNewTask(this, rootPaneCheckingEnabled);
        fnt.setProject(null);
        fnt.setVisible(true);
    }//GEN-LAST:event_txtAddTaskMouseClicked

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
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JPanel panelEmpty;
    private javax.swing.JPanel panelList;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelProject;
    private javax.swing.JPanel panelTask;
    private javax.swing.JScrollPane scroolGridTasks;
    private javax.swing.JTable tableGrid;
    private javax.swing.JLabel txtAddProj;
    private javax.swing.JLabel txtAddTask;
    private javax.swing.JLabel txtImg;
    private javax.swing.JLabel txtLogoImg;
    private javax.swing.JLabel txtProject;
    private javax.swing.JLabel txtTask;
    // End of variables declaration//GEN-END:variables

    public void decorateTable(){
        
        // Método criado para customizar o Header para o Grid de Tarefas
        
        tableGrid.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        tableGrid.getTableHeader().setBackground(new Color(50,67,118));
        tableGrid.getTableHeader().setForeground(Color.WHITE);
        tableGrid.setAutoCreateRowSorter(true);
    }
    
    //Método para instanciar as classes controller
    public void initDataController(){
        projectController = new ProjectController();
        taskController = new TaskController();
    }
    
    public void initComponentsModel(){
        listModel = new DefaultListModel();
        loadProjectModel();
        
        tasksModel = new TaskTableModel();
        tableGrid.setModel(tasksModel);
        loadTasks(2);
    }
    
    public void loadTasks(int idProject){
        List<Task> tasks = taskController.getAllTasks(idProject);
        tasksModel.setTasks(tasks);
    }
    
    public void loadProjectModel(){
        
        List<Project> projects = projectController.getAllProjects();
        
        listModel.clear();
        
        for(int i =0; i < projects.size(); i++){
            
            Project project = projects.get(i);
            
            listModel.addElement(project);
        }
        
        jList1.setModel(listModel);
    }
}
