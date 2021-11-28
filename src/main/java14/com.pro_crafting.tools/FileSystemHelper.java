package com.pro_crafting.tools;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Map;

public class FileSystemHelper {
    public static FileSystem openFS(Path path, Map<String, ?> env, ClassLoader classLoader) throws IOException {
        return FileSystems.newFileSystem(path, env, classLoader);
    }

    public static FileSystem openFS(URI uri, Map<String, ?> env, ClassLoader classLoader) throws IOException {
        return FileSystems.newFileSystem(uri, env, classLoader);
    }
}
