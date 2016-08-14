package org.weightsensor.dao;

import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.weightsensor.document.WeightData;


@Repository
public class WeightDataDAOImpl implements WeightDataDAO{

	@Autowired
	Datastore datastore;

	@Override
	public void create(WeightData data) {
		datastore.save(data);
		
	}

	@Override
	public List<WeightData> read() {
		final Query<WeightData> query = datastore.createQuery(WeightData.class);
		List<WeightData> weightMetrics = query.asList();
		
		return weightMetrics;
	}

	@Override
	public List<WeightData> readByTimeRange(long timestamp1, long timestamp2) {
		List<WeightData> weightMetrics = datastore.createQuery(WeightData.class).field("timeStamp").greaterThan(timestamp1).filter("timeStamp < ", timestamp2).asList();
		 return weightMetrics;
	}

}
