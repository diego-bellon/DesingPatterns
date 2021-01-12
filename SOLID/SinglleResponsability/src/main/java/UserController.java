import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.databind.ObjectMapper;

//Handles incoming JSON requests that work on User resource/entity
public class UserController {
	//Store used by controller
    private final UserPersistenceService userPersistenceService = new UserPersistenceService();
    
    //Create a new user
    public String createUser(String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(userJson, User.class);

        UserValidator userValidator = new UserValidator();
        boolean isValidUser = userValidator.validateUser(user);

        if(!isValidUser) {
            return "ERROR";
        }

        userPersistenceService.saveUser(user);
        
        return "SUCCESS";
    } 



}
