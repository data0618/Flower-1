package com.flower.db.field.type;

/**
 * ʱ������
 *
 */
public class DateTimeType extends ValidateType {

	private static final long serialVersionUID = 1L;

	@Override
	public int getSqlType() {
		return java.sql.Types.DATE;
	}

}
