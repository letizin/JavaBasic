package program;

import java.util.HashMap;
import java.util.Map;

public class Pr06 {
	public static void main(String[] args) {
		Map<String, String> setData = new HashMap<>();
		
		setData.put("호랑이", "tiger");
		setData.put("표범", "leopard");
		setData.put("사자", "lion");
		
		System.out.println("변경 전 : " + setData);
		
		setData.replaceAll((key, value) -> value.toUpperCase());
		System.out.println("변경 후 : " + setData);
	}
}
