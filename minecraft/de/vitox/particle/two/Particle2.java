package de.vitox.particle.two;

import java.util.Random;
import java.util.Timer;

import de.vitox.RenderUtils;
import net.minecraft.util.MathHelper;

public class Particle2 {

	public int x;
	public int y;
	public int k;
	private float size;
	private Random random = new Random();

	public Particle2(int x, int y) {
		this.x = x;
		this.y = y;
		this.size = genRandom2(0.3F, 0.8F);
	}

	public void draw2() {

		this.k += 1;
		int xx = (int) (MathHelper.cos(0.1F * (this.x + this.k)) * 10.0F);

		RenderUtils.drawBorderedCircle(this.x + xx, this.y, this.size, 0, 0xffFFFFFF);
	}

	public float genRandom2(float min, float max) {
		return (float) (min + Math.random() * (max - min + 1.0F));
	}
}
