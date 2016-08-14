package org.weightsensor.document;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

@Entity("weightData")
public class WeightData {
	@Id
	long timeStamp;
	@Property
	int value;
	
	public WeightData() {
		super();
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timestamp) {
		this.timeStamp = timestamp;
	}


	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public WeightData(long timeStamp, int value) {
		super();
		this.timeStamp = timeStamp;
		this.value = value;
	}

}
