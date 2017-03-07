package com.flower.main.act;

import java.io.Serializable;

import org.apache.wicket.Page;

public interface IPageAction extends Serializable{
	/**
	 * �õ��������ƣ�һ��������ʾ
	 * 
	 * @return ��������
	 */
	public String getActName();
	
	public void exec(Page page, Object param);

}