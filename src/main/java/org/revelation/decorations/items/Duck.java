package org.revelation.decorations.items;

import org.revelation.decorations.ModConfig;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;

public class Duck {
    public static void createDuck() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("org.revelation.duck")
                .name("Duck", "Ducks", "A duck decoration.")
                .modelName("model.toy.duck.")
                .imageNumber((short)0)
                .behaviourType((short)1)
                .combatDamage(0)
                .decayTime(9072000L)
                .dimensions(1, 1, 1)
                .weightGrams(ModConfig.DuckWeight)
                .material(Materials.MATERIAL_POTTERY)
                .value(ModConfig.DuckValue)
                .isTraded(true)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_POTTERY,
                        ItemTypes.ITEM_TYPE_REPAIRABLE,
                        ItemTypes.ITEM_TYPE_NOT_MISSION,
                        ItemTypes.ITEM_TYPE_DECORATION,
                        ItemTypes.ITEM_TYPE_COLORABLE
                })
                .build();

        int duckTemplateId = temp.getTemplateId();

        CreationEntryCreator.createSimpleEntry(ModConfig.DuckSkill, ItemList.bodyHand, ItemList.clay, duckTemplateId, false, true, 0.0f, false, false, CreationCategories.TOYS);
    }
}
