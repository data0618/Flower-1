package com.flower.main;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

import com.flower.main.page.AppPage;

/**
 * Application������ϵͳ���� Ҫ���������Ϣ������
 *
 */
public class MainApp extends WebApplication {

	/**
	 * ͨ�� getHomePage ��������Ϳ��Զ����û�����ʱ��Ĭ��ҳ��
	 */
	@Override
	public Class<? extends Page> getHomePage() {
		this.getMarkupSettings().setStripWicketTags(true);
		return AppPage.class;
	}

}
