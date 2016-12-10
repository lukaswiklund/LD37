package se.wiklund.ld37.world.entity;

import com.sun.glass.events.KeyEvent;

import se.wiklund.ld37.Assets;
import se.wiklund.ld37.input.Keyboard;
import se.wiklund.ld37.world.tile.Tile;

public class Player extends Entity {

	public Player() {
		super(Assets.ENTITY_PLAYER, Tile.SIZE * 3, Tile.SIZE * 3, 16, 32);
	}
	
	@Override
	public void tick() {
		super.tick();
		
		if (Keyboard.isKeyDown(KeyEvent.VK_A)) {
			moveX(true);
		}
		if (Keyboard.isKeyDown(KeyEvent.VK_D)) {
			moveX(false);
		}
		if (Keyboard.isKeyDown(KeyEvent.VK_W)) {
			moveY(true);
		}
		if (Keyboard.isKeyDown(KeyEvent.VK_S)) {
			moveY(false);
		}
	}
}