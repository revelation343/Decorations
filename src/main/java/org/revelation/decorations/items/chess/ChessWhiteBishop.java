package org.revelation.decorations.items.chess;

import org.revelation.decorations.ModConfig;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;

public class ChessWhiteBishop {
    public static void createChessWhiteBishop() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("org.revelation.chesswhitebishop")
                .name("Chess White Bishop", "Chess White Bishops", "A chess piece used in playing a strategy game.")
                .modelName("model.toy.chesswhitebishop.")
                .imageNumber((short)0)
                .behaviourType((short)1)
                .combatDamage(0)
                .decayTime(9072000L)
                .dimensions(1, 1, 1)
                .weightGrams(ModConfig.ChessWhiteBishopWeight)
                .material(Materials.MATERIAL_MARBLE)
                .value(ModConfig.ChessWhiteBishopValue)
                .isTraded(true)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_STONE,
                        ItemTypes.ITEM_TYPE_REPAIRABLE,
                        ItemTypes.ITEM_TYPE_NOT_MISSION,
                        ItemTypes.ITEM_TYPE_DECORATION,
                        ItemTypes.ITEM_TYPE_COLORABLE
                })
                .build();

        int chessWhiteBishopTemplateId = temp.getTemplateId();

        CreationEntryCreator.createSimpleEntry(ModConfig.ChessWhiteBishopSkill, ItemList.stoneChisel, ItemList.marbleShard, chessWhiteBishopTemplateId, false, true, 0.0f, false, false, CreationCategories.TOYS);
    }
}