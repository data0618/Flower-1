package com.flower.db.field.type;

import java.io.Serializable;

/**
 * ����У������
 */
public abstract class ValidateType implements Serializable {
	private static final long serialVersionUID = 1L;

	// �����������󳤶�
	protected int maxLength = 65535;
	
	// �Ƿ�����Ϊ�յı�־
	protected boolean notNull = false;
	
	/**
	 * ��ȡ���ݿ�����
	 * @return
	 */
	public abstract int getSqlType();
	
	/**
	 * ��ȡ�Ƿ�����Ϊ��
	 * 
	 * @return ������Ϊ��ʱ����true,���򷵻�false
	 */
	public boolean notNull() {
		return notNull;
	}

	/**
	 * �����Ƿ�����Ϊ��
	 * 
	 * @param ������Ϊ��ʱ��Ϊtrue,������Ϊfalse
	 * @return
	 */
	public final ValidateType setNotNull(boolean notNull) {
		this.notNull = notNull;
		return this;
	}
}
