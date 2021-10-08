package demo_design_pattern.proxy_pattern.demo_1;

public class ProxyInternetAccess implements OfficeInternetAccess {

    private final Employee employee;
    private RealInternetAccess realAccess;

    public ProxyInternetAccess(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void grantInternetAccess() {
        if (checkAccessGranted()) {
            realAccess = new RealInternetAccess(employee);
            realAccess.grantInternetAccess();
        }
    }

    private boolean checkAccessGranted() {
        return employee.getRoleLevel() > 5;
    }
}
