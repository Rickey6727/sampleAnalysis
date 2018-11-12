package com.example.sample.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import com.example.sample.entity.sales.MGachaCountry;
import com.example.sample.repository.sales.MGachaCountryDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class SampleDataController {
		
		@Autowired
		private MGachaCountryDao MGachaCountryDao;

		@RequestMapping(value = "/sample/data", method = RequestMethod.GET)
		public Optional<MGachaCountry> main() {
		Integer gachaId = 10186;
		Integer countryCd = 1;
		Optional<MGachaCountry> re = MGachaCountryDao.selectById(gachaId, countryCd);
				return re;
		}
	}
