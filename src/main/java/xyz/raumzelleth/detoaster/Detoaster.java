package xyz.raumzelleth.detoaster;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Detoaster implements ModInitializer {
	public static final String MOD_ID = "detoaster";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Minecraft de-toasted.");
	}
}
