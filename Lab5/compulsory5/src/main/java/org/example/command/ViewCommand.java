package org.example.command;
import org.example.repository.Repository;
import lombok.*;
import org.example.resource.Resource;
import org.example.resourceException.ResourceException;

import java.awt.*;
import java.io.File;
import java.net.URI;

@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor


public class ViewCommand implements Command{

    Resource resource;

    @Override
    public void execute() throws ResourceException {

        try{
            Desktop desktop = Desktop.getDesktop();
            if (resource.getLocation().startsWith("http")) {
                desktop.browse(new URI(resource.getLocation()));
            } else {
                desktop.open(new File(resource.getLocation()));
            }
        } catch (Exception e) {
            throw new ResourceException("Resource not found: " + e.getMessage());
        }

    }
}
