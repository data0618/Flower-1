package com.flower.main.page;

import org.apache.wicket.markup.html.panel.Panel;

/**
 * ģ̬���ڲ���ʾ��Page
 *
 */
public class ModalPage extends AppPage {

	private static final long serialVersionUID = 1L;
	public final String panelId = "mainPanel";

	public ModalPage() {
	}
	
	public ModalPage(Panel panel){
		initBody(panel);
	}
}
