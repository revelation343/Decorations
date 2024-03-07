package org.revelation.decorations.items.chess;

import org.revelation.decorations.ModConfig;
import com.wurmonline.server.behaviours.Vehicle;
import com.wurmonline.server.creatures.Creature;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;
import org.gotti.wurmunlimited.modsupport.vehicles.ModVehicleBehaviour;
import org.gotti.wurmunlimited.modsupport.vehicles.ModVehicleBehaviours;
import org.gotti.wurmunlimited.modsupport.vehicles.VehicleFacade;

import java.io.IOException;

public class ChessChair {
    public static void createChessChair() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("org.revelation.chesschair")
                .name("Chess Chair", "Chess Chairs", "A decorative chair designed to match the Chess Table.")
                .modelName("model.furniture.chair.chesschair.")
                .imageNumber((short)274)
                .behaviourType((short)41)
                .combatDamage(0)
                .decayTime(9072000L)
                .dimensions(150, 150, 150)
                .weightGrams(ModConfig.ChessChairWeight)
                .material(Materials.MATERIAL_WOOD_BIRCH)
                .value(ModConfig.ChessChairValue)
                .isTraded(true)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_NAMED,
                        ItemTypes.ITEM_TYPE_WOOD,
                        ItemTypes.ITEM_TYPE_OWNER_DESTROYABLE,
                        ItemTypes.ITEM_TYPE_DESTROYABLE,
                        ItemTypes.ITEM_TYPE_OWNER_TURNABLE,
                        ItemTypes.ITEM_TYPE_DECORATION,
                        ItemTypes.ITEM_TYPE_REPAIRABLE,
                        ItemTypes.ITEM_TYPE_VEHICLE,
                        ItemTypes.ITEM_TYPE_CHAIR,
                        ItemTypes.ITEM_TYPE_PLANTABLE,
                        ItemTypes.ITEM_TYPE_HASDATA,
                        ItemTypes.ITEM_TYPE_NOT_MISSION,
                })
                .build();

        int chessChairTemplateId = temp.getTemplateId();

        AdvancedCreationEntry chessChair = CreationEntryCreator.createAdvancedEntry(ModConfig.ChessChairSkill, ItemList.knifeCarving, ItemList.plank, chessChairTemplateId, false, true, 0.0f, false, false, CreationCategories.FURNITURE);
        chessChair.addRequirement(new CreationRequirement(1, ItemList.shaft, 4, true));
        chessChair.addRequirement(new CreationRequirement(2, ItemList.plank, 4, true));

        ModVehicleBehaviours.addItemVehicle(chessChairTemplateId, new ModVehicleBehaviour() {
            @Override
            public void setSettingsForVehicle(Creature creature, Vehicle vehicle) {
            }
            @Override
            public void setSettingsForVehicle(Item item, Vehicle vehicle) {
                VehicleFacade facade = wrap(vehicle);
                facade.setCreature(false);
                vehicle.setMaxHeight(2500f);
                facade.createOnlyPassengerSeats(1);
                vehicle.setSeatFightMod(0, 1.0F, 0.4F);
                vehicle.setSeatOffset(0, 0.0F, 0.0F, 0.63F);
                vehicle.setChair(true);
                facade.setCommandType((byte) 2);
                facade.setName(item.getName());
                facade.setMaxDepth(-0.7F);
                facade.setMaxHeightDiff(0.04F);
            }
        });
    }
}
