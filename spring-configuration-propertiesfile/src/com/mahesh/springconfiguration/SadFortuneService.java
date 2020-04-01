/**
 * 
 */
package com.mahesh.springconfiguration;

/**
 * @author Mahesh
 *
 */
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "It is such a sad day";
	}

}
