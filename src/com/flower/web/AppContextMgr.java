package com.flower.web;

/**
 * 
 * Purpose:ȫ�ֲ�������
 * 
 * 
 * @see
 * @since 1.0
 */
public class AppContextMgr {
	/**
	 * ϵͳ����
	 */
	static String htmlTitle = "Elim�ʻ�֮��";

	/**
	 * ����������
	 */
	static String htmlFooter = "�Ͼ��з�С�ֶ�������Ʒ  ������Ļ�ֱ��ʣ�1280x800����";
	
	

	public static String getHtmlTitle() {
		return htmlTitle;
	}

	public static void setHtmlTitle(String htmlTitle) {
		AppContextMgr.htmlTitle = htmlTitle;
	}

	public static String getHtmlFooter() {
		return htmlFooter;
	}

	public static void setHtmlFooter(String htmlFooter) {
		AppContextMgr.htmlFooter = htmlFooter;
	}
}