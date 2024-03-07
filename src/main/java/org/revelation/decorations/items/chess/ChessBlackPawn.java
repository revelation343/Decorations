package org.revelation.decorations.items.chess;

import org.revelation.decorations.ModConfig;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;

public class ChessBlackPawn {
    public static void createChessBlackPawn() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("org.revelation.chessblackpawn")
                .name("Chess Black Pawn", "Chess Black Pawns", "A chess piece used in playing a strategy game.")
                .modelName("model.toy.chessblackpawn.")
                .imageNumber((short)0)
                .behaviourType((short)1)
                .combatDamage(0)
                .decayTime(9072000L)
                .dimensions(1, 1, 1)
                .weightGrams(ModConfig.ChessBlackPawnWeight)
                .material(Materials.MATERIAL_SLATE)
                .value(ModConfig.ChessBlackPawnValue)
                .isTraded(true)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_STONE,
                        ItemTypes.ITEM_TYPE_REPAIRABLE,
                        ItemTypes.ITEM_TYPE_NOT_MISSION,
                        ItemTypes.ITEM_TYPE_DECORATION,
                        ItemTypes.ITEM_TYPE_COLORABLE
                })
                .build();

        int chessBlackPawnTemplateId = temp.getTemplateId();

        CreationEntryCreator.createSimpleEntry(ModConfig.ChessBlackPawnSkill, ItemList.stoneChisel, ItemList.slateShard, chessBlackPawnTemplateId, false, true, 0.0f, false, false, CreationCategories.TOYS);
    }
}
