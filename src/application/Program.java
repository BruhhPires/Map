package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>(); // MAP FUNCIONA COM KEY E VALOR
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		
		cookies.remove("email"); // REMOVER COM BASE NO KEY
		cookies.put("phone", "99711133"); // SERÁ SUBSCRITO POIS POSSUI A MESMA CHAVE
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone")); // VERIFICA SE CONTEM A KEY
		System.out.println("Phone number: " + cookies.get("phone")); // PEGA O VALOR
		System.out.println("Email: " +  cookies.get("email")); 
		System.out.println("Size: "+ cookies.size());
		
		System.out.println("ALL COOKIES:");
		for(String key: cookies.keySet()) {  //PERCORRE O MAPA
			System.out.println(key + ": " + cookies.get(key));
		}

	}

}
