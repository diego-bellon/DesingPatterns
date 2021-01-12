import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;



public class UserValidatorTest {
    UserValidator userValidator;
    //A valid USER JSON String
    private static final String VALID_USER_JSON = "{\"name\": \"Randy\", \"email\": \"randy@email.com\", \"address\":\"110 Sugar lane\"}";

    //Invalid USER JSON String - email format wrong
    private static final String INVALID_USER_JSON_WRONG_EMAIL = "{\"name\": \"Sam\", \"email\": \"sam@email\", \"address\":\"111 Sugar lane\"}";

    //Invalid USER JSON String - Null mane
    private static final String INVALID_USER_JSON_NULL_NAME = "{\"name\": \"\", \"email\": \"sam@email\", \"address\":\"111 Sugar lane\"}";

    //Invalid USER JSON String - Special characters mane
    private static final String INVALID_USER_JSON_SPECIAL_CHARACTERS_NAME = "{\"name\": \"Sam.,\", \"email\": \"sam@email\", \"address\":\"111 Sugar lane\"}";


    @Before
    public void setup() {
        userValidator = new UserValidator();
    }

    private User getUserFromJSON(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, User.class);

    }

    @Test
    public void returnsValidationOk() throws JsonProcessingException {
        boolean isValid = userValidator.validateUser(getUserFromJSON(VALID_USER_JSON));
        assertThat(isValid, is(true));
    }

    @Test
    public void returnsValidationFailedBecauseEmailFormat() throws JsonProcessingException {
        boolean isValid = userValidator.validateUser(getUserFromJSON(INVALID_USER_JSON_WRONG_EMAIL));
        assertThat(isValid, is(false));
    }
    @Test
    public void returnsValidationFailedBecauseNullName() throws JsonProcessingException {
        boolean isValid = userValidator.validateUser(getUserFromJSON(INVALID_USER_JSON_NULL_NAME));
        assertThat(isValid, is(false));
    }
    @Test
    public void returnsValidationFailedBecauseSpecialCharacters() throws JsonProcessingException {
        boolean isValid = userValidator.validateUser(getUserFromJSON(INVALID_USER_JSON_SPECIAL_CHARACTERS_NAME));
        assertThat(isValid, is(false));
    }
}
