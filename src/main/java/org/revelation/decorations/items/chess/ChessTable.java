package org.revelation.decorations.items.chess;

import org.revelation.decorations.ModConfig;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;

public class ChessTable {
    public static void createChessTable() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("org.revelation.chesstable")
                .name("Chess Table", "Chess Tables", "A table design for playing chess on.")
                .modelName("model.furniture.chesstable.")
                .imageNumber((short)60)
                .behaviourType((short)1)
                .combatDamage(0)
                .decayTime(9072000L)
                .dimensions(400, 400, 400)
                .weightGrams(ModConfig.ChessTableWeight)
                .material(Materials.MATERIAL_WOOD_BIRCH)
                .value(ModConfig.ChessTableValue)
                .isTraded(true)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_WOOD,
                        ItemTypes.ITEM_TYPE_REPAIRABLE,
                        ItemTypes.ITEM_TYPE_NOT_MISSION,
                        ItemTypes.ITEM_TYPE_DECORATION,
                        ItemTypes.ITEM_TYPE_COLORABLE,
                        ItemTypes.ITEM_TYPE_HOLLOW,
                        ItemTypes.ITEM_TYPE_VIEWABLE_SUBITEMS
                })
                .build();

        int chessTableTemplateId = temp.getTemplateId();

        AdvancedCreationEntry chessTable = CreationEntryCreator.createAdvancedEntry(ModConfig.ChessTableSkill, ItemList.knifeCarving, ItemList.plank, chessTableTemplateId, false, true, 0.0f, false, false, CreationCategories.FURNITURE);
        chessTable.addRequirement(new CreationRequirement(1, ItemList.shaft, 4, true));
        chessTable.addRequirement(new CreationRequirement(2, ItemList.plank, 4, true));
    }
}
