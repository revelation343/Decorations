package org.revelation.decorations.items.chess;

import org.revelation.decorations.ModConfig;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;

public class ChessBlackHorse {
    public static void createChessBlackHorse() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("org.revelation.chessblackhorse")
                .name("Chess Black Horse", "Chess Black Horses", "A chess piece used in playing a strategy game.")
                .modelName("model.toy.chessblackhorse.")
                .imageNumber((short)0)
                .behaviourType((short)1)
                .combatDamage(0)
                .decayTime(9072000L)
                .dimensions(1, 1, 1)
                .weightGrams(ModConfig.ChessBlackHorseWeight)
                .material(Materials.MATERIAL_SLATE)
                .value(ModConfig.ChessBlackHorseValue)
                .isTraded(true)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_STONE,
                        ItemTypes.ITEM_TYPE_REPAIRABLE,
                        ItemTypes.ITEM_TYPE_NOT_MISSION,
                        ItemTypes.ITEM_TYPE_DECORATION,
                        ItemTypes.ITEM_TYPE_COLORABLE
                })
                .build();

        int chessBlackHorseTemplateId = temp.getTemplateId();

        CreationEntryCreator.createSimpleEntry(ModConfig.ChessBlackHorseSkill, ItemList.stoneChisel, ItemList.slateShard, chessBlackHorseTemplateId, false, true, 0.0f, false, false, CreationCategories.TOYS);
    }
}
