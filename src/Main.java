public class Main {
    public static void main(String[] args) {
        String[] commads = {"Сидеть","Лежать"};
        Shelter shelter = new Shelter("Ромашка","Ленина 1");

        Dog dog = new Dog("Rex", "Ovcharka", commads,
                EnumColor.BROWN, shelter);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Гив гив");
        dog.makeVoice("Нув нув");

        Dog_2 dog_2 = new Dog_2("SERGEY", "Haski", EnumColor.GRAY, shelter);
        System.out.println(dog_2.getInfo());
        dog_2.makeVoice();
        dog_2.makeVoice("Воу воу уууууу");
        dog_2.makeVoice("Гав ваф");
    }
}