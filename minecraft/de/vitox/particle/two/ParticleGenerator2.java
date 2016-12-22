package de.vitox.particle.two;

import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;

import org.lwjgl.opengl.GL11;

import net.minecraft.util.MathHelper;

public class ParticleGenerator2 {
	
	public static int anzahl;
	public static int breite;
	public static int höhe;
	public ArrayList<Particle2> particles2 = new ArrayList();
	private Random random = new Random();
	private Timer timer = new Timer();

	public ParticleGenerator2(int anzahl, int breite, int höhe) {
		this.anzahl = anzahl;
		this.breite = breite;
		this.höhe = höhe;
		for (int i = 0; i < anzahl; i++) {
			this.particles2.add(new Particle2(this.random.nextInt(breite), this.random.nextInt(höhe)));
		}
	}

	public void drawParticles2() {
		for (Particle2 p : this.particles2) {
			p.draw2();
		}
	}
}
