package org.revelation.decorations.items.chess;

import org.revelation.decorations.ModConfig;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;

public class ChessBlackBishop {
    public static void createChessBlackBishop() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("org.revelation.chessblackbishop")
                .name("Chess Black Bishop", "Chess Black Bishops", "A chess piece used in playing a strategy game.")
                .modelName("model.toy.chessblackbishop.")
                .imageNumber((short)0)
                .behaviourType((short)1)
                .combatDamage(0)
                .decayTime(9072000L)
                .dimensions(1, 1, 1)
                .weightGrams(ModConfig.ChessBlackBishopWeight)
                .material(Materials.MATERIAL_SLATE)
                .value(ModConfig.ChessBlackBishopValue)
                .isTraded(true)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_STONE,
                        ItemTypes.ITEM_TYPE_REPAIRABLE,
                        ItemTypes.ITEM_TYPE_NOT_MISSION,
                        ItemTypes.ITEM_TYPE_DECORATION,
                        ItemTypes.ITEM_TYPE_COLORABLE
                })
                .build();

        int chessBlackBishopTemplateId = temp.getTemplateId();

        CreationEntryCreator.createSimpleEntry(ModConfig.ChessBlackBishopSkill, ItemList.stoneChisel, ItemList.slateShard, chessBlackBishopTemplateId, false, true, 0.0f, false, false, CreationCategories.TOYS);
    }
}
