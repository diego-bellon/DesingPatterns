import lombok.Data;

import java.time.LocalDate;

/**
 * Represents a news post.
 *
 */
@Data
public class NewsPost extends Post{
	private String headline;
	private LocalDate newsTime;
}
