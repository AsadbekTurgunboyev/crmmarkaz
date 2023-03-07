public class StudentModel {
    String name;
    String surname;
    String phone;
    int tolov;
    String guruh;

    public StudentModel(String name, String surname, String phone, int tolov, String guruh) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.tolov = tolov;
        this.guruh = guruh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getTolov() {
        return tolov;
    }

    public void setTolov(int tolov) {
        this.tolov = tolov;
    }

    public String getGuruh() {
        return guruh;
    }

    public void setGuruh(String guruh) {
        this.guruh = guruh;
    }
}
