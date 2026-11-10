import java.io.File;
import java.util.*;

void main() throws IOException {
    //Scenerio: User will provide input add the data will be stored in objects, then stored in the file.
    //Using Scanner and BufferedWriter
    Scanner sc = new Scanner(System.in);
    String Path ="C:\\Users\\ender\\IdeaProjects\\FIleIO_Exercise\\src\\Data.txt";
    File fil = new File(Path);

    Student [] StudentInfo = new Student[5];
    String name;
    double gpa;
    Student s;
    FileWriter fw = new FileWriter(fil);

    try{
        for(int i = 0; i<5; i++){
                //Adding to an array
                IO.println("Enter Student name");
                name = sc.next();

                IO.println("Enter gpa");
                gpa = sc.nextDouble();

                s = new Student(name,gpa);
                StudentInfo[i]=s;
        }
        for(int i = 0; i<5; i++){
            fw.write(String.valueOf(StudentInfo[i]));
            fw.write("\n");
        }
        fw.close();

        } catch (IOException e) {
        throw new RuntimeException(e);
    }


    }

