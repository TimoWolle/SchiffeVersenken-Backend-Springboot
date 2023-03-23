package schiffezerstoeren.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import schiffezerstoeren.entity.enumeration.ShipType;

import java.util.HashMap;
import java.util.Map;

@Getter
@Configuration
public class GameConfig {
    @Value("${schiffezerstoeren.field.x}")
    private Integer Field_X;
    @Value("${schiffezerstoeren.field.y}")
    private Integer Field_Y;
    @Value("${schiffezerstoeren.shipamount.submarine}")
    private Integer SUBMARINE_Amount;
    @Value("${schiffezerstoeren.shipamount.destroyer}")
    private Integer DESTROYER_Amount;
    @Value("${schiffezerstoeren.shipamount.battleship}")
    private Integer BATTLESHIP_Amount;
    @Value("${schiffezerstoeren.shipamount.aircraft_carrier}")
    private Integer AIRCRAFT_CARRIER_Amount;
    private final Map<ShipType, Integer> shipAmount = new HashMap<>();

    {
        shipAmount.put(ShipType.SUBMARINE,  SUBMARINE_Amount);
        shipAmount.put(ShipType.DESTROYER, DESTROYER_Amount);
        shipAmount.put(ShipType.BATTLESHIP, BATTLESHIP_Amount);
        shipAmount.put(ShipType.AIRCRAFT_CARRIER, AIRCRAFT_CARRIER_Amount);
    }


}
