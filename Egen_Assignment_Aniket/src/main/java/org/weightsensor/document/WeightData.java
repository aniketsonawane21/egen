package org.weightsensor.document;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

@Entity("weightData")
public class WeightData {
	@Id
	long time;
	@Property
	int val;
	

	public WeightData() {
		super();
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public WeightData(long time, int val) {
		super();
		this.time = time;
		this.val = val;
	}

	@Override
	public String toString() {
		return "WeightData [time=" + time + ", val=" + val + "]";
	}
	
}
