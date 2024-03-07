package org.revelation.decorations.items;

import org.revelation.decorations.ModConfig;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;

public class Lute {
    public static void createLute() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("org.revelation.lute")
                .name("Lute", "Lutes", "A puzzle game")
                .modelName("model.toy.lute.")
                .imageNumber((short)0)
                .behaviourType((short)1)
                .combatDamage(0)
                .decayTime(9072000L)
                .dimensions(1, 1, 1)
                .weightGrams(ModConfig.LuteWeight)
                .material(Materials.MATERIAL_WOOD_BIRCH)
                .value(ModConfig.LuteValue)
                .isTraded(true)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_WOOD,
                        ItemTypes.ITEM_TYPE_REPAIRABLE,
                        ItemTypes.ITEM_TYPE_NOT_MISSION,
                        ItemTypes.ITEM_TYPE_DECORATION
                })
                .build();

        int luteTemplateId = temp.getTemplateId();

        AdvancedCreationEntry lute = CreationEntryCreator.createAdvancedEntry(ModConfig.LuteSkill, ItemList.knifeCarving, ItemList.plank, luteTemplateId, false, true, 0.0f, false, false, CreationCategories.TOYS);
        lute.addRequirement(new CreationRequirement(1, ItemList.plank, 2, true));
        lute.addRequirement(new CreationRequirement(2, ItemList.metalWires, 6, true));
    }
}
