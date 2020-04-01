package com.mahesh.springannotations;

import org.springframework.stereotype.Component;

/**
 * @author Mahesh
 *
 */
@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Database fortune service";
	}

}
