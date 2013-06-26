package org.koushik.javabrains.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity 
@Table (name="USER_DETAILS")
public class UserDetails {
	
	@Id @GeneratedValue
	private int userID;
	private String userName;
	//private Date joinedDate;
	
	
	@ElementCollection (fetch=FetchType.EAGER)
	@JoinTable (name="USER_ADDRESS", joinColumns=@JoinColumn(name="USER_ID"))
	private Collection <Address> listOfAddresses = new ArrayList<Address>();
	
	
	
	
	
	/*@ElementCollection
	@JoinTable (name="USER_ADDRESS", joinColumns=@JoinColumn(name="USER_ID"))
	@GenericGenerator(name = "hilo-gen", strategy = "hilo")
	@CollectionId(columns = { @Column (name="ADDRESS_ID") }, generator = "hilo-gen", type = @Type(type="long")) 
	private Collection <Address> listOfAddresses = new ArrayList<Address>();*/
	
	
	/*
	@ElementCollection
	@JoinTable (name="USER_ADDRESS", joinColumns=@JoinColumn(name="USER_ID"))
	private Set <Address> listOfAddresses = new HashSet();
	
	public Set<Address> getListOfAddresses() {
		return listOfAddresses;
	}
	public void setListOfAddresses(Set<Address> listOfAddresses) {
		this.listOfAddresses = listOfAddresses;
	}
	*/
	/*
	@Embedded
	@AttributeOverrides({
		@AttributeOverride (name="street", column=@Column (name="HOME_STREET_NAME")),
		@AttributeOverride (name="city", column=@Column (name="HOME_CITY_NAME")),
		@AttributeOverride (name="state", column=@Column (name="HOME_STATE_NAME")),
		@AttributeOverride (name="pincode", column=@Column (name="HOME_PIN_CODE"))})
	private Address homeAddress;
	
	@Embedded
	private Address officeAddress;
	*/
	
	//private String description;
	
	public Collection<Address> getListOfAddresses() {
		return listOfAddresses;
	}
	public void setListOfAddresses(Collection<Address> listOfAddresses) {
		this.listOfAddresses = listOfAddresses;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	/*
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	*/
	public String getUserName() {
		return userName + " from getter";
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/*
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	*/

	/*
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	*/
	

}
