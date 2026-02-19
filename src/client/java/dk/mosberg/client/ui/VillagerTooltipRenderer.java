package dk.mosberg.client.ui;

import dk.mosberg.villager.happiness.VillagerHappinessSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.text.Text;

/**
 * Renders tooltips and overhead names for villagers.
 */
public class VillagerTooltipRenderer {
    public static void renderVillagerTooltip(DrawContext context, VillagerEntity villager,
            int mouseX, int mouseY) {
        // Example: Show job, personality, happiness
        String job = villager.getVillagerData().profession().toString();
        String name = villager.getName().getString();
        String personality = dk.mosberg.villager.personality.VillagerPersonalityRegistry
                .getPersonality(villager.getUuid());
        int happiness = VillagerHappinessSystem.getHappiness(villager.getUuid());
        context.drawTooltip(
                MinecraftClient.getInstance().textRenderer, Text.of(name + "\nJob: " + job
                        + "\nPersonality: " + personality + "\nHappiness: " + happiness),
                mouseX, mouseY);
    }

    public static void renderOverheadName(DrawContext context, VillagerEntity villager, float x,
            float y, float z) {
        String name = villager.getName().getString();
        context.drawText(MinecraftClient.getInstance().textRenderer, name, (int) x, (int) y,
                0xFFFFFF, true);
    }
}
