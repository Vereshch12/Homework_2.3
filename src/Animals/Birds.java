package Animals;

public abstract class Birds extends Animals {
    public Birds(String nickname, Integer age, String livingEnvironment) {
        super(nickname, age, livingEnvironment);
    }

    @Override
    void eat() {
        System.out.println ("Птица " + nickname + " клюет еду");
    }

    @Override
    void go() {
        System.out.println ("Птица " + nickname + " перемещается");
    }

    void hunt(){
        System.out.println ("Земноводное " + nickname + " охотится");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
