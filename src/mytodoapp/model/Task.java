
package mytodoapp.model;

public class Task {
   
    private int id;
    private int idProject;
    private String name;
    private String description;
    private String notes;
    private boolean isCompleted;
    private String deadLine;
    private String deadlineTermino;
    private String createdDate;
    private String updateDate;

    public Task(int id, int idProject, String name, String description, 
            String notes, boolean isCompleted, String deadLine, 
            String deadlineTermino, String createdDate, String updateDate) {
        this.id = id;
        this.idProject = idProject;
        this.name = name;
        this.description = description;
        this.notes = notes;
        this.isCompleted = isCompleted;
        this.deadLine = deadLine;
        this.deadlineTermino = deadlineTermino;
        this.createdDate = createdDate;
        this.updateDate = updateDate;
    }

    
    
    public Task(){
        this.createdDate = new String();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
    
    public String getDeadlineTermino() {
        return deadlineTermino;
    }

    public void setDeadlineTermino(String deadlineTermino) {
        this.deadlineTermino = deadlineTermino;
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", idProject=" 
                + idProject + ", name=" 
                + name + ", description=" 
                + description + ", notes=" 
                + notes + ", isCompleted=" 
                + isCompleted + ", deadLine=" 
                + deadLine + ", deadlineTermino=" 
                + deadlineTermino + ", createdDate=" 
                + createdDate + ", updateDate=" 
                + updateDate + '}';
    }

    

}
