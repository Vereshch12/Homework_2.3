package Animals;

import java.util.Objects;

public final class Herbivores extends Mammals{
    private String typeOfFood;

    public Herbivores(String nickname, Integer age, String livingEnvironment, Integer speed, String typeOfFood) {
        super(nickname, age, livingEnvironment, speed);
        this.typeOfFood = checkNaming(typeOfFood);
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = checkNaming(typeOfFood);
    }

    @Override
    void eat() {
        System.out.println("Травоядное ");
        super.eat();
        System.out.print(" " + typeOfFood);
    }

    @Override
    void go() {
        super.go();
    }

    void graze(){
        System.out.println("Травоядное млекопитающее " + nickname + "пасется в " + livingEnvironment);
    }

    @Override
    public String toString() {
        return super.toString() + "\nВид: травоядное\nТип пищи: " + typeOfFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }
}
