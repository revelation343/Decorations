package org.revelation.decorations.items;

import org.revelation.decorations.ModConfig;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;
public class TeddyBear {
    public static void createTeddyBear() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("org.revelation.teddybear")
                .name("Teddybear", "Teddybears", "Something to cuddle and make you feel good.")
                .modelName("model.toy.teddybear.")
                .imageNumber((short)306)
                .behaviourType((short)1)
                .combatDamage(0)
                .decayTime(9072000L)
                .dimensions(1, 1, 1)
                .weightGrams(ModConfig.TeddyBearWeight)
                .material(Materials.MATERIAL_COTTON)
                .value(ModConfig.TeddyBearValue)
                .isTraded(true)
                .containerSize(50, 50, 50)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_CLOTH,
                        ItemTypes.ITEM_TYPE_REPAIRABLE,
                        ItemTypes.ITEM_TYPE_NOT_MISSION,
                        ItemTypes.ITEM_TYPE_DECORATION
                })
                .build();

        int teddyBearTemplateId = temp.getTemplateId();

        AdvancedCreationEntry teddy = CreationEntryCreator.createAdvancedEntry(ModConfig.TeddyBearSkill, ItemList.needleIron, ItemList.clothString, teddyBearTemplateId, false, true, 0.0f, false, false, CreationCategories.TOYS);
        teddy.addRequirement(new CreationRequirement(1, ItemList.clothYard, 5, true));
        teddy.addRequirement(new CreationRequirement(2, ItemList.cotton, 5, true));
        teddy.addRequirement(new CreationRequirement(3, ItemList.charcoal, 3, true));
    }
}
