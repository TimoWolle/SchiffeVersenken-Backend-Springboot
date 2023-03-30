package schiffeversenken.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import schiffeversenken.entity.enumeration.ShipType;

import java.util.HashMap;
import java.util.Map;

@Getter
@Configuration
public class GameConfig {
    @Value("${schiffeversenken.field.widht}")
    private Integer Field_Width;
    @Value("${schiffeversenken.field.height}")
    private Integer Field_Height;
    @Value("${schiffeversenken.shipamount.submarine}")
    private Integer SUBMARINE_Amount;
    @Value("${schiffeversenken.shipamount.destroyer}")
    private Integer DESTROYER_Amount;
    @Value("${schiffeversenken.shipamount.battleship}")
    private Integer BATTLESHIP_Amount;
    @Value("${schiffeversenken.shipamount.aircraft_carrier}")
    private Integer AIRCRAFT_CARRIER_Amount;
    private final Map<ShipType, Integer> shipAmount = new HashMap<>();

    {
        shipAmount.put(ShipType.SUBMARINE,  SUBMARINE_Amount);
        shipAmount.put(ShipType.DESTROYER, DESTROYER_Amount);
        shipAmount.put(ShipType.BATTLESHIP, BATTLESHIP_Amount);
        shipAmount.put(ShipType.AIRCRAFT_CARRIER, AIRCRAFT_CARRIER_Amount);
    }


}
