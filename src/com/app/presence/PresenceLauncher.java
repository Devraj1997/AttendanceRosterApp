package com.app.presence;

import javax.swing.SwingUtilities;

import com.app.presence.windows.HomeWindow;

public class PresenceLauncher {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				HomeWindow homeWindow = new HomeWindow();
				homeWindow.show();
			}
		});
	}
}
