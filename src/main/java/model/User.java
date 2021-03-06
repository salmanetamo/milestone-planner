package model;


import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String salt;
    private List<Project> projects;
    private List<Milestone> sharedMilestones;

    public User(String firstName, String lastName, String email, String password, String salt){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.salt = salt;
        this.projects = new ArrayList<Project>();
        this.sharedMilestones = new ArrayList<Milestone>();
    }

    public User(int id, String firstName, String lastName, String email, String password, String salt){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.salt = salt;
        this.projects = new ArrayList<Project>();
        this.sharedMilestones = new ArrayList<Milestone>();
    }

    @Override
    public String toString(){
        return this.firstName + " " + this.lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String password) {
        this.salt = salt;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<Milestone> getSharedMilestones() {
        return sharedMilestones;
    }

    public void setSharedMilestones(List<Milestone> sharedMilestones) {
        this.sharedMilestones = sharedMilestones;
    }
}
