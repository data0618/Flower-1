package com.flower.main.panel;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;

/**
 * ȱʡ��ҳ�棬��Ϊ�հ׻���ʾ��Ϣ
 */
public final class DefaultPanel extends Panel {
	private static final long serialVersionUID = 1L;

	public DefaultPanel(String id) {
		super(id);
		this.add(new Label("msg").setVisible(false));
	}
	
	public DefaultPanel(String id, String msg){
		super(id);
		this.add(new Label("msg", msg));
	}
}
