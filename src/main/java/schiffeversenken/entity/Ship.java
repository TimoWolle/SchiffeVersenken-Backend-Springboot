package schiffeversenken.entity;
import schiffeversenken.entity.enumeration.Oriantation;
import schiffeversenken.entity.enumeration.ShipType;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Ship{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(value = EnumType.STRING)
    private Oriantation oriantation;
    @Enumerated(value = EnumType.STRING)
    private ShipType shipType;
    private Coordinates coordinates;
    private Boolean isDestroyed = false;
}
