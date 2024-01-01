package org.example.commands;

import org.example.MyStringBuilder;

public interface Command {

    void undo(StringBuilder stringBuilder);
}
