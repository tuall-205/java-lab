package test;

import java.util.Objects;

public class Cat {

    private int weight;
    private String name;

    public Cat(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public Cat() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return getWeight() == cat.getWeight() && Objects.equals(getName(), cat.getName());
    }

}
