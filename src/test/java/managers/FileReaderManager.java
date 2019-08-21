package managers;

import dataProvider.ConfigurationFileReader;

import java.io.IOException;

public class FileReaderManager {

    private static FileReaderManager fileReaderManager = new FileReaderManager();
    private static ConfigurationFileReader configFileReader;

    private FileReaderManager() {
    }

    public static FileReaderManager getInstance() {
        return fileReaderManager;
    }

    public ConfigurationFileReader getConfigReader() throws IOException {

        if(configFileReader == null){
            configFileReader = new ConfigurationFileReader();
            return configFileReader;
        }
        else
            return configFileReader;

    }
}
