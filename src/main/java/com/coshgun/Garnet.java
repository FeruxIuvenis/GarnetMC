package com.coshgun;

import com.coshgun.block.ModBlocks;
import com.coshgun.item.ModItemGroup;
import com.coshgun.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Garnet implements ModInitializer {  // Main .java file
	public static final String MOD_ID = "garnet";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroup.registerModItemGroups();
	}
}