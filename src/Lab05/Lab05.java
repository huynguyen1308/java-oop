package Lab05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        Map<Integer, String> studentList = new HashMap<Integer,String>();
        Scanner scanner=new Scanner(System.in);
        boolean isContinuing=true;
        while(isContinuing){
            System.out.println("\n---------MENU---------");
            System.out.println("1. Input student info");
            System.out.println("2. Find student by ID");
            System.out.println("0. Exit!");

            switch (scanner.nextInt()){
                case 1:
                    inputStudentInfo(studentList);
                    break;
                case 2:
                    System.out.println("Input ID to find student:");
                    findStudentById(scanner.nextInt(),studentList);
                    break;
                case 0:
                    System.out.println("exit program! ");
                    isContinuing=false;
                    break;
                default:
            }
        }
    }
    public static void findStudentById(Integer id, Map<Integer,String> stuList){
        String Name= stuList.get(id);
        if(Name!= null)
            System.out.printf("[%s,%d]\n",Name,id);
        else
            System.out.printf("Student with ID %d not found\n",id);

    }
    public static void inputStudentInfo(Map<Integer,String> stuList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Student Name: ");
        String stuName = scanner.nextLine();
        System.out.println("Input Student ID: ");
        int stuId = scanner.nextInt();
        stuList.put(stuId, stuName);
    }
}
