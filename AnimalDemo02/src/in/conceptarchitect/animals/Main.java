package in.conceptarchitect.animals;

public class Main {

    public static void main(String []args){

        Animal [] animals={
          new Tiger(),
          new Horse(),
          new Eagle(),
          new Snake(),
          new Crocodile(),
          new Dog(),
          new Camel(),
          new Leopard(),
          //new Mammal(),
        new Cow(),
        //new Reptile(),
          new Parrot(),
          //new Bird(),
        //  new Cat(),
                //can't create an instance of an abstract class
         // new Animal(),
        };


        for(Animal animal : animals){
            System.out.println("Animal is "+animal.type());
            animal.move();
            animal.eat();

            //huntIfYouAreTiger(animal);

            if(animal instanceof  Hunter){
                Hunter h=(Hunter) animal;
                h.hunt();
            }

            System.out.println();
        }




    }

    private static void huntIfYouAreTiger(Animal animal) {
        if(animal instanceof Tiger) {
            Tiger tiger = (Tiger) animal;
            tiger.hunt();
        }
    }

    private static void arrayDemo() {
        int [] values1=new int [5];
        int values2[];

        int values3[]={2,3,9,4,1};

        values2=new int [10];

        for(int i=0;i< values1.length;i++){
            values1[i]=i*10;

        }

        for(int value : values1)
            System.out.print(value+"\t");
        System.out.println();
        for(int value : values3)
            System.out.print(value+"\t");
        System.out.println();
        for(int i=0;i<20;i++)
            values2[i]=i*100;
    }
}
