package co.eltrut.lepton.core;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import co.eltrut.differentiate.core.registrator.Registrator;

@Mod("lepton")
public class Lepton {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "lepton";
    public static final Registrator REGISTRATOR = new Registrator(MOD_ID);
    public static Lepton instance;

    public Lepton(IEventBus modEventBus, ModContainer modContainer) {
        instance = this;

        REGISTRATOR.register(modEventBus);

    }
}
