package org.group20.sunstruck.gameobject;

import org.group20.sunstruck.Game;
import org.group20.sunstruck.behavior.Behavior.BEHAVIOR;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class MediumKamikazeShip extends GameObject {
	public static TextureRegion shipTexture = Game.textureAtlas
			.findRegion("shipHuge3");

	public MediumKamikazeShip() {
		super(shipTexture, 1f);
		speed = 7;
		reloadTime = 300;
		BURST_COUNT = 3;
		PAUSE_COUNT = 6;
		behavior = BEHAVIOR.SIN_VEL;
		impactDamage = 30;
		hull = 30;
		currentHull = hull;
		shield = 0;
		weaponType = new LaserTiny1();
		currentShield = shield;
	}

}
