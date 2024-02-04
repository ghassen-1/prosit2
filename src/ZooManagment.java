public class ZooManagment {


    public static void main(String[] args) {


    //---------------------------------------------Instruction 5: ----------------------------------------

    Animal lion=new Animal("rex","jack",10,true);
    Animal gazelle= new Animal("suavage","lama", 5, false);
    Zoo myZoo=new Zoo("ichkel","benzart",14);
     Animal tiger=  new Animal("mor","aran",13,true);

/*
        System.out.println("family: "+lion.family);
        System.out.println("name: "+lion.name);
        System.out.println("age: "+lion.age);
        System.out.println("isMammal: "+lion.isMammal);

        System.out.println("name zoo:"+myZoo.name);
        System.out.println("city zoo:"+myZoo.city);
        System.out.println("nbre de cage zoo:"+myZoo.nbrCages);
*/
      //---------------------------------------------------------------------------------------------------


      //---------------------------------------------Instruction 8: ----------------------------------------
 /*
        myZoo.displayZoo();
        System.out.println(myZoo.toString());

 */
       //---------------------------------------------------------------------------------------------------

        //---------------------------------------------Instruction 9: ----------------------------------------
 /*
        lion.displayAnimal();
        System.out.println(lion.toString());
 */

        //---------------------------------------------Instruction 10: ----------------------------------------
        /*myZoo.addAnimal(lion);
        myZoo.addAnimal(gazelle);
        myZoo.addAnimal(new Animal("mor","aran",13,true));
        myZoo.displayZoo();*/
        //---------------------------------------------------------------------------------------------------
        //---------------------------------------------Instruction 11: ----------------------------------------
        /*myZoo.displayAnimals();
        int id=myZoo.searchAnimal(lion);
        System.out.println(id);*/
        //---------------------------------------------------------------------------------------------------
        //---------------------------------------------Instruction 12: ----------------------------------------
        /*
        int a=0;
        a=myZoo.searchAnimal(tiger);
        if(myZoo.nbrCages<=25) {
            if (a == 0) {
                myZoo.addAnimal(tiger);
                myZoo.addAnimal(new Animal("mor","aran",13,true));
                myZoo.addAnimal(new Animal("mor","aran",13,true));
                myZoo.addAnimal(new Animal("mor","aran",13,true));

            } else
                System.out.println("animal exist");

        }
        else
            System.out.println("zoo is full"); */
        //---------------------------------------------------------------------------------------------------
        //---------------------------------------------Instruction 13: ----------------------------------------
        myZoo.removeAnimal(lion);


    }


}