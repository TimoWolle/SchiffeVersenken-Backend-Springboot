package schiffezerstoeren.entity;
import schiffezerstoeren.entity.enumeration.Difficulty;
import schiffezerstoeren.entity.enumeration.Player;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Field fieldPlayerOne= new Field();
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Field fieldPlayerTwo= new Field();
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Turn> turns = new ArrayList<>();
    @Enumerated(value = EnumType.STRING)
    private Difficulty difficulty;
    @Enumerated(value = EnumType.STRING)
    private Player winner;

}
