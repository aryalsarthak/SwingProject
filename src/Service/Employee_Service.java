package Service;

import java.util.List;

import Model.Employee;

public interface Employee_Service {
	
	boolean addEmployee(Employee emp);
	
	boolean deleteEmployee(int id);
	
	boolean updateEmployee(Employee emp);
	
	Employee getEmpById(int id);
	
	List<Employee> getAllEmployee();
	
	List<Employee> searchEmployee(String searchdata);
}
