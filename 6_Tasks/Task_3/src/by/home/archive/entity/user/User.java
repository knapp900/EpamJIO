package by.home.archive.entity.user;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class User implements Serializable {
	
	private static final long serialVersionUID = -4602448819807807377L;

	private String id;

    private String login;

    private String password;

    private Role role;

    public User() {
    	
    }

    public User(String login, String password) {
        this.id = UUID.randomUUID().toString();
        this.login = login;
        this.password = password;
        this.role = Role.USER;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

	@Override
	public int hashCode() {
		return Objects.hash(id, login, password, role);
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
		return Objects.equals(id, other.id) && Objects.equals(login, other.login)
				&& Objects.equals(password, other.password) && role == other.role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + " login=" + login + " password=" + password + " role=" + role + "]";
	}

	
    

   

}
