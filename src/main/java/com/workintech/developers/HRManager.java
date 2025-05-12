package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;


    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("HRManager starts to working");
    }

    public void addEmployee(int index, JuniorDeveloper developer){
        if (index < 0){
            System.out.println("Index must be bigger than 0");
        } else if(juniorDevelopers[index] != null){
            System.out.println("Index already used.");
        } else {
            juniorDevelopers[index] = developer;
        }
    }
    public void addEmployee(int index, MidDeveloper developer){
        if (index < 0){
            System.out.println("Index must be bigger than 0");
        } else if(midDevelopers[index] != null){
            System.out.println("Index already used.");
        } else {
            midDevelopers[index] = developer;
        }
    }
    public void addEmployee(int index, SeniorDeveloper developer){
        if (index < 0){
            System.out.println("Index must be bigger than 0");
        } else if(seniorDevelopers[index] != null){
            System.out.println("Index already used.");
        } else {
            seniorDevelopers[index] = developer;
        }
    }

}
