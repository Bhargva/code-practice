import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

class Student{
    int id;
    String name;
    double cgpa;

    Student(int id,String name,double cgpa)
    {
        super();
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;

    }
    int getID()
    {
        return id;
    }
    String getName()
    {
        return name;
    }
    double getCGPA()
    {
        return cgpa;
    }
}
class Priorities
{

    // List<Student> stu=new List<Student>();
    PriorityQueue<Student> prio=new PriorityQueue<Student>(new Comparator<Student>()
    {

        public int compare(Student p,Student q)
        {
            if(p.getCGPA()<q.getCGPA())
            {
                return 1;
            }
            else if(p.getCGPA()>q.getCGPA())
            {
                return -1;
            }
            else
            {
                if(p.getName().compareTo(q.getName())==0)
                {
                    return p.getID()-q.getID();
                }
                else
                {
                    return p.getName().compareTo(q.getName());
                }
            }
        }});
    List<Student> getStudents(List<String> events)
    {
        for(String s:events)
        {
            Scanner sn=new Scanner(s);
            String d=sn.next();
            if(d.equals("ENTER"))
            {
                String na=sn.next();
                double cg=sn.nextDouble();
                int id=sn.nextInt();

                Student st=new Student(id,na,cg);
                prio.add(st);

            }
            else if(s.equals("SERVED"))
            {
                if(prio.isEmpty())
                {
                    continue;
                }
                else
                {
                    prio.remove();
                }
            }
        }

        List<Student> stu=new ArrayList<Student>();
        Student first =  prio.poll();
        if (first == null) {
            return stu;
        } else {
            while (first != null) {

                stu.add(first);
                first =  prio.poll();

            }
            return stu;
        }
    }


}


class priorityque{
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}