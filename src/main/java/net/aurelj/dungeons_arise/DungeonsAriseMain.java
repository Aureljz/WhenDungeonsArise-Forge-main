package net.aurelj.dungeons_arise;

import net.aurelj.dungeons_arise.WDAStructures;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(DungeonsAriseMain.MODID)
public class DungeonsAriseMain {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "dungeons_arise";

    public DungeonsAriseMain() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        WDAStructures.DEFERRED_REGISTRY_STRUCTURE.register(modEventBus);
    }
}