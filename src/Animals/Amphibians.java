package Animals;

public final class Amphibians extends Animals{
    public Amphibians(String nickname, Integer age, String livingEnvironment) {
        super(nickname, age, livingEnvironment);
    }

    @Override
    void eat() {
        System.out.println ("Земноводное " + nickname + " ест");
    }

    @Override
    void go() {
        System.out.println ("Земноводное " + nickname + " перемещается");
    }

    void hunt(){
        System.out.println ("Земноводное " + nickname + " охотится");
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
