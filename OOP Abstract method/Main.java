package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ERPSystem erpSystem = new ERPSystem();
        while (true){
            System.out.println("PRESS [1] TO ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [3] TO LIST USER BY INDEX");
            int choice = in.nextInt();
            if (choice == 1){
                System.out.println("PRESS [1] TO ADD STUDENT");
                System.out.println("PRESS [2] TO ADD TEACHER");
                int second_choice = in.nextInt();
                if (second_choice == 1){
                    Student student = new Student();
                    System.out.println("Login: ");
                    student.setLogin(in.next());
                    System.out.println("Password: ");
                    student.setPassword(in.next());
                    System.out.println("Name: ");
                    student.setName(in.next());
                    System.out.println("Surname: ");
                    student.setSurname(in.next());
                    System.out.println("Group: ");
                    student.setGroup(in.next());
                    System.out.println("GPA: ");
                    student.setGpa(in.nextDouble());
                    erpSystem.addUser(student);
                }
                else if (second_choice == 2){
                    Teacher teacher = new Teacher();
                    System.out.println("Login: ");
                    teacher.setLogin(in.next());
                    System.out.println("Password: ");
                    teacher.setPassword(in.next());
                    System.out.println("Nick Name: ");
                    teacher.setNickname(in.next());
                    System.out.println("Status: ");
                    teacher.setStatus(in.next());
                    System.out.println("PRESS [1] TO ADD SUBJECT'\'PRESS [2] TO FINISH ADDING SUBJECT ");
                    int a = in.nextInt();
                    if (a == 1){
                        while (true){
                            String line = in.next();
                            if (line.equals("2")) break;
                            else teacher.addSubject(line);
                        }
                    }
                    erpSystem.addUser(teacher);
                }else System.out.println("Sorry something was wrong :(");
            }
            else if (choice == 2){
                System.out.println("PRESS [1] TO LIST STUDENTS\n" + "PRESS [2] TO LIST TEACHERS\n" + "PRESS [3] TO LIST ALL USERS");
                int third_choice = in.nextInt();
                if (third_choice == 1){
                    for (User a : erpSystem.memory) {
                        if (a instanceof Student) System.out.println(a.getUserData());
                    }
                }
                else if (third_choice == 2){
                    for (User a : erpSystem.memory) {
                        if (a instanceof Teacher) System.out.println(a.getUserData());
                    }
                }
                else if (third_choice == 3) erpSystem.printAllUsers();
                else System.out.println("Sorry something was wrong :(");
            }
            else if (choice == 3){
                System.out.println("ENTER INDEX:");
                int index = in.nextInt();
                erpSystem.printUser(index);
            }
            else if (choice == 0) System.exit(0);
            else System.out.println("Sorry something was wrong :(");
        }

    }
}
