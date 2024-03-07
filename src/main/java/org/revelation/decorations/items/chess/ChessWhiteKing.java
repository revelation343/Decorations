package org.revelation.decorations.items.chess;

import org.revelation.decorations.ModConfig;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;

public class ChessWhiteKing {
    public static void createChessWhiteKing() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("org.revelation.chesswhiteking")
                .name("Chess White King", "Chess White Kings", "A chess piece used in playing a strategy game.")
                .modelName("model.toy.chesswhiteking.")
                .imageNumber((short)0)
                .behaviourType((short)1)
                .combatDamage(0)
                .decayTime(9072000L)
                .dimensions(1, 1, 1)
                .weightGrams(ModConfig.ChessWhiteKingWeight)
                .material(Materials.MATERIAL_MARBLE)
                .value(ModConfig.ChessWhiteKingValue)
                .isTraded(true)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_STONE,
                        ItemTypes.ITEM_TYPE_REPAIRABLE,
                        ItemTypes.ITEM_TYPE_NOT_MISSION,
                        ItemTypes.ITEM_TYPE_DECORATION,
                        ItemTypes.ITEM_TYPE_COLORABLE
                })
                .build();

        int chessWhiteKingTemplateId = temp.getTemplateId();

        CreationEntryCreator.createSimpleEntry(ModConfig.ChessWhiteKingSkill, ItemList.stoneChisel, ItemList.marbleShard, chessWhiteKingTemplateId, false, true, 0.0f, false, false, CreationCategories.TOYS);
    }
}