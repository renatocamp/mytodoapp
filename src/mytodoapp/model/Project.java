
package mytodoapp.model;

public class Project {
    
    private int id;
    private String name;
    private String description;

    /* 
    Constructor da classe passando todos os seus atributos
    Class' constructor passing all of your attributes fields
    */
    
    public Project(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Project() {
        
    }

    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
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


    @Override
    public String toString() {
        return this.name;
    }

}
