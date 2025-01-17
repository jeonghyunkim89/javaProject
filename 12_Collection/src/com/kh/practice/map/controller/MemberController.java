package com.kh.practice.map.controller;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	
	private HashMap<String, Member> map = new HashMap<>();
	
	public boolean joinMembership(String id, Member m) {
		// 전달 받은 id가 없다면 id와 m을 map에 추가 후 true 반환 
		// 있다면 false 값 반환
		if(!map.containsKey(id)) {
			map.put(id, m);
			return true;
		} else {
			return false;
		}
	}
	
	public String logIn(String id, String password) {
		// 전달 받은 id가 존재하는지 확인 후 존재하면 Member에 저장된 비밀번호와 
		// 사용자가 입력한 비밀번호가 같은지 비교. 
		// 같다면 저장된 Member의 이름 반환, 그 외 모든 상황에는 null 반환
		Member m = map.get(id);	//Map에서 id(key)에 해당하는 데이터를 조회
		
		if(m != null) { //데이터가 있다면
			if(m.getPassword().equals(password)) { //저장된 비밀번호와 전달된 비밀번호를 비교
				return m.getName(); // 같다면, 해당 객체의 이름 데이터를 반환
			}
		}
		return null;	//그외에 모든 경우는 null반환
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		// 아이디가 존재하면서 저장된 비밀번호와 사용자가 입력한 비밀번호(oldPw)가 
		// 같을 때 새로운 비밀번호로 바꾸고 true 반환, 아니라면 false 반환
		Member m = map.get(id); //아이디에 해당하는 객체를 Map에서 조회
		
		if(m != null) {	//데이터가 있다면
			if(m.getPassword().equals(oldPw)) {	//저장된 비밀번호와 입력된 기존 비밀번호가 같다면
				//새로운 비밀번호로 변경
				m.setPassword(newPw);	//map저장된 객체의 주소를 m참조변수가 가리키고 있으므로 setter로 처리가능!
				return true;
			}
		}
		return false;
	}
	public void changeName(String id, String newName) {
		//전달 받은 id를 통해 Member의 이름을 새로 입력한 이름으로 변경 
		if(map.containsKey(id)) { //Map에 해당 id의 데이터가 존재한다면(포함되어있다면)
			Member m = map.get(id);	//데이터를 조회해와서 객체의 name필드의 값을 변경
			m.setName(newName);
		}
	}
	
	public TreeMap<String, String> sameName(String name) {
		// 전달 받은 name이 저장된 데이터의 이름과 같으면 
		// key로 오름차순 해주는 객체에 해당 id와 이름 저장 후 객체 반환 
		// 단, 엘리먼트 하나씩 뽑아내는 과정에서 keySet()을 쓸 것
		TreeMap<String, String> tMap = new TreeMap(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
		
		//(HashMap)map의 키 목록 조회 : keySet()
		for(String k : map.keySet()) {
			Member m = map.get(k);
			if(m.getName().equals(name)) {
				tMap.put(k, m.getName());	//k:아이디 name: m.getName()으로 넣어줘도됨
			}
		}
		return tMap;
	}
}
