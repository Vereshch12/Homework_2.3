package Animals;

import java.util.Objects;

public final class Predators extends Mammals{
    private String typeOfFood;
    public Predators(String nickname, Integer age, String livingEnvironment, Integer speed, String typeOfFood) {
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
        System.out.println("Хищное ");
        super.eat();
        System.out.print(" " + typeOfFood);
    }

    @Override
    void go() {
        super.go();
    }

    void hunt(){
        System.out.println("Хищное млекопитающее " + nickname + "охотится в " + livingEnvironment);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }


    @Override
    public String toString() {
        return super.toString() + "\nВид: хищники\nТип пищи: " + typeOfFood;
    }
}
