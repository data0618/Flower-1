package com.flower.db.field.type;

/**
 * �ַ�����
 *
 */
public class StringType extends ValidateType {

	private static final long serialVersionUID = 1L;
	
	public StringType() {
	}
	
	/**
	 * @param maxLength ��󳤶�
	 */
	public StringType(int maxLength){
		this.maxLength = maxLength;
	}

	@Override
	public int getSqlType() {
		return java.sql.Types.VARCHAR;
	}

}
