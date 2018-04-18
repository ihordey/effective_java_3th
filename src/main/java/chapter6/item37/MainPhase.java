package chapter6.item37;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MainPhase {

    public static void main(String[] args) {
        Phase.Transition fromSolidToGas = Phase.Transition.from(Phase.SOLID, Phase.GAS);
        Phase.Transition fromGasToPlasma = Phase.Transition.from(Phase.GAS, Phase.PLASMA);
        log.info("transition from Solid to Gas {}", fromSolidToGas);
        log.info("transition  from Gas to Plasma {}", fromGasToPlasma);
    }
}
