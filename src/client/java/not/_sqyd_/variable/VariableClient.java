package not._sqyd_.variable;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import not._sqyd_.variable.entity.client.ModModelLayers;
import not._sqyd_.variable.entity.client.PorcupineModel;
import not._sqyd_.variable.entity.client.PorcupineRenderer;
import not._sqyd_.variable.entity.custom.ModEntities;

public class VariableClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

		EntityRendererRegistry.register(ModEntities.PORCUPINE, PorcupineRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(ModModelLayers.PORCUPINE, PorcupineModel::getTexturedModelData);

	}
}