import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    static List<StudentModel> list = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("CRM dasturiga xush kelibsiz!");
        setList();
        Student student = new Student();
        student.showAllStudent(list);
        System.out.println();
        System.out.println("Android -> 1\nWeb ->2\nTo'lov qilganlar ->3\nTo'lov qilmaganlar ->4");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a) {
            case 1 -> student.showAllStudent(getSpecificItem("Android", list));
            case 2 -> student.showAllStudent(getSpecificItem("Web", list));
            case 3 -> {
                student.showAllStudent(getSpecificItem("Android", getSpecificPrice(0)));
                student.showAllStudent(getSpecificItem("Web", getSpecificPrice(0)));
            }
            case 4 -> {
                student.showAllStudent(getSpecificItem("Android", getSpecificPrice(1)));
                student.showAllStudent(getSpecificItem("Web", getSpecificPrice(1)));
            }
        }


    }

    private static void setList() {
        list.add(new StudentModel("Nozimjon","Nuraliyev","+998916600109",600000,"Android"));
        list.add(new StudentModel("Umidjon","Fozilov","+998990377668",600000,"Web"));
        list.add(new StudentModel("Qudratillo","Shukuriddinov","+998905626063",600000,"Android"));
        list.add(new StudentModel("Dilyora","Mamurjonova","+998911222542",600000,"Web"));
        list.add(new StudentModel("MuhammadMirzo","Abdupattoyev","+998907854434",600000,"Web"));
        list.add(new StudentModel("Asadullo","Yahyoxonov","+998770047779",600000,"Web"));
        list.add(new StudentModel("Hayitbek","Rahmonov","+998770047779",600000,"Android"));

    }


    private static List<StudentModel> getSpecificItem(String item, List<StudentModel> list){
        List<StudentModel> newList = new ArrayList<>();
        for(StudentModel model : list){
            if (model.getGuruh().equals(item)){
                newList.add(model);
            }
        }
        return newList;
    }

    private static List<StudentModel> getSpecificPrice(int p){
        List<StudentModel> tolovList = new ArrayList<>();
        List<StudentModel> noTolovList = new ArrayList<>();
        for(StudentModel model : list){
            if (model.getTolov() == 600000){
                tolovList.add(model);
            }else {
                noTolovList.add(model);
            }
        }
       if (p == 0){
           return tolovList;
       }else {
           return noTolovList;
       }
    }


}
