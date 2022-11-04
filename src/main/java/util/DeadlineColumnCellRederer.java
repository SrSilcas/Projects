/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import model.Task;

/**
 * @author Lucas Silva Arruda Chagas
 * Class util DeadLineColumnCellRender change deadline in table tasks
 */
public class DeadlineColumnCellRederer extends DefaultTableCellRenderer {  
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
            boolean isSelected, boolean hasFocus, int rowIndex,
            int columnIndex){
        
        JLabel label;
        label = (JLabel) super.getTableCellRendererComponent(table, value,
                isSelected, hasFocus, rowIndex, columnIndex);
        label.setHorizontalAlignment(JLabel.CENTER);
        TaskTableModel taskModel = (TaskTableModel) table.getModel();
        Task task = taskModel.getTasks().get(rowIndex);
        if (task.getDeadline().after(new Date())) {
            label.setBackground(Color.GREEN);
        }else{
            label.setBackground(Color.RED);
        }
          
        return label;
    }
}