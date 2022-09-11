public class EmployeeBook {
    private Employee[] empArr = {new Employee("sotrudnik1", 1, 10.0d), new Employee("sotrudnik2", 2, 20.0d),
    new Employee("sotrudnik3", 3, 300.0d), new Employee("sotrudnik4", 4, 40.0d),
    new Employee("sotrudnik5", 5, 50.0d), new Employee("sotrudnik6", 1, 6.0d),
    new Employee("sotrudnik7", 2, 70.0d), new Employee("sotrudnik8", 3, 80.0d),
    new Employee("sotrudnik9", 2, 90.0d), new Employee("sotrudnik10", 5, 100.0d)};

    public void getAll(){

        for (Employee emp : empArr){
            if(emp ==null)continue;
            System.out.println(emp.getId()+" "+emp.getFio()+ " "+emp.getDepartment()+" "+emp.getSallary());
        }
    }
    public void summSallary(){
        double sum= 0.0d;
        for (Employee emp : empArr){
            if(emp == null) continue;
            sum = sum + emp.getSallary();
        }
        System.out.println("summ "+sum);
        System.out.println("srednee "+sum / empArr.length);
    }
    private void summSallary2(Employee[] empArr){
        double sum= 0.0d;
        for (Employee emp : empArr){
            if(emp == null) continue;
            sum = sum + emp.getSallary();
        }
        System.out.println("summ "+sum);
        System.out.println("srednee "+sum / empArr.length);
    }
    public void minMax(){
        double min= empArr[0].getSallary();
        double max= empArr[0].getSallary();
        for (Employee emp : empArr){
            if(emp == null) continue;
            for (Employee emp2 : empArr){
                if(emp2 == null) continue;
                if(emp.getSallary() > emp2.getSallary() && max <emp.getSallary()) {
                    max = emp.getSallary();
                } else if (emp.getSallary() < emp2.getSallary() && min > emp.getSallary()) {
                    min = emp.getSallary();
                }
            }
        }
        System.out.println("max "+max);
        System.out.println("min "+min);
    }
    private void minMax2(Employee[] empArr){
        double min= empArr[0].getSallary();
        double max= empArr[0].getSallary();
        for (Employee emp : empArr){
            if(emp == null) continue;
            for (Employee emp2 : empArr){
                if(emp2 == null) continue;
                if(emp.getSallary() > emp2.getSallary() && max <emp.getSallary()) {
                    max = emp.getSallary();
                } else if (emp.getSallary() < emp2.getSallary() && min > emp.getSallary()) {
                    min = emp.getSallary();
                }
            }
        }
        System.out.println("max "+max);
        System.out.println("min "+min);
    }
    public void addPercentage(double percentage){
        for (Employee emp : empArr){
            emp.setSallary(emp.getSallary() + (emp.getSallary() * percentage /100));
            System.out.println(emp.getFio()+" "+emp.getSallary());
        }

    }
    private void addPercentage2(Employee[] empArr,double percentage){
        for (Employee emp : empArr){
            emp.setSallary(emp.getSallary() + (emp.getSallary() * percentage /100));
            System.out.println(emp.getFio()+" "+emp.getSallary());
        }

    }
    public void getByDepartment(double percentage, int department){
        System.out.println("by department");
        int countPeople = 0;
        for (Employee emp : empArr){
            if(emp == null) continue;
            if(emp.getDepartment() == department){
                countPeople++;
            }
        }
        Employee[] empArrDepartment = new Employee[countPeople];
        int pos =0;
        for (Employee emp : empArr){
            if(emp.getDepartment() == department){
                empArrDepartment[pos] = emp;
                pos++;
            }
        }
        minMax2(empArrDepartment);
        summSallary2(empArrDepartment);
        addPercentage2(empArrDepartment,10);
        for (Employee emp : empArrDepartment){
            System.out.println(emp.getId()+" "+emp.getFio()+ " "+emp.getSallary());
        }
        System.out.println("by department");
    }
    public void getAllMinMax(double num){
        for (Employee emp : empArr){
            if(emp == null) continue;
            if(emp.getSallary() < num){
                System.out.println("min "+emp.getId()+" "+emp.getFio()+ " "+emp.getSallary());
            }
        }
        for (Employee emp : empArr){
            if(emp == null) continue;
            if(emp.getSallary() >= num){
                System.out.println("max "+emp.getId()+" "+emp.getFio()+ " "+emp.getSallary());
            }
        }
    }
    public void dellPeople(String fio, int id){
        boolean find = false;
        for(int i =0; i<empArr.length; i++){
            if(empArr[i] == null) continue;
            if(fio.equalsIgnoreCase(empArr[i].getFio()) && id == empArr[i].getId()){
                empArr[i] = null;
                find=true;
                break;
            }
        }
        if(!find){
            for(int i =0; i<empArr.length; i++){
                if(empArr[i] == null) continue;
                if(id == empArr[i].getId()){
                    empArr[i] = null;
                    break;
                }
            }
        }
    }
    public void addPeople(String fio, int department, double sallary){
        for(int i =0; i<empArr.length; i++){
            if(empArr[i] == null) {
                empArr[i] = new Employee(fio,department,sallary);
                break;
            }
        }
    }
    public void changePeopleDepartment(String fio, int department){
        for(int i =0; i<empArr.length; i++){
            if(empArr[i] == null) continue;
            if(fio.equalsIgnoreCase(empArr[i].getFio()) ){
                empArr[i].setDepartment(department);
                break;
            }
        }
    }
    public void changePeopleSallary(String fio, double sallary){
        for(int i =0; i<empArr.length; i++){
            if(empArr[i] == null) continue;
            if(fio.equalsIgnoreCase(empArr[i].getFio()) ){
                empArr[i].setSallary(sallary);
                break;
            }
        }
    }
    public void getAllSortDepartment(){
        for(int i = empArr.length-1 ; i > 0 ; i--){
            if(empArr[i] ==null) continue;
            for(int j = 0 ; j < i ; j++){
                if(empArr[j] ==null) continue;
            if( empArr[j].getDepartment() > empArr[j+1].getDepartment() ){
                Employee tmp = empArr[j];
                empArr[j] = empArr[j+1];
                empArr[j+1] = tmp;
            }
        }
    }
        for (Employee emp : empArr){
            if(emp ==null)continue;
            System.out.println(emp.getId()+" "+emp.getFio()+ " "+emp.getDepartment()+" "+emp.getSallary());
        }
    }
}
