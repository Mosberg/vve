# Copilot Instructions — Village & Villager Expansion (VVE)

## Actual project versioning

- The project uses a `gradle.properties` file to centralize all version numbers for Minecraft, Fabric, dependencies, and testing frameworks.
- This allows for easy updates and consistency across the codebase, build scripts, and documentation.

```properties
# --------------------------------------------------------------
# Minecraft & Fabric Versions
# --------------------------------------------------------------

minecraft_version=1.21.11
yarn_mappings=1.21.11+build.4
loader_version=0.18.4
loom_version=1.15-SNAPSHOT
fabric_api_version=0.141.3+1.21.11
java_version=21

# --------------------------------------------------------------
# Library Versions
# --------------------------------------------------------------

gson_version=2.13.2
slf4j_version=2.0.17
annotations_version=26.0.2

# --------------------------------------------------------------
# Testing Framework Versions
# --------------------------------------------------------------

junit_version=6.0.2

# --------------------------------------------------------------
# Optional Dependencies
# --------------------------------------------------------------

modmenu_version=17.0.0-beta.2
cloth_config_version=21.11.153
```

## Quickstart

- **Build:** `./gradlew build` (Windows: `gradlew.bat build`)
- **Test:** `./gradlew test` (JUnit Jupiter)
- **Run:** `./gradlew runClient` for dev environment
- **Java:** Target version 21
- **IDE:** Use IntelliJ IDEA or VS Code (Java + Gradle)

## Directory Structure

- `src/main/java/dk/mosberg/` — Core logic: village gen, AI, professions, economy
- `src/client/java/dk/mosberg/client/` — Client features: UI, config, mod menu
- `src/main/resources/fabric.mod.json` — Mod metadata, entrypoints
- `build.gradle` — Build, dependencies, test config
- `src/main/resources/assets/vve/` — Mod assets/resources

## Modularity & Extensibility

- **Entrypoints:** Defined in `fabric.mod.json`, expanded via Gradle
- **Modular Features:** Add new professions, quests, village types as separate classes/components
- **Resource Expansion:** `processResources` auto-expands mod properties
- **No test code in JAR:** Tests excluded from final artifact
- **External APIs:** Fabric API, ModMenu, Cloth Config, Gson, SLF4J

## Best Practices

- Keep core logic in `main`, client-only code in `client`
- Update `fabric.mod.json` and Gradle properties for new entrypoints/metadata
- Use JUnit Jupiter for all tests
- Prefer `modImplementation` for Fabric mod dependencies
- Use schema-driven JSON for all data/config (see `data/vve/*.json`)

## Data-Driven Workflow

- JSON schemas in `src/main/resources/data/vve/` drive villager names, backstories, preferences, goals, professions, upgrades, themes, types, quests, story arcs, reputation
- Java model classes mirror JSON structure (see `dk.mosberg.data.*`)
- Use `JsonDataLoader` for runtime parsing
- Example:
  ```java
  VillagerBackstory backstory = JsonDataLoader.load("data/vve/villager_backstories.json", VillagerBackstory.class);
  ```

## Integration Examples

- See `VVE.java` for mod entrypoint
- See `VVEModConfigScreen.java`, `VVEModMenu.java` for client config/mod menu
- See `VillagerPersonalityManager.java` for JSON-driven personality generation

## Advanced

- Custom Gradle task: `./gradlew validateModMetadata` (checks mod metadata)
- Tests include both main/client outputs in classpath
- Resource packs: add assets to `assets/vve/`

---

## Remote Index: Fabric & Minecraft Docs

- For quick access to API docs, guides, wiki definitions, and advanced modding topics, use the [remote-index.md](remote-index.md) in `.github/`.
- Categories include JavaDocs, developer guides, items, blocks, entities, rendering, data generation, serialization, Loom, porting, wiki definitions, and more.
- Use browser search (Ctrl+F) or VS Code search to find topics instantly.
- Bookmark or add to your project wiki for instant access.
- All links are Minecraft 1.21.11 and Fabric-specific unless noted.

---

For full details, see [README.md](../README.md), `build.gradle`, and [remote-index.md](remote-index.md).
