package Animals;

import java.util.Objects;

public final class FlyBirds extends Birds{
    private final String MOVEMENT_TYPE = "летают";

    public FlyBirds(String nickname, Integer age, String livingEnvironment) {
        super(nickname, age, livingEnvironment);
    }

    void walk(){
        System.out.println ("Птица " + nickname + " летает над " + livingEnvironment);
    }

    @Override
    void eat() {
        super.eat();
    }

    @Override
    void go() {
        System.out.println ("Млекопитающее " + nickname + " перемещается с помощию полета");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FlyBirds flyBirds = (FlyBirds) o;
        return Objects.equals(MOVEMENT_TYPE, flyBirds.MOVEMENT_TYPE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), MOVEMENT_TYPE);
    }

    @Override
    public String toString() {
        return super.toString() + "\nТип перемещения: " + MOVEMENT_TYPE;
    }
}
