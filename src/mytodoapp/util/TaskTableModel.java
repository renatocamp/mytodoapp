/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mytodoapp.util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import mytodoapp.model.Task;

public class TaskTableModel extends AbstractTableModel {

    String[] columns = {"Nome", "Descrição", "Término", "Tarefa Concluída",
        "Editar", "Excluir"};

    List<Task> tasks = new ArrayList<>();

    @Override
    public int getRowCount() {
        return tasks.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return columns[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        return switch (columnIndex) {
            case 0 -> tasks.get(rowIndex).getName();
            case 1 -> tasks.get(rowIndex).getDescription();
            case 2 -> tasks.get(rowIndex).getDeadlineTermino();
            case 3 -> tasks.get(rowIndex).isIsCompleted();
            case 4 -> "";
            case 5 -> "";
            default -> "Dados não encontrados!";
        };
    }

    public String[] getColumns() {
        return columns;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

}
