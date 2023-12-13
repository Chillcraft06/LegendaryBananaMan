package com.lbm.game;

import com.badlogic.gdx.Graphics.DisplayMode;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
                DisplayMode displayMode = Lwjgl3ApplicationConfiguration.getDisplayMode();
		config.setForegroundFPS(60);
		config.setTitle("Legendary Banana Man");
                config.setWindowIcon("bananaman1.png");
                config.setFullscreenMode(displayMode);
                //config.setWindowSizeLimits(1920, 1080, 1921, 1081);
		new Lwjgl3Application(new LBM(), config);
	}
}
