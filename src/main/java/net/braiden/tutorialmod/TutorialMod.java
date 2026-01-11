package net.braiden.tutorialmod;

import net.braiden.tutorialmod.block.ModBlocks;
import net.braiden.tutorialmod.item.ModItemGroups;
import net.braiden.tutorialmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorial-mod";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.reigsterModItems();
        ModBlocks.registerBlocks();

	}
}