package com.Login_Reg.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;





@Entity
@Table(name = "User", uniqueConstraints = @UniqueConstraint(columnNames = "Email"))
@Getter
@Setter
@AllArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name="User_id", updatable = false, nullable = false)
	private String id; // private Long id;
	
	
	@Column(name = "Name")
	private String name;

	@Column(name = "Email")
	private String email;

	@JsonIgnore
	private String password;

	@Column(name = "Address")
	private String address;
	
//	@OneToMany(mappedBy = "user")
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "User_id"),
	inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "Role_ID"))
	private Set<Role> roles;
	
	public User() {
	}

	public String getPassword() {
	    return this.password;
	}

	
}
