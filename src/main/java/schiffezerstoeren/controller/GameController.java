package schiffezerstoeren.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import schiffezerstoeren.entity.Game;
import schiffezerstoeren.service.GameService;

import java.util.List;

@RestController
@RequestMapping("/schiffezerstoeren")
@RequiredArgsConstructor
public class GameController {
    private final GameService gameService;

    @PostMapping
    public Game startGame(@RequestBody Game _game){
        return gameService.insert(_game);
    }

    @GetMapping("/{id}")
    public Game getGameById(@PathVariable("id") Long id){
        return gameService.getGameById(id);
    }

    @GetMapping
    public List<Game> getGame(){
        return gameService.getGame();
    }


//
    //placeShips() -> immer passen dann
}
