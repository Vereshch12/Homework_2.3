package Animals;

import java.util.Objects;

public final class NotFlyBirds extends Birds{
    private final String movementType = "ходят";

    public NotFlyBirds(String nickname, Integer age, String livingEnvironment) {
        super(nickname, age, livingEnvironment);
    }

    void walk(){
        System.out.println ("Птица " + nickname + " гуляет в " + livingEnvironment);
    }

    @Override
    void eat() {
        super.eat();
    }

    @Override
    void go() {
        System.out.println ("Млекопитающее " + nickname + " перемещается с помощию ног");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NotFlyBirds that = (NotFlyBirds) o;
        return Objects.equals(movementType, that.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }

    @Override
    public String toString() {
        return super.toString() + "\nТип перемещения: " + movementType;
    }
}
