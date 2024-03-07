package org.revelation.decorations.items.chess;

import org.revelation.decorations.ModConfig;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;

public class ChessBlackCastle {
    public static void createChessBlackCastle() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("org.revelation.chessblackcastle")
                .name("Chess Black Castle", "Chess Black Castles", "A chess piece used in playing a strategy game.")
                .modelName("model.toy.chessblackcastle.")
                .imageNumber((short)0)
                .behaviourType((short)1)
                .combatDamage(0)
                .decayTime(9072000L)
                .dimensions(1, 1, 1)
                .weightGrams(ModConfig.ChessBlackCastleWeight)
                .material(Materials.MATERIAL_SLATE)
                .value(ModConfig.ChessBlackCastleValue)
                .isTraded(true)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_STONE,
                        ItemTypes.ITEM_TYPE_REPAIRABLE,
                        ItemTypes.ITEM_TYPE_NOT_MISSION,
                        ItemTypes.ITEM_TYPE_DECORATION,
                        ItemTypes.ITEM_TYPE_COLORABLE
                })
                .build();

        int chessBlackCastleTemplateId = temp.getTemplateId();

        CreationEntryCreator.createSimpleEntry(ModConfig.ChessBlackCastleSkill, ItemList.stoneChisel, ItemList.slateShard, chessBlackCastleTemplateId, false, true, 0.0f, false, false, CreationCategories.TOYS);
    }
}