package football.league.files;

import java.io.File;
import java.nio.file.Paths;

public class AbstractFileReader {

    private static String PATH = "C:\\Users\\miczu\\IdeaProjects\\footballManager\\FootballManager\\storage";

    protected File getFile(String path) {
        if (path == null) {
            throw new IllegalArgumentException("May not be null");
        }

        path = PATH + "\\" + path;

        return Paths.get(path).toFile();
    }
}
