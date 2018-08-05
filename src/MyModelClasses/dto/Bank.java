package MyModelClasses.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Bank {
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int Bank_Id;
	private String Bank_Name;
	//@ManyToOne()
	//public Employee employee ;
	/*@ManyToMany
	public Collection<Employee> employee = new ArrayList<Employee>();
	/*public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}*/
	
	/*public void setEmployee(Collection<Employee> employee) {
		this.employee = employee;
	}
	public int getBank_Id() {
		return Bank_Id;
	}
	public Collection<Employee> getEmployee() {
		return employee;
	}
	public void setBank_Id(int bank_Id) {
		Bank_Id = bank_Id;
	}
	public String getBank_Name() {
		return Bank_Name;
	}
	public void setBank_Name(String bank_Name) {
		Bank_Name = bank_Name;
	}
	
	*/
	
	public String getBank_Name() {
		return Bank_Name;
	}
	public void setBank_Name(String bank_Name) {
		Bank_Name = bank_Name;
	}
	public int getBank_Id() {
		return Bank_Id;
	}
	public void setBank_Id(int bank_Id) {
		Bank_Id = bank_Id;
	}
	
}
