import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class Patientdetails1{
    static String hospital;
    String name,blogroup,docAssigned;
    ArrayList<String> disease;
    int pid,age, priority;
    static int patientCounter = 0;

    {
        ++patientCounter;
    }
    public Patientdetails1(String name, String blogroup, String docAssigned, int age, int priority){
        this.pid = patientCounter;
        this.name = name;
        this.blogroup = blogroup;
        this.disease = new ArrayList<String>();
        this.docAssigned = docAssigned;
        this.age = age;
        this.priority = priority;
    }

    public static void patientd(Patientdetails1 p){
        System.out.println(p.pid+"\t"+p.name+"\t"+p.age+"\t"+p.blogroup+"\t"+p.priority+"\t"+p.docAssigned+"\t");
        System.out.println(p.name+"-"+p.disease.toString());
        System.out.println("Hospital Name:"+Patientdetails1.hospital+"\n");
    }
    public static Patientdetails1 createNewPatient(Scanner sc){
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        System.out.println("Enter Blood Group: ");
        String blogroup = sc.nextLine();
        System.out.println("Enter Docter Name: ");
        String docname = sc.nextLine();
        System.out.println("Enter Disease: ");
        String disease = sc.nextLine();
    }
    public static void main(String[] args) {
        ArrayList<Patientdetails1> patientsList = new ArrayList<Patientdetails1>();
        while (true) { 
            System.out.println("1. Add new Patient\t2.Update Patient Details\t"+"3.Get Patient Details\t4.Delete Patient Details");

        }
    }
}