package org.weightsensor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.weightsensor.dao.WeightDataDAO;
import org.weightsensor.document.WeightData;



@RestController("weightDemo")
public class WeightSensorController {
	
	@Autowired
	WeightDataDAO mongoDAO;

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody WeightData data) {
		mongoDAO.create(data);
	}
	
	@RequestMapping(value="/{timeValue1}/{timeValue2}/", method=RequestMethod.GET)
	public List<WeightData> readByTimeRange(@PathVariable("timeValue1")long timestamp1, @PathVariable("timeValue2") long timestamp2){
		
		return mongoDAO.readByTimeRange(timestamp1, timestamp2);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<WeightData> read() {
	 	return mongoDAO.read();
	}
	
	
}
