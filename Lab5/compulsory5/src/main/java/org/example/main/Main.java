package org.example.main;

import org.example.command.Command;
import org.example.command.ReportCommand;
import org.example.command.ViewCommand;
import org.example.repository.Repository;
import org.example.resource.Resource;

public class Main {
    static void main() {
        try {
            Repository repo = new Repository();
            repo.setName("D&D resources");

            Resource oneDndPHB = new Resource("1", "One DND Player's handbook", "C:\\Users\\Mihaela\\Downloads\\OneDnD_PHB.pdf", "2024", "WOTC", "pirated copy of the new dnd phb");
            Resource dungeonMasterGuide = new Resource("2", "Dungeon's Master guide", "C:\\Users\\Mihaela\\Downloads\\Dungeon Masters Guide (2024) (1)", "2024", "WOTC", "pirated copy of the new dmg");
            Resource myCharacterSheet = new Resource( "3", "My character Sheet", "C:\\Users\\Mihaela\\Downloads\\DnD_2024_Character-Sheet", "2025", "Eu", "Character sheet pentru caracterul meu pe nume Mythros");
            Resource drivePrmFIICode = new Resource( "4", "Drive PRM FII Code 2026", "https://drive.google.com/drive/u/1/folders/1ZBHIhlL4j9qstIYCGlRrDSCWB0fwOdey", "2026" ,"Daniel", "Drive-ul prm de anul acesta de la proiectul FII Code");

            repo.add(oneDndPHB);
            repo.add(dungeonMasterGuide);
            repo.add(myCharacterSheet);
            repo.add(drivePrmFIICode);

            System.out.println(repo.toString());

//            repo.openResource("1");
//            repo.openResource("4");
//            repo.openResource("wrong id for testing");

            Command viewCommand = new ViewCommand(oneDndPHB);
            viewCommand.execute();

            Command reportCommand = new ReportCommand(repo);
            reportCommand.execute();

        } catch (Exception e) {
            System.err.println("Eroare: " + e.getMessage());
        }


    }

}

