package co.eltrut.lepton.core;

import co.eltrut.differentiate.client.provider.MyaliteColorProvider;
import co.eltrut.differentiate.core.registrator.Registrator;
import co.eltrut.differentiate.core.util.CompatUtil;
import co.eltrut.lepton.core.compat.LeptonEveryCompatModule;
import co.eltrut.lepton.core.registry.LeptonBlocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("lepton")
public class Lepton {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "lepton";
    public static final Registrator REGISTRATOR = new Registrator(MOD_ID);
    public static Lepton instance;

    public Lepton(IEventBus modEventBus, ModContainer modContainer) {
        instance = this;

        REGISTRATOR.register(modEventBus);

        this.registerEveryCompatModule();

        modEventBus.addListener(this::registerBlockColorHandlers);
        modEventBus.addListener(this::registerItemColorHandlers);

    }

    private void registerBlockColorHandlers(RegisterColorHandlersEvent.Block event) {
        event.register(MyaliteColorProvider.getBlockColor(),
                LeptonBlocks.POLISHED_MYALITE_BUTTON.value(),
                LeptonBlocks.POLISHED_MYALITE_PRESSURE_PLATE.value(),
                LeptonBlocks.POLISHED_MYALITE_WALL.value());
    }

    private void registerItemColorHandlers(RegisterColorHandlersEvent.Item event) {
        event.register(MyaliteColorProvider.getItemColor(),
                LeptonBlocks.POLISHED_MYALITE_BUTTON.value(),
                LeptonBlocks.POLISHED_MYALITE_PRESSURE_PLATE.value(),
                LeptonBlocks.POLISHED_MYALITE_WALL.value());
    }

    private void registerEveryCompatModule() {
        // I do this and I don't get an error
        try {
            if (CompatUtil.areModsLoaded("everycomp")) {
                Lepton.LOGGER.info("Loading EveryCompat module...");
                LeptonEveryCompatModule.registerEveryCompatModule();
            } else {
                Lepton.LOGGER.info("EveryCompat not detected, module not loading!");
            }
        } catch (Exception e) {
            Lepton.LOGGER.error("Uh oh, failed to start EveryCompat module", e);
        }
    }

}
