package com.premaseem.prototypePattern;

import com.premaseem.prototypePattern.Molecule.MoleculePrototype;

import java.util.EnumMap;
import java.util.Map;

public class SubstanceCache {

    private static SubstanceCache substanceCache = null;
    private Map<MoleculePrototype, Molecule> prototypeSample = new EnumMap<>(MoleculePrototype.class);

    private SubstanceCache() {
        loadSubstanceCache();
    }

    private void loadSubstanceCache() {
        prototypeSample.put(MoleculePrototype.SOLID, new SolidMolecule());
        prototypeSample.put(MoleculePrototype.LIQUID, new LiquidMolecule());
        prototypeSample.put(MoleculePrototype.PLASMA, new PlasmaMolecule());
        prototypeSample.put(MoleculePrototype.VAPOR, new VaporMolecule());
    }

    static public SubstanceCache getInstance() {
        if (substanceCache == null) {
            substanceCache = new SubstanceCache();
        }
        return substanceCache;
    }

    public Molecule getMoleculeProtoType(MoleculePrototype mol) { return prototypeSample.get(mol); }
}
