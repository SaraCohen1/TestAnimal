public class Cat extends Animal implements Land {
    private int numberOfLegs;

    public Cat(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
        numberOfLegs = 4;
        if (!mammals || !carnivorous) {
            throw new RuntimeException("Cats must be mammals and carnivorous");
        }
    }

    public void sayHello() {
        sayHello(mood);
    }

    public void sayHello(int myMood) {
        System.out.println("meow!");
        if (myMood == MOOD_HAPPY)
            System.out.println("purr purr");
        else
            System.out.println("hiss");
    }


    public void setMammals(boolean mammals) {
        if (!mammals)
            throw new RuntimeException("Cats must be mammals");
        this.mammals = mammals;
    }

    public boolean isMammals() {
        return mammals;
    }

    public boolean isCarnivorous() {
        return carnivorous;
    }

    public  void setCarnivorous(boolean carnivorous) {
        if (!carnivorous)
            throw new RuntimeException("cats must be carnivorous");
        this.carnivorous = carnivorous;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}
