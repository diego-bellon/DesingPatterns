import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Call {

    private LocalDateTime begin;

    private long duration;

    private Long subscriberId;

}
