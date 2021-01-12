package lombook;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserDTO {
    private String name;
    private String address;
    private String age;
}
