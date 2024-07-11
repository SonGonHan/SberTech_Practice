import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
public class Resource {
    Integer resource;

    @Override
    public String toString() {
        return resource.toString();
    }
}
