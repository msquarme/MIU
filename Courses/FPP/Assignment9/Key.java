package prob1;

import java.util.Objects;

/*
 * @author Musie M.
 * ID: 616079
 * 
 * 						========================================
 * 									Assignment Twelve
 * 						========================================
 * 
 * 
 * 
 * */


public class Key{
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	@Override
	public int hashCode() {
		return Objects.hash(getFirstName(), getLastName());
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Key k = (Key) obj;
		return getFirstName().equals(k.getFirstName()) && getLastName().equals(k.getLastName());
	}
	
}
