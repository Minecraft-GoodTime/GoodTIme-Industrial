package com.mcgoodtime.gti.common.tiles.tileslot;

import com.mcgoodtime.gti.common.recipes.IProcessable;
import com.mcgoodtime.gti.common.tiles.TileContainer;
import net.minecraft.item.ItemStack;

/**
 * Created by BestOwl on 2015.11.10.0010.
 *
 * @author BestOwl
 */

public class TileSlotInput extends TileSlot {

    public IProcessable processable;

    public TileSlotInput(TileContainer tile, IProcessable processable) {
        this(tile, SlotMode.INPUT, processable);
    }

    public TileSlotInput(TileContainer tile, SlotMode mode, IProcessable processable) {
        super(tile, mode);
        this.processable = processable;
    }

    /**
     * Whether the current item can be inputted.
     *
     * @param itemStack Input item.
     */
    @Override
    public boolean canInput(ItemStack itemStack) {
        return this.processable.canProcess(itemStack);
    }
}