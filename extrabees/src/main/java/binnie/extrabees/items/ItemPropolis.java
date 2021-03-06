package binnie.extrabees.items;

import binnie.extrabees.items.types.EnumPropolis;
import forestry.api.core.Tabs;
import forestry.core.items.IColoredItem;
import net.minecraft.item.ItemStack;

public class ItemPropolis extends ItemProduct<EnumPropolis> implements IColoredItem {

	public ItemPropolis() {
		super(EnumPropolis.values());
		this.setCreativeTab(Tabs.tabApiculture);
		this.setTranslationKey("propolis");
		setRegistryName("propolis");
	}

	@Override
	public int getColorFromItemstack(final ItemStack itemStack, final int tintIndex) {
		EnumPropolis type = EnumPropolis.get(itemStack);
		return type.getSpriteColour(tintIndex);
	}
}
