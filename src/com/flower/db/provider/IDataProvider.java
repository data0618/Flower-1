package com.flower.db.provider;

import java.util.List;

import com.flower.db.field.Field;

/**
 * �б�����������ṩ�ӿ�
 */
public interface IDataProvider{
	/**
	 * �õ���¼�ܸ���
	 * @param condition �������
	 * @param condValues ��������
	 * @return
	 */
	public int onGetCount(String condition, List<Object> condValues);
	
	/**
	 * ��ѯ��¼
	 * @param fields
	 * @param condition
	 * @param condValues
	 * @param start
	 * @param max
	 * @param orderby
	 * @param bAsc
	 * @return
	 */
	public List<Object[]> onSearch(Field[] fields, String condition, 
				List<Object> condValues, int start, int max, String orderby, boolean bAsc);
}
