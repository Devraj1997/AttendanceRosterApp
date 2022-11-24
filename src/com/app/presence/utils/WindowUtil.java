package com.app.presence.utils;

import java.awt.Dimension;
import java.awt.Toolkit;

public class WindowUtil {

	public static Dimension getWindowSize() {
		return Toolkit.getDefaultToolkit().getScreenSize();
	}
}
