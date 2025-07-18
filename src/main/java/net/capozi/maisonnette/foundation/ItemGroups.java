package net.capozi.maisonnette.foundation;

import net.capozi.maisonnette.Maisonnette;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemGroups {
    public static final ItemGroup MAISONNETTE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Maisonnette.MOD_ID, "maisonnette"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.maisonnette"))
                    .icon(() -> new ItemStack(Items.ENCHANTED_BOOK)).entries((displayContext, entries) -> {
                        entries.add(BlockInit.CALCITE_BRICKS);
                        entries.add(BlockInit.CHISELED_CALCITE);
                        entries.add(BlockInit.CALCITE_STAIRS);
                        entries.add(BlockInit.CALCITE_SLAB);
                        entries.add(BlockInit.CALCITE_WALL);
                        entries.add(BlockInit.CALCITE_BUTTON);
                        entries.add(BlockInit.TUFF_BRICKS);
                        entries.add(BlockInit.CHISELED_TUFF);
                        entries.add(BlockInit.TUFF_STAIRS);
                        entries.add(BlockInit.TUFF_SLAB);
                        entries.add(BlockInit.TUFF_WALL);
                        entries.add(BlockInit.TUFF_BUTTON);
                        entries.add(Items.BOOK);
                    }).build());
    public static void init() {

    }
}
