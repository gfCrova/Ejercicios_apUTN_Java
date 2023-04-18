package com.argPrograma.Services;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathService {

    private static final String pathMsj = "src\\main\\resources\\Chat.txt";

    Path pathMj = Paths.get(pathMsj);

    public Path getPathMj() {
        return pathMj;
    }
}
