package org.example.command;

import org.example.resourceException.ResourceException;

import java.io.IOException;

public interface Command {

    void execute() throws ResourceException, IOException;

}
