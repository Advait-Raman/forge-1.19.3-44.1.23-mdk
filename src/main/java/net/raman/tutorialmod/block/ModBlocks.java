package net.raman.tutorialmod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;
import net.raman.tutorialmod.TutorialMod;
import net.raman.tutorialmod.block.custom.BradleyBomb;
import net.raman.tutorialmod.block.custom.DoNotPlayChess;
import net.raman.tutorialmod.item.ModItems;
import java.util.function.Supplier;
public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static final RegistryObject<Block> BRADLEY_BOMB = registerBlock("bradley_bomb",
            () -> new BradleyBomb(BlockBehaviour.Properties.of(Material.EXPLOSIVE)));

    public static final RegistryObject<Block> DO_NOT_PLAY_CHESS = registerBlock("do_not_play_chess",
            () -> new DoNotPlayChess(BlockBehaviour.Properties.of(Material.EXPLOSIVE)));
    public static final <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
