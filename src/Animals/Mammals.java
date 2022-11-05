package Animals;

import java.util.Objects;

public abstract class Mammals extends Animals{
    protected Integer speed;

    public Mammals(String nickname, Integer age, String livingEnvironment, Integer speed) {
        super(nickname, age, livingEnvironment);
        if (speed == 0) speed = 30;
        else if (speed < 0) {
            speed = Math.abs(speed);
        }
        this.speed = speed;
    }

    @Override
    void eat() {
        System.out.println ("Животное " + nickname + " ест");
    }

    @Override
    void go() {
        System.out.println ("Млекопитающее " + nickname + " перемещается");
    }

    void walk(){
        System.out.println ("Млекопитающее " + nickname + " гуляет в " + livingEnvironment);
    }

    public Integer getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return super.toString() + "\nКласс: Млекопитающее\n" +
                "Максимальная скорость: " + speed + " км/ч";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return Objects.equals(speed, mammals.speed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed);
    }
}
