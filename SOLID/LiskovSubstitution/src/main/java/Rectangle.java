import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rectangle implements Shape {

	private int width;
	private int height;

	@Override
	public int computeArea() {
		return width * height;
	}
}
