/*
 * This file is part of Matter Overdrive
 * Copyright (c) 2015., Simeon Radivoev, All rights reserved.
 *
 * Matter Overdrive is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Matter Overdrive is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Matter Overdrive.  If not, see <http://www.gnu.org/licenses>.
 */

package matteroverdrive.data.inventory;

import matteroverdrive.init.MatterOverdriveRecipes;
import net.minecraft.item.ItemStack;

/**
 * Created by Simeon on 11/12/2015.
 */
public class InscriberSlot extends Slot
{
	boolean isSecSlot;

	public InscriberSlot(boolean isMainSlot, boolean isSecSlot)
	{
		super(isMainSlot);
		this.isSecSlot = isSecSlot;
	}

	@Override
	public boolean isValidForSlot(ItemStack stack)
	{
		return isSecSlot ? MatterOverdriveRecipes.INSCRIBER.isSecondaryInput(stack) : MatterOverdriveRecipes.INSCRIBER.isPrimaryInput(stack);
	}

	public int getMaxStackSize()
	{
		if (isSecSlot)
		{
			return 64;
		}
		else
		{
			return 1;
		}
	}
}
