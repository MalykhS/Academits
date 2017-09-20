package malykh.main;

import malykh.internetProducts.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<InternetProducts> list = new ArrayList<>(Arrays.asList(
                new videoDisk("Video course Java", 1800, "6767612", InternetProducts.diskType.DVD),
                new ProgrammingBook("Java", 135, "4600001", 869, "Java"),
                new musicDisk("Sting", 320, "7111123", InternetProducts.diskType.CD),
                new CookBook("Cook", 200, "43090909", 500, "Pepper"),
                new softwareDisk("Debian", 670, "12341234", InternetProducts.diskType.DVD),
                new musicDisk("Aria", 490, "4587623", InternetProducts.diskType.DVD),
                new ProgrammingBook("Tutorial C++", 350, "34000001", 1024, "C++"),
                new SpiritBook("Planet", 150, "238000008", 154, 14),
                new videoDisk("Marvel", 782, "2388881", InternetProducts.diskType.DVD),
                new CookBook("Plate", 460, "45000091", 1090, "Salt")
        ));

        list.sort((a, b) -> b.getNumber().compareTo(a.getNumber()));

        InternetProducts.display(list);
    }
}