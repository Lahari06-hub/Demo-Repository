import java.util.ArrayList;

class Patientdetails{
    static String hospital;
    String name,blogroup,docAssigned;
    ArrayList<String> disease;
    int age, priority;

    public Patientdetails(String name, String blogroup, String docAssigned, int age, int priority){
        this.name = name;
        this.blogroup = blogroup;
        this.disease = new ArrayList<String>();
        this.docAssigned = docAssigned;
        this.age = age;
        this.priority = priority;
    }

    public static void patientd(Patientdetails p){
        System.out.println(p.name+"\t"+p.age+"\t"+p.blogroup+"\t"+p.priority+"\t"+p.docAssigned+"\t");
        System.out.println(p.name+"-"+p.disease.toString());
        System.out.println("Hospital Name:"+Patientdetails.hospital+"\n");
    }
    public static void main(String[] args) {
        Patientdetails.hospital = "ABC Hospital";
        Patientdetails p1 = new Patientdetails("Alpha","O+","Beta",25,6);
        p1.disease.add("Fever");
        p1.disease.add("Cold");
        p1.disease.add("Body Pain");

        patientd(p1);
    }
}