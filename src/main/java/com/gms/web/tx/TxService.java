package com.gms.web.tx;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TxService {
	@Autowired HashMap<String, Object> map;
	public Map<?,?>point(Map<?,?>p){
		map.clear();
		return map;
		
	}
}
