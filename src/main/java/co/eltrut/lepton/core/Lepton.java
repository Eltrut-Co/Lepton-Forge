package co.eltrut.lepton.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import co.eltrut.differentiate.core.registrator.Registrator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("lepton")
@Mod.EventBusSubscriber(modid = "lepton", bus = Bus.MOD)
public class Lepton
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "lepton";
    public static final Registrator REGISTRATOR = new Registrator(MOD_ID);
    public static Lepton instance;

    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public Lepton() {
        modEventBus.addListener(this::doCommonStuff);
    	modEventBus.addListener(this::doClientStuff);
        instance = this;
        
        MinecraftForge.EVENT_BUS.register(this);
        
    }

    private void doCommonStuff(final FMLCommonSetupEvent event) {
    }
    
    private void doClientStuff(final FMLClientSetupEvent event) {
    }
}
