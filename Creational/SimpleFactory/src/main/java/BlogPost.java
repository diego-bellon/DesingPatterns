import lombok.Data;

/**
 * Represents a blog post. 
 * 
 */
@Data
public class BlogPost extends Post {
	private String author;
	private String[] tags;
}
