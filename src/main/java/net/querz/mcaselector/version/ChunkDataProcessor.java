package net.querz.mcaselector.version;

import javafx.scene.image.PixelWriter;
import net.querz.nbt.CompoundTag;

public interface ChunkDataProcessor {

	void drawChunk(CompoundTag root, ColorMapping colorMapping, int x, int z, PixelWriter writer);
}
