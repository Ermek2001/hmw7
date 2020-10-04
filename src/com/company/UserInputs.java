package com.company;

import java.util.*;

public class UserInputs {
    Scanner userIn = new Scanner(System.in);
    ArrayList<String> userListA = new ArrayList<>(5);
    ArrayList<String> userListB = new ArrayList<>(5);
    ArrayList<String> userListC = new ArrayList<>(userListA.size()+userListB.size());
    
    public void getUserInput(){
        while (userListA.size() < 5){
            System.out.println("Write your 5 favourite books: ");
            userListA.add(userIn.nextLine());
        }
        Iterator<String> iterator = userListA.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        while (userListB.size() < 5){
            System.out.println("Write your 5 impressions about books");
            userListB.add(userIn.nextLine());
        }
        iterator = userListB.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Reversed one");
        Collections.reverse(userListB);
        iterator = userListB.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List<String> combineListC = null;
        for (int i = 0; i < userListA.size(); i++) {
            combineListC.add(userListA.get(i));
            combineListC.add(userListB.get(i));
            
        }
        iterator = combineListC.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Sorted with length");
        Collections.sort(combineListC, new Comparator<String>() {
            @Override
            public int compare(String s , String t1){
                return Integer.compare(s.length(), t1.length());
            
            
        } 
            
        });
        iterator = combineListC.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void getUserInputs() {
    }
}
