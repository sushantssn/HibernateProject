package MyModelClasses.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
//This is Model class.We have to include it in the cfg file to annotated entity class.
@Entity 
@NamedQuery(name = "Employee.byid", query = "from Employee where id = ?")
@NamedNativeQuery(name="Employee.byName", query = " select * from SushantEmployee where name = :Empname",resultClass =Employee.class)
@Table(name = "SushantEmployee")
public class Employee {
	@Id
	@Column(name = "Emp_Id")
	@GeneratedValue(strategy =GenerationType.AUTO)//Hibernate will do the auto increment of its sequence and maintain.
	private int EmpID ;
	@Column (columnDefinition = "varchar2(50)")
	private String EmpName;
	@Column (columnDefinition = "varchar2(50)")
	private String FavPlayer;
	/*@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "Street", column=@Column(name = "Home_Street")),
		@AttributeOverride(name = "City", column=@Column(name = "Home_City")),
		@AttributeOverride(name = "State", column=@Column(name = "Home_State")),
		@AttributeOverride(name = "Pincode", column=@Column(name = "Home_PinCode"))
	})
	 private Address home_address;
	
	 private Address office_address;*/
	/*
	@ElementCollection(fetch=FetchType.EAGER)//This will ensure that what ever are the values of all member variables of the class 
	//are fetched at session.get method of object initialization.Lazy loading on the other hand fetches only first level member variables and not the second level like list of object.
	//by default we have lazy loading in hibernate but if we want we can change to Eager by declaring the fetch type.
	
	@JoinTable(name="Employee_Address")//Change the name of the table of collection storing classes.
	@GenericGenerator(name="hilo-gen",strategy = "hilo")
	@CollectionId(columns = { @Column(name = "Address_id") }, generator = "hilo-gen", type = @Type(type="long"))
	private Collection<Address> listofAddress = new ArrayList<Address>();
	
	public void setListofAddress(Collection<Address> listofAddress) {
		this.listofAddress = listofAddress;
	}
	public Collection<Address> getListofAddress() {
		return listofAddress;
	}
	/*public Address getHome_address() {
		return home_address;
	}
	public void setHome_address(Address home_address) {
		this.home_address = home_address;
	}
	public Address getOffice_address() {
		return office_address;
	}
	public void setOffice_address(Address office_address) {
		this.office_address = office_address;
	}*/
	/*
	@OneToOne //In One to one we have normal entity declaration of the bank class 
	private Bank bank ;
	
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}*/
	/*@OneToMany(mappedBy = "employee")//When it comes to OneToMany we have a collection type of entity declaration in the Employee class such that
	//when we make an object of Employee class we can store more than one Bank objects. Hence it is a One to many relationship
	//This is done by hibernate for you by creating a seperate mapping table where PK of Parent Entity and PK of Child Entity is stored.
	//we implement this by @OneToMany tag. We declare this at the declaration of the Bank Entity.@JoinTable defines the properties of the intermediate table created
	//to maintain the OneToMany relation mapping. In this tag we can make change to the table name column name by the tags mentioned.
	//If we dnt want an extra table to keep the mapping of OneToMany we can use attribute of (mappedBy = "employee") where it tells that there is an employee object declaration inside Bank which will me mapped by that id.
	@JoinTable(name="Employee_Bank",joinColumns=@JoinColumn(name="Emp_Bank_Id"),inverseJoinColumns=@JoinColumn(name="Bank_Id"))
	*/
	/*@ManyToMany
	private Collection <Bank> bank = new ArrayList<Bank>();
	
	public Collection<Bank> getBank() {
		return bank;
	}
	public void setBank(Collection<Bank> bank) {
		this.bank = bank;
	}
	public int getEmpID() {
		return EmpID;
	}
	/*public Set<Address> getListofAddress() {
		return listofAddress;
	}
	public void setListofAddress(Set<Address> listofAddress) {
		this.listofAddress = listofAddress;
	}*/
	public void setEmpID(int empID) {
		EmpID = empID;
	}
	public String getFavPlayer() {
		return FavPlayer;
	}
	public void setFavPlayer(String favPlayer) {
		FavPlayer = favPlayer;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}	

}
