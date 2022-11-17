import Animals.Herbivores;
import Animals.Amphibians;
import Animals.Predators;
import Animals.FlyBirds;
import Animals.NotFlyBirds;

public class Main {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("Газель", 12, "саванна", 100, "трава");
        System.out.println(gazelle);
        Herbivores giraffe = new Herbivores("Жираф", 14, "саванна", 60, "трава");
        System.out.println(giraffe);
        Herbivores horse = new Herbivores("Лошадь", 14, "степь", 80, "трава");
        System.out.println(horse);
        Predators hyena = new Predators("Гиена", 6, "пустыни и саванны", 65, "падаль");
        System.out.println(hyena);
        Predators tiger = new Predators("Тигр", 20, "Азия", 65, "травоедные, мелкие хищники");
        System.out.println(tiger);
        Predators bear = new Predators("Медведь", 27, "леса", 65, "все, что можно");
        System.out.println(bear);
        Amphibians frog = new Amphibians("Лягушка", 1, "болота");
        System.out.println(frog);
        Amphibians snake = new Amphibians("Уж пресноводный", 2, "Берега рек");
        System.out.println(snake);
        NotFlyBirds peacock = new NotFlyBirds("Павлин", 2, null);
        System.out.println(peacock);
        NotFlyBirds penguin = new NotFlyBirds("Пингвин", 0, "Антарктида");
        System.out.println(penguin);
        NotFlyBirds dodo = new NotFlyBirds("Птица Додо", 6, "вымерли");
        System.out.println(dodo);
        FlyBirds gull = new FlyBirds("Чайка", 3, "около морец и океанов");
        System.out.println(gull);
        FlyBirds albatross = new FlyBirds("Альбитрос", 8, "океан");
        System.out.println(albatross);
        FlyBirds falcon = new FlyBirds("Сокол", 15, null);
        System.out.println(falcon);
    }
}