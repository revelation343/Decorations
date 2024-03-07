package org.revelation.decorations.items;

import org.revelation.decorations.ModConfig;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;

public class BowlingSet {
    public static void createBowlingSet() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("org.revelation.bowlingset")
                .name("Bowling set", "Bowling sets", "A game played by children.")
                .modelName("model.toy.bowling.")
                .imageNumber((short)0)
                .behaviourType((short)1)
                .combatDamage(0)
                .decayTime(9072000L)
                .dimensions(1, 1, 1)
                .weightGrams(ModConfig.BowlingSetWeight)
                .material(Materials.MATERIAL_WOOD_BIRCH)
                .value(ModConfig.BowlingSetValue)
                .isTraded(true)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_WOOD,
                        ItemTypes.ITEM_TYPE_REPAIRABLE,
                        ItemTypes.ITEM_TYPE_NOT_MISSION,
                        ItemTypes.ITEM_TYPE_DECORATION,
                        ItemTypes.ITEM_TYPE_COLORABLE
                })
                .build();

        int bowlingSetTemplateId = temp.getTemplateId();

        CreationEntryCreator.createSimpleEntry(ModConfig.BowlingSetSkill, ItemList.knifeCarving, ItemList.log, bowlingSetTemplateId, false, true, 0.0f, false, false, CreationCategories.TOYS);
    }
}
