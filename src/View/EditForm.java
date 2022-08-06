package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import Model.Employee;
import Service.Employee_Service;
import Service.Employee_Service_Impl;

import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EditForm extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JTextField fname;
	private JLabel lblNewLabel_1;
	private JComboBox country;
	private JLabel lblNewLabel_2;
	private JTextField email;
	private JLabel lblNewLabel_3;
	private JTextField company;
	private JLabel lblNewLabel_4;
	private JTextField department;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField lname;
	private JLabel lblNewLabel_7;
	private JComboBox state;
	private JLabel lblNewLabel_8;
	private JTextField city;
	private JLabel lblNewLabel_9;
	private JTextField phone;
	private JLabel lblNewLabel_10;
	private JDateChooser dob;
	private JLabel lblNewLabel_11;
	private JRadioButton permanent;
	private JRadioButton contract;
	private JLabel lblNewLabel_12;
	private JTextField salary;
	private JLabel lblNewLabel_13;
	private JComboBox post;
	private JLabel lblNewLabel_14;
	private JRadioButton male;
	private JRadioButton female;
	private JSeparator separator;
	private JButton update;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JLabel lblNewLabel_16;
	private JTextArea textArea;
	private JSeparator separator_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JDateChooser jd;
	private JComboBox statetxt;
	private JLabel lblNewLabel_17;
	private JTextField age;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JComboBox stat;
	private int eid=0;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditForm frame = new EditForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EditForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1267, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnNewButton());
		contentPane.add(getLblNewLabel());
		contentPane.add(getFname());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getCountry());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getEmail());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getCompany());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getDepartment());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getLname());
		contentPane.add(getLblNewLabel_7());
	//	contentPane.add(getState());
		contentPane.add(getLblNewLabel_8());
		contentPane.add(getCity());
		contentPane.add(getLblNewLabel_9());
		contentPane.add(getPhone());
		contentPane.add(getLblNewLabel_10());
		contentPane.add(getDob());
		contentPane.add(getLblNewLabel_11());
		contentPane.add(getPermanent());
		contentPane.add(getContract());
		contentPane.add(getLblNewLabel_12());
		contentPane.add(getSalary());
		contentPane.add(getLblNewLabel_13());
		contentPane.add(getPost());
		contentPane.add(getLblNewLabel_14());
		contentPane.add(getMale());
		contentPane.add(getFemale());
		contentPane.add(getSeparator());
		contentPane.add(getUpdate());
		contentPane.add(getBtnNewButton_4());
		contentPane.add(getBtnNewButton_5());
		contentPane.add(getBtnNewButton_6());
		contentPane.add(getBtnNewButton_7());
		contentPane.add(getLblNewLabel_16());
		contentPane.add(getTextArea());
		contentPane.add(getSeparator_1());
		contentPane.add(getJd());
		contentPane.add(getStatetxt());
		contentPane.add(getLblNewLabel_17());
		contentPane.add(getAge());
		contentPane.add(getStat());
	//	displayData();
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Update employee");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnNewButton.setBounds(216, 24, 303, 23);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("first name");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel.setBounds(20, 66, 95, 14);
		}
		return lblNewLabel;
	}
	private JTextField getFname() {
		if (fname == null) {
			fname = new JTextField();
			fname.setBounds(114, 65, 145, 20);
			fname.setColumns(10);
		}
		return fname;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("country");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_1.setBounds(20, 145, 67, 14);
		}
		return lblNewLabel_1;
	}
	private JComboBox getCountry() {
		if (country == null) {
			country = new JComboBox();
			country.setModel(new DefaultComboBoxModel(new String[] {"--country--", "nepal", "india", "china", "bhutan"}));
			country.setBounds(104, 142, 145, 22);
		}
		return country;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("email");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_2.setBounds(10, 210, 49, 14);
		}
		return lblNewLabel_2;
	}
	private JTextField getEmail() {
		if (email == null) {
			email = new JTextField();
			email.setBounds(104, 208, 145, 20);
			email.setColumns(10);
		}
		return email;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("company");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_3.setBounds(20, 235, 67, 33);
		}
		return lblNewLabel_3;
	}
	private JTextField getCompany() {
		if (company == null) {
			company = new JTextField();
			company.setBounds(123, 239, 136, 20);
			company.setColumns(10);
		}
		return company;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("department");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_4.setBounds(10, 343, 95, 14);
		}
		return lblNewLabel_4;
	}
	private JTextField getDepartment() {
		if (department == null) {
			department = new JTextField();
			department.setBounds(108, 337, 141, 20);
			department.setColumns(10);
		}
		return department;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("join date");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_5.setBounds(10, 411, 77, 14);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("Last name");
			lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_6.setBounds(349, 68, 95, 14);
		}
		return lblNewLabel_6;
	}
	private JTextField getLname() {
		if (lname == null) {
			lname = new JTextField();
			lname.setBounds(474, 65, 150, 20);
			lname.setColumns(10);
		}
		return lname;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("state");
			lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_7.setBounds(278, 146, 49, 14);
		}
		return lblNewLabel_7;
	}
	private JComboBox getstat() {
		if (stat == null) {
			stat = new JComboBox();
		
			stat.setBounds(359, 142, 67, 22);
		}
		return stat;
	}
	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("city");
			lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_8.setBounds(371, 211, 49, 14);
		}
		return lblNewLabel_8;
	}
	private JTextField getCity() {
		if (city == null) {
			city = new JTextField();
			city.setBounds(455, 208, 115, 20);
			city.setColumns(10);
		}
		return city;
	}
	private JLabel getLblNewLabel_9() {
		if (lblNewLabel_9 == null) {
			lblNewLabel_9 = new JLabel("phone");
			lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_9.setBounds(339, 260, 67, 14);
		}
		return lblNewLabel_9;
	}
	private JTextField getPhone() {
		if (phone == null) {
			phone = new JTextField();
			phone.setBounds(423, 257, 136, 20);
			phone.setColumns(10);
		}
		return phone;
	}
	private JLabel getLblNewLabel_10() {
		if (lblNewLabel_10 == null) {
			lblNewLabel_10 = new JLabel("date of birth");
			lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_10.setBounds(339, 340, 95, 14);
		}
		return lblNewLabel_10;
	}
	private JDateChooser getDob() {
		if (dob == null) {
			dob = new JDateChooser();
			dob.setBounds(445, 337, 74, 20);
		}
		return dob;
	}
	private JLabel getLblNewLabel_11() {
		if (lblNewLabel_11 == null) {
			lblNewLabel_11 = new JLabel("Service type");
			lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_11.setBounds(339, 413, 95, 14);
		}
		return lblNewLabel_11;
	}
	private JRadioButton getPermanent() {
		if (permanent == null) {
			permanent = new JRadioButton("permanent");
			buttonGroup_2.add(permanent);
			permanent.setBounds(459, 409, 111, 23);
		}
		return permanent;
	}
	private JRadioButton getContract() {
		if (contract == null) {
			contract = new JRadioButton("contract");
			buttonGroup_2.add(contract);
			contract.setBounds(608, 409, 111, 23);
		}
		return contract;
	}
	private JLabel getLblNewLabel_12() {
		if (lblNewLabel_12 == null) {
			lblNewLabel_12 = new JLabel("salary");
			lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_12.setBounds(10, 477, 49, 14);
		}
		return lblNewLabel_12;
	}
	private JTextField getSalary() {
		if (salary == null) {
			salary = new JTextField();
			salary.setBounds(104, 475, 135, 20);
			salary.setColumns(10);
		}
		return salary;
	}
	private JLabel getLblNewLabel_13() {
		if (lblNewLabel_13 == null) {
			lblNewLabel_13 = new JLabel("Post");
			lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_13.setBounds(345, 478, 49, 14);
		}
		return lblNewLabel_13;
	}
	private JComboBox getPost() {
		if (post == null) {
			post = new JComboBox();
			post.setModel(new DefaultComboBoxModel(new String[] {"-----post----", "HR", "Senior assistance", "jounior assistance", "manager"}));
			post.setBounds(423, 474, 115, 22);
		}
		return post;
	}
	private JLabel getLblNewLabel_14() {
		if (lblNewLabel_14 == null) {
			lblNewLabel_14 = new JLabel("Gender");
			lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_14.setBounds(28, 523, 49, 14);
		}
		return lblNewLabel_14;
	}
	private JRadioButton getMale() {
		if (male == null) {
			male = new JRadioButton("male");
			male.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
				}
			});
			buttonGroup_1.add(male);
			male.setBounds(98, 519, 111, 23);
		}
		return male;
	}
	private JRadioButton getFemale() {
		if (female == null) {
			female = new JRadioButton("female");
			female.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
				}
			});
			buttonGroup_1.add(female);
			female.setBounds(235, 519, 111, 23);
		}
		return female;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(0, 549, 1243, 2);
		}
		return separator;
	}
	private JButton getUpdate() {
		if (update == null) {
			update = new JButton("update");
			update.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Employee emp = new Employee();
					
					emp.setId(eid);
					emp.setFname(fname.getText());	
					emp.setLname(lname.getText());	
					emp.setCompany(company.getText());
					emp.setCountry(country.getSelectedItem().toString());
					emp.setDepartment(department.getText());
					emp.setEmail(email.getText());
					emp.setCity(city.getText());
					emp.setPhone(phone.getText());
					emp.setState(statetxt.getSelectedItem().toString());
					emp.setSalary(Integer.parseInt(salary.getText()));
					emp.setAge(Integer.parseInt(age.getText()));
					emp.setDob(new Date(dob.getDate().getTime()));
					emp.setJoinDate(new Date(jd.getDate().getTime()));
					
					if(male.isSelected()) {
						emp.setGender("male");
					}else if(female.isSelected()) {
						emp.setGender("female");
					}
					if(permanent.isSelected())
					{
						emp.setService("parmanent");
					}
					else {
						emp.setService("contract");
					}
					
					Employee_Service es = new Employee_Service_Impl();
					
					boolean response=es.updateEmployee(emp);
					if (response) {
						JOptionPane.showMessageDialog(null, "update sucess");
						new Employeeform().setVisible();
						dispose();
					}
					else {
						JOptionPane.showMessageDialog(null, "update failed");
						
					}
					
					
				}
			});
			update.setBackground(Color.CYAN);
			update.setFont(new Font("Tahoma", Font.BOLD, 15));
			update.setBounds(327, 519, 166, 23);
		}
		return update;
	}
	private JButton getBtnNewButton_4() {
		if (btnNewButton_4 == null) {
			btnNewButton_4 = new JButton("upload");
			btnNewButton_4.setBackground(Color.ORANGE);
			btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnNewButton_4.setBounds(944, 256, 89, 23);
		}
		return btnNewButton_4;
	}
	private JButton getBtnNewButton_5() {
		if (btnNewButton_5 == null) {
			btnNewButton_5 = new JButton("Export data");
			btnNewButton_5.setBackground(Color.MAGENTA);
			btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnNewButton_5.setBounds(950, 340, 145, 23);
		}
		return btnNewButton_5;
	}
	private JButton getBtnNewButton_6() {
		if (btnNewButton_6 == null) {
			btnNewButton_6 = new JButton("Print record");
			btnNewButton_6.setBackground(Color.GRAY);
			btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnNewButton_6.setBounds(950, 409, 154, 23);
		}
		return btnNewButton_6;
	}
	private JButton getBtnNewButton_7() {
		if (btnNewButton_7 == null) {
			btnNewButton_7 = new JButton("clear form");
			btnNewButton_7.setBackground(Color.PINK);
			btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnNewButton_7.setBounds(950, 486, 154, 23);
		}
		return btnNewButton_7;
	}
	private JLabel getLblNewLabel_16() {
		if (lblNewLabel_16 == null) {
			lblNewLabel_16 = new JLabel("photo");
			lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_16.setBounds(944, 84, 67, 14);
		}
		return lblNewLabel_16;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setBounds(887, 45, 154, 144);
		}
		return textArea;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setBounds(10, 634, 1243, 2);
		}
		return separator_1;
	}
	private JDateChooser getJd() {
		if (jd == null) {
			jd = new JDateChooser();
			jd.setBounds(101, 405, 108, 20);
		}
		return jd;
	}
	private JComboBox getStatetxt() {
		if (statetxt == null) {
			statetxt = new JComboBox();
			statetxt.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6"}));
			statetxt.setBounds(397, 142, 145, 22);
		}
		return statetxt;
	}
	private JLabel getLblNewLabel_17() {
		if (lblNewLabel_17 == null) {
			lblNewLabel_17 = new JLabel("age");
			lblNewLabel_17.setBounds(54, 305, 49, 14);
		}
		return lblNewLabel_17;
	}
	private JTextField getAge() {
		if (age == null) {
			age = new JTextField();
			age.setBounds(114, 302, 96, 20);
			age.setColumns(10);
		}
		return age;
	}
	private JComboBox getStat() {
		if (stat == null) {
			stat = new JComboBox();
			stat.setModel(new DefaultComboBoxModel(new String[] {"state", "1", "2", "3", "4", "5"}));
			stat.setBounds(350, 142, 94, 22);
		}
		return stat;
	}
	public void setDataForEdit(int id)
	{
		eid=id;
	
		Employee_Service es= new Employee_Service_Impl();
		Employee emp=es.getEmpById(id);
		fname.setText(emp.getFname());
		lname.setText(emp.getLname());
		age.setText(String.valueOf(emp.getAge()));
		salary.setText(String.valueOf(emp.getSalary()));
		jd.setDate(emp.getJoinDate());
		  
		  if(emp.getGender().equalsIgnoreCase("male"))
		  {
			  male.setSelected(true);
		  }else {
			  female.setSelected(true);
		  }
		  
		  dob.setDate(emp.getDob());
	}
}

 
