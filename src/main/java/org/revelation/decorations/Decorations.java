package org.revelation.decorations;

import org.gotti.wurmunlimited.modloader.interfaces.Configurable;
import org.gotti.wurmunlimited.modloader.interfaces.Initable;
import org.gotti.wurmunlimited.modloader.interfaces.ItemTemplatesCreatedListener;
import org.gotti.wurmunlimited.modloader.interfaces.WurmServerMod;
import org.gotti.wurmunlimited.modsupport.vehicles.ModVehicleBehaviours;
import org.revelation.decorations.items.*;
import org.revelation.decorations.items.chess.*;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class Decorations implements WurmServerMod, Configurable, ItemTemplatesCreatedListener, Initable {
    public static final Logger logger = Logger.getLogger(Decorations.class.getName());

    public String getVersion() {
        return "v2.0";
    }

    @Override
    public void configure(Properties properties) {
        // Logging
        ModConfig.enableLogging = Boolean.parseBoolean(properties.getProperty("enableLogging", "true"));

        // Chess Black Bishop
        ModConfig.ChessBlackBishopEnabled = Boolean.parseBoolean(properties.getProperty("ChessBlackBishopEnabled", "true"));
        ModConfig.ChessBlackBishopWeight = Integer.parseInt(properties.getProperty("ChessBlackBishopWeight", "1"));
        ModConfig.ChessBlackBishopValue = Integer.parseInt(properties.getProperty("ChessBlackBishopValue", "10000"));
        ModConfig.ChessBlackBishopSkill = Integer.parseInt(properties.getProperty("ChessBlackBishopSkill", "10074"));

        // Chess Black Castle
        ModConfig.ChessBlackCastleEnabled = Boolean.parseBoolean(properties.getProperty("ChessBlackCastleEnabled", "true"));
        ModConfig.ChessBlackCastleWeight = Integer.parseInt(properties.getProperty("ChessBlackCastleWeight", "1"));
        ModConfig.ChessBlackCastleValue = Integer.parseInt(properties.getProperty("ChessBlackCastleValue", "10000"));
        ModConfig.ChessBlackCastleSkill = Integer.parseInt(properties.getProperty("ChessBlackCastleSkill", "10074"));

        // Chess Black Horse
        ModConfig.ChessBlackHorseEnabled = Boolean.parseBoolean(properties.getProperty("ChessBlackHorseEnabled", "true"));
        ModConfig.ChessBlackHorseWeight = Integer.parseInt(properties.getProperty("ChessBlackHorseWeight", "1"));
        ModConfig.ChessBlackHorseValue = Integer.parseInt(properties.getProperty("ChessBlackHorseValue", "10000"));
        ModConfig.ChessBlackHorseSkill = Integer.parseInt(properties.getProperty("ChessBlackHorseSkill", "10074"));

        // Chess Black King
        ModConfig.ChessBlackKingEnabled = Boolean.parseBoolean(properties.getProperty("ChessBlackKingEnabled", "true"));
        ModConfig.ChessBlackKingWeight = Integer.parseInt(properties.getProperty("ChessBlackKingWeight", "1"));
        ModConfig.ChessBlackKingValue = Integer.parseInt(properties.getProperty("ChessBlackKingValue", "10000"));
        ModConfig.ChessBlackKingSkill = Integer.parseInt(properties.getProperty("ChessBlackKingSkill", "10074"));

        // Chess Black Pawn
        ModConfig.ChessBlackPawnEnabled = Boolean.parseBoolean(properties.getProperty("ChessBlackPawnEnabled", "true"));
        ModConfig.ChessBlackPawnWeight = Integer.parseInt(properties.getProperty("ChessBlackPawnWeight", "1"));
        ModConfig.ChessBlackPawnValue = Integer.parseInt(properties.getProperty("ChessBlackPawnValue", "10000"));
        ModConfig.ChessBlackPawnSkill = Integer.parseInt(properties.getProperty("ChessBlackPawnSkill", "10074"));

        // Chess Black Queen
        ModConfig.ChessBlackQueenEnabled = Boolean.parseBoolean(properties.getProperty("ChessBlackQueenEnabled", "true"));
        ModConfig.ChessBlackQueenWeight = Integer.parseInt(properties.getProperty("ChessBlackQueenWeight", "1"));
        ModConfig.ChessBlackQueenValue = Integer.parseInt(properties.getProperty("ChessBlackQueenValue", "10000"));
        ModConfig.ChessBlackQueenSkill = Integer.parseInt(properties.getProperty("ChessBlackQueenSkill", "10074"));

        // Chess Chair
        ModConfig.ChessChairEnabled = Boolean.parseBoolean(properties.getProperty("ChessChairEnabled", "true"));
        ModConfig.ChessChairWeight = Integer.parseInt(properties.getProperty("ChessChairWeight", "500"));
        ModConfig.ChessChairValue = Integer.parseInt(properties.getProperty("ChessChairValue", "10000"));
        ModConfig.ChessChairSkill = Integer.parseInt(properties.getProperty("ChessChairSkill", "10044"));

        // Chess Table
        ModConfig.ChessTableEnabled = Boolean.parseBoolean(properties.getProperty("ChessTableEnabled", "true"));
        ModConfig.ChessTableWeight = Integer.parseInt(properties.getProperty("ChessTableWeight", "5000"));
        ModConfig.ChessTableValue = Integer.parseInt(properties.getProperty("ChessTableValue", "10000"));
        ModConfig.ChessTableSkill = Integer.parseInt(properties.getProperty("ChessTableSkill", "10044"));

        // Chess White Bishop
        ModConfig.ChessWhiteBishopEnabled = Boolean.parseBoolean(properties.getProperty("ChessWhiteBishopEnabled", "true"));
        ModConfig.ChessWhiteBishopWeight = Integer.parseInt(properties.getProperty("ChessWhiteBishopWeight", "1"));
        ModConfig.ChessWhiteBishopValue = Integer.parseInt(properties.getProperty("ChessWhiteBishopValue", "10000"));
        ModConfig.ChessWhiteBishopSkill = Integer.parseInt(properties.getProperty("ChessWhiteBishopSkill", "10074"));

        // Chess White Castle
        ModConfig.ChessWhiteCastleEnabled = Boolean.parseBoolean(properties.getProperty("ChessWhiteCastleEnabled", "true"));
        ModConfig.ChessWhiteCastleWeight = Integer.parseInt(properties.getProperty("ChessWhiteCastleWeight", "1"));
        ModConfig.ChessWhiteCastleValue = Integer.parseInt(properties.getProperty("ChessWhiteCastleValue", "10000"));
        ModConfig.ChessWhiteCastleSkill = Integer.parseInt(properties.getProperty("ChessWhiteCastleSkill", "10074"));

        // Chess White Horse
        ModConfig.ChessWhiteHorseEnabled = Boolean.parseBoolean(properties.getProperty("ChessWhiteHorseEnabled", "true"));
        ModConfig.ChessWhiteHorseWeight = Integer.parseInt(properties.getProperty("ChessWhiteHorseWeight", "1"));
        ModConfig.ChessWhiteHorseValue = Integer.parseInt(properties.getProperty("ChessWhiteHorseValue", "10000"));
        ModConfig.ChessWhiteHorseSkill = Integer.parseInt(properties.getProperty("ChessWhiteHorseSkill", "10074"));

        // Chess White King
        ModConfig.ChessWhiteKingEnabled = Boolean.parseBoolean(properties.getProperty("ChessWhiteKingEnabled", "true"));
        ModConfig.ChessWhiteKingWeight = Integer.parseInt(properties.getProperty("ChessWhiteKingWeight", "1"));
        ModConfig.ChessWhiteKingValue = Integer.parseInt(properties.getProperty("ChessWhiteKingValue", "10000"));
        ModConfig.ChessWhiteKingSkill = Integer.parseInt(properties.getProperty("ChessWhiteKingSkill", "10074"));

        // Chess White Pawn
        ModConfig.ChessWhitePawnEnabled = Boolean.parseBoolean(properties.getProperty("ChessWhitePawnEnabled", "true"));
        ModConfig.ChessWhitePawnWeight = Integer.parseInt(properties.getProperty("ChessWhitePawnWeight", "1"));
        ModConfig.ChessWhitePawnValue = Integer.parseInt(properties.getProperty("ChessWhitePawnValue", "10000"));
        ModConfig.ChessWhitePawnSkill = Integer.parseInt(properties.getProperty("ChessWhitePawnSkill", "10074"));

        // Chess White Queen
        ModConfig.ChessWhiteQueenEnabled = Boolean.parseBoolean(properties.getProperty("ChessWhiteQueenEnabled", "true"));
        ModConfig.ChessWhiteQueenWeight = Integer.parseInt(properties.getProperty("ChessWhiteQueenWeight", "1"));
        ModConfig.ChessWhiteQueenValue = Integer.parseInt(properties.getProperty("ChessWhiteQueenValue", "10000"));
        ModConfig.ChessWhiteQueenSkill = Integer.parseInt(properties.getProperty("ChessWhiteQueenSkill", "10074"));

        // Bilboquet
        ModConfig.BilboquetEnabled = Boolean.parseBoolean(properties.getProperty("BilboquetEnabled", "true"));
        ModConfig.BilboquetWeight = Integer.parseInt(properties.getProperty("BilboquetWeight", "1"));
        ModConfig.BilboquetValue = Integer.parseInt(properties.getProperty("BilboquetValue", "10000"));
        ModConfig.BilboquetSkill = Integer.parseInt(properties.getProperty("BilboquetSkill", "10044"));

        // Bowling Set
        ModConfig.BowlingSetEnabled = Boolean.parseBoolean(properties.getProperty("BowlingSetEnabled", "true"));
        ModConfig.BowlingSetWeight = Integer.parseInt(properties.getProperty("BowlingSetWeight", "1"));
        ModConfig.BowlingSetValue = Integer.parseInt(properties.getProperty("BowlingSetValue", "1"));
        ModConfig.BowlingSetSkill = Integer.parseInt(properties.getProperty("BowlingSetSkill", "1"));

        // Bunny
        ModConfig.BunnyEnabled = Boolean.parseBoolean(properties.getProperty("BunnyEnabled", "true"));
        ModConfig.BunnyWeight = Integer.parseInt(properties.getProperty("BunnyWeight", "10000"));
        ModConfig.BunnyValue = Integer.parseInt(properties.getProperty("BunnyValue", "10000"));
        ModConfig.BunnySkill = Integer.parseInt(properties.getProperty("BunnySkill", "10016"));

        // Dragon Block Set
        ModConfig.DragonBlockSetEnabled = Boolean.parseBoolean(properties.getProperty("DragonBlockSetEnabled", "true"));
        ModConfig.DragonBlockSetWeight = Integer.parseInt(properties.getProperty("DragonBlockSetWeight", "1"));
        ModConfig.DragonBlockSetValue = Integer.parseInt(properties.getProperty("DragonBlockSetValue", "10000"));
        ModConfig.DragonBlockSetSkill = Integer.parseInt(properties.getProperty("DragonBlockSetSkill", "10044"));

        // Duck
        ModConfig.DuckEnabled = Boolean.parseBoolean(properties.getProperty("DuckEnabled", "true"));
        ModConfig.DuckWeight = Integer.parseInt(properties.getProperty("DuckWeight", "1"));
        ModConfig.DuckValue = Integer.parseInt(properties.getProperty("DuckValue", "10000"));
        ModConfig.DuckSkill = Integer.parseInt(properties.getProperty("DuckSkill", "1011"));

        // Koala
        ModConfig.KoalaEnabled = Boolean.parseBoolean(properties.getProperty("KoalaEnabled", "true"));
        ModConfig.KoalaWeight = Integer.parseInt(properties.getProperty("KoalaWeight", "10000"));
        ModConfig.KoalaValue = Integer.parseInt(properties.getProperty("KoalaValue", "10000"));
        ModConfig.KoalaSkill = Integer.parseInt(properties.getProperty("KoalaSkill", "10016"));

        // Leaning Axe
        ModConfig.LeaningAxeEnabled = Boolean.parseBoolean(properties.getProperty("LeaningAxeEnabled", "true"));
        ModConfig.LeaningAxeWeight = Integer.parseInt(properties.getProperty("LeaningAxeWeight", "1"));
        ModConfig.LeaningAxeValue = Integer.parseInt(properties.getProperty("LeaningAxeValue", "10000"));
        ModConfig.LeaningAxeSkill = Integer.parseInt(properties.getProperty("LeaningAxeSkill", "1016"));

        // Lute
        ModConfig.LuteEnabled = Boolean.parseBoolean(properties.getProperty("LuteEnabled", "true"));
        ModConfig.LuteWeight = Integer.parseInt(properties.getProperty("LuteWeight", "1"));
        ModConfig.LuteValue = Integer.parseInt(properties.getProperty("LuteValue", "1000"));
        ModConfig.LuteSkill = Integer.parseInt(properties.getProperty("LuteSkill", "10044"));

        // Marbles
        ModConfig.MarblesEnabled = Boolean.parseBoolean(properties.getProperty("MarblesEnabled", "true"));
        ModConfig.MarblesWeight = Integer.parseInt(properties.getProperty("MarblesWeight", "1"));
        ModConfig.MarblesValue = Integer.parseInt(properties.getProperty("MarblesValue", "10000"));
        ModConfig.MarblesSkill = Integer.parseInt(properties.getProperty("MarblesSkill", "1011"));

        // Rocking Horse
        ModConfig.RockingHorseEnabled = Boolean.parseBoolean(properties.getProperty("RockingHorseEnabled", "true"));
        ModConfig.RockingHorseWeight = Integer.parseInt(properties.getProperty("RockingHorseWeight", "500"));
        ModConfig.RockingHorseValue = Integer.parseInt(properties.getProperty("RockingHorseValue", "10000"));
        ModConfig.RockingHorseSkill = Integer.parseInt(properties.getProperty("RockingHorseSkill", "10044"));

        // Teddy Bear
        ModConfig.TeddyBearEnabled = Boolean.parseBoolean(properties.getProperty("TeddyBearEnabled", "true"));
        ModConfig.TeddyBearWeight = Integer.parseInt(properties.getProperty("TeddyBearWeight", "10000"));
        ModConfig.TeddyBearValue = Integer.parseInt(properties.getProperty("TeddyBearValue", "10000"));
        ModConfig.TeddyBearSkill = Integer.parseInt(properties.getProperty("TeddyBearSkill", "10016"));
    }

    @Override
    public void onItemTemplatesCreated() {
        if (ModConfig.enableLogging) {
            logger.info("ChessBlackBishopEnabled: " + ModConfig.ChessBlackBishopEnabled);
            logger.info("ChessBlackBishopWeight: " + ModConfig.ChessBlackBishopWeight);
            logger.info("ChessBlackBishopValue: " + ModConfig.ChessBlackBishopValue);
            logger.info("ChessBlackBishopSkill: " + ModConfig.ChessBlackBishopSkill);

            logger.info("ChessBlackCastleEnabled: " + ModConfig.ChessBlackCastleEnabled);
            logger.info("ChessBlackCastleWeight: " + ModConfig.ChessBlackCastleWeight);
            logger.info("ChessBlackCastleValue: " + ModConfig.ChessBlackCastleValue);
            logger.info("ChessBlackCastleSkill: " + ModConfig.ChessBlackCastleSkill);

            logger.info("ChessBlackHorseEnabled: " + ModConfig.ChessBlackHorseEnabled);
            logger.info("ChessBlackHorseWeight: " + ModConfig.ChessBlackHorseWeight);
            logger.info("ChessBlackHorseValue: " + ModConfig.ChessBlackHorseValue);
            logger.info("ChessBlackHorseSkill: " + ModConfig.ChessBlackHorseSkill);

            logger.info("ChessBlackKingEnabled: " + ModConfig.ChessBlackKingEnabled);
            logger.info("ChessBlackKingWeight: " + ModConfig.ChessBlackKingWeight);
            logger.info("ChessBlackKingValue: " + ModConfig.ChessBlackKingValue);
            logger.info("ChessBlackKingSkill: " + ModConfig.ChessBlackKingSkill);

            logger.info("ChessBlackPawnEnabled: " + ModConfig.ChessBlackPawnEnabled);
            logger.info("ChessBlackPawnWeight: " + ModConfig.ChessBlackPawnWeight);
            logger.info("ChessBlackPawnValue: " + ModConfig.ChessBlackPawnValue);
            logger.info("ChessBlackPawnSkill: " + ModConfig.ChessBlackPawnSkill);

            logger.info("ChessBlackQueenEnabled: " + ModConfig.ChessBlackQueenEnabled);
            logger.info("ChessBlackQueenWeight: " + ModConfig.ChessBlackQueenWeight);
            logger.info("ChessBlackQueenValue: " + ModConfig.ChessBlackQueenValue);
            logger.info("ChessBlackQueenSkill: " + ModConfig.ChessBlackQueenSkill);

            logger.info("ChessChairEnabled: " + ModConfig.ChessChairEnabled);
            logger.info("ChessChairWeight: " + ModConfig.ChessChairWeight);
            logger.info("ChessChairValue: " + ModConfig.ChessChairValue);
            logger.info("ChessChairSkill: " + ModConfig.ChessChairSkill);

            logger.info("ChessTableEnabled: " + ModConfig.ChessTableEnabled);
            logger.info("ChessTableWeight: " + ModConfig.ChessTableWeight);
            logger.info("ChessTableValue: " + ModConfig.ChessTableValue);
            logger.info("ChessTableSkill: " + ModConfig.ChessTableSkill);

            logger.info("ChessWhiteBishopEnabled: " + ModConfig.ChessWhiteBishopEnabled);
            logger.info("ChessWhiteBishopWeight: " + ModConfig.ChessWhiteBishopWeight);
            logger.info("ChessWhiteBishopValue: " + ModConfig.ChessWhiteBishopValue);
            logger.info("ChessWhiteBishopSkill: " + ModConfig.ChessWhiteBishopSkill);

            logger.info("ChessWhiteCastleEnabled: " + ModConfig.ChessWhiteCastleEnabled);
            logger.info("ChessWhiteCastleWeight: " + ModConfig.ChessWhiteCastleWeight);
            logger.info("ChessWhiteCastleValue: " + ModConfig.ChessWhiteCastleValue);
            logger.info("ChessWhiteCastleSkill: " + ModConfig.ChessWhiteCastleSkill);

            logger.info("ChessWhiteHorseEnabled: " + ModConfig.ChessWhiteHorseEnabled);
            logger.info("ChessWhiteHorseWeight: " + ModConfig.ChessWhiteHorseWeight);
            logger.info("ChessWhiteHorseValue: " + ModConfig.ChessWhiteHorseValue);
            logger.info("ChessWhiteHorseSkill: " + ModConfig.ChessWhiteHorseSkill);

            logger.info("ChessWhiteKingEnabled: " + ModConfig.ChessWhiteKingEnabled);
            logger.info("ChessWhiteKingWeight: " + ModConfig.ChessWhiteKingWeight);
            logger.info("ChessWhiteKingValue: " + ModConfig.ChessWhiteKingValue);
            logger.info("ChessWhiteKingSkill: " + ModConfig.ChessWhiteKingSkill);

            logger.info("ChessWhitePawnEnabled: " + ModConfig.ChessWhitePawnEnabled);
            logger.info("ChessWhitePawnWeight: " + ModConfig.ChessWhitePawnWeight);
            logger.info("ChessWhitePawnValue: " + ModConfig.ChessWhitePawnValue);
            logger.info("ChessWhitePawnSkill: " + ModConfig.ChessWhitePawnSkill);

            logger.info("ChessWhiteQueenEnabled: " + ModConfig.ChessWhiteQueenEnabled);
            logger.info("ChessWhiteQueenWeight: " + ModConfig.ChessWhiteQueenWeight);
            logger.info("ChessWhiteQueenValue: " + ModConfig.ChessWhiteQueenValue);
            logger.info("ChessWhiteQueenSkill: " + ModConfig.ChessWhiteQueenSkill);

            logger.info("BilboquetEnabled: " + ModConfig.BilboquetEnabled);
            logger.info("BilboquetWeight: " + ModConfig.BilboquetWeight);
            logger.info("BilboquetValue: " + ModConfig.BilboquetValue);
            logger.info("BilboquetSkill: " + ModConfig.BilboquetSkill);

            logger.info("BowlingSetEnabled: " + ModConfig.BowlingSetEnabled);
            logger.info("BowlingSetWeight: " + ModConfig.BowlingSetWeight);
            logger.info("BowlingSetValue: " + ModConfig.BowlingSetValue);
            logger.info("BowlingSetSkill: " + ModConfig.BowlingSetSkill);

            logger.info("BunnyEnabled: " + ModConfig.BunnyEnabled);
            logger.info("BunnyWeight: " + ModConfig.BunnyWeight);
            logger.info("BunnyValue: " + ModConfig.BunnyValue);
            logger.info("BunnySkill: " + ModConfig.BunnySkill);

            logger.info("DragonBlockSetEnabled: " + ModConfig.DragonBlockSetEnabled);
            logger.info("DragonBlockSetWeight: " + ModConfig.DragonBlockSetWeight);
            logger.info("DragonBlockSetValue: " + ModConfig.DragonBlockSetValue);
            logger.info("DragonBlockSetSkill: " + ModConfig.DragonBlockSetSkill);

            logger.info("DuckEnabled: " + ModConfig.DuckEnabled);
            logger.info("DuckWeight: " + ModConfig.DuckWeight);
            logger.info("DuckValue: " + ModConfig.DuckValue);
            logger.info("DuckSkill: " + ModConfig.DuckSkill);

            logger.info("KoalaEnabled: " + ModConfig.KoalaEnabled);
            logger.info("KoalaWeight: " + ModConfig.KoalaWeight);
            logger.info("KoalaValue: " + ModConfig.KoalaValue);
            logger.info("KoalaSkill: " + ModConfig.KoalaSkill);

            logger.info("LeaningAxeEnabled: " + ModConfig.LeaningAxeEnabled);
            logger.info("LeaningAxeWeight: " + ModConfig.LeaningAxeWeight);
            logger.info("LeaningAxeValue: " + ModConfig.LeaningAxeValue);
            logger.info("LeaningAxeSkill: " + ModConfig.LeaningAxeSkill);

            logger.info("LuteEnabled: " + ModConfig.LuteEnabled);
            logger.info("LuteWeight: " + ModConfig.LuteWeight);
            logger.info("LuteValue: " + ModConfig.LuteValue);
            logger.info("LuteSkill: " + ModConfig.LuteSkill);

            logger.info("MarblesEnabled: " + ModConfig.MarblesEnabled);
            logger.info("MarblesWeight: " + ModConfig.MarblesWeight);
            logger.info("MarblesValue: " + ModConfig.MarblesValue);
            logger.info("MarblesSkill: " + ModConfig.MarblesSkill);

            logger.info("RockingHorseEnabled: " + ModConfig.RockingHorseEnabled);
            logger.info("RockingHorseWeight: " + ModConfig.RockingHorseWeight);
            logger.info("RockingHorseValue: " + ModConfig.RockingHorseValue);
            logger.info("RockingHorseSkill: " + ModConfig.RockingHorseSkill);

            logger.info("TeddyBearEnabled: " + ModConfig.TeddyBearEnabled);
            logger.info("TeddyBearWeight: " + ModConfig.TeddyBearWeight);
            logger.info("TeddyBearValue: " + ModConfig.TeddyBearValue);
            logger.info("TeddyBearSkill: " + ModConfig.TeddyBearSkill);
        }
        try {
            if (ModConfig.ChessBlackBishopEnabled)
                ChessBlackBishop.createChessBlackBishop();
            if (ModConfig.ChessBlackCastleEnabled)
                ChessBlackCastle.createChessBlackCastle();
            if (ModConfig.ChessBlackHorseEnabled)
                ChessBlackHorse.createChessBlackHorse();
            if (ModConfig.ChessBlackKingEnabled)
                ChessBlackKing.createChessBlackKing();
            if (ModConfig.ChessBlackPawnEnabled)
                ChessBlackPawn.createChessBlackPawn();
            if (ModConfig.ChessBlackQueenEnabled)
                ChessBlackQueen.createChessBlackQueen();
            if (ModConfig.ChessChairEnabled)
                ChessChair.createChessChair();
            if (ModConfig.ChessTableEnabled)
                ChessTable.createChessTable();
            if (ModConfig.ChessWhiteBishopEnabled)
                ChessWhiteBishop.createChessWhiteBishop();
            if (ModConfig.ChessWhiteCastleEnabled)
                ChessWhiteCastle.createChessWhiteCastle();
            if (ModConfig.ChessWhiteHorseEnabled)
                ChessWhiteHorse.createChessWhiteHorse();
            if (ModConfig.ChessWhiteKingEnabled)
                ChessWhiteKing.createChessWhiteKing();
            if (ModConfig.ChessWhitePawnEnabled)
                ChessWhitePawn.createChessWhitePawn();
            if (ModConfig.ChessWhiteQueenEnabled)
                ChessWhiteQueen.createChessWhiteQueen();
            if (ModConfig.BilboquetEnabled)
                Bilboquet.createBilboquet();
            if (ModConfig.BowlingSetEnabled)
                BowlingSet.createBowlingSet();
            if (ModConfig.BunnyEnabled)
                Bunny.createBunny();
            if (ModConfig.DragonBlockSetEnabled)
                DragonBlockSet.createDragonBlockSet();
            if (ModConfig.DuckEnabled)
                Duck.createDuck();
            if (ModConfig.KoalaEnabled)
                Koala.createKoala();
            if (ModConfig.LeaningAxeEnabled)
                LeaningAxe.createLeaningAxe();
            if (ModConfig.LuteEnabled)
                Lute.createLute();
            if (ModConfig.MarblesEnabled)
                Marbles.createMarbles();
            if (ModConfig.RockingHorseEnabled)
                RockingHorse.createRockingHorse();
            if (ModConfig.TeddyBearEnabled)
                TeddyBear.createTeddyBear();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void init() {
        ModVehicleBehaviours.init();
    }
}