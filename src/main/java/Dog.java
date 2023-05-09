public class Dog extends Animal implements Land {
    private int numberOfLegs;

    public Dog(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
        numberOfLegs = 4;
        if (!mammals || !carnivorous) {
            throw new RuntimeException("dogs must be mammals and carnivorous");
        }
    }
    public void sayHello() {
        sayHello(mood);
            }

    public void sayHello(int myMood) {
        System.out.println("wagging the tail!");
        if (myMood==MOOD_HAPPY)
            System.out.println("bark bark");
        else
            System.out.println("whoof");
    }


    public void setMammals(boolean mammals) {
        if (!mammals)
            throw new RuntimeException("dogs must be mammals");
        this.mammals = mammals;
    }

    public boolean isMammals() {
        return super.mammals;
    }

    public boolean isCarnivorous() {
        return super.carnivorous;
    }

    public void setCarnivorous(boolean carnivorous) {
        if (!carnivorous)
            throw new RuntimeException("dogs must be carnivorous");
        this.carnivorous = carnivorous;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}
