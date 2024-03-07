package org.revelation.decorations.items.chess;

import org.revelation.decorations.ModConfig;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;

public class ChessWhiteQueen {
    public static void createChessWhiteQueen() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("org.revelation.chesswhitequeen")
                .name("Chess White Queen", "Chess White Queens", "A chess piece used in playing a strategy game.")
                .modelName("model.toy.chesswhitequeen.")
                .imageNumber((short)0)
                .behaviourType((short)1)
                .combatDamage(0)
                .decayTime(9072000L)
                .dimensions(1, 1, 1)
                .weightGrams(ModConfig.ChessWhiteQueenWeight)
                .material(Materials.MATERIAL_MARBLE)
                .value(ModConfig.ChessWhiteQueenValue)
                .isTraded(true)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_STONE,
                        ItemTypes.ITEM_TYPE_REPAIRABLE,
                        ItemTypes.ITEM_TYPE_NOT_MISSION,
                        ItemTypes.ITEM_TYPE_DECORATION,
                        ItemTypes.ITEM_TYPE_COLORABLE
                })
                .build();

        int chessWhiteQueenTemplateId = temp.getTemplateId();

        CreationEntryCreator.createSimpleEntry(ModConfig.ChessWhiteQueenSkill, ItemList.stoneChisel, ItemList.marbleShard, chessWhiteQueenTemplateId, false, true, 0.0f, false, false, CreationCategories.TOYS);
    }
}
