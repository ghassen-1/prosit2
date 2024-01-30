public class Animal {

    String family;
    String name;
    int age;
    boolean isMammal;

    //constructeur de la classe Animal
    public Animal(){

    }
public Animal(String family, String name, int age, boolean isMammal)
{
    this.family=family;
    this.name=name;
    this.age=age;
    this.isMammal=isMammal;
}
public void displayAnimal(){
    System.out.println(family);
    System.out.println(name);
    System.out.println(age);
    System.out.println(isMammal);

}
public String toString (){
        return family+"/n"+name+"/n"+age+"/n"+isMammal;

}
}
