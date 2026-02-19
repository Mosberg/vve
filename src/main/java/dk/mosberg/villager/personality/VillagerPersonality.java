package dk.mosberg.villager.personality;

import java.util.List;
import java.util.Map;

/**
 * Villager personality and traits data model.
 */
public class VillagerPersonality {
    private final String firstName;
    private final String lastName;
    private final String backstory;
    private final List<String> traits;
    private final List<String> skills;
    private final List<String> likes;
    private final List<String> dislikes;
    private final List<String> goals;
    private final Map<String, Object> properties;
    public int reputation;

    public VillagerPersonality(String firstName, String lastName, String backstory,
            List<String> traits, List<String> skills, List<String> likes, List<String> dislikes,
            List<String> goals, Map<String, Object> properties, int reputation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.backstory = backstory;
        this.traits = traits;
        this.skills = skills;
        this.likes = likes;
        this.dislikes = dislikes;
        this.goals = goals;
        this.properties = properties;
        this.reputation = reputation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBackstory() {
        return backstory;
    }

    public List<String> getTraits() {
        return traits;
    }

    public List<String> getSkills() {
        return skills;
    }

    public List<String> getLikes() {
        return likes;
    }

    public List<String> getDislikes() {
        return dislikes;
    }

    public List<String> getGoals() {
        return goals;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public int getReputation() {
        return reputation;
    }

}
