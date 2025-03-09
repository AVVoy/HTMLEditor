package com.javarush.task.task32.task3209;

import javax.swing.filechooser.FileFilter;
import java.io.File;
import java.nio.file.Files;

public class HTMLFileFilter extends FileFilter {
    @Override
    public boolean accept(File f) {
        String string = f.getName().toLowerCase();
        if (f.isDirectory()) return true;
        if (string.endsWith(".html".toLowerCase()) ||
                string.endsWith(".htm".toLowerCase()))
            return true;
        return false;
    }

    @Override
    public String getDescription() {
        return "HTML и HTM файлы";
    }
}
