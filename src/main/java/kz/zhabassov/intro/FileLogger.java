package kz.zhabassov.intro;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileLogger implements Logger {
    private String fileName;
    private File file;

    public FileLogger(String fileName) {
        this.fileName = fileName;
        this.file = new File(this.fileName);
    }

    @Override
    public void log(String msg) {
        try {
            FileUtils.writeStringToFile(file, msg, "UTF-8", true);
        } catch (IOException e) {
            new ConsoleLogger().log(e.toString());
        }
    }
}
