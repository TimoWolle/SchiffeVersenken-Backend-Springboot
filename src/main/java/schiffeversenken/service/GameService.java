package schiffeversenken.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import schiffeversenken.entity.Coordinates;
import schiffeversenken.entity.Game;
//import entity.GameStatus;
import schiffeversenken.entity.Ship;
import schiffeversenken.repository.GameRepository;
import schiffeversenken.repository.ShipRepository;

import java.util.List;

@Service
@RequiredArgsConstructor

public class GameService {
    private final GameRepository gameRepository;
    //private final ShipRepository shipRepository;
    public Game insert(Game _game){
        return gameRepository.save(_game);
    }

    public Game shoot(Long _game_id, Coordinates _coordinates){
        Game game = gameRepository.findById(_game_id).orElseThrow();
        if (game.getWinner()!=null) return game;



        game.getFieldPlayerTwo().getShips();



        return gameRepository.save(game);
    }


    public Game placeShips(Long _game_id, List<Ship> _placedships){
        //Validierung ob Anzahl der Schiffe stimmt,
        //Alle Schiffe auf dem FELD OHNE ÜBERHANG,
        //Überschneiden/Berühren,
        //Game ID exestiert

        Game game = gameRepository.findById(_game_id).orElseThrow();
        game.getFieldPlayerOne().setShips(_placedships);

        //game.getFIeldPlayerTwo().setShips(_placedships); (KI / SHELFED IN GIT)
        return gameRepository.save(game);
    }
}
