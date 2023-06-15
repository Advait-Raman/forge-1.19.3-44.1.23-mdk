package net.raman.tutorialmod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.raman.tutorialmod.TutorialMod;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab MOD_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        MOD_TAB = event.registerCreativeModeTab(new ResourceLocation(TutorialMod.MOD_ID, "mod_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.DAVID_BRADLEY.get()))
                        .title(Component.translatable("creativemodetab.mod_tab")));
    }
}