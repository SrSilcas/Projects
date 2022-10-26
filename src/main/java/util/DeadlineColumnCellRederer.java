/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author User
 */
public class DeadlineColumnCellRederer extends DefaultTableCellRenderer {  
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
            boolean isSelected, boolean hasFocus, int rowIndex,
            int columnIndex){
        
        JLabel label;
        label = (JLabel) super.getTableCellRendererComponent(table, value,
                isSelected, hasFocus, rowIndex, columnIndex);
        label.setHorizontalAlignment(CENTER);
        return null;
    }
}
