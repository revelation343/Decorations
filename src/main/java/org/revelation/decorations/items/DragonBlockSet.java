package org.revelation.decorations.items;

import org.revelation.decorations.ModConfig;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;

public class DragonBlockSet {
    public static void createDragonBlockSet() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("org.revelation.dragonblockset")
                .name("Dragon Block Set", "Dragon Block Sets", "A puzzle game. Block sets with dragons.")
                .modelName("model.toy.dragonbox.")
                .imageNumber((short)0)
                .behaviourType((short)1)
                .combatDamage(0)
                .decayTime(9072000L)
                .dimensions(1, 1, 1)
                .weightGrams(ModConfig.DragonBlockSetWeight)
                .material(Materials.MATERIAL_WOOD_BIRCH)
                .value(ModConfig.DragonBlockSetValue)
                .isTraded(true)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_WOOD,
                        ItemTypes.ITEM_TYPE_REPAIRABLE,
                        ItemTypes.ITEM_TYPE_NOT_MISSION,
                        ItemTypes.ITEM_TYPE_DECORATION
                })
                .build();

        int dragonBlockSetTemplateId = temp.getTemplateId();

        AdvancedCreationEntry dragonbox = CreationEntryCreator.createAdvancedEntry(ModConfig.DragonBlockSetSkill, ItemList.knifeCarving, ItemList.plank, dragonBlockSetTemplateId, false, true, 0.0f, false, false, CreationCategories.TOYS);
        dragonbox.addRequirement(new CreationRequirement(1, ItemList.shaft, 3, true));
        dragonbox.addRequirement(new CreationRequirement(2, ItemList.dye, 1, true));
    }
}
