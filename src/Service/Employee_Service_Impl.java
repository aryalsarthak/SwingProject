package Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import DB.Db;
import Model.Employee;
import netscape.javascript.JSException;
public class Employee_Service_Impl implements Employee_Service {

	private static final String DB = null;

	@Override
	public boolean addEmployee(Employee emp) {
		
		String insert = "insert into employee1(fname,lname,gender,phone,email,company,post,department,salary,image name,age,country,city,state,zip,dob,Service,Qualification,joinDate)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement pstm = Db.getDB().prepareStatement(insert);
			
			pstm.setString(1, emp.getFname());
			pstm.setString(2, emp.getLname());
			pstm.setString(3, emp.getGender());
			pstm.setString(4, emp.getPhone());
			pstm.setString(5, emp.getEmail());
			pstm.setString(6, emp.getCompany());
			pstm.setString(7, emp.getPost());
			pstm.setString(8, emp.getDepartment());
			pstm.setInt(9, emp.getSalary());
			pstm.setInt(10, emp.getAge());
			pstm.setString(11, emp.getCountry());
			pstm.setString(12, emp.getCity());
			pstm.setString(13, emp.getState());
			pstm.setString(14, emp.getZip());
			pstm.setDate(15, emp.getDob());
			pstm.setString(16, emp.getService());
			pstm.setString(17, emp.getQualification());
			pstm.setDate(18, emp.getJoinDate());

			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		String delete="delete from employee1 where id="+id;
		
		try {
			Statement stm=Db.getDB().createStatement();
			stm.execute(delete);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		
String insert = "update  employee1 set fname=?,lname=?,gender=?,phone=?,email=?,company=?,post=?,department=?,salary=?,age=?,country=?,city=?,state=?,zip=?,dob=?,Service=?,Qualification=?,joinDate=? where id=?";
		
		try {
			PreparedStatement pstm = Db.getDB().prepareStatement(insert);
			
			pstm.setString(1, emp.getFname());
			pstm.setString(2, emp.getLname());
			pstm.setString(3, emp.getGender());
			pstm.setString(4, emp.getPhone());
			pstm.setString(5, emp.getEmail());
			pstm.setString(6, emp.getCompany());
			pstm.setString(7, emp.getPost());
			pstm.setString(8, emp.getDepartment());
			pstm.setInt(9, emp.getSalary());
			pstm.setInt(10, emp.getAge());
			pstm.setString(11, emp.getCountry());
			pstm.setString(12, emp.getCity());
			pstm.setString(13, emp.getState());
			pstm.setString(14, emp.getZip());
			pstm.setDate(15, emp.getDob());
			pstm.setString(16, emp.getService());
			pstm.setString(17, emp.getQualification());
			pstm.setDate(18, emp.getJoinDate());
			pstm.setInt(19, emp.getId());
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public Employee getEmpById(int id) {
		Employee emp= new Employee();
		String sql="select * from employee1 where id="+id;
		try {
			Statement stm = Db.getDB().createStatement();
			ResultSet rs= stm.executeQuery(sql);
			
			if(rs.next()) {
				emp.setId(rs.getInt("ID"));
				emp.setFname(rs.getString("Fname"));
				emp.setLname(rs.getString("Lname"));
 			emp.setCity(rs.getString("City"));
//				emp.setEmail(res.getString("Email"));
				emp.setPhone(rs.getString("Phone"));
				emp.setGender(rs.getString("Gender"));
				emp.setDob(rs.getDate("DOB"));
				emp.setCountry(rs.getString("Country"));
				emp.setState(rs.getString("state"));
				emp.setDepartment(rs.getString("Department"));
				emp.setPost(rs.getString("Post"));
				emp.setSalary(rs.getInt("Salary"));
				emp.setAge(rs.getInt("Age"));
				emp.setImageName(rs.getString("imageName"));
				emp.setJoinDate(rs.getDate("JoinDate"));
				
			}	
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return emp;
	}
	

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> emplist = new ArrayList<>();
		
		String show = "Select * from employee1";
		
		try {
			Statement stm = Db.getDB().createStatement();
			
			ResultSet res = stm.executeQuery(show);
			
			while(res.next()) {
				Employee emp = new Employee();
				
				emp.setId(res.getInt("ID"));
				emp.setFname(res.getString("Fname"));
				emp.setLname(res.getString("Lname"));
//				emp.setCity(res.getString("City"));
//				emp.setEmail(res.getString("Email"));
//				emp.setPhone(res.getString("Phone"));
//				emp.setGender(res.getString("Gender"));
//				emp.setDob(res.getDate("DOB"));
//				emp.setCompany(res.getString("Company"));
//				emp.setService(res.getString("Service"));
//				emp.setDepartment(res.getString("Department"));
				emp.setPost(res.getString("Post"));
//				emp.setSalary(res.getInt("Salary"));
				emp.setAge(res.getInt("Age"));
//				emp.setJoinDate(res.getDate("JoinDate"));
				
				emplist.add(emp);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return emplist;
	}

	@Override
	public List<Employee> searchEmployee(String searchdata) {
List<Employee> empList=new ArrayList<>();
		


String show = "Select * from employee1 where'%"+searchdata+"%'OR city like '%"+searchdata+"%'  ";

try {
	Statement stm = Db.getDB().createStatement();
	
	ResultSet res = stm.executeQuery(show);
	
	while(res.next()) {
		Employee emp = new Employee();
		
		emp.setId(res.getInt("ID"));
		emp.setFname(res.getString("Fname"));
		emp.setLname(res.getString("Lname"));
//		emp.setCity(res.getString("City"));
//		emp.setEmail(res.getString("Email"));
//		emp.setPhone(res.getString("Phone"));
//		emp.setGender(res.getString("Gender"));
//		emp.setDob(res.getDate("DOB"));
//		emp.setCompany(res.getString("Company"));
//		emp.setService(res.getString("Service"));
//		emp.setDepartment(res.getString("Department"));
		emp.setPost(res.getString("Post"));
//		emp.setSalary(res.getInt("Salary"));
		emp.setAge(res.getInt("Age"));
//		emp.setJoinDate(res.getDate("JoinDate"));
		
		empList.add(emp);
		
	}
	
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



return empList;
	
		
	
	}


}