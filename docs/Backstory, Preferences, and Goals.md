# Backstory, Preferences, and Goals

```json
{
  "$schema": "https://json-schema.org/draft/2020-12/schema",
  "title": "Villager Backstory Configuration",
  "version": "1.0.0",
  "minecraft_version": "1.21.11",
  "description": "Data-driven villager backstories with biome/profession context for immersive dialogue and quests.",
  "backstories": {
    "culture_groups": {
      "plains": {
        "weight": 1.0,
        "templates": [
          {
            "id": "farmer_legacy",
            "rarity": 0.3,
            "text": "Grew up tending the endless wheat fields of {location}. My family has farmed these lands since the Great Replanting.",
            "triggers": ["farmer", "fletcher"],
            "traits": ["kind", "hardworking"]
          },
          {
            "id": "raid_survivor",
            "rarity": 0.2,
            "text": "Lost my brother to pillager raids three harvests ago. Now I trade only with those who prove trustworthy.",
            "triggers": ["any"],
            "traits": ["cautious", "grumpy"]
          }
        ]
      },
      "forest": {
        "weight": 0.9,
        "templates": [
          {
            "id": "tree_whisperer",
            "rarity": 0.4,
            "text": "The ancient oaks taught me their secrets. They sing of forgotten paths and hidden glades.",
            "triggers": ["herbalist", "hunter"],
            "traits": ["curious", "mystical"]
          },
          {
            "id": "exiled_woodcutter",
            "rarity": 0.25,
            "text": "Banished from the deep woods for cutting a sacred tree. Now I wander, seeking redemption.",
            "triggers": ["any"],
            "traits": ["guilty", "skilled"]
          }
        ]
      },
      "mountain": {
        "weight": 0.7,
        "templates": [
          {
            "id": "deep_delver",
            "rarity": 0.35,
            "text": "Found emeralds in caves no dwarf would dare enter. The mountain spirits watch over my forge.",
            "triggers": ["blacksmith", "miner"],
            "traits": ["brave", "greedy"]
          }
        ]
      }
    },
    "universal": [
      {
        "id": "orphan",
        "rarity": 0.15,
        "text": "Raised by the village after zombies took my parents. I owe these people everything.",
        "triggers": ["any"],
        "traits": ["loyal", "grateful"]
      },
      {
        "id": "wanderer",
        "rarity": 0.2,
        "text": "Travelled from {distant_land} seeking fortune. Your village is the first to welcome me.",
        "triggers": ["any"],
        "traits": ["curious", "adventurous"]
      }
    ],
    "placeholders": {
      "location": ["Golden Plains", "Verdant Fields", "Sunset Valley"],
      "distant_land": ["distant desert kingdoms", "frozen northern wastes", "island city-states"]
    }
  }
}
```

**Save as:** `villager_backstories.json`

---

```json
{
  "$schema": "https://json-schema.org/draft/2020-12/schema",
  "title": "Villager Likes/Dislikes Configuration",
  "version": "1.0.0",
  "minecraft_version": "1.21.11",
  "description": "Item-based villager preferences that affect trading prices, gifts, and dialogue.",
  "preferences": {
    "culture_groups": {
      "plains": {
        "likes": [
          { "item": "minecraft:wheat", "value": 10 },
          { "item": "minecraft:bread", "value": 8 },
          { "item": "minecraft:apple", "value": 6 }
        ],
        "dislikes": [
          { "item": "minecraft:rotten_flesh", "value": -15 },
          { "item": "minecraft:spider_eye", "value": -12 }
        ]
      },
      "forest": {
        "likes": [
          { "item": "minecraft:oak_sapling", "value": 12 },
          { "item": "minecraft:sweet_berries", "value": 9 },
          { "item": "minecraft:golden_apple", "value": 20 }
        ],
        "dislikes": [
          { "item": "minecraft:dead_bush", "value": -10 },
          { "item": "minecraft:poisonous_potato", "value": -18 }
        ]
      }
    },
    "profession_specific": {
      "blacksmith": {
        "likes": [
          { "item": "minecraft:iron_ingot", "value": 15 },
          { "item": "minecraft:diamond", "value": 30 }
        ],
        "dislikes": [{ "item": "minecraft:stick", "value": -5 }]
      },
      "hunter": {
        "likes": [
          { "item": "minecraft:rabbit_hide", "value": 12 },
          { "item": "minecraft:leather", "value": 10 }
        ]
      }
    },
    "gift_values": {
      "perfect_gift": 25,
      "good_gift": 10,
      "neutral": 0,
      "bad_gift": -5,
      "terrible_gift": -15
    }
  }
}
```

**Save as:** `villager_preferences.json`

---

```json
{
  "$schema": "https://json-schema.org/draft/2020-12/schema",
  "title": "Villager Personal Goals Configuration",
  "version": "1.0.0",
  "minecraft_version": "1.21.11",
  "description": "Dynamic villager goals that generate quests and drive villager behavior over time.",
  "personal_goals": {
    "goal_types": {
      "family": {
        "weight": 0.3,
        "description": "Wants to start/expand family",
        "quests": ["find_partner", "build_nursery"],
        "progress": ["met_partner", "expecting_child"]
      },
      "wealth": {
        "weight": 0.25,
        "description": "Amassing personal fortune",
        "quests": ["rare_materials", "expand_trades"],
        "progress": ["chest_full", "emerald_rich"]
      },
      "adventure": {
        "weight": 0.2,
        "description": "Seeks exploration and discovery",
        "quests": ["explore_ruins", "find_artifact"],
        "progress": ["found_relic", "mapped_caves"]
      },
      "mastery": {
        "weight": 0.25,
        "description": "Perfect their craft",
        "quests": ["masterpiece_item", "rare_recipe"],
        "progress": ["expert_crafter", "legendary_work"]
      }
    },
    "profession_goals": {
      "farmer": {
        "goals": [
          {
            "id": "mega_farm",
            "description": "Expand farm to feed entire village",
            "requirements": { "crops_planted": 512 }
          }
        ]
      },
      "blacksmith": {
        "goals": [
          {
            "id": "legendary_forge",
            "description": "Build ultimate smithing setup",
            "requirements": { "netherite_ingots": 10 }
          }
        ]
      }
    },
    "completion_rewards": {
      "reputation": 200,
      "special_trades": true,
      "unique_dialogue": true
    }
  }
}
```

**Save as:** `villager_goals.json`

## Fabric Integration Example

```java
// Load all personality data at once
PersonalityConfig config = loader.loadCombined(
  "backstories.json", "preferences.json", "goals.json"
);

// Generate complete villager personality
VillagerPersonality personality = config.generate(
  biome = world.getBiome(pos),
  profession = villager.getProfession(),
  culture = villageCulture
);

// Check if player gift affects reputation
int repChange = personality.evaluateGift(playerItem);
villager.reputation += repChange;
```

**Perfect for your schema-driven workflow** - all villager personality is now 100% data-driven with biome-aware generation, profession synergies, and quest integration! 🎮
