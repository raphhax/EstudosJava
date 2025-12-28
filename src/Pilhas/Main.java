package Pilhas;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args){
        // static size, some 2 slots of memory
        arraysBasicos();

        // List names, dynamic sizes(automatic up or down)
        lista();

        // Stack names
        pilhas();

        // QUEUE(FILAS)
        filas();
    }

    public static void arraysBasicos(){
        String[] namesArray = new String[2];
        namesArray[0] = "Narutim";
        namesArray[1] = "Narutao";
    }

    public static void lista(){
        List<String> namesList = new ArrayList<>();
        namesList.add("Narutadas");
        System.out.println(namesList);
    }

    public static void pilhas(){
        Stack<String> namesStack = new Stack<>();
        namesStack.push("Naruto");
        namesStack.push("Charutadas");
        System.out.println("Its start of my stack: " + namesStack);
        System.out.println("Size of my stack: " + namesStack.size());
        namesStack.pop();
        namesStack.peek(); // View the actually top element of my stack
        System.out.println("Finished Stack: " + namesStack);
        System.out.println("My final stack size: " + namesStack.size());
    }

    public static void filas(){
        Queue<String> namesQueue = new LinkedList<>();
        namesQueue.add("");
    }
}
