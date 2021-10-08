package demo_design_pattern.proxy_pattern.demo_1;

public class RealInternetAccess implements OfficeInternetAccess {

    private Employee employee;
    public RealInternetAccess(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void grantInternetAccess() {
        System.out.println("Internet Access granted for employee: " + employee.getName());
    }
}
