package com.example.sample.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import com.example.sample.entity.sales.MGachaCountry;
import com.example.sample.repository.sales.MGachaCountryDao;
import com.example.sample.entity.sales.MGacha;
import com.example.sample.repository.sales.MGachaDao;
import com.example.sample.entity.sales.TGachaCount;
import com.example.sample.repository.sales.TGachaCountDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class SampleDataController {
		
		@Autowired
		private MGachaCountryDao MGachaCountryDao;
		
		@RequestMapping(value = "/sampleData/data", method = RequestMethod.POST)
		@CrossOrigin
		public Optional<MGachaCountry> data(Integer gachaId, Integer countryCd) {
			Optional<MGachaCountry> re = MGachaCountryDao.selectById(gachaId, countryCd);
					return re;
		}
		
		@RequestMapping(value = "/sampleData/data", method = RequestMethod.GET)
		@CrossOrigin
		public Optional<MGachaCountry> data() {
			Integer gachaId = 10186;
			Integer countryCd = 1;
			Optional<MGachaCountry> re = MGachaCountryDao.selectById(gachaId, countryCd);
					return re;
		}
		
		
		@Autowired
		private MGachaDao MGachaDao;
		
		@RequestMapping(value = "/sampleData/salesData", method = RequestMethod.POST)
		@CrossOrigin
		public Optional<MGacha> salesData(Integer gachaId) {
			Optional<MGacha> re = MGachaDao.selectById(gachaId);
					return re;
		}
		
		@RequestMapping(value = "/sampleData/salesData", method = RequestMethod.GET)
		@CrossOrigin
		public Optional<MGacha> salesData() {
			Integer gachaId = 10186;
			Optional<MGacha> re = MGachaDao.selectById(gachaId);
					return re;
		}
		
		
//		@Autowired
//		private TGachaCountDao TGachaCountDao;
//		
//		@RequestMapping(value = "/sampleData/countData", method = RequestMethod.POST)
//		@CrossOrigin
//		public Optional<TGachaCount> countData(Integer gachaId) {
//			Optional<TGachaCount> re = TGachaCountDao.selectById(gachaId);
//					return re;
//		}
//		
//		@RequestMapping(value = "/sampleData/countData", method = RequestMethod.GET)
//		@CrossOrigin
//		public Optional<TGachaCount> countData() {
//			Integer gachaId = 20013;
//			Optional<TGachaCount> re = TGachaCountDao.selectById(gachaId);
//					return re;
//		}
	}
