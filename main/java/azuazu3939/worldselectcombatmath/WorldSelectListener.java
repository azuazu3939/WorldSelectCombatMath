package azuazu3939.worldselectcombatmath;

import org.bukkit.Bukkit;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;

public class WorldSelectListener implements Listener {

    @EventHandler
    public void onDamaged(EntityDamageByEntityEvent event) {

        if (event.getEntity() instanceof LivingEntity damaged) {

            for (String worldName : WorldSelectCombatMath.inst().getConfig().getStringList("WorldName")) {
                if (damaged.getWorld().getName().equals(worldName)) {

                    double damage = event.getDamage();
                    int armor = 0;
                    double toughness = 0;

                    if (damaged.getAttribute(Attribute.GENERIC_ARMOR) != null) {
                        armor = (int) Objects.requireNonNull(damaged.getAttribute(Attribute.GENERIC_ARMOR)).getValue();
                    }
                    if (damaged.getAttribute(Attribute.GENERIC_ARMOR_TOUGHNESS) != null) {
                        toughness = Objects.requireNonNull(damaged.getAttribute(Attribute.GENERIC_ARMOR_TOUGHNESS)).getValue();
                    }

                    double enchant = 1;
                    if (damaged.getEquipment() != null) {
                        int level = 0;
                        if (damaged.getEquipment().getBoots() != null && damaged.getEquipment().getBoots().hasItemMeta() &&
                                Objects.requireNonNull(damaged.getEquipment().getBoots().getItemMeta()).hasEnchant(Enchantment.PROTECTION_ENVIRONMENTAL)) {
                            level += damaged.getEquipment().getBoots().getEnchantmentLevel(Enchantment.PROTECTION_ENVIRONMENTAL);
                        }
                        if (damaged.getEquipment().getBoots() != null && damaged.getEquipment().getBoots().hasItemMeta() &&
                                event.getCause().equals(EntityDamageEvent.DamageCause.PROJECTILE) &&
                                Objects.requireNonNull(damaged.getEquipment().getBoots().getItemMeta()).hasEnchant(Enchantment.PROTECTION_PROJECTILE)) {
                            level += damaged.getEquipment().getBoots().getEnchantmentLevel(Enchantment.PROTECTION_PROJECTILE) * 2;
                        }
                        if (damaged.getEquipment().getBoots() != null && damaged.getEquipment().getBoots().hasItemMeta() &&
                                event.getCause().equals(EntityDamageEvent.DamageCause.ENTITY_EXPLOSION) &&
                                Objects.requireNonNull(damaged.getEquipment().getBoots().getItemMeta()).hasEnchant(Enchantment.PROTECTION_EXPLOSIONS)) {
                            level += damaged.getEquipment().getBoots().getEnchantmentLevel(Enchantment.PROTECTION_EXPLOSIONS) * 2;
                        }
                        if (damaged.getEquipment().getLeggings() != null && damaged.getEquipment().getLeggings().hasItemMeta() &&
                                Objects.requireNonNull(damaged.getEquipment().getLeggings().getItemMeta()).hasEnchant(Enchantment.PROTECTION_ENVIRONMENTAL)) {
                            level += damaged.getEquipment().getLeggings().getEnchantmentLevel(Enchantment.PROTECTION_ENVIRONMENTAL);
                        }
                        if (damaged.getEquipment().getLeggings() != null && damaged.getEquipment().getLeggings().hasItemMeta() &&
                                event.getCause().equals(EntityDamageEvent.DamageCause.PROJECTILE) &&
                                Objects.requireNonNull(damaged.getEquipment().getLeggings().getItemMeta()).hasEnchant(Enchantment.PROTECTION_PROJECTILE)) {
                            level += damaged.getEquipment().getLeggings().getEnchantmentLevel(Enchantment.PROTECTION_PROJECTILE) * 2;
                        }
                        if (damaged.getEquipment().getLeggings() != null && damaged.getEquipment().getLeggings().hasItemMeta() &&
                                event.getCause().equals(EntityDamageEvent.DamageCause.ENTITY_EXPLOSION) &&
                                Objects.requireNonNull(damaged.getEquipment().getLeggings().getItemMeta()).hasEnchant(Enchantment.PROTECTION_EXPLOSIONS)) {
                            level += damaged.getEquipment().getLeggings().getEnchantmentLevel(Enchantment.PROTECTION_EXPLOSIONS) * 2;
                        }
                        if (damaged.getEquipment().getChestplate() != null && damaged.getEquipment().getChestplate().hasItemMeta() &&
                                Objects.requireNonNull(damaged.getEquipment().getChestplate().getItemMeta()).hasEnchant(Enchantment.PROTECTION_ENVIRONMENTAL)) {
                            level += damaged.getEquipment().getChestplate().getEnchantmentLevel(Enchantment.PROTECTION_ENVIRONMENTAL);
                        }
                        if (damaged.getEquipment().getChestplate() != null && damaged.getEquipment().getChestplate().hasItemMeta() &&
                                event.getCause().equals(EntityDamageEvent.DamageCause.PROJECTILE) &&
                                Objects.requireNonNull(damaged.getEquipment().getChestplate().getItemMeta()).hasEnchant(Enchantment.PROTECTION_PROJECTILE)) {
                            level += damaged.getEquipment().getChestplate().getEnchantmentLevel(Enchantment.PROTECTION_PROJECTILE) * 2;
                        }
                        if (damaged.getEquipment().getChestplate() != null && damaged.getEquipment().getChestplate().hasItemMeta() &&
                                event.getCause().equals(EntityDamageEvent.DamageCause.ENTITY_EXPLOSION) &&
                                Objects.requireNonNull(damaged.getEquipment().getChestplate().getItemMeta()).hasEnchant(Enchantment.PROTECTION_EXPLOSIONS)) {
                            level += damaged.getEquipment().getChestplate().getEnchantmentLevel(Enchantment.PROTECTION_EXPLOSIONS) * 2;
                        }
                        if (damaged.getEquipment().getHelmet() != null && damaged.getEquipment().getHelmet().hasItemMeta() &&
                                Objects.requireNonNull(damaged.getEquipment().getHelmet().getItemMeta()).hasEnchant(Enchantment.PROTECTION_ENVIRONMENTAL)) {
                            level += damaged.getEquipment().getHelmet().getEnchantmentLevel(Enchantment.PROTECTION_ENVIRONMENTAL);
                        }
                        if (damaged.getEquipment().getHelmet() != null && damaged.getEquipment().getHelmet().hasItemMeta() &&
                                event.getCause().equals(EntityDamageEvent.DamageCause.PROJECTILE) &&
                                Objects.requireNonNull(damaged.getEquipment().getHelmet().getItemMeta()).hasEnchant(Enchantment.PROTECTION_PROJECTILE)) {
                            level += damaged.getEquipment().getHelmet().getEnchantmentLevel(Enchantment.PROTECTION_PROJECTILE) * 2;
                        }
                        if (damaged.getEquipment().getHelmet() != null && damaged.getEquipment().getHelmet().hasItemMeta() &&
                                event.getCause().equals(EntityDamageEvent.DamageCause.ENTITY_EXPLOSION) &&
                                Objects.requireNonNull(damaged.getEquipment().getHelmet().getItemMeta()).hasEnchant(Enchantment.PROTECTION_EXPLOSIONS)) {
                            level += damaged.getEquipment().getHelmet().getEnchantmentLevel(Enchantment.PROTECTION_EXPLOSIONS) * 2;
                        }
                        if (level > 20) level = 20;
                        if (level != 0) {
                            enchant = (1 - level * 0.01);
                        }
                    }
                    double finalDamageMath = (damage * (1 - (armor * 0.01)) * (enchant)) - (toughness * 0.1);
                    if (finalDamageMath <= 0) {
                        event.setCancelled(true);
                    } else {
                        if (damaged.hasPotionEffect(PotionEffectType.DAMAGE_RESISTANCE)) {
                            finalDamageMath = finalDamageMath * (1 - 0.2 * (Objects.requireNonNull(damaged.getPotionEffect(PotionEffectType.DAMAGE_RESISTANCE)).getAmplifier() + 1));
                        }
                        event.setDamage(0.0);
                        event.setDamage(EntityDamageEvent.DamageModifier.ARMOR, finalDamageMath);
                    }
                }
            }
        }
    }
}
