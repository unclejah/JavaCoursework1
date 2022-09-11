public class Main {
    public static void main(String[] args) {
    EmployeeBook empBook = new EmployeeBook();
    empBook.getAll();
    empBook.summSallary();
    empBook.minMax();
    empBook.addPercentage(10);
    empBook.getByDepartment(10, 2);
    empBook.getAllMinMax(15);
    empBook.dellPeople("", 3);
    empBook.addPeople("asdfsadf", 3, 234);
    empBook.getAll();
    empBook.changePeopleDepartment("asdfsadf",4);
    empBook.getAll();
    empBook.changePeopleSallary("asdfsadf",4);
    empBook.getAllSortDepartment();
    }

}