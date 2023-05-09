import org.junit.Assert;

public class TestAnimal {
    public static void main(String[] args) {

        Dog dog = new Dog(true, true, Animal.MOOD_HAPPY);
        Cat cat = new Cat(true, true, Animal.MOOD_SCARE);
        Frog frog = new Frog(false, false, Animal.MOOD_SCARE);


        System.out.println("Testing sayHello method with giving mood");
        System.out.print("dogs way to say hello when they are happy is ");
        dog.sayHello(1);
        System.out.print("dogs way to say hello when they are frightened is ");
        dog.sayHello(0);
        System.out.print("cats way to say hello when they are happy is ");
        cat.sayHello(1);
        System.out.print("cats way to say hello when they are frightened is ");
        cat.sayHello(0);
        System.out.print("frogs way to say hello when they are happy is ");
        frog.sayHello(1);
        System.out.print("frogs way to say hello when they are frightened is ");
        frog.sayHello(0);

        System.out.println("Testing sayHello method with default mood ");
        System.out.println("dogs:");
        dog.sayHello();
        System.out.println("cats:");
        cat.sayHello();
        System.out.println("frogs:");
        frog.sayHello();

        System.out.println("Testing getNumberOfLegs method");
        System.out.println("number of legs for dog:" +  dog.getNumberOfLegs());
        Assert.assertEquals("number of legs for dog", dog.getNumberOfLegs(), 4);
        System.out.println("number of legs for cat:" +  cat.getNumberOfLegs());
        Assert.assertEquals("number of legs for cat", cat.getNumberOfLegs(), 4);
        System.out.println("number of legs for frog:" +  frog.getNumberOfLegs());
        Assert.assertEquals("number of legs for frog", frog.getNumberOfLegs(), 4);

        System.out.println("Testing isMammals method ");
        Assert.assertEquals("a cat is a mammal", cat.isMammals(), true);
        Assert.assertEquals("a dog is a mammal", dog.isMammals(), true);
        Assert.assertEquals("a frog is a mammal", frog.isMammals(), false);

        System.out.println("Testing isCarnivorous method ");
        Assert.assertEquals("a cat is a mammal", cat.isCarnivorous(), true);
        Assert.assertEquals("a dog is a mammal", dog.isCarnivorous(), true);
        Assert.assertEquals("a frog is a mammal", frog.isCarnivorous(), false);

        System.out.println("Testing setCarnivorous & setMammals methods when input is not valid");
        Assert.assertThrows(RuntimeException.class,()-> { cat.setCarnivorous(false);});
        Assert.assertThrows(RuntimeException.class,()-> { dog.setCarnivorous(false);});
        Assert.assertThrows(RuntimeException.class,()-> { frog.setCarnivorous(true);});
        Assert.assertThrows(RuntimeException.class,()-> { cat.setMammals(false);});
        Assert.assertThrows(RuntimeException.class,()-> { dog.setMammals(false);});
        Assert.assertThrows(RuntimeException.class,()-> { frog.setMammals(true);});


        System.out.println("Testing setCarnivorous & setMammals methods when input is valid");
        dog.setCarnivorous(true);
        cat.setCarnivorous(true);
        frog.setCarnivorous(false);
        cat.setMammals(true);
        dog.setMammals(true);
        frog.setMammals(false);

        System.out.println("Testing hasGills & hasLaysEggs method ");
        Assert.assertEquals("a frog has gills", frog.hasGills(), true);
        Assert.assertEquals("a frog has Lays Eggs" , frog.hasLaysEggs(), true);
    }
}
