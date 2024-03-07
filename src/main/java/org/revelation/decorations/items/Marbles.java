package org.revelation.decorations.items;

import org.revelation.decorations.ModConfig;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;

public class Marbles {
    public static void createMarbles() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("org.revelation.marbles")
                .name("Marbles", "Marbles", "Bag of marbles.")
                .modelName("model.toy.marbles.")
                .imageNumber((short)0)
                .behaviourType((short)1)
                .combatDamage(0)
                .decayTime(9072000L)
                .dimensions(1, 1, 1)
                .weightGrams(ModConfig.MarblesWeight)
                .material(Materials.MATERIAL_POTTERY)
                .value(ModConfig.MarblesValue)
                .isTraded(true)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_POTTERY,
                        ItemTypes.ITEM_TYPE_REPAIRABLE,
                        ItemTypes.ITEM_TYPE_NOT_MISSION,
                        ItemTypes.ITEM_TYPE_DECORATION
                })
                .build();

        int marblesTemplateId = temp.getTemplateId();

        CreationEntryCreator.createSimpleEntry(ModConfig.MarblesSkill, ItemList.bodyHand, ItemList.clay, marblesTemplateId, false, true, 0.0f, false, false, CreationCategories.TOYS);
    }
}