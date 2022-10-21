/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Lucas Silva Arruda Chagas
 */
public class MainScrenn extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public MainScrenn() {
        initComponents();
        decorateTableTasks();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TasksListJPanelNoTasks = new javax.swing.JPanel();
        NoTasksJLabelIcon = new javax.swing.JLabel();
        NoTasksJLabelTitle = new javax.swing.JLabel();
        NoTasksJLabelSubTitle = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        JPanelToolBar = new javax.swing.JPanel();
        ToolBarJLabelTitle = new javax.swing.JLabel();
        ToolBarJLabelSubTitle = new javax.swing.JLabel();
        JPanelProjects = new javax.swing.JPanel();
        ProjectsJLabelProjects = new javax.swing.JLabel();
        ProjectsJLabelAdd = new javax.swing.JLabel();
        JPanelTasks = new javax.swing.JPanel();
        TasksJLabelTasks = new javax.swing.JLabel();
        TasksJLabelAdd = new javax.swing.JLabel();
        JPanelProjectsList = new javax.swing.JPanel();
        ProjectsListjScrollPaneProjectsList = new javax.swing.JScrollPane();
        ProjectsJListProjects = new javax.swing.JList<>();
        JPanelTasksList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TasksListJTableTasks = new javax.swing.JTable();

        TasksListJPanelNoTasks.setBackground(java.awt.Color.white);

        NoTasksJLabelIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NoTasksJLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lists.png"))); // NOI18N
        NoTasksJLabelIcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        NoTasksJLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NoTasksJLabelTitle.setForeground(new java.awt.Color(0, 153, 102));
        NoTasksJLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NoTasksJLabelTitle.setText("Nenhuma tarefa nesse projeto");

        NoTasksJLabelSubTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NoTasksJLabelSubTitle.setForeground(new java.awt.Color(0, 153, 102));
        NoTasksJLabelSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NoTasksJLabelSubTitle.setText("Clique no botão \"+\" para adcionar uma nova tarefa");

        javax.swing.GroupLayout TasksListJPanelNoTasksLayout = new javax.swing.GroupLayout(TasksListJPanelNoTasks);
        TasksListJPanelNoTasks.setLayout(TasksListJPanelNoTasksLayout);
        TasksListJPanelNoTasksLayout.setHorizontalGroup(
            TasksListJPanelNoTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NoTasksJLabelSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
            .addComponent(NoTasksJLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TasksListJPanelNoTasksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NoTasksJLabelIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TasksListJPanelNoTasksLayout.setVerticalGroup(
            TasksListJPanelNoTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TasksListJPanelNoTasksLayout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(NoTasksJLabelIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NoTasksJLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoTasksJLabelSubTitle)
                .addGap(130, 130, 130))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 800));
        setName("PrincipalWindow"); // NOI18N

        JPanelToolBar.setBackground(new java.awt.Color(0, 153, 102));
        JPanelToolBar.setForeground(new java.awt.Color(0, 153, 102));
        JPanelToolBar.setName("TopPanelProjectsGreen"); // NOI18N

        ToolBarJLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ToolBarJLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        ToolBarJLabelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tick.png"))); // NOI18N
        ToolBarJLabelTitle.setText("Projects App");
        ToolBarJLabelTitle.setName(""); // NOI18N

        ToolBarJLabelSubTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ToolBarJLabelSubTitle.setForeground(new java.awt.Color(255, 255, 255));
        ToolBarJLabelSubTitle.setText(" Escreva tudo, não esqueça nada");

        javax.swing.GroupLayout JPanelToolBarLayout = new javax.swing.GroupLayout(JPanelToolBar);
        JPanelToolBar.setLayout(JPanelToolBarLayout);
        JPanelToolBarLayout.setHorizontalGroup(
            JPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelToolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ToolBarJLabelTitle)
                    .addComponent(ToolBarJLabelSubTitle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanelToolBarLayout.setVerticalGroup(
            JPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelToolBarLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(ToolBarJLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ToolBarJLabelSubTitle)
                .addGap(36, 36, 36))
        );

        JPanelProjects.setBackground(java.awt.Color.white);
        JPanelProjects.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ProjectsJLabelProjects.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ProjectsJLabelProjects.setForeground(new java.awt.Color(0, 153, 102));
        ProjectsJLabelProjects.setText("Projetos");

        ProjectsJLabelAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        ProjectsJLabelAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProjectsJLabelAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPanelProjectsLayout = new javax.swing.GroupLayout(JPanelProjects);
        JPanelProjects.setLayout(JPanelProjectsLayout);
        JPanelProjectsLayout.setHorizontalGroup(
            JPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProjectsJLabelProjects, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProjectsJLabelAdd)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        JPanelProjectsLayout.setVerticalGroup(
            JPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPanelProjectsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ProjectsJLabelAdd))
                    .addComponent(ProjectsJLabelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        JPanelTasks.setBackground(java.awt.Color.white);
        JPanelTasks.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TasksJLabelTasks.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TasksJLabelTasks.setForeground(new java.awt.Color(0, 153, 102));
        TasksJLabelTasks.setText("Tarefas");

        TasksJLabelAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N

        javax.swing.GroupLayout JPanelTasksLayout = new javax.swing.GroupLayout(JPanelTasks);
        JPanelTasks.setLayout(JPanelTasksLayout);
        JPanelTasksLayout.setHorizontalGroup(
            JPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelTasksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TasksJLabelTasks, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TasksJLabelAdd)
                .addContainerGap())
        );
        JPanelTasksLayout.setVerticalGroup(
            JPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelTasksLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TasksJLabelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TasksJLabelAdd))
                .addContainerGap())
        );

        JPanelProjectsList.setBackground(java.awt.Color.white);
        JPanelProjectsList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ProjectsJListProjects.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ProjectsJListProjects.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ProjectsJListProjects.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ProjectsJListProjects.setFixedCellHeight(50);
        ProjectsJListProjects.setSelectionBackground(new java.awt.Color(0, 153, 102));
        ProjectsListjScrollPaneProjectsList.setViewportView(ProjectsJListProjects);

        javax.swing.GroupLayout JPanelProjectsListLayout = new javax.swing.GroupLayout(JPanelProjectsList);
        JPanelProjectsList.setLayout(JPanelProjectsListLayout);
        JPanelProjectsListLayout.setHorizontalGroup(
            JPanelProjectsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelProjectsListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProjectsListjScrollPaneProjectsList)
                .addContainerGap())
        );
        JPanelProjectsListLayout.setVerticalGroup(
            JPanelProjectsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelProjectsListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProjectsListjScrollPaneProjectsList)
                .addContainerGap())
        );

        JPanelTasksList.setBackground(java.awt.Color.white);
        JPanelTasksList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TasksListJTableTasks.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TasksListJTableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Prazo", "Tarefa Concluida"
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
        TasksListJTableTasks.setGridColor(java.awt.Color.white);
        TasksListJTableTasks.setRowHeight(50);
        TasksListJTableTasks.setSelectionBackground(new java.awt.Color(0, 153, 102));
        TasksListJTableTasks.setShowVerticalLines(false);
        jScrollPane1.setViewportView(TasksListJTableTasks);

        javax.swing.GroupLayout JPanelTasksListLayout = new javax.swing.GroupLayout(JPanelTasksList);
        JPanelTasksList.setLayout(JPanelTasksListLayout);
        JPanelTasksListLayout.setHorizontalGroup(
            JPanelTasksListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );
        JPanelTasksListLayout.setVerticalGroup(
            JPanelTasksListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPanelProjectsList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPanelTasksList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanelToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanelProjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPanelTasks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanelProjectsList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPanelTasksList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //event Mouse cliced in Project ADD
    private void ProjectsJLabelAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProjectsJLabelAddMouseClicked
        // TODO add your handling code here:
        ProjectAddDialogScreen projectAddDialogScreen =
                new ProjectAddDialogScreen(this, rootPaneCheckingEnabled);
        projectAddDialogScreen.setVisible(true);
    }//GEN-LAST:event_ProjectsJLabelAddMouseClicked

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
            java.util.logging.Logger.getLogger(MainScrenn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScrenn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScrenn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScrenn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScrenn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelProjects;
    private javax.swing.JPanel JPanelProjectsList;
    private javax.swing.JPanel JPanelTasks;
    private javax.swing.JPanel JPanelTasksList;
    private javax.swing.JPanel JPanelToolBar;
    private javax.swing.JLabel NoTasksJLabelIcon;
    private javax.swing.JLabel NoTasksJLabelSubTitle;
    private javax.swing.JLabel NoTasksJLabelTitle;
    private javax.swing.JLabel ProjectsJLabelAdd;
    private javax.swing.JLabel ProjectsJLabelProjects;
    private javax.swing.JList<String> ProjectsJListProjects;
    private javax.swing.JScrollPane ProjectsListjScrollPaneProjectsList;
    private javax.swing.JLabel TasksJLabelAdd;
    private javax.swing.JLabel TasksJLabelTasks;
    private javax.swing.JPanel TasksListJPanelNoTasks;
    private javax.swing.JTable TasksListJTableTasks;
    private javax.swing.JLabel ToolBarJLabelSubTitle;
    private javax.swing.JLabel ToolBarJLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
    public void decorateTableTasks(){
        //decor table TasksList
        TasksListJTableTasks.getTableHeader().setFont(new Font("Segoe Ui", Font.BOLD, 14));
        TasksListJTableTasks.getTableHeader().setBackground(new Color(0,153,102));
        TasksListJTableTasks.getTableHeader().setForeground(new Color(255,255,255));
        //Created
        TasksListJTableTasks.setAutoCreateRowSorter(true);
        
    }
}