import java.util.*;
//import lombok.NoArgsConstructor;

public class SocialNetwork {

    static List<Profile>  profiles;

    public SocialNetwork(List<Profile> profiles) {
        this.profiles = new ArrayList<>(profiles);
    }

    public static void sortProfiles() {
        profiles.sort(Comparator.comparing(Profile::getName));
    }

    public static void printProfiles() {
        for (Profile profile : profiles) {
            System.out.println(profile.getName());
        }
    }

}
