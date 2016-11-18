package model;

/**
 * Created by root on 17/11/16.
 */

public class Person {

    private String name;
    private String celphone;
    private String job;

    public Person(String name, String celphone, String job){
        this.name = name;
        this.celphone = celphone;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCelphone() {
        return celphone;
    }

    public void setCelphone(String celphone) {
        this.celphone = celphone;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

}
