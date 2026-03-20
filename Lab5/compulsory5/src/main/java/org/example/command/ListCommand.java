package org.example.command;

import org.example.repository.Repository;
import lombok.*;
import org.example.resource.Resource;

@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ListCommand implements Command{

    private Repository repository;

    @Override
    public void execute() {
        System.out.println("Nume: " + repository.getName());
        for (Resource resource : repository.getResources() ) {
            System.out.println(resource.getTitle());
        }
    }

}
