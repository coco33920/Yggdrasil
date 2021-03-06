package net.akami.yggdrasil.spell.test;

import net.akami.yggdrasil.api.spell.Spell;
import net.akami.yggdrasil.api.spell.SpellLauncher;
import net.akami.yggdrasil.api.spell.SpellTier;

import java.util.Arrays;
import java.util.List;

public class EarthTowerSpell implements Spell {

    private List<SpellTier> tiers;

    @Override
    public SpellLauncher getLauncher() {
        return null;
    }

    public EarthTowerSpell() {
        this.tiers = Arrays.asList(
                new EarthTowerTestTier(),
                new EarthTowerTestTier(),
                new EarthTowerTestTier());
    }

    @Override
    public List<SpellTier> getTiers() {
        return tiers;
    }
}
