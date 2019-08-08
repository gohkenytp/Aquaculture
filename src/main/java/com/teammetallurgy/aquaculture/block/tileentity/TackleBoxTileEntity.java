package com.teammetallurgy.aquaculture.block.tileentity;

import com.teammetallurgy.aquaculture.init.AquaBlocks;
import com.teammetallurgy.aquaculture.inventory.container.TackleBoxContainer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class TackleBoxTileEntity extends IItemHandlerTEBase implements INamedContainerProvider {

    public TackleBoxTileEntity() {
        super(AquaBlocks.AquaTileEntities.TACKLE_BOX);
    }

    @Override
    @Nonnull
    public ITextComponent getDisplayName() {
        return this.getBlockState().getBlock().getNameTextComponent();
    }

    @Nullable
    @Override
    public Container createMenu(int windowID, @Nonnull PlayerInventory playerInventory, @Nonnull PlayerEntity player) {
        return new TackleBoxContainer(windowID, pos, playerInventory);
    }

    @Override
    @Nonnull
    protected IItemHandler createItemHandler() {
        return new ItemStackHandler(17);
    }
}