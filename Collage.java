//Author Kresimir Tuk
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;
// this would be main class that where we have our static main method wich will create instances of
// students objects, assignment has not been finshed do to the lack of time and private life and work.
// most of the methods are finished it just has not been implemented in to one.

public class Collage {


    public static void main(String[] args) {
            //data base of Undergraduate
        Undergraduate SO1 = new Undergraduate("Martin Niles", 12345, "dt249",
                74, true, ArrayOfStudentMarks(), "Software engineering", "manegament");

        Undergraduate SO2 = new Undergraduate("Martin Smith", 12345, "dt249",
                74, true, ArrayOfStudentMarks(), "Software engineering", "manegament");

        Undergraduate SO3 = new Undergraduate("Martin English", 12345, "dt249",
                74, true, ArrayOfStudentMarks(), "Software engineering", "manegament");

        Undergraduate SO4 = new Undergraduate("Martin Burns", 12345, "dt249",
                74, true, ArrayOfStudentMarks(), "Networks", "manegament");

        Undergraduate SO5 = new Undergraduate("Martin O'Nil", 12345, "dt249",
                74, true, ArrayOfStudentMarks(), "Networks", "manegament");

        Undergraduate SO6 = new Undergraduate("Martin Swinny", 12345, "dt249",
                74, true, ArrayOfStudentMarks(), "Web Development", "manegament");

        Undergraduate SO7 = new Undergraduate("Martin Trump", 12345, "dt249",
                74, true, ArrayOfStudentMarks(), "Web Development", "manegament");

        Undergraduate SO8 = new Undergraduate("Martin Hampton", 12345, "dt249",
                74, true, ArrayOfStudentMarks(), "Web Development", "manegament");

        Undergraduate SO9 = new Undergraduate("Martin Grey", 12345, "dt249",
                74, true, ArrayOfStudentMarks(), "Web Development", "manegament");

        Undergraduate SO10 = new Undergraduate("Martin Baldwin", 12345, "dt249",
                74, true, ArrayOfStudentMarks(), "Networks", "manegament");

        Undergraduate SO11 = new Undergraduate("Martin Keely", 12345, "dt249",
                74, true, ArrayOfStudentMarks(), "Networks", "manegament");

        Undergraduate SO12 = new Undergraduate("Martin O'Rayan", 12345, "dt249",
                74, true, ArrayOfStudentMarks(), "Networks", "manegament");

        Undergraduate SO13 = new Undergraduate("Martin Strange", 12345, "dt249",
                74, true, ArrayOfStudentMarks(), "Machine Learning", "manegament");

        Undergraduate SO14 = new Undergraduate("Martin Brave", 12345, "dt249",
                74, true, ArrayOfStudentMarks(), "Machine Learning", "manegament");

        Undergraduate SO15 = new Undergraduate("Martin Hill", 12345, "dt249",
                74, true, ArrayOfStudentMarks(), "Web Development", "manegament");

        Undergraduate SO16 = new Undergraduate("Martin Rourke", 12345, "dt249",
                74, true, ArrayOfStudentMarks(), "Software engineering", "manegament");

        Undergraduate SO17 = new Undergraduate("Martin Mathew", 12345, "dt249",
                74, true, ArrayOfStudentMarks(), "Software engineering", "manegament");

        Undergraduate SO18 = new Undergraduate("Martin Oraile", 12345, "dt249",
                74, true, ArrayOfStudentMarks(), "Machine Learning", "manegament");

        Undergraduate SO19 = new Undergraduate("Martin Jordan", 12345, "dt249",
                74, true, ArrayOfStudentMarks(), "Machine Learning", "manegament");

        Undergraduate SO20 = new Undergraduate("Martin Lennon", 12345, "dt249",
                74, true, ArrayOfStudentMarks(), "Machine Learning", "manegament");

        ArrayList<Undergraduate> list = new ArrayList<>();

        list.add(SO1);
        list.add(SO2);
        list.add(SO3);
        list.add(SO4);
        list.add(SO5);
        list.add(SO6);
        list.add(SO7);
        list.add(SO8);
        list.add(SO9);
        list.add(SO10);
        list.add(SO11);
        list.add(SO12);
        list.add(SO13);
        list.add(SO14);
        list.add(SO15);
        list.add(SO16);
        list.add(SO17);
        list.add(SO18);
        list.add(SO19);
        list.add(SO20);

        ArrayList overall = highestGrade(list);
        System.out.println("Studen wit highest grade overall is :" + overall.get(19));
        findSameStream(list);
        for (Undergraduate b : list){
            b.warning();
        }
        }

    public static void findSameStream(ArrayList<Undergraduate> x){
        // this method will take in list of Undergraduate and with switch command
        // make 4 list of possible streams
        ArrayList<Undergraduate> i = new ArrayList<>();
        ArrayList<Undergraduate> j = new ArrayList<>();
        ArrayList<Undergraduate> k = new ArrayList<>();
        ArrayList<Undergraduate> l = new ArrayList<>();
        for (Undergraduate b : x){
            String stream = b.getChosenStream();
            switch(stream){
                case "Networks":
                    i.add(b);
                     break;
                case "Software engineering":
                    j.add(b);
                    break;
                case "Machine Learning":
                    k.add(b);
                    break;
                case "Web Development":
                    l.add(b);
                    break;
                default:
                    break;
            }


        }
        ArrayList ib = highestGrade(i);
        System.out.println("highestGrade "+ ib.get(4)+ " "+i.get(4).getName()+ " "+i.get(4).getChosenStream());

        ArrayList jb = highestGrade(j);
        System.out.println("highestGrade "+jb.get(4)+ " "+j.get(4).getName()+ " "+j.get(4).getChosenStream());

        ArrayList kb = highestGrade(k);
        System.out.println("highestGrade "+kb.get(4)+ " "+k.get(4).getName()+ " "+k.get(4).getChosenStream());

        ArrayList lb = highestGrade(l);
        System.out.println("highestGrade "+lb.get(4)+ " "+l.get(4).getName()+ " "+ l.get(4).getChosenStream());


    }

    public static ArrayList<Integer> highestGrade(ArrayList<Undergraduate> x) {
        // this method will sort objects
        // in ascending order so whne we return list
        // highest grade will be with object on last position of array

        ArrayList<Integer> b = new ArrayList<>();
        for(Undergraduate a : x){
            b.add(a.calculateGradeAvreage(ArrayOfStudentMarks()));
        }
        Collections.sort(b);

        return b;
    }
    public static ArrayList<Integer> ArrayOfStudentMarks() {
        // this is method to create arraylist and assign random integers to ten places in array
        // it represents student mark
        ArrayList<Integer> studentMarks = new ArrayList<Integer>();
        Random rand = new Random();


        for (int k = 0; k < 10; k++) {
            studentMarks.add(rand.nextInt(100));
        }

        return studentMarks;
    }


}
