package schiffezerstoeren.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import schiffezerstoeren.entity.Game;
//import entity.GameStatus;
import schiffezerstoeren.entity.Ship;
import schiffezerstoeren.repository.GameRepository;
import schiffezerstoeren.repository.ShipRepository;

import java.util.List;

@Service
@RequiredArgsConstructor

public class GameService {
    private final GameRepository gameRepository;
    //private final ShipRepository shipRepository;
    public Game insert(Game _game){
        return gameRepository.save(_game);
    }

    public Game shoot(Game _game){
        return gameRepository.save(_game);
    }


    public Game placeShips(Long _game_id, List<Ship> _placedships){
        //Validierung ob Anzahl der Schiffe stimmt,
        //Alle Schiffe auf dem FELD OHNE ÜBERHANG,
        //Überschneiden/Berühren,
        //Game ID exestiert

        Game game = gameRepository.findById(_game_id).orElseThrow();
        game.getFieldPlayerOne().setShips(_placedships);

        //game.getFIeldPlayerTwo().setShips(_placedships);
    }
}
