package com.mahesh.springannotations;

import org.springframework.stereotype.Component;

/**
 * @author Mahesh
 *
 */
@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}

}
