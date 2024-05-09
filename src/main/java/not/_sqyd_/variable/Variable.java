package not._sqyd_.variable;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import not._sqyd_.variable.entity.PorcupineEntity;
import not._sqyd_.variable.entity.custom.ModEntities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Variable implements ModInitializer {
	public static final String MOD_ID = "Variable";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		FabricDefaultAttributeRegistry.register(ModEntities.PORCUPINE, PorcupineEntity.createPorcupineAttributes());

	}
}