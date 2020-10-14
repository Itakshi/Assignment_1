public class Main {

    public static void main(String[] args)
    {
        //Employee e = new Employee("Itakshi",12,"Jammu");
        Employee e = new Employee();
        e.name="Itakshi";
        e.age=22;
        e.city="Pune";
        e.display();
       // Employee e2 = new Employee("Neha",12,"Kashmir");
        Employee e2= new Employee();
        e.name="Neha";
        e.age=21;
        e.city ="Jammu";
        e2.display();
    }

}
