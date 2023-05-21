package xyz.raumzelleth.detoaster.mixin;

import net.minecraft.client.toast.Toast;
import net.minecraft.client.toast.ToastManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ToastManager.class)
public class ToastManagerMixin {
    /**
     * @author Raumzelleth
     * @reason Screw your toasts.
     */
    @Overwrite public void add(Toast toast) {assert true;}
}
