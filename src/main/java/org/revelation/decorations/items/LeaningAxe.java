package org.revelation.decorations.items;

import org.revelation.decorations.ModConfig;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;

public class LeaningAxe {
    public static void createLeaningAxe() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("org.revelation.leaningaxe")
                .name("Leaning Axe", "Leaning Axes", "Axe that leans.")
                .modelName("model.toy.leaningaxe.")
                .imageNumber((short)0)
                .behaviourType((short)1)
                .combatDamage(0)
                .decayTime(9072000L)
                .dimensions(1, 1, 1)
                .weightGrams(ModConfig.LeaningAxeWeight)
                .material(Materials.MATERIAL_WOOD_BIRCH)
                .value(ModConfig.LeaningAxeValue)
                .isTraded(true)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_METAL,
                        ItemTypes.ITEM_TYPE_REPAIRABLE,
                        ItemTypes.ITEM_TYPE_NOT_MISSION,
                        ItemTypes.ITEM_TYPE_DECORATION
                })
                .build();

        int leaningAxeTemplateId = temp.getTemplateId();

        CreationEntryCreator.createSimpleEntry(ModConfig.LeaningAxeSkill, ItemList.shaft, ItemList.axeHeadMedium, leaningAxeTemplateId, true, true, 0.0f, false, false, CreationCategories.TOYS);
    }
}