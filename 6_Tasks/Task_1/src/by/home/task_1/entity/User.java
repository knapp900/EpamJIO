package by.home.task_1.entity;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

	private static final long serialVersionUID = -8388958870299719257L;

	private String login;

	private String password;

	private String email;

	private Role role;

	public User() {
		
		super();
	}

	public User(String name, String pasword) {
		super();
		this.login = name;
		this.password = pasword;
	}

	public User(String name, String email, Role role) {
		super();
		this.login = name;
		this.email = email;
		this.role = role;
	}

	public User(String name, String pasword, String email, Role role) {
		super();
		this.login = name;
		this.password = pasword;
		this.role = role;
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPasword() {
		return password;
	}

	public void setPasword(String pasword) {
		this.password = pasword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, login, password, role);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && Objects.equals(login, other.login)
				&& Objects.equals(password, other.password) && Objects.equals(role, other.role);
	}

	@Override
	public String toString() {
		return "login=" + login + " password=" + password + " email=" + email + " role=" + role ;
	}

}
