import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class InternetSession {

    private LocalDateTime begin;

    private Long subscriberId;

    private Long dataUsed;

}
