package net.raman.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.raman.tutorialmod.TutorialMod;
import net.raman.tutorialmod.sounds.ModSounds;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> BLACK_OPAL = ITEMS.register("black_opal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DAVID_BRADLEY = ITEMS.register("david_bradley",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MUSIC_BOX_MUSIC_DISC = ITEMS.register("music_box_music_disc",
            () -> new RecordItem(8, ModSounds.MUSIC_BOX,new Item.Properties(),4000));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
