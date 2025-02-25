package satisfy.bakery.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import satisfy.bakery.util.BakeryIdentifier;

public class TagsRegistry {

    public static final TagKey<Item> IGNORE_BLOCK_ITEM = TagKey.create(Registries.ITEM, new BakeryIdentifier("ignore_block_item"));
    public static final TagKey<Block> ALLOWS_COOKING = TagKey.create(Registries.BLOCK, new BakeryIdentifier("allows_cooking"));
    public static final TagKey<Block> CAN_NOT_CONNECT = TagKey.create(Registries.BLOCK, new BakeryIdentifier("can_not_connect"));
    public static final TagKey<Item> BREAD = TagKey.create(Registries.ITEM, new BakeryIdentifier("bread"));
    public static final TagKey<Item> JAMS = TagKey.create(Registries.ITEM, new BakeryIdentifier("jams"));
    public static final TagKey<Item> KNIVES = TagKey.create(Registries.ITEM, new BakeryIdentifier("knives"));
    public static final TagKey<Item> CONTAINER = TagKey.create(Registries.ITEM, new BakeryIdentifier("container"));
    public static final TagKey<Item> WHEAT = TagKey.create(Registries.ITEM, new BakeryIdentifier("wheat"));

}
