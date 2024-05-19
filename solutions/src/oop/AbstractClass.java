/*
In the editor, we have provided the abstract Book class and a Main class.
In the Main class, we created an instance of a class called MyBook.
Your task is to write just the MyBook class.

Your class mustn't be public.

Sample Input:
A tale of two cities

Sample Output:
The title is: A tale of two cities
 */
package oop;

import java.util.*;


public class AbstractClass{

    public static void main(String []args){
        //Book new_novel=new Book(); This line prHMain.java:22: error: Book is abstract; cannot be instantiated
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
        sc.close();
    }
}


abstract class Book{
    String title;

    abstract void setTitle(String s);

    String getTitle(){
        return title;
    }
}


class MyBook extends Book {
    void setTitle(String s) {
        this.title = s;
    }
}
