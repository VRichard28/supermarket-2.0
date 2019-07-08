package domain;

import java.util.Objects;

public class Persoane implements Comparable<Persoane>{

    private String name;
    private String cnp;
    private int age;
    private String porecla;

    public Persoane(){

    }

    public Persoane(String name, String cnp, int age, String porecla) {
        this.name = name;
        this.cnp = cnp;
        this.age = age;
        this.porecla = porecla;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPorecla() {
        return porecla;
    }

    public void setPorecla(String porecla) {
        this.porecla = porecla;
    }

    @Override
    public String toString() {
        return "Persoane{" +
                "name='" + name + '\'' +
                ", cnp='" + cnp + '\'' +
                ", age=" + age + '\'' +
                ", porecla=" + porecla +
                '}';
    }


    @Override
    public int compareTo(Persoane o) {
        return name.compareTo(o.getName());
    }

    public int compareTo(String cnp) {
        return cnp.compareTo (getCnp ());
    }
}
