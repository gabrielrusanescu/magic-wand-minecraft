package com.example.examplemod;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.Component;

public class BaghetaMagica extends Item {

    private int putereMagica;
    private String elementMagic;

    public BaghetaMagica(Properties properties, int putereMagica, String elementMagic) {
        super(properties);
        this.putereMagica = putereMagica;
        this.elementMagic = elementMagic;
    }

    public int getPutereMagica() {
        return putereMagica;
    }

    public String getElementMagic() {
        return elementMagic;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);

        if (!level.isClientSide()) {
            player.sendSystemMessage(Component.literal("Ai lansat o vraja de " + this.elementMagic + " cu putere " + this.putereMagica + "!"));

            net.minecraft.world.phys.Vec3 view = player.getViewVector(1.0F);
            net.minecraft.world.entity.projectile.LargeFireball fireball = new net.minecraft.world.entity.projectile.LargeFireball(level, player, view.x, view.y, view.z, 20);
            fireball.setPos(player.getX() + view.x * 1.5D, player.getEyeY() + 0.1D, player.getZ() + view.z * 1.5D);
            level.addFreshEntity(fireball);
        }

        return InteractionResultHolder.success(itemStack);
    }
}