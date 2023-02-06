package datastructure;
import java.util.*;
import java.util.logging.Logger;
class Student {
     String name;
     int age;
     double gpa;
    public Student()
    {
        name = null;
        age = 0;
        gpa = 0.0;
    }
    public void setValue(String n,int a,double g)
    {
        this.name = n;
        this.age = a;
        this.gpa = g;
    }
    public String toString()
    {
        return  "Name :" + name + " |Age :" + age +" |Gpa :" + gpa;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
    public double getGpa()
    {
        return this.gpa;
    }
}
public class Studenttest {
    public static void main(String args[])
    {   
    	
    	Logger l =Logger.getLogger("com.api.jar");
        ArrayList<Student> list = new ArrayList<>();
        Student a = new Student();
        Student b = new Student();
        Student c = new Student();
        Student d = new Student();
        Student e = new Student();
        Student f = new Student();
        a.setValue("Arun  ",21,8.72);
        b.setValue("Aksh  ",20,8.73);
        c.setValue("Prabu ",20,9.11);
        d.setValue("Partha",22,9.01);
        e.setValue("shiv  ",23,7.99);
        f.setValue("Naruto",20,8.92);
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        list.add(f);
        for(int i=0;i<list.size();i++)
        {
             System.out.println(list.get(i));
        } 
        Comparator<Student> compareBygpa = new Comparator<Student>()
        {
     	       public int compare(Student o1, Student o2) 
     	         {
     	    	  Double obj1 = o1.getGpa();
                  Double obj2 = o2.getGpa();
		            return (obj2.compareTo(obj1));
	             }
        };

        Collections.sort(list,compareBygpa);
        for(int i=0;i<list.size();i++)
        {   
        	 l.info("Name : " + list.get(i).getName()+ " " +"|Gpa : "+ list.get(i).getGpa());
        } 
    }
}