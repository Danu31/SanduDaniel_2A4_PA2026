package org.example.command;
import org.example.repository.Repository;
import lombok.*;
import org.example.resource.Resource;
import freemarker.template.*;
import org.example.resourceException.ResourceException;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.*;

@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ReportCommand implements Command{

    private Repository repository;

    @Override
    public void execute() throws ResourceException {

        try{
            Configuration configuration = new Configuration(Configuration.VERSION_2_3_22);

            configuration.setDirectoryForTemplateLoading(new File("C:\\Users\\Mihaela\\Desktop\\Daniel\\Facultate\\Anul 2 Semestrul 2\\Java\\Lab5\\compulsory5\\src\\main\\java\\org\\example\\command\\HTMLReport"));
            configuration.setDefaultEncoding("UTF-8");

            Map<String, Object> data = new HashMap<>();
            data.put("repoName", repository.getName());
            data.put("resources", repository.getResources());

            Template template = configuration.getTemplate("report.ftl");
            File reportFile = new File("report.html");

            try (Writer out = new FileWriter(reportFile)) {
                template.process(data, out);
            }

            Desktop.getDesktop().open(reportFile);
        }
        catch (Exception e){
            throw new ResourceException("Eroare la generarea raportului: " + e.getMessage());
        }


    }


}
