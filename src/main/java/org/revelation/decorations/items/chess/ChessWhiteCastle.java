package org.revelation.decorations.items.chess;

import org.revelation.decorations.ModConfig;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;

public class ChessWhiteCastle {
    public static void createChessWhiteCastle() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("org.revelation.chesswhitecastle")
                .name("Chess White Castle", "Chess White Castles", "A chess piece used in playing a strategy game.")
                .modelName("model.toy.chesswhitecastle.")
                .imageNumber((short)0)
                .behaviourType((short)1)
                .combatDamage(0)
                .decayTime(9072000L)
                .dimensions(1, 1, 1)
                .weightGrams(ModConfig.ChessWhiteCastleWeight)
                .material(Materials.MATERIAL_MARBLE)
                .value(ModConfig.ChessWhiteCastleValue)
                .isTraded(true)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_STONE,
                        ItemTypes.ITEM_TYPE_REPAIRABLE,
                        ItemTypes.ITEM_TYPE_NOT_MISSION,
                        ItemTypes.ITEM_TYPE_DECORATION,
                        ItemTypes.ITEM_TYPE_COLORABLE
                })
                .build();

        int chessWhiteCastleTemplateId = temp.getTemplateId();

        CreationEntryCreator.createSimpleEntry(ModConfig.ChessWhiteCastleSkill, ItemList.stoneChisel, ItemList.marbleShard, chessWhiteCastleTemplateId, false, true, 0.0f, false, false, CreationCategories.TOYS);
    }
}
