package com.example.sample.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import com.example.sample.entity.sales.MGachaCountry;
import com.example.sample.repository.sales.MGachaCountryDao;
import com.example.sample.entity.sales.MGacha;
import com.example.sample.repository.sales.MGachaDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class SampleDataController {
		
		@Autowired
		private MGachaCountryDao MGachaCountryDao;
		
		@RequestMapping(value = "/sampleData/data", method = RequestMethod.POST)
		public Optional<MGachaCountry> data(Integer gachaId, Integer countryCd) {
			Optional<MGachaCountry> re = MGachaCountryDao.selectById(gachaId, countryCd);
					return re;
		}
		
	}
