package org.revelation.decorations.items.chess;

import org.revelation.decorations.ModConfig;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;

public class ChessBlackQueen {
    public static void createChessBlackQueen() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("org.revelation.chessblackqueen")
                .name("Chess Black Queen", "Chess Black Queens", "A chess piece used in playing a strategy game.")
                .modelName("model.toy.chessblackqueen.")
                .imageNumber((short)0)
                .behaviourType((short)1)
                .combatDamage(0)
                .decayTime(9072000L)
                .dimensions(1, 1, 1)
                .weightGrams(ModConfig.ChessBlackQueenWeight)
                .material(Materials.MATERIAL_SLATE)
                .value(ModConfig.ChessBlackQueenValue)
                .isTraded(true)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_STONE,
                        ItemTypes.ITEM_TYPE_REPAIRABLE,
                        ItemTypes.ITEM_TYPE_NOT_MISSION,
                        ItemTypes.ITEM_TYPE_DECORATION,
                        ItemTypes.ITEM_TYPE_COLORABLE
                })
                .build();

        int chessBlackQueenTemplateId = temp.getTemplateId();

        CreationEntryCreator.createSimpleEntry(ModConfig.ChessBlackQueenSkill, ItemList.stoneChisel, ItemList.slateShard, chessBlackQueenTemplateId, false, true, 0.0f, false, false, CreationCategories.TOYS);
    }
}