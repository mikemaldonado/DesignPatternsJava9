//Author: Mike Maldonado
package com.premaseem.prototypePattern;

import com.premaseem.prototypePattern.Molecule.MoleculePrototype;

import java.util.Scanner;

public class MoleculeClientFile {
    public static void main(String[] args) {
        System.out.println("Welcome to Prototype design patterns Lab ");
        Scanner scan = new Scanner(System.in);
        SubstanceCache substanceLab = SubstanceCache.getInstance();
        Molecule subjectMolecule;

        int repeatRunFlag = 1;

        while(repeatRunFlag == 1) {

            System.out.println("Choose molecule substance solid|plasma|liquid|vapor|gas");
            System.out.println("press 1 for solid");
            System.out.println("press 2 for liquid");
            System.out.println("press 3 for plasma");
            System.out.println("press 4 for vapor");
            System.out.println("press 5 for gas");

            int type = scan.nextInt();
            switch (type) {
                case 1:
                    subjectMolecule = substanceLab.getMoleculeProtoType(MoleculePrototype.SOLID);
                    break;
                case 2:
                    subjectMolecule = substanceLab.getMoleculeProtoType(MoleculePrototype.LIQUID);
                    break;
                case 3:
                    subjectMolecule = substanceLab.getMoleculeProtoType(MoleculePrototype.PLASMA);
                    break;
                case 4:
                    subjectMolecule = substanceLab.getMoleculeProtoType(MoleculePrototype.VAPOR);
                    break;
                case 5:
                    subjectMolecule = substanceLab.getMoleculeProtoType(MoleculePrototype.GAS);
                    break;
                default:
                    System.out.println("Incorrect input. Try again...");
                    continue;
            }

            System.out.println("Increasing substance density...");
            for (int i = 0; i < 10; i++) {
                System.out.println(subjectMolecule.addNewMolecule());
                System.out.println(" ...........  ........  >>>> .... ");
            }

            System.out.println("=============================");
            System.out.println("Press 1 to Repeat .... ");
            repeatRunFlag = scan.nextInt();

        }
    }
}
