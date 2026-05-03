package com.hlysine.create_power_loader;

import net.createmod.ponder.foundation.PonderIndex;
import net.fabricmc.api.ClientModInitializer;

public class CreatePowerLoaderClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        CPLPartialModels.register();
        PonderIndex.addPlugin(new CPLPonders());
    }
}
