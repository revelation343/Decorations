package org.revelation.decorations.items;

import org.revelation.decorations.ModConfig;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;

public class Bunny {
    public static void createBunny() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("org.revelation.bunny")
                .name("Bunny", "Bunnies", "Something to cuddle and make you feel good.")
                .modelName("model.toy.bunny.")
                .imageNumber((short)306)
                .behaviourType((short)1)
                .combatDamage(0)
                .decayTime(9072000L)
                .dimensions(1, 1, 1)
                .weightGrams(ModConfig.BunnyWeight)
                .material(Materials.MATERIAL_COTTON)
                .value(ModConfig.BunnyValue)
                .isTraded(true)
                .containerSize(50, 50, 50)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_CLOTH,
                        ItemTypes.ITEM_TYPE_REPAIRABLE,
                        ItemTypes.ITEM_TYPE_NOT_MISSION,
                        ItemTypes.ITEM_TYPE_DECORATION
                })
                .build();

        int bunnyTemplateId = temp.getTemplateId();

        AdvancedCreationEntry bunny = CreationEntryCreator.createAdvancedEntry(ModConfig.BunnySkill, ItemList.needleIron, ItemList.clothString, bunnyTemplateId, false, true, 0.0f, false, false, CreationCategories.TOYS);
        bunny.addRequirement(new CreationRequirement(1, ItemList.clothYard, 5, true));
        bunny.addRequirement(new CreationRequirement(2, ItemList.cotton, 5, true));
        bunny.addRequirement(new CreationRequirement(3, ItemList.charcoal, 3, true));
    }
}