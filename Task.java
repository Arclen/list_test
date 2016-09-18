/*
The idea is to make a to-do list, nothing special
However, later on in development I would like to add customization 
But, I have to get there first, so disregard for the time being
 */
package task;

/**
 *
 * @author Jacob Liou
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Task {

    String title;
    String info;
    int diff;
    Scanner input = new Scanner (System.in);
    
    public Task()
    {
        title = "Insert task name";
        info = "Insert task details";
        diff = 3;
    }
    
    public Task(String t, int d)
    {
        title = t;
        info = "Insert task details";
        diff =d;
    }
    
    public void printTask()
    {
        System.out.println(title + " Difficulty level: " + diff);
        System.out.println(info);
    }
    public void assignInfo()
    {
        System.out.println("What are the details of " + title + "?");
        info = input.nextLine();
    }
    public void assignDiff()
    {
        System.out.println("What is the difficulty level of " + title + "?");
        diff = input.nextInt();
    }
    public static void main(String[] args) 
    {
        Task shopping = new Task("Shopping", 3);
        ArrayList<Task> todolist = new ArrayList<Task>();
        todolist.add(shopping);
        shopping.assignInfo();
        shopping.printTask();
    }
    
}
