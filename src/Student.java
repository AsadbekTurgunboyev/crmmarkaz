import java.util.List;

public class Student {


    public void showAllStudent(List<StudentModel> list){
        if (list.isEmpty()){
            System.out.println("Malumot yoq");
        }else {


            int i = 1;
            int max = getMaxLn(list);
            int guruhMax = getMaxGr(list);
            int tolovMax = getMaxGr(list);

            if (tolovMax == -1) {
                System.out.println("Barcha to'lagan");
            } else {
                for (StudentModel model : list) {
                    System.out.println(i + ". " + getNameWithSpace(model.getName() + " " + model.getSurname(), max) + " | "
                            + model.getPhone() + " | " + getNameWithSpace(model.getGuruh(), guruhMax) + " | " + getNameWithSpace(String.valueOf(model.getTolov()), tolovMax) + " so'm");
                    i++;
                }
            }
        }
    }

    public String getNameWithSpace(String name, int max){
        String fullname = name ;
        int lengFull = fullname.length();
        int space = max - lengFull;
        for (int i = 0 ; i < space; i ++){
            fullname +=" ";
        }

        return fullname;

    }


    public int getMaxLn(List<StudentModel> list){

        String full = list.get(0).getName() + " " + list.get(0).getSurname();
        int  max = full.length();

        for (int i = 0; i < list.size(); i++){
            String f = list.get(i).getName() + " " + list.get(i).getSurname();
            if (f.length() > max){
                max = f.length();
            }
        }
        return max;
    }
    public int getMaxGr(List<StudentModel> list){

        String full = list.get(0).getGuruh();
        int  max = full.length();

        for (int i = 0; i < list.size(); i++){
            String f = list.get(i).getGuruh();
            if (f.length() > max){
                max = f.length();
            }
        }
        return max;
    }
    public int getMaxTl(List<StudentModel> list){
        String full = String.valueOf(list.get(0).getTolov());
        int  max = full.length();

        for (int i = 0; i < list.size(); i++){
            String f = list.get(i).getGuruh();
            if (f.length() > max){
                max = f.length();
            }
        }
        return max;
    }
}
