/**
 * 
 */
package tij.tweleve;

/**
 * @author chengj
 *
 */

class DynamicFieldsException extends Exception {}

public class DynamicFields {
	
	private Object[][] fields;
	
	public DynamicFields(int size) {
		fields = new Object[size][2];
		for (int i = 0; i < size; i++) {
			fields[i] = new Object[] {null, null};
		}
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		for (Object[] objects : fields) {
			result.append(objects[0]);
			result.append(": ");
			result.append(objects[1]);
			result.append("\n");
		}
		return result.toString();
	}
	
	private int hasField(String id) {
		for (int i = 0; i < fields.length; i++) {
			if (id.equals(fields[i][0]))
				return i;
		}
		return -1;
	}
	
	private int getFieldNumber(String id) 
			throws NoSuchFieldException {
		int fielNum = hasField(id);
		if (fielNum == -1) {
			throw new NoSuchFieldException();
		}
		return fielNum;
	}
	
	private int makeField(String id) {
		for(int i = 0; i < fields.length; i++) {
			if (fields[i][0] == null) {
				fields[i][0] = id;
				return i;
			}
		}
		Object[][] tmp = new Object[fields.length + 1][2];
		for(int i = 0; i < fields.length; i++) { 
			tmp[i] = fields[i];
		}
		for(int i = fields.length; i < tmp.length; i++) {
			tmp[i] = new Object[] {null, null};
		}
		fields = tmp;
		return makeField(id);
	}
	
	public Object getField(String id) throws NoSuchFieldException {
		return fields[getFieldNumber(id)][1];
	}
	
	public Object setFiled(String id, Object value) throws DynamicFieldsException {
		if (value == null) {
			DynamicFieldsException dfe = 
					new DynamicFieldsException();
			dfe.initCause(new NullPointerException());
			throw dfe;
		}
		int fieldNumber = hasField(id);
		if (fieldNumber == -1) {
			fieldNumber = makeField(id);
		}
		Object result = null;
		try {
			result = getField(id);
		} catch (NoSuchFieldException e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
		fields[fieldNumber][1] = value;
		return result;
	}
	
	
	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicFields df = new DynamicFields(3);
		System.out.println(df);
		try {
			df.setFiled("d", "A value for d");
			df.setFiled("number", 47);
			df.setFiled("number2", 48);
			System.out.println(df);
			df.setFiled("d", "A new value for d");
			df.setFiled("number3", 11);
			System.out.println("df:" + df);
			System.out.println("df.getField(\"d\"):" + df.getField("d"));
			Object fied = df.setFiled("d", null);
			
		} catch (NoSuchFieldException e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		} catch (DynamicFieldsException e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		}
	}

}
