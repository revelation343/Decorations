package org.revelation.decorations.items;

import org.revelation.decorations.ModConfig;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;

public class RockingHorse {
    public static void createRockingHorse() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("org.revelation.rockinghorse")
                .name("Rocking horse", "Rocking horse", "A wooden horse for a child to ride.")
                .modelName("model.toy.rockinghorse.")
                .imageNumber((short)0)
                .behaviourType((short)1)
                .combatDamage(0)
                .decayTime(9072000L)
                .dimensions(150, 150, 150)
                .weightGrams(ModConfig.RockingHorseWeight)
                .material(Materials.MATERIAL_WOOD_BIRCH)
                .value(ModConfig.RockingHorseValue)
                .isTraded(true)
                .containerSize(50, 50, 50)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_WOOD,
                        ItemTypes.ITEM_TYPE_REPAIRABLE,
                        ItemTypes.ITEM_TYPE_NOT_MISSION,
                        ItemTypes.ITEM_TYPE_DECORATION,
                        ItemTypes.ITEM_TYPE_COLORABLE,
                        ItemTypes.ITEM_TYPE_SUPPORTS_SECONDARY_COLOR,
                        ItemTypes.ITEM_TYPE_HOLLOW,
                        ItemTypes.ITEM_TYPE_VIEWABLE_SUBITEMS
                })
                .build();

        int rockingHorseTemplateId = temp.getTemplateId();

        AdvancedCreationEntry horse = CreationEntryCreator.createAdvancedEntry(ModConfig.RockingHorseSkill, ItemList.hammerWood, ItemList.plank, rockingHorseTemplateId, false, true, 0.0f, false, false, CreationCategories.TOYS);
        horse.addRequirement(new CreationRequirement(1, ItemList.shaft, 5, true));
        horse.addRequirement(new CreationRequirement(2, ItemList.nailsIronSmall, 10, true));
    }
}
