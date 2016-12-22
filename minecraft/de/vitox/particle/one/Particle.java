package de.vitox.particle.one;

import java.util.Random;

import de.vitox.RenderUtils;
import net.minecraft.util.MathHelper;

public class Particle {

	public int x;
	public int y;
	public int k;
	public float size;
	private Random random = new Random();

	public Particle(int x, int y) {
		this.x = x;
		this.y = y;
		this.size = genRandom(0.3F, 0.8F);
	}

	public void draw() {
		this.k += 1;
		int xx = (int) (MathHelper.cos(0.1F * (this.x + this.k)) * 10.0F);
		RenderUtils.drawBorderedCircle(this.x + xx, this.y, this.size, 0, 0xffFFFFFF);
	}


	public float genRandom(float min, float max) {
		return (float) (min + Math.random() * (max - min + 1.0F));
	}
}