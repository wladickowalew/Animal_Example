
package test;

import java.util.ArrayList;
import java.util.Scanner;


public class Test {
    
    static ArrayList<Animal> animals= new ArrayList<Animal>();


    public static void main(String[] args) {
       //ввод данных с клавиатуры
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       
       Animal a1 = new Animal("иннокентий", "Утконос", 500, 34.678, true);
       Animal a2 = new Animal();
       Animal a3 = new Fish();
       animals.add(a1);
       animals.add(a2);
       animals.add(a3);
       showAnimalsInfo();
       
    }
    
    public static void showAnimalsInfo(){
        for (Animal animal: animals){
            System.out.println(animal);
        }
    }
    
}


