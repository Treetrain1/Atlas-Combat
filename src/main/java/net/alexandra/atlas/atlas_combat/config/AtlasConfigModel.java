package net.alexandra.atlas.atlas_combat.config;

import io.wispforest.owo.config.Option;
import io.wispforest.owo.config.annotation.*;
import net.alexandra.atlas.atlas_combat.AtlasCombat;

@Sync(Option.SyncMode.OVERRIDE_CLIENT)
@Modmenu(modId = AtlasCombat.MOD_ID)
@Config(name = AtlasCombat.MOD_ID, wrapperName = "AtlasConfig")
public class AtlasConfigModel {
	@SectionHeader("Booleans")
	public boolean toolsAreWeapons = false;
	@RestartRequired
	public boolean bedrockBlockReach = false;
	public boolean refinedCoyoteTime = false;
	public boolean midairKB = false;
	public boolean fishingHookKB = false;
	@RestartRequired
	public boolean fistDamage = false;
	public boolean swordBlocking = false;
	public boolean saturationHealing = false;
	@RestartRequired
	public boolean axeReachBuff = false;
	@RestartRequired
	public boolean blockReach = true;
	@RestartRequired
	public boolean attackReach = true;
	public boolean eatingInterruption = true;
	@SectionHeader("Integers")
	@RangeConstraint(min = -3, max = 4)
	public int swordProtectionEfficacy = 0;
	@RangeConstraint(min = 1, max = 1000)
	public int potionUseDuration = 20;
	@RangeConstraint(min = 1, max = 1000)
	public int honeyBottleUseDuration = 20;
	@RangeConstraint(min = 1, max = 1000)
	public int milkBucketUseDuration = 20;
	@RangeConstraint(min = 1, max = 1000)
	public int stewUseDuration = 20;
	@RangeConstraint(min = 1, max = 1000)
	public int instantHealthBonus = 6;
	@RangeConstraint(min = 1, max = 1000)
	public int eggItemCooldown = 4;
	@RangeConstraint(min = 1, max = 1000)
	public int snowballItemCooldown = 4;
	@SectionHeader("Floats")
	@RangeConstraint(min = 0, max = 40)
	public float snowballDamage = 0.0F;
	@RangeConstraint(min = 0, max = 4)
	public float bowUncertainty = 0.25F;
	public static class UseDurations {
	}
	public static class Cooldowns {
	}
}
