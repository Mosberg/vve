# Copilot Instructions for Village & Villager Expansion (VVE)

## Project Overview

- **VVE** is a Minecraft Fabric mod that overhauls village generation, villager AI, professions, economy, defense, and player interaction.
- The codebase is split into `main` (core logic) and `client` (client-specific features, UI, config screens).
- Major features are described in the [README.md](../README.md) and include new village types, villager behaviors, professions, dynamic economy, defense systems, and quest/story mechanics.
- Remote indexes and documentation for Minecraft 1.21.11 Fabric mod development can be found in [remote-index.md](./remote-index.md).

## Key Directories & Files

- `src/main/java/dk/mosberg/` — Core mod logic (village generation, AI, professions, economy, etc.)
- `src/client/java/dk/mosberg/client/` — Client-side code (UI, config, mod menu integration)
- `src/main/resources/fabric.mod.json` — Mod metadata, entrypoints, and resource definitions
- `build.gradle` — Build, dependency, and test configuration

## Build & Test Workflow

- **Build:** Use `./gradlew build` (or `gradlew.bat build` on Windows) to build the mod JAR.
- **Test:** Run `./gradlew test` to execute JUnit tests (uses JUnit Jupiter, see `build.gradle`).
- **Java Version:** Project targets Java 21 (see `build.gradle`).
- **Custom Task:** `./gradlew validateModMetadata` checks for required mod metadata properties.
- **IDE:** Recommended to use IntelliJ IDEA or VS Code with Java support and Gradle integration.

## Project Conventions & Patterns

- **Entrypoints:** Entrypoints for main, client, and mod menu are defined in `fabric.mod.json` and expanded from Gradle properties.
- **Resource Expansion:** `processResources` in `build.gradle` auto-expands mod properties into resource files.
- **Testing:** Tests are configured to include both main and client outputs in the classpath.
- **Dependencies:** Uses Fabric Loader, Fabric API, ModMenu, Cloth Config, Gson, SLF4J, and JUnit Jupiter.
- **Source Structure:** Keep core logic in `main`, client-only code in `client`.
- **No test code in JAR:** The `jar` task excludes all test sources from the final artifact.

## Integration & Extensibility

- **External APIs:** Integrates with Fabric API, ModMenu, and Cloth Config for mod compatibility and configuration.
- **Modular Design:** New features (professions, quests, village types) should be implemented as modular, extensible components.
- **Resource Packs:** Assets and resources are under `src/main/resources/assets/vve/`.

## Examples

- See `VVE.java` for main mod entrypoint and initialization.
- See `VVEModConfigScreen.java` and `VVEModMenu.java` for client config and mod menu integration.

## Additional Notes

- Always update `fabric.mod.json` and Gradle properties when adding new entrypoints or metadata.
- Follow the established directory split for main/client code.
- Use JUnit Jupiter for all new tests.
- For new dependencies, add to `build.gradle` and prefer `modImplementation` for Fabric mods.

---

For more details, see the [README.md](../README.md) and `build.gradle`.
