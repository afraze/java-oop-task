package org.example;


public class SoftwareDeveloper extends Employee implements ISoftwareDeveloper{

    private String skills;
    private int experience;
    private Manager supervisor;

    public SoftwareDeveloper(int id, String firstName, String lastName, int age, double salary, String department,Manager supervisor, String skills, int experience ) {
        super(id, firstName, lastName, age, salary, department);
        this.skills = skills;
        this.experience = experience;
        this.supervisor = supervisor;
    }
    @Override
    public void writeCode() {
        System.out.println("Code has been written by : "+this.getFirstName()+" "+this.getLastName());
    }

    @Override
    public void testCode() {
        System.out.println("Code has been tested by : "+this.getFirstName());
    }

    @Override
    public void pushChanges() {
        System.out.println("Code has been pushed by : "+this.getFirstName()+" "+this.getLastName());

    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Manager getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Manager supervisor) {
        this.supervisor = supervisor;
    }

    // A SoftwareDeveloper has Supervisor, skills, experience attribute additionally.
    // Please implement necessary methods to get and set these attributes of Manager




}
