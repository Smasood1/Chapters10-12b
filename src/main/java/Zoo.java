import java.nio.channels.ScatteringByteChannel;

public class Zoo {

    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();

        Animal sasha = new Dog();
        System.out.println();
        sasha.makeSound();
        feed(sasha);
        sasha = new Cat();
        sasha.makeSound();

        //sasha is a type of animal but not a type of cat. so it does
        //not have access to the cat make noise method

        //Type Casting
        //sasha.scratch;
        ((Cat) sasha).scratch();
        feed(sasha);


    }

    public static void feed(Animal animal){

        if(animal instanceof Dog){
            System.out.println("heres your dog food");
        }
        else if( animal instanceof Cat){
            System.out.println("heres your cat food");
        }


    }

}
