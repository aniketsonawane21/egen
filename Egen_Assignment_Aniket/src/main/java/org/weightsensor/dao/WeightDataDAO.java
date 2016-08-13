package org.weightsensor.dao;

import java.util.List;

import org.weightsensor.document.WeightData;

public interface WeightDataDAO {
	public void create(WeightData data);
	public List<WeightData> read();
	List<WeightData> readByTimeRange(long timestamp1, long timestamp2);
}
