import com.kodtodya.practice.inheritance.service.ManagerService;

public class ManagerInheritanceDemo {
    public static void main(String[] args) {
        ManagerService managerService = new ManagerService();

        managerService.speaks(); // grand-parent level method from PersonService is accessible
        managerService.walks(); // grand-parent level method from PersonService is accessible

        managerService.work(); // parent level method from EmployeeService is accessible

        managerService.manages(); // own method too is accessible
    }
}