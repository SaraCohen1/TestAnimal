public abstract class Animal {

    public static  final int MOOD_SCARE=0;
    public static  final int MOOD_HAPPY=1;

    protected boolean mammals;
    protected boolean carnivorous;
    protected int mood;

    public Animal(boolean mammals, boolean carnivorous, int mood) {
        this.mammals = mammals;
        this.carnivorous = carnivorous;
        this.mood = mood;
    }

    public abstract void sayHello();

    public abstract void sayHello(int myMood);

    public abstract void setMammals(boolean mammals);

    public abstract boolean isMammals();

    public abstract boolean isCarnivorous();

    public abstract void setCarnivorous(boolean carnivorous);
}
