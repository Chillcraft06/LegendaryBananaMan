package com.lbm.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import javax.swing.ImageIcon;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
                config.setResizable(false);
		config.setForegroundFPS(60);
		config.setTitle("Legendary Banana Man");
                config.setWindowIcon("bananaman1.png");
		new Lwjgl3Application(new LBM(), config);
	}
}
