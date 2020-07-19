package pack03_generic.sec02_GenericClass.EX02_TwoGenericArguments;

/*���׸� Ÿ�Ժ��� 2���� ���� ���׸�Ŭ������ ���� �� Ȱ��*/

class KeyValue<K, V>{
	private K key;
	private V value;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}

public class EX02_TwoGenericArguments {
	public static void main(String[] args) {
		KeyValue<String, Integer> kv1 = new KeyValue<>();
		kv1.setKey("���");
		kv1.setValue(1000);		
		String key1 = kv1.getKey();
		int value1 = kv1.getValue();
		System.out.println("key: "+key1+"  value: "+value1);
		
		KeyValue<Integer, String> kv2 = new KeyValue<>();
		kv2.setKey(404);
		kv2.setValue("Not Found(��û���������� ã�� �� ����)");		
		int key2 = kv2.getKey();
		String value2 = kv2.getValue();
		System.out.println("key: "+key2+" value: "+value2);
		
		KeyValue<String, Void> kv3 = new KeyValue<>();
		kv3.setKey("Ű���� ���");				
		String key3 = kv3.getKey();		
		System.out.println("key: "+key3);
	}
}
