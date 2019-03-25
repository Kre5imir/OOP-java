//Author Kresimir Tuk
import java.util.ArrayList;
import java.util.Random;
// this is subclass of Student class it has a constuctor of Student class and assigned two methods
//which will return initials and or display warning about student state of grade
public class Undergraduate extends Student {

    String choosenStream;
    String finalProject;
    int howManyStudents = 0;

    public Undergraduate(){

    }
    public Undergraduate(String customName, int customStudentNumber, String customCourse, int customCurrentYear, boolean customRegStatus,
                         ArrayList<Integer> customMarks, String customChoosenStream, String customFinalProject){

        super(customName,customStudentNumber,customCourse,customCurrentYear,customRegStatus,customMarks);
        this.choosenStream = customChoosenStream;
        this.finalProject = customFinalProject;
        howManyStudents++;
    }
    //seters
    public String getChosenStream() {
        return this.choosenStream;

    }  /*Random rand = new Random();
        int i = 0;

        ArrayList<String> stream = new ArrayList<>();
        stream.add("network");
        stream.add("project management");
        stream.add("programming");

        return this.choosenStream = stream.get(rand.nextInt()*3);
    */
    // this method could take three streams randomly and assign them to student
    // so we could set choosen stream to group of students and compare them if they have
    // same stream compare the grades and return highest grade in each stream
    public String setChoosenStream(String newChoosenStream){
        return this.choosenStream = newChoosenStream;
    }
    public void setFinalProject(String newFinalProject){ finalProject = newFinalProject; }
    //geters


    public String getFinalProject(){
        return this.finalProject;
    }
    public int getHowManyStudents(){
        return this.howManyStudents;
    }
    //methods
    public String getStudenInitials(){
        String name = this.getName();
        String initials = Character.toString(name.charAt(0));
        int length = name.length();

        for (int i = 0; i < length -1; i ++){
            if (name.charAt(i) == ' '){
                initials += name.charAt(i + 1);
            }
        }
        return initials;
    }
    public void warning(ArrayList<Undergraduate> x){

        if(calculateGradeAvreage(this.) < 50){
            System.out.println(this.getStudenInitials()+" student has mark " + assignGrade());
        }
    }
}
