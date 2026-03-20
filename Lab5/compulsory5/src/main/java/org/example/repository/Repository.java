package org.example.repository;
import java.io.File;
import java.net.URI;
import java.util.*;
import lombok.*;
import org.example.resource.Resource;
import org.example.resourceException.ResourceException;

import java.awt.Desktop;

@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Repository {

    private String name;
    private List<Resource> resources = new ArrayList<>();

    public void add(Resource resource) {
        this.resources.add(resource);
    }

    public void openResource(String id) throws ResourceException {
        Resource resource = resources.stream()
                .filter(r -> r.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResourceException("Resursa " + id + " nu există!"));

        try {
            Desktop desktop = Desktop.getDesktop();
            if (resource.getLocation().startsWith("http")) {
                desktop.browse(new URI(resource.getLocation()));
            } else {
                desktop.open(new File(resource.getLocation()));
            }
        } catch (Exception e) {
            throw new ResourceException("Nu s-a putut deschide resursa: " + e.getMessage());
        }
    }

}
