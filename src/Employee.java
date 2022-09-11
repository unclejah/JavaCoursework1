public class Employee {
    private int id = 0;
    private static int idCounter = 1;
    private String fio = "";
    private int department;
    private double sallary;
    Employee(String fio, int department, double sallary){
        if(department <1 || department>5) throw new RuntimeException("wrong department 1-5");
        this.id = idCounter++;
        this.fio = fio;
        this.department = department;
        this.sallary = sallary;

    }
    public int getId(){
        return id;
    }

    public String getFio() {
        return fio;
    }

    public int getDepartment() {
        return department;
    }

    public double getSallary() {
        return sallary;
    }

    public void setDepartment(int department) {
        if(department <1 || department>5) throw new RuntimeException("wrong department 1-5");
        this.department = department;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }
}
