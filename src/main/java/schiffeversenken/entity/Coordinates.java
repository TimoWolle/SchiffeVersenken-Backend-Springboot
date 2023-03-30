package schiffeversenken.entity;
import lombok.*;
import jakarta.persistence.Embeddable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Coordinates {
    private Integer x;
    private Integer y;
}
