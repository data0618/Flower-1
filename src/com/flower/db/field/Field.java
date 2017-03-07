package com.flower.db.field;

import java.io.Serializable;
import java.sql.Types;

import com.flower.db.field.type.ValidateType;

/**
 * Field����ȷ�����Ե����ݵĶ��壬
 * ���԰��������ݵ��ڲ���ʶ��name�������ͣ�type����������ʾ���ƣ�caption�����Ƿ�ǿգ�notNull���ȡ�
 *
 */
public class Field implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ���ڽ�����ʾ�ַ���
	 */
	public final String caption;

	/**
	 * �ڲ�ʹ�õı�ʶ���������ݿ��ֶΣ�Ҳ���ֶ�����
	 */
	public String name;

	/**
	 * �Ƿ�ǿ�
	 */
	public final boolean notNull;

	/**
	 * �Ƿ�Ϊ����
	 */
	public final boolean isPrimaryKey;

	/**
	 * �ֶζ�Ӧ��У������
	 */
	private ValidateType type;
	
	/**
	 * ���캯��
	 * 
	 * @param caption	������ʾ������
	 * @param name		�ڲ����ݱ�ʶ���������ݿ��ֶ����ֶ�����
	 * @param type		����֤����������
	 */
	public Field(String caption, String name, ValidateType type) {
		this(caption, name, type, false, false);
	}

	/**
	 * ���캯��
	 * 
	 * @param caption	������ʾ������
	 * @param name		�ڲ����ݱ�ʶ���������ݿ��ֶ����ֶ�����
	 * @param type		����֤����������
	 * @param notNull	�Ƿ�ǿ�
	 */
	public Field(String caption, String name, ValidateType type, boolean notNull) {
		this(caption, name, type, notNull, false);
	}

	/**
	 * ���캯��
	 * 
	 * @param caption		������ʾ������
	 * @param name			�ڲ����ݱ�ʶ���������ݿ��ֶ����ֶ�����
	 * @param type			����֤����������
	 * @param notNull		�Ƿ�ǿ�
	 * @param isPrimaryKey	�Ƿ�Ϊ������һ�㶨�����ݿ��ʱ�õ�
	 */
	public Field(String caption, String name, ValidateType type, boolean notNull, boolean isPrimaryKey) {
		this.caption = caption;
		this.name = name;
		this.notNull = notNull;
		this.type = type;
		this.isPrimaryKey = isPrimaryKey;

		if (type != null) {
			type.setNotNull(notNull);
		}
	}

	/**
	 * ��ȡ��Ӧ����֤����
	 */
	public ValidateType getType() {
		return type;
	}

	/**
	 * ����field�����ͣ���valת��Ϊname=val��sql��ʽ��Ŀǰֻ֧��string��integer���� ��Ϊ�˷���д�򵥵Ĳ�ѯ����
	 * 
	 * @param val ��Ҫת��Ϊsql��������
	 * @return ת�����sql�ַ���
	 */
	public String toSqlEQ(Object val) {
		if (val == null)
			return null;

		switch (getType().getSqlType()) {
		case Types.VARCHAR:
			return name + "='" + val + "'";
		case Types.INTEGER:
		case Types.NUMERIC:
			return name + "=" + val;
		default:
			throw new UnsupportedOperationException("toSqlEQ��֧�ָ�����");
		}
	}
}
