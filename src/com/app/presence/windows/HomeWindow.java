package com.app.presence.windows;

import java.awt.Dimension;

import javax.swing.JFrame;

import com.app.presence.constants.CommonConstants;
import com.app.presence.utils.WindowUtil;

public class HomeWindow {

	private JFrame homeWindow;
	
	public HomeWindow() {
		this.homeWindow = new JFrame();
		this.homeWindow.setTitle(CommonConstants.TITLE);
		this.homeWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Dimension dimension = WindowUtil.getWindowSize();
		this.homeWindow.setSize(dimension.width, dimension.height);
		this.homeWindow.setLocationRelativeTo(null);
	} 
	
	public void show() {
		this.homeWindow.setVisible(true);
	}
}
