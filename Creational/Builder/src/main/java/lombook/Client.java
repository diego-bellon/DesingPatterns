package lombook;

import common.Address;
import common.User;

import java.time.LocalDate;
import java.time.Period;


public class Client {

	public static void main(String[] args) {
		User user = createUser();
		// Client has to provide director with concrete builder
		UserDTO dto = directBuild(UserDTO.builder(), user);
		System.out.println(dto);
	}

	/**
	 * This method serves the role of director in builder pattern.
	 */
	private static UserDTO directBuild(UserDTO.UserDTOBuilder builder, User user) {
		return builder.name(user.getFirstName()+" "+user.getLastName())
				.address(user.getAddress().getHouseNumber()
						+ " " +user.getAddress().getStreet()
						+ "\n"+user.getAddress().getCity()
						+", "+user.getAddress().getState()
						+" "+user.getAddress().getZipcode())
				.age(Integer.toString(Period.between(user.getBirthday(), LocalDate.now()).getYears()))
				.build();
	}

	/**
	 * Returns a sample user.
	 */
	public static User createUser() {
		User user = new User();
		user.setBirthday(LocalDate.of(1960, 5, 6));
		user.setFirstName("Ron");
		user.setLastName("Swanson");
		Address address = new Address();
		address.setHouseNumber("100");
		address.setStreet("State Street");
		address.setCity("Pawnee");
		address.setState("Indiana");
		address.setZipcode("47998");
		user.setAddress(address);
		return user;
	}

}
