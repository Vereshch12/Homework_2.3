package Animals;


import java.util.Objects;

public abstract class Animals {
    protected String nickname;
    protected Integer age;
    protected String livingEnvironment;
    public String checkNaming (String line){
        if (line == null || line.isEmpty() || line.isBlank()) {
            return  "default";
        } else return line;
    }

    private Integer checkAge(Integer age){
        if (age == 0) return  5;
        else if (age < 0) {
            return Math.abs(age);
        }else
            return age;
    }

    public Animals(String nickname,Integer age, String livingEnvironment) {
        this.nickname = checkNaming(nickname);
        this.age = checkAge(age);
        this.livingEnvironment = checkNaming(livingEnvironment);
    }

    void eat(){
        System.out.println ("Животное " + nickname + " ест");
    }
    void sleep(){
        System.out.println ("Животное " + nickname + " спит");
    }
    void go(){
        System.out.println ("Животное " + nickname + " перемещается");
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = checkNaming(nickname);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = checkAge(age);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    @Override
    public String toString() {
        return "\nКласс объекта: " + getClass() +
                "\nЖивотное: " + nickname +
                "\nВозраст: " + age + " лет" +
                "\nОбитает в: " + livingEnvironment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return Objects.equals(nickname, animals.nickname) && Objects.equals(age, animals.age) && Objects.equals(livingEnvironment, animals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, age, livingEnvironment);
    }
}
