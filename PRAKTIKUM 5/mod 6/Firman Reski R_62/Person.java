//class Person dengan dua variabel instance name dan address
//menggunakan modifier protected
public class Person{
    protected String name;
    protected String address;

    //default constructor
    //variabel name dan address dengan nilai kosong
    //mencetak pesan "Inside Person:Constructor"
    public Person() {
        System.out.println("Inside Person:Constructor");
        name = "";
        address = "";
    }
    //constructor dengan dua parameter
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    //method accessor untuk mengambil nilai name
    public String getName() {
        System.out.println("Person Name : " +name);
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String add) {

        this.address = add;
    }
}

//class student subclass dari Person
class Student extends Person {
    public Student()
    {
        System.out.println("Inside Student:Constructor");
    }
    @Override
    public String getName() {
        System.out.println("Student Name : " +name);
        return name;
    }
    public static void main(String[] args) {

        Student anna = new Student();
    }
}

//class Employee juga merupakan subclass dari Person
class Employee extends Person{
    public String getName() {
        System.out.println("Employe Name:" +name);
        return name;
    }

    //method main() membuat objek studentObject dari class Student
    public static void main(String[] args)
    {
       Person ref;
       Student studentObject = new Student();
       Employee employeeObject = new Employee();

       ref = studentObject; //person merujuk kepada object student

        String temp = ref.getName(); //dari student class dipanggil
        System.out.println(temp);

        ref = employeeObject; //person merujuk kepada object employee

        temp = ref.getName(); //getname dari employee class dipanggil
        System.out.println(temp);
    }
}