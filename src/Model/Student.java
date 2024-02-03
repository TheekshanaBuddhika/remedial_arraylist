package Model;

public class Student {

    private String id;
    private int age;
    private double dbm;
    private double prf;

    public Student() {
    }

    public Student(String id, int age, double dbm, double prf) {
        this.id = id;
        this.age = age;
        this.dbm = dbm;
        this.prf = prf;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getDbm() {
        return dbm;
    }

    public void setDbm(double dbm) {
        this.dbm = dbm;
    }

    public double getPrf() {
        return prf;
    }

    public void setPrf(double prf) {
        this.prf = prf;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", dbm=" + dbm +
                ", prf=" + prf +
                '}';
    }
}
