package com.hibernatetry;

/**
 * Sequence entity. @author MyEclipse Persistence Tools
 */

public class Sequence {

	// Fields

	private String name;
	private Integer currentValue;
	private Integer increment;

	// Constructors

	/** default constructor */
	public Sequence() {
	}

	/** full constructor */
	public Sequence(String name, Integer currentValue, Integer increment) {
		this.name = name;
		this.currentValue = currentValue;
		this.increment = increment;
	}

	// Property accessors

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCurrentValue() {
		return this.currentValue;
	}

	public void setCurrentValue(Integer currentValue) {
		this.currentValue = currentValue;
	}

	public Integer getIncrement() {
		return this.increment;
	}

	public void setIncrement(Integer increment) {
		this.increment = increment;
	}

}