package com.company;

public class ERPSystem {
    User[] memory = new User[1000];
    int sizeOfUsers = 0;

    public void addUser(User u){
        memory[sizeOfUsers] = u;
        sizeOfUsers++;
    }

    public void printAllUsers(){
        for (User a : memory) {
            if (a != null){
                System.out.println(a.getUserData());
                System.out.println();
            }
        }
    }

    public void printUser(int index){
        if (memory[index] != null) System.out.println(memory[index].getUserData());
        else System.out.println("No User in this index :(");
    }
}
