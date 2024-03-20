package org.example.Creational.Prototype;

public class Project implements Copyable{
    private int id;
    private String name;
    private String code;

    public Project(int id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    @Override
    public Object copy() {
        Project project = new Project(id, name, code);
        return project;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
