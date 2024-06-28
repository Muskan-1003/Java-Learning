import java.util.*;

public class file{
    

    public static String[] folderNameSystem(String[] folderNames) {
        // HashMap to store folder names and their frequencies
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Result array to store modified folder names
        String[] result = new String[folderNames.length];

        // Process each folder name
        for (int i = 0; i < folderNames.length; i++) {
            String currentFolder = folderNames[i];

            // Check if the folder name already exists in the system
            if (frequencyMap.containsKey(currentFolder)) {
                int count = frequencyMap.get(currentFolder);
                String newName = currentFolder + count;
                result[i] = newName;

                // Update the frequency map
                frequencyMap.put(currentFolder, count + 1);
            } else {
                // If folder name is unique, add it to result and map with count 1
                result[i] = currentFolder;
                frequencyMap.put(currentFolder, 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Sample input
        String[] folderNames = {"home", "download", "first", "first"};

        // Calling the folderNameSystem function
        String[] uniqueNames = folderNameSystem(folderNames);

        // Printing the result
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}
