public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();
        Animal sheep = registry.createSheep();
        Animal cow = registry.createCow();
        Animal horse = registry.createHorse();

        ((Sheep) sheep).setName("Dolly"); 
        ((Cow) cow).setSound("Moo!"); 
        ((Horse) horse).setName("Black"); 

        System.out.println("Sheep 1: Name = " + ((Sheep) sheep).getName() + ", Food = " + ((Sheep) sheep).getFood() + ", Sound = " + ((Sheep) sheep).getSound() + ", Legs = " + ((Sheep) sheep).getLegs());
        System.out.println("Cow 1: Name = " + ((Cow) cow).getName() + ", Food = " + ((Cow) cow).getFood() + ", Sound = " + ((Cow) cow).getSound() + ", Legs = " + ((Cow) cow).getLegs());
        System.out.println("Horse 1: Name = " + ((Horse) horse).getName() + ", Food = " + ((Horse) horse).getFood() + ", Sound = " + ((Horse) horse).getSound() + ", Legs = " + ((Horse) horse).getLegs());
        System.out.println();

        Animal sheep2 = registry.createSheep();
        ((Sheep) sheep2).setName("Molly"); 
        System.out.println("Sheep 2: Name = " + ((Sheep) sheep2).getName() + ", Food = " + ((Sheep) sheep2).getFood() + ", Sound = " + ((Sheep) sheep2).getSound() + ", Legs = " + ((Sheep) sheep2).getLegs());
        System.out.println();

        Animal cow2 = registry.createCow();
        ((Cow) cow2).setName("Bessie"); 
        ((Cow) cow2).setFood("Corn"); 
        ((Cow) cow2).setSound("Maa!"); 
        System.out.println("Cow 2: Name = " + ((Cow) cow2).getName() + ", Food = " + ((Cow) cow2).getFood() + ", Sound = " + ((Cow) cow2).getSound() + ", Legs = " + ((Cow) cow2).getLegs());
        System.out.println();

        Animal horse2 = registry.createHorse();
        ((Horse) horse2).setName("Molly"); 
        ((Horse) horse2).setName("Brown"); 
        ((Horse) horse2).setSound("NAEEEEE!!!!"); 
        System.out.println("Horse 2: Name = " + ((Horse) horse2).getName() + ", Food = " + ((Horse) horse2).getFood() + ", Sound = " + ((Horse) horse2).getSound() + ", Legs = " + ((Horse) horse2).getLegs());
        System.out.println();
    }
}
