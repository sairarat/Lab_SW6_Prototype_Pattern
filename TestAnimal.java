public class TestAnimal {
    public static void main(String[] args) {
        // Create AnimalRegistry
        AnimalRegistry registry = new AnimalRegistry();

        // Create and customize Sheep prototype
        Sheep sheep = (Sheep) registry.createSheep();
        sheep.setName("Julia");

        // Clone sheep to create sheep2
        Sheep sheep2 = (Sheep) registry.createSheep();
        sheep2.setName("Pres");

        // Clone sheep to create sheep3
        Sheep sheep3 = (Sheep) registry.createSheep();
        sheep3.setName("Carl");

        // Clone sheep to create sheep4
        Sheep sheep4 = (Sheep) registry.createSheep();
        sheep4.setName("Albert");

        System.out.println("Sheep 1: Name = " + sheep.getName() + ", Food = " + sheep.getFood() + ", Sound = " + sheep.getSound() + ", Legs = " + sheep.getLegs());
        System.out.println("Sheep 2: Name = " + sheep2.getName() + ", Food = " + sheep2.getFood() + ", Sound = " + sheep2.getSound() + ", Legs = " + sheep2.getLegs());
        System.out.println("Sheep 3: Name = " + sheep3.getName() + ", Food = " + sheep3.getFood() + ", Sound = " + sheep3.getSound() + ", Legs = " + sheep3.getLegs());
        System.out.println("Sheep 4: Name = " + sheep4.getName() + ", Food = " + sheep4.getFood() + ", Sound = " + sheep4.getSound() + ", Legs = " + sheep4.getLegs());
        System.out.println();


        // Create and customize Cow prototype
        Cow cow = (Cow) registry.createCow();
        cow.setName("Presidad");

        // Clone cow to create cow2
        Cow cow2 = (Cow) registry.createCow();
        cow2.setName("Baikiki");

        // Create and customize Cow prototype
        Cow cow3 = (Cow) registry.createCow();
        cow3.setName("Juliana");

        // Clone cow to create cow2
        Cow cow4 = (Cow) registry.createCow();
        cow4.setName("Bai");

        System.out.println("Cow 1: Name = " + cow.getName() + ", Sound = " + cow.getSound() + ", Food = " + cow.getFood() + ", Legs = " + cow.getLegs());
        System.out.println("Cow 2: Name = " + cow2.getName() + ", Sound = " + cow2.getSound() + ", Food = " + cow2.getFood() + ", Legs = " + cow2.getLegs());
        System.out.println("Cow 3: Name = " + cow3.getName() + ", Sound = " + cow3.getSound() + ", Food = " + cow3.getFood() + ", Legs = " + cow3.getLegs());
        System.out.println("Cow 4: Name = " + cow4.getName() + ", Sound = " + cow4.getSound() + ", Food = " + cow4.getFood() + ", Legs = " + cow4.getLegs());
        System.out.println();

        // Create and customize Horse prototype
        Horse horse = (Horse) registry.createHorse();
        horse.setName("Saki");

        // Clone horse to create horse2
        Horse horse2 = (Horse) registry.createHorse();
        horse2.setName("Vinz");

        System.out.println("Horse 1: Name = " + horse.getName() + ", Sound = " + horse.getSound() + ", Food = " + horse.getFood() + ", Legs = " + horse.getLegs());
        System.out.println("Horse 2: Name = " + horse2.getName() + ", Sound = " + horse2.getSound() + ", Food = " + horse2.getFood() + ", Legs = " + horse2.getLegs());
    }
}
