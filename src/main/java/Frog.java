public class Frog extends Animal implements Water, Land{
    private int numberOfLegs;

    public Frog(boolean mammals, boolean carnivorous, int mood)
        {   super(mammals, carnivorous, mood);
            numberOfLegs = 4;
            if (mammals && carnivorous)

         System.out.println("frogs are neither mammalian nor carnivorous");
    }

    @Override
    public void sayHello() {
        sayHello(mood);
    }

        public void sayHello(int myMood) {
            if (myMood==MOOD_HAPPY)
            System.out.println("quack quack quack");
        else
            System.out.println("plop into the water");
    }


    public void setMammals(boolean mammals) {
        if (mammals)
            throw new RuntimeException("frogs are not mammals");
        this.mammals = mammals;
    }

    public boolean isMammals() {
        return super.mammals;
    }

    public boolean isCarnivorous() {
        return super.carnivorous;
    }

    public void setCarnivorous(boolean carnivorous) {
        if (carnivorous)
            throw new RuntimeException("dogs must be carnivorous");
        this.carnivorous = carnivorous;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
    public boolean hasGills(){
        return true;
    }
    public boolean hasLaysEggs(){
        return true;
    }

}
