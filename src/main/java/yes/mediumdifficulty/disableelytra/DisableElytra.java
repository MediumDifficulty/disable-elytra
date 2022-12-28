package yes.mediumdifficulty.disableelytra;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.EntityElytraEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DisableElytra implements ModInitializer {

    public static Logger LOGGER = LoggerFactory.getLogger("DisableElytra");

    @Override
    public void onInitialize() {
        EntityElytraEvents.ALLOW.register((entity) -> false);

        LOGGER.info("Disabled elytra!");
    }
}
