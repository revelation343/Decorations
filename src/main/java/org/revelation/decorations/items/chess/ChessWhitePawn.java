package org.revelation.decorations.items.chess;

import org.revelation.decorations.ModConfig;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;

public class ChessWhitePawn {
    public static void createChessWhitePawn() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("org.revelation.chesswhitepawn")
                .name("Chess White Pawn", "Chess White Pawns", "A chess piece used in playing a strategy game.")
                .modelName("model.toy.chesswhitepawn.")
                .imageNumber((short)0)
                .behaviourType((short)1)
                .combatDamage(0)
                .decayTime(9072000L)
                .dimensions(1, 1, 1)
                .weightGrams(ModConfig.ChessWhitePawnWeight)
                .material(Materials.MATERIAL_MARBLE)
                .value(ModConfig.ChessWhitePawnValue)
                .isTraded(true)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_STONE,
                        ItemTypes.ITEM_TYPE_REPAIRABLE,
                        ItemTypes.ITEM_TYPE_NOT_MISSION,
                        ItemTypes.ITEM_TYPE_DECORATION,
                        ItemTypes.ITEM_TYPE_COLORABLE
                })
                .build();

        int chessWhitePawnTemplateId = temp.getTemplateId();

        CreationEntryCreator.createSimpleEntry(ModConfig.ChessWhitePawnSkill, ItemList.stoneChisel, ItemList.marbleShard, chessWhitePawnTemplateId, false, true, 0.0f, false, false, CreationCategories.TOYS);
    }
}
