/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

/**
 *
 * @author Анастасия
 */
public class Main {
    public static void main(String[] args) {
        List MyList = new List();
        MyList.addBack(3.3);
        MyList.addBack(4);
        MyList.addBack("string");
        MyList.addFront(2);
        MyList.addFront(1.1);
        MyList.addFront("My");
 
        MyList.printList();
        System.out.println();
        
        MyList.delElem(4);
        
        MyList.printList();
        System.out.println();
        
        MyList.delList();
        
        if(MyList.isEmpty()) System.out.println("Empty List");
        
    }
}
