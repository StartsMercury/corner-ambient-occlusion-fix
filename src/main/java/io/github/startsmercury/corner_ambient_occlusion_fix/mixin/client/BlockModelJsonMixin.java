package io.github.startsmercury.corner_ambient_occlusion_fix.mixin.client;

import com.llamalad7.mixinextras.sugar.Local;
import finalforeach.cosmicreach.rendering.blockmodels.BlockModelJson;
import finalforeach.cosmicreach.rendering.blockmodels.BlockModelJsonCuboidFace;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

/**
 * Mixin class.
 *
 * @see Mixin
 */
@Mixin(BlockModelJson.class)
public abstract class BlockModelJsonMixin {
    @ModifyVariable(
        method = "addVertices(Lfinalforeach/cosmicreach/rendering/IMeshData;IIII[S[I)V",
        name = "aoIdA",
        at = @At(value = "STORE", ordinal = 0)
    )
    private int tempA(
        final int aoIdA,
        final @Local(ordinal = 3, argsOnly = true) int opaqueBitMask,
        final @Local(ordinal = 0) BlockModelJsonCuboidFace face
    ) {
        return aoIdA == 1 && (opaqueBitMask & face.aoBitmaskA1) == 0 ? 0 : aoIdA;
    }

    @ModifyVariable(
        method = "addVertices(Lfinalforeach/cosmicreach/rendering/IMeshData;IIII[S[I)V",
        name = "aoIdB",
        at = @At(value = "STORE", ordinal = 0)
    )
    private int tempB(
        final int aoIdB,
        final @Local(ordinal = 3, argsOnly = true) int opaqueBitMask,
        final @Local(ordinal = 0) BlockModelJsonCuboidFace face
    ) {
        return aoIdB == 1 && (opaqueBitMask & face.aoBitmaskB1) == 0 ? 0 : aoIdB;
    }

    @ModifyVariable(
        method = "addVertices(Lfinalforeach/cosmicreach/rendering/IMeshData;IIII[S[I)V",
        name = "aoIdC",
        at = @At(value = "STORE", ordinal = 0)
    )
    private int tempC(
        final int aoIdC,
        final @Local(ordinal = 3, argsOnly = true) int opaqueBitMask,
        final @Local(ordinal = 0) BlockModelJsonCuboidFace face
    ) {
        return aoIdC == 1 && (opaqueBitMask & face.aoBitmaskC1) == 0 ? 0 : aoIdC;
    }

    @ModifyVariable(
        method = "addVertices(Lfinalforeach/cosmicreach/rendering/IMeshData;IIII[S[I)V",
        name = "aoIdD",
        at = @At(value = "STORE", ordinal = 0)
    )
    private int tempD(
        final int aoIdD,
        final @Local(ordinal = 3, argsOnly = true) int opaqueBitMask,
        final @Local(ordinal = 0) BlockModelJsonCuboidFace face
    ) {
        return aoIdD == 1 && (opaqueBitMask & face.aoBitmaskD1) == 0 ? 0 : aoIdD;
    }
}
