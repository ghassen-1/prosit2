public class Zoo {
 Animal [] animals;
 String name;
 String city;
 int nbrCages;

 int animal_counter;
 //constructeur de la classe Zoo
 public Zoo(String name, String city, int nbrCages){
  animals= new Animal[nbrCages];
  this.name=name;
  this.city=city;
  this.nbrCages=nbrCages;

 }
 public void displayZoo(){
  System.out.println("name:"+name);
  System.out.println("city:"+city);
  System.out.println("nbrCage"+nbrCages);
 }
 public String toString()
 {
  return name+city+nbrCages;

 }
 boolean addAnimal(Animal animal){

  if(animal_counter<nbrCages)
  {
   animals[animal_counter] = animal; // Ajoute l'animal au tableau
   animal_counter++;
   System.out.println("add complete ");
   return true;
  }
  else {
   System.out.println("Le zoo est plein");
   return false;
  }

 }
 public void displayAnimals() {
  System.out.println("Animaux dans le zoo :");
  for (int i = 0; i < animal_counter; i++) {
   System.out.println("Animal " + (i + 1) + ": " + animals[i].name);
  }
 }
 public int searchAnimal(Animal animal) {
  for (int i = 0; i < animal_counter; i++) {
   if (animals[i].name.equals(animal.name)) {
    return i; // Returns the index of the animal if found
   }
  }
  return -1; // Returns -1 if the animal is not found
 }
}
