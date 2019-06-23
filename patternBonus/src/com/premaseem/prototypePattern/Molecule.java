package com.premaseem.prototypePattern;

public class Molecule implements Cloneable{
    public Molecule() {
        System.out.println("Molecule Constructor called...");
    }

    String moleculeStateString;

    public enum MoleculePrototype {
        SOLID, PLASMA, LIQUID, VAPOR, GAS
    }

    public Object addNewMolecule() {
        Object cloneMolecule = null;
        try {
            cloneMolecule = clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloneMolecule;
    }

    @Override
    public String toString() {
        return moleculeStateString + " with id " + hashCode();
    }
}



class SolidMolecule extends Molecule {
    public SolidMolecule() {
        moleculeStateString = "Solid";
        System.out.println("SolidMolecule Constructor called");
    }
}

class PlasmaMolecule extends Molecule {
    public PlasmaMolecule()
    {
        moleculeStateString = "Plasma";
        System.out.println("PlasmaMolecule Constructor called");
    }
}

class LiquidMolecule extends  Molecule {
    public LiquidMolecule() {
        moleculeStateString = "Liquid";
        System.out.println("LicquidMolecule Constructor called");
    }
}

class VaporMolecule extends Molecule {
    public VaporMolecule() {
        moleculeStateString = "Vapor";
        System.out.println("VaporMolecule Constructor called");
    }
}

class GasMolecule extends Molecule {
    public GasMolecule() {
        moleculeStateString = "Gas";
        System.out.println("GasMolecule Constructor called");
    }
}

