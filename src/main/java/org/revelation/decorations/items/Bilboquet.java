package org.revelation.decorations.items;

import org.revelation.decorations.ModConfig;
import com.wurmonline.server.items.*;
import com.wurmonline.server.skills.SkillList;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;

public class Bilboquet {
    public static void createBilboquet() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("org.revelation.bilboquet")
                .name("Bilboquet", "Bilboquets", "A game played by children.")
                .modelName("model.toy.bilboquet.")
                .imageNumber((short)0)
                .behaviourType((short)1)
                .combatDamage(0)
                .decayTime(9072000L)
                .dimensions(1, 1, 1)
                .weightGrams(ModConfig.BilboquetWeight)
                .material(Materials.MATERIAL_WOOD_BIRCH)
                .value(ModConfig.BilboquetValue)
                .isTraded(true)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_WOOD,
                        ItemTypes.ITEM_TYPE_REPAIRABLE,
                        ItemTypes.ITEM_TYPE_NOT_MISSION,
                        ItemTypes.ITEM_TYPE_DECORATION,
                        ItemTypes.ITEM_TYPE_COLORABLE
                })
                .build();

        int bilboquetTemplateId = temp.getTemplateId();

        AdvancedCreationEntry bilboquet = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.knifeCarving, ItemList.log, bilboquetTemplateId, false, true, 0.0f, false, false, CreationCategories.TOYS);
        bilboquet.addRequirement(new CreationRequirement(ModConfig.BilboquetSkill, ItemList.clothString, 1, true));
    }
}