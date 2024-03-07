package org.revelation.decorations.items.chess;

import org.revelation.decorations.ModConfig;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;

public class ChessBlackKing {
    public static void createChessBlackKing() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("org.revelation.chessblackking")
                .name("Chess Black King", "Chess Black Kings", "A chess piece used in playing a strategy game.")
                .modelName("model.toy.chessblackking.")
                .imageNumber((short)0)
                .behaviourType((short)1)
                .combatDamage(0)
                .decayTime(9072000L)
                .dimensions(1, 1, 1)
                .weightGrams(ModConfig.ChessBlackKingWeight)
                .material(Materials.MATERIAL_SLATE)
                .value(ModConfig.ChessBlackKingValue)
                .isTraded(true)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_STONE,
                        ItemTypes.ITEM_TYPE_REPAIRABLE,
                        ItemTypes.ITEM_TYPE_NOT_MISSION,
                        ItemTypes.ITEM_TYPE_DECORATION,
                        ItemTypes.ITEM_TYPE_COLORABLE
                })
                .build();

        int chessBlackKingTemplateId = temp.getTemplateId();

        CreationEntryCreator.createSimpleEntry(ModConfig.ChessBlackKingSkill, ItemList.stoneChisel, ItemList.slateShard, chessBlackKingTemplateId, false, true, 0.0f, false, false, CreationCategories.TOYS);
    }
}