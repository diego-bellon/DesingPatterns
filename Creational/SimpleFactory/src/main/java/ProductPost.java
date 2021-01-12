import lombok.Data;

/**
 * Represents a product information post. 
 *
 */
@Data
public class ProductPost extends Post{
	private String imageUrl;
	private String name;
}
