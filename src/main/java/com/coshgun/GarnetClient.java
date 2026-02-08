package com.coshgun;

import com.coshgun.util.ModModelPredicates;
import net.fabricmc.api.ClientModInitializer;

public class GarnetClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModModelPredicates.registerModModelPredicates();
    }
}
