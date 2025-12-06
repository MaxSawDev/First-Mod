package net.siyoga.firstmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.siyoga.firstmod.FirstMod;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FirstMod.MOD_ID);

    public static final DeferredItem<Item> SIYONITE = ITEMS.register("siyonite",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
