package aula10;
import java.util.*;
public class A10E03_OrdenarAtrasoMedio implements Comparator<String>{
	Map<String, Integer> map;
	
	public A10E03_OrdenarAtrasoMedio(Map<String, Integer> map){
		this.map = map;
	}

	@Override
	public int compare(String a, String b) {
		if(map.get(a) >= map.get(b)) return 1;
		else return -1;
	}
}