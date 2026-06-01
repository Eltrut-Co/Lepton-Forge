package co.eltrut.lepton.core;

import co.eltrut.differentiate.client.provider.MyaliteColorProvider;
import co.eltrut.lepton.core.registry.LeptonBlocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
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

}
