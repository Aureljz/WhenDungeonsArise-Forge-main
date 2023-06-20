package net.aurelj.dungeons_arise;

import net.aurelj.dungeons_arise.structures.WDAGenericStructures;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class WDAStructures {

    public static final DeferredRegister<StructureType<?>> DEFERRED_REGISTRY_STRUCTURE = DeferredRegister.create(Registry.STRUCTURE_TYPE_REGISTRY, DungeonsAriseMain.MODID);

    public static final RegistryObject<StructureType<WDAGenericStructures>> GENERIC_STRUCTURES = DEFERRED_REGISTRY_STRUCTURE.register("generic_structures", () -> () -> WDAGenericStructures.CODEC);
}