import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;

//User entity
@Data
@AllArgsConstructor
public class User {

    private String name;

    private String email;

    private String address;

    public User() {

    }

    @Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", address=" + address + "]";
	}

    
}
