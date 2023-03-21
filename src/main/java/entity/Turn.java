package entity;
import entity.enumeration.Player;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Turn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer turn;
    @Enumerated(value = EnumType.STRING)
    private Player player;
    private Coordinates coordinates;
    private Boolean hit;
}
