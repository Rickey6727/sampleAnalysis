package com.example.sample.controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import lombok.Data;
import org.seasar.doma.Column;
import org.seasar.doma.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.context.annotation.Profile;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import com.example.sample.config.SampleBean;

import com.example.sample.entity.sales.MGachaCountry;
import com.example.sample.repository.sales.MGachaCountryDao;
import com.example.sample.entity.sales.TGachaHistory;
import com.example.sample.repository.sales.TGachaHistoryDao;
import com.example.sample.entity.sales.MGacha;
import com.example.sample.repository.sales.MGachaDao;
import com.example.sample.entity.sales.TGachaCount;
import com.example.sample.repository.sales.TGachaCountDao;
import com.example.sample.entity.sales.TCoinEvent;
import com.example.sample.repository.sales.TCoinEventDao;

import com.example.sample.entity.clothes.TClothesOwn;
import com.example.sample.repository.clothes.TClothesOwnDao;

import com.example.sample.entity.operation.MGachaExchange;
import com.example.sample.repository.operation.MGachaExchangeDao;

import com.example.sample.entity.account.TExchangeHistory;
import com.example.sample.repository.account.TExchangeHistoryDao;
import com.example.sample.entity.account.TTutorialState;
import com.example.sample.repository.account.TTutorialStateDao;

import com.example.sample.entity.event.MCaptureEvent;
import com.example.sample.repository.event.MCaptureEventDao;
import com.example.sample.entity.event.MDeliveryEvent;
import com.example.sample.repository.event.MDeliveryEventDao;
import com.example.sample.entity.event.MLeagueEvent;
import com.example.sample.repository.event.MLeagueEventDao;
import com.example.sample.entity.event.TCaptureUserState;
import com.example.sample.repository.event.TCaptureUserStateDao;
import com.example.sample.entity.event.TDeliveryEventState;
import com.example.sample.repository.event.TDeliveryEventStateDao;
import com.example.sample.entity.event.TLeagueEventAccount;
import com.example.sample.repository.event.TLeagueEventAccountDao;
import com.example.sample.entity.event.TCaptureCaptured;
import com.example.sample.repository.event.TCaptureCapturedDao;

import com.example.sample.entity.history.TLoginHistory;
import com.example.sample.repository.history.TLoginHistoryDao;



@RestController
	public class SampleDataController<sdformat> {
		
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
//■■　がチャ分析
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	//ガチャタイトルとバナー画像URL (MGachaCountry)
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
		
		
	//ガチャの開始時間と終了時間 (MGacha)

		@Autowired
		private MGachaDao MGachaDao;
		
		@Data
		static class Gacha {
		    Integer gachaId;
		    Integer gachaType;
		    Integer amount;
		    Integer delFlg;
		    String pageUrl;
		    String saleStartDate;
		    String saleEndDate;
		    LocalDateTime createTime;
		    LocalDateTime updateTime;
		    Integer ipEventId;
		    Boolean boxFlg;
		    Integer recommendFlg;
		    Integer castId;
		}
		
		@RequestMapping(value = "/sampleData/salesData", method = RequestMethod.POST)
		@CrossOrigin
		public Gacha salesData(Integer gachaId) {
			Optional<MGacha> re = MGachaDao.selectById(gachaId);
			
			Gacha gacha = new Gacha();
			if (re.isPresent()) {
				MGacha mGacha = re.get();
				gacha.gachaId = mGacha.getGachaId();
				gacha.gachaType = mGacha.getGachaType();
				gacha.amount = mGacha.getAmount();
				gacha.delFlg = mGacha.getDelFlg();
				gacha.pageUrl = mGacha.getPageUrl();
//				gacha.saleStartDate = mGacha.getSaleStartDate();
//				gacha.saleEndDate = mGacha.getSaleEndDate();
				gacha.saleStartDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mGacha.getSaleStartDate());
				gacha.saleEndDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mGacha.getSaleEndDate());
				gacha.createTime = mGacha.getCreateTime();
				gacha.updateTime = mGacha.getUpdateTime();
				gacha.ipEventId = mGacha.getIpEventId();
				gacha.boxFlg = mGacha.getBoxFlg(); 
				gacha.recommendFlg = mGacha.getRecommendFlg();
				gacha.castId = mGacha.getCastId();
			}
			
				return gacha;
		}
		
		@RequestMapping(value = "/sampleData/salesData", method = RequestMethod.GET)
		@CrossOrigin
		public Gacha salesData() {
			Integer gachaId = 10186;
			Optional<MGacha> re = MGachaDao.selectById(gachaId);
			Gacha gacha = new Gacha();
			if (re.isPresent()) {
				MGacha mGacha = re.get();
				gacha.gachaId = mGacha.getGachaId();
				gacha.gachaType = mGacha.getGachaType();
				gacha.amount = mGacha.getAmount();
				gacha.delFlg = mGacha.getDelFlg();
				gacha.pageUrl = mGacha.getPageUrl();
//				gacha.saleStartDate = mGacha.getSaleStartDate();
//				gacha.saleEndDate = mGacha.getSaleEndDate();
//				SimpleDateFormat saleStartDate= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//				gacha.saleStartDate = saleStartDate.format(mGacha.getSaleStartDate());
//				SimpleDateFormat saleEndDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//				gacha.saleEndDate = saleEndDate.format(mGacha.getSaleEndDate());
				gacha.saleStartDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mGacha.getSaleStartDate());
				gacha.saleEndDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mGacha.getSaleEndDate());
				gacha.createTime = mGacha.getCreateTime();
				gacha.updateTime = mGacha.getUpdateTime();
				gacha.ipEventId = mGacha.getIpEventId();
				gacha.boxFlg = mGacha.getBoxFlg(); 
				gacha.recommendFlg = mGacha.getRecommendFlg();
				gacha.castId = mGacha.getCastId();
			}
			return gacha;
		}
		
		
	//ガチャ設置期間内の総回転数 (TGachaHistory)
		@Autowired
		private TGachaHistoryDao TGachaHistoryDao;
		
		@RequestMapping(value = "/sampleData/countData", method = RequestMethod.POST)
		@CrossOrigin
		public Optional<TGachaHistory> countData(Integer gachaId) {
			Optional<TGachaHistory> re = TGachaHistoryDao.selectByGachaId(gachaId);
					return re;
		}
		
		@RequestMapping(value = "/sampleData/countData", method = RequestMethod.GET)
		@CrossOrigin
		public Optional<TGachaHistory> countData() {
			Integer gachaId = 10722;
			Optional<TGachaHistory> re = TGachaHistoryDao.selectByGachaId(gachaId);
					return re;
		}
		
		
	//指定期間内の回転数 (TGachaHistory)		
		@RequestMapping(value = "/sampleData/selectCountData", method = RequestMethod.POST)
		@CrossOrigin
		public Optional<TGachaHistory> selectCountData(Integer gachaId, String selectStartDate, String selectEndDate) {
			Optional<TGachaHistory> re = TGachaHistoryDao.selectByTerm(gachaId, selectStartDate, selectEndDate);
					return re;
		}
		
		@RequestMapping(value = "/sampleData/selectCountData", method = RequestMethod.GET)
		@CrossOrigin
		public Optional<TGachaHistory> selectCountData() {
			Integer gachaId = 10722;
			String selectStartDate = "2018-07-09 15:00:00.000";
			String selectEndDate = "2018-07-10 15:00:00.000";
			Optional<TGachaHistory> re = TGachaHistoryDao.selectByTerm(gachaId, selectStartDate, selectEndDate);
					return re;
		}
	
	//チケットor無料の回転数 (TGachaHistory)		
		@RequestMapping(value = "/sampleData/freeCountData", method = RequestMethod.POST)
		@CrossOrigin
		public Optional<TGachaHistory> freeCountData(Integer gachaId) {
			Optional<TGachaHistory> re = TGachaHistoryDao.selectFreeCountByGachaId(gachaId);
					return re;
		}
		
		@RequestMapping(value = "/sampleData/freeCountData", method = RequestMethod.GET)
		@CrossOrigin
		public Optional<TGachaHistory> freeCountData() {
			Integer gachaId = 10722;
			Optional<TGachaHistory> re = TGachaHistoryDao.selectFreeCountByGachaId(gachaId);
					return re;
		}
		

	//本質的な無料の回転数 (TGachaHistory)		
		@RequestMapping(value = "/sampleData/allFreeCountData", method = RequestMethod.POST)
		@CrossOrigin
		public Optional<TGachaHistory> allFreeCountData(Integer gachaId) {
			Optional<TGachaHistory> re = TGachaHistoryDao.selectAllFreeCountByGachaId(gachaId);
					return re;
		}
		
		@RequestMapping(value = "/sampleData/allFreeCountData", method = RequestMethod.GET)
		@CrossOrigin
		public Optional<TGachaHistory> allFreeCountData() {
			Integer gachaId = 10722;
			Optional<TGachaHistory> re = TGachaHistoryDao.selectAllFreeCountByGachaId(gachaId);
					return re;
		}
		
	//10+2の獲得数 (TGachaHistory)		
		@RequestMapping(value = "/sampleData/tenTwoData", method = RequestMethod.POST)
		@CrossOrigin
		public Optional<TGachaHistory> TenTwoData(Integer gachaId) {
			Optional<TGachaHistory> re = TGachaHistoryDao.selectTenTwoByGachaId(gachaId);
					return re;
		}
		
		@RequestMapping(value = "/sampleData/tenTwoData", method = RequestMethod.GET)
		@CrossOrigin
		public Optional<TGachaHistory> TenTwoData() {
			Integer gachaId = 10722;
			Optional<TGachaHistory> re = TGachaHistoryDao.selectTenTwoByGachaId(gachaId);
					return re;
		}
			
			
	//開始後3日間の回転数 (TGachaHistory)		
		@RequestMapping(value = "/sampleData/threeDaysData", method = RequestMethod.POST)
		@CrossOrigin
		public Optional<TGachaHistory> threeDaysData(Integer gachaId, String salesStartDate, String selectEndDate) {
			Optional<TGachaHistory> re = TGachaHistoryDao.selectThreeDaysCountByGachaId(gachaId, salesStartDate, selectEndDate);
					return re;
		}
		
		@RequestMapping(value = "/sampleData/threeDaysData", method = RequestMethod.GET)
		@CrossOrigin
		public Optional<TGachaHistory> threeDaysData() {
			Integer gachaId = 10680;
			String salesStartDate = "2018-05-08 15:00:00.000";
			String selectEndDate = "2018-05-11 15:00:00.000";
			Optional<TGachaHistory> re = TGachaHistoryDao.selectThreeDaysCountByGachaId(gachaId, salesStartDate, selectEndDate);
					return re;
		}
		
		
	//開始後3日間の無料／チケット回転数 (TGachaHistory)		
		@RequestMapping(value = "/sampleData/freeThreeDaysData", method = RequestMethod.POST)
		@CrossOrigin
		public Optional<TGachaHistory> freeThreeDaysData(Integer gachaId, String salesStartDate, String selectEndDate) {
			Optional<TGachaHistory> re = TGachaHistoryDao.selectFreeThreeDaysCountByGachaId(gachaId, salesStartDate, selectEndDate);
					return re;
		}
		
		@RequestMapping(value = "/sampleData/freeThreeDaysData", method = RequestMethod.GET)
		@CrossOrigin
		public Optional<TGachaHistory> freeThreeDaysData() {
			Integer gachaId = 10722;
			String salesStartDate = "2018-07-08 15:00:00.000";
			String selectEndDate = "2018-07-11 15:00:00.000";
			Optional<TGachaHistory> re = TGachaHistoryDao.selectFreeThreeDaysCountByGachaId(gachaId, salesStartDate, selectEndDate);
					return re;
		}
		
	//開始後3日間の無料のみ回転数 (TGachaHistory)		
		@RequestMapping(value = "/sampleData/allFreeThreeDaysData", method = RequestMethod.POST)
		@CrossOrigin
		public Optional<TGachaHistory> allFreeThreeDaysData(Integer gachaId, String salesStartDate, String selectEndDate) {
			Optional<TGachaHistory> re = TGachaHistoryDao.selectAllFreeThreeDaysCountByGachaId(gachaId, salesStartDate, selectEndDate);
					return re;
		}
		
		@RequestMapping(value = "/sampleData/allFreeThreeDaysData", method = RequestMethod.GET)
		@CrossOrigin
		public Optional<TGachaHistory> allFreeThreeDaysData() {
			Integer gachaId = 10722;
			String salesStartDate = "2018-07-08 15:00:00.000";
			String selectEndDate = "2018-07-11 15:00:00.000";
			Optional<TGachaHistory> re = TGachaHistoryDao.selectAllFreeThreeDaysCountByGachaId(gachaId, salesStartDate, selectEndDate);
					return re;
		}
		
	//開始後3日間の10+2 (TGachaHistory)		
		@RequestMapping(value = "/sampleData/tenTwoThreeDaysData", method = RequestMethod.POST)
		@CrossOrigin
		public Optional<TGachaHistory> tenTwoThreeDaysData(Integer gachaId, String salesStartDate, String selectEndDate) {
			Optional<TGachaHistory> re = TGachaHistoryDao.selectTenTwoThreeDaysCountByGachaId(gachaId, salesStartDate, selectEndDate);
					return re;
		}
		
		@RequestMapping(value = "/sampleData/tenTwoThreeDaysData", method = RequestMethod.GET)
		@CrossOrigin
		public Optional<TGachaHistory> tenTwoThreeDaysData() {
			Integer gachaId = 10722;
			String salesStartDate = "2018-07-08 15:00:00.000";
			String selectEndDate = "2018-07-11 15:00:00.000";
			Optional<TGachaHistory> re = TGachaHistoryDao.selectTenTwoThreeDaysCountByGachaId(gachaId, salesStartDate, selectEndDate);
					return re;
		}
		
	//ステップ回転数 (TGachaHistory)		
		@RequestMapping(value = "/sampleData/stepCountData", method = RequestMethod.POST)
		@CrossOrigin
		public Optional<TGachaHistory> stepCountData(Integer gachaId) {
			Optional<TGachaHistory> re = TGachaHistoryDao.selectStepCountByGachaId(gachaId);
					return re;
		}
		
		@RequestMapping(value = "/sampleData/stepCountData", method = RequestMethod.GET)
		@CrossOrigin
		public Optional<TGachaHistory> stepCountData() {
			Integer gachaId = 10722;
			Optional<TGachaHistory> re = TGachaHistoryDao.selectStepCountByGachaId(gachaId);
					return re;
		}
		
	//開始後3日間のステップ回転数 (TGachaHistory)		
		@RequestMapping(value = "/sampleData/stepCountThreeDaysData", method = RequestMethod.POST)
		@CrossOrigin
		public Optional<TGachaHistory> stepCountThreeDaysData(Integer gachaId, String salesStartDate, String selectEndDate) {
			Optional<TGachaHistory> re = TGachaHistoryDao.selectStepCountThreeDaysCountByGachaId(gachaId, salesStartDate, selectEndDate);
					return re;
		}
		
		@RequestMapping(value = "/sampleData/stepCountThreeDaysData", method = RequestMethod.GET)
		@CrossOrigin
		public Optional<TGachaHistory> stepCountThreeDaysData() {
			Integer gachaId = 10722;
			String salesStartDate = "2018-07-08 15:00:00.000";
			String selectEndDate = "2018-07-11 15:00:00.000";
			Optional<TGachaHistory> re = TGachaHistoryDao.selectStepCountThreeDaysCountByGachaId(gachaId, salesStartDate, selectEndDate);
					return re;
		}
		
	//ガチャ交換系（MGachaExchange）
		@Autowired
		private MGachaExchangeDao MGachaExchangeDao;
		
		@RequestMapping(value = "/sampleData/exchange1Data", method = RequestMethod.POST)
		@CrossOrigin
		public List<MGachaExchange> exchange1Data(Integer gachaId) {
			List<MGachaExchange> re = MGachaExchangeDao.selectExchangeType1ByGachaId(gachaId);
			return re;
		}
		
		@RequestMapping(value = "/sampleData/exchange2Data", method = RequestMethod.POST)
		@CrossOrigin
		public List<MGachaExchange> exchange2Data(Integer gachaId) {
			List<MGachaExchange> re = MGachaExchangeDao.selectExchangeType2ByGachaId(gachaId);
			return re;
		}
		
		@RequestMapping(value = "/sampleData/exchange1Data", method = RequestMethod.GET)
		@CrossOrigin
		public List<MGachaExchange> exchange1Data() {
			Integer gachaId = 10831;
			List<MGachaExchange> re = MGachaExchangeDao.selectExchangeType1ByGachaId(gachaId);
				return re;
		}
		
		@RequestMapping(value = "/sampleData/exchange2Data", method = RequestMethod.GET)
		@CrossOrigin
		public List<MGachaExchange> exchange2Data() {
			Integer gachaId = 10831;
			List<MGachaExchange> re = MGachaExchangeDao.selectExchangeType2ByGachaId(gachaId);
				return re;
		}
		
		
	//かぶらずとプレイ回数の回転数 (TGachaHistory)
		@Autowired
		private TExchangeHistoryDao TExchangeHistoryDao;
		
		@RequestMapping(value = "/sampleData/exchangeCount", method = RequestMethod.POST)
		@CrossOrigin
		public Optional<TExchangeHistory> exchangeCount(Integer exchangeId) {
			Optional<TExchangeHistory> re = TExchangeHistoryDao.selectCountByExchangeId(exchangeId);
					return re;
		}
		
		@RequestMapping(value = "/sampleData/exchangeCount", method = RequestMethod.GET)
		@CrossOrigin
		public Optional<TExchangeHistory> exchangeCount() {
			Integer exchangeId = 3850;
			Optional<TExchangeHistory> re = TExchangeHistoryDao.selectCountByExchangeId(exchangeId);
					return re;
		}
		

//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
//■■　衣装所有者検索
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	//アイテムの所有者リスト（TClothesOwn）
		@Autowired
		private TClothesOwnDao TClothesOwnDao;
		
		@RequestMapping(value = "/sampleData/clothesOwnData", method = RequestMethod.POST)
		@CrossOrigin
		public List<Integer> clothesOwnData(Integer clothesId) {
			List<Integer> accountIds = new ArrayList<Integer>();
			for (Integer i = 0; i < 100; i++) {
				accountIds.addAll(TClothesOwnDao.selectAccountIdByClothesId(i, clothesId));
			}
			return accountIds;
		}
		
		@RequestMapping(value = "/sampleData/clothesOwnData", method = RequestMethod.GET)
		@CrossOrigin
		public List<Integer> clothesOwnData() {
			List<Integer> accountIds = new ArrayList<Integer>();
			Integer i = 0;
			Integer clothesId = 10052625;
			for (i = 0; i < 100; i++) {
				accountIds.addAll(TClothesOwnDao.selectAccountIdByClothesId(i, clothesId));
			}
			return accountIds;
		}
		


//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
//■■　イベント分析
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	//ほかくイベントID・期間・紙芝居ID（MCaptureEvent）
		@Autowired
		private MCaptureEventDao mCaptureEventDao;
		
		@Data
		static class Capture {
			Integer eventId;
		    Integer maxStage;
		    String startDate;
		    String endDate;
		    Integer luckyGachaId;
		    Integer eventShopId;
		    Integer startTutorialId;
		    Integer endTutorialId;
		    Integer delFlg;
		    LocalDateTime createDate;
		    LocalDateTime updateDate;
		}
		
		@RequestMapping(value = "/sampleData/captureEventData", method = RequestMethod.POST)
		@CrossOrigin
		public Capture captureEventData(Integer eventId) {
			Optional<MCaptureEvent> re = mCaptureEventDao.selectById(eventId);
			
			Capture capture = new Capture();
			if (re.isPresent()) {
				MCaptureEvent mCaptureEvent = re.get();
				capture.eventId = mCaptureEvent.getEventId();
				capture.maxStage = mCaptureEvent.getMaxStage();
				capture.startDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mCaptureEvent.getStartDate());
				capture.endDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mCaptureEvent.getEndDate());
				capture.luckyGachaId = mCaptureEvent.getLuckyGachaId();
				capture.eventShopId = mCaptureEvent.getEventShopId();
				capture.startTutorialId = mCaptureEvent.getStartTutorialId();
				capture.endTutorialId = mCaptureEvent.getEndTutorialId();
				capture.delFlg = mCaptureEvent.getDelFlg();
				capture.createDate = mCaptureEvent.getCreateDate();
				capture.updateDate = mCaptureEvent.getUpdateDate(); 
			}
				return capture;
		}
		
		@RequestMapping(value = "/sampleData/captureEventData", method = RequestMethod.GET)
		@CrossOrigin
		public Capture captureEventData() {
			Integer eventId = 36;
			Optional<MCaptureEvent> re = mCaptureEventDao.selectById(eventId);
			
			Capture capture = new Capture();
			if (re.isPresent()) {
				MCaptureEvent mCaptureEvent = re.get();
				capture.eventId = mCaptureEvent.getEventId();
				capture.maxStage = mCaptureEvent.getMaxStage();
				capture.startDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mCaptureEvent.getStartDate());
				capture.endDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mCaptureEvent.getEndDate());
				capture.luckyGachaId = mCaptureEvent.getLuckyGachaId();
				capture.eventShopId = mCaptureEvent.getEventShopId();
				capture.startTutorialId = mCaptureEvent.getStartTutorialId();
				capture.endTutorialId = mCaptureEvent.getEndTutorialId();
				capture.delFlg = mCaptureEvent.getDelFlg();
				capture.createDate = mCaptureEvent.getCreateDate();
				capture.updateDate = mCaptureEvent.getUpdateDate();
			}
				return capture;
		}
		
	//ほかく実施期間（MCaptureEvent）
		@RequestMapping(value = "/sampleData/captureEventTerm", method = RequestMethod.POST)
		@CrossOrigin
		public Optional<MCaptureEvent> captureEventTerm(Integer eventId) {
			Optional<MCaptureEvent> re = mCaptureEventDao.selectEventTermByEventId(eventId);
			return re;
		}
		
		@RequestMapping(value = "/sampleData/captureEventTerm", method = RequestMethod.GET)
		@CrossOrigin
		public Optional<MCaptureEvent> captureEventTerm() {
			Integer eventId = 227;
			Optional<MCaptureEvent> re = mCaptureEventDao.selectEventTermByEventId(eventId);
			return re;
		}
		
	//納品イベントID・期間・紙芝居ID（MDeliveryEvent）
		@Autowired
		private MDeliveryEventDao mDeliveryEventDao;
		
		@Data
		static class Delivery {
			Integer eventId;
		    String startDate;
		    String endDate;
		    Integer luckyGachaId;
		    Integer luckyGachaTicketId;
		    Integer startTutorialId;
		    Integer endTutorialId;
		    LocalDateTime createDate;
		    LocalDateTime updateDate;
		}
		
		@RequestMapping(value = "/sampleData/deliveryEventData", method = RequestMethod.POST)
		@CrossOrigin
		public Delivery deliveryEventData(Integer eventId) {
			Optional<MDeliveryEvent> re = mDeliveryEventDao.selectById(eventId);
			
			Delivery delivery = new Delivery();
			if (re.isPresent()) {
				MDeliveryEvent mDeliveryEvent = re.get();
				delivery.eventId = mDeliveryEvent.getEventId();
				delivery.startDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mDeliveryEvent.getStartDate());
				delivery.endDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mDeliveryEvent.getEndDate());
				delivery.luckyGachaId = mDeliveryEvent.getLuckyGachaId();
				delivery.luckyGachaTicketId = mDeliveryEvent.getLuckyGachaTicketId();
				delivery.startTutorialId = mDeliveryEvent.getStartTutorialId();
				delivery.endTutorialId = mDeliveryEvent.getEndTutorialId();
				delivery.createDate = mDeliveryEvent.getCreateDate();
				delivery.updateDate = mDeliveryEvent.getUpdateDate(); 
			}
				return delivery;
		}
		
		@RequestMapping(value = "/sampleData/deliveryEventData", method = RequestMethod.GET)
		@CrossOrigin
		public Delivery deliveryEventData() {
			Integer eventId = 268;
			Optional<MDeliveryEvent> re = mDeliveryEventDao.selectById(eventId);
			
			Delivery delivery = new Delivery();
			if (re.isPresent()) {
				MDeliveryEvent mDeliveryEvent = re.get();
				delivery.eventId = mDeliveryEvent.getEventId();
				delivery.startDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mDeliveryEvent.getStartDate());
				delivery.endDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mDeliveryEvent.getEndDate());
				delivery.luckyGachaId = mDeliveryEvent.getLuckyGachaId();
				delivery.luckyGachaTicketId = mDeliveryEvent.getLuckyGachaTicketId();
				delivery.startTutorialId = mDeliveryEvent.getStartTutorialId();
				delivery.endTutorialId = mDeliveryEvent.getEndTutorialId();
				delivery.createDate = mDeliveryEvent.getCreateDate();
				delivery.updateDate = mDeliveryEvent.getUpdateDate();
			}
				return delivery;
		}
		
	//納品実施期間（MDeliveryEvent）
		@RequestMapping(value = "/sampleData/deliveryEventTerm", method = RequestMethod.POST)
		@CrossOrigin
		public Optional<MDeliveryEvent> deliveryEventTerm(Integer eventId) {
			Optional<MDeliveryEvent> re = mDeliveryEventDao.selectEventTermByEventId(eventId);
			return re;
		}
		
		@RequestMapping(value = "/sampleData/deliveryEventTerm", method = RequestMethod.GET)
		@CrossOrigin
		public Optional<MDeliveryEvent> deliveryEventTerm() {
			Integer eventId = 260;
			Optional<MDeliveryEvent> re = mDeliveryEventDao.selectEventTermByEventId(eventId);
			return re;
		}
		
	//ギルドイベントID・期間・紙芝居ID（MGuildEvent）
		@Autowired
		private MLeagueEventDao mLeagueEventDao;
		
		@Data
		static class League {
			Integer eventId;
		    String startDate;
		    String endDate;
		    Integer baseProbability;
		    Integer helperFacilityId;
		    Integer startTutorialId;
		    Integer endTutorialId;
		    Integer rewardTutorialId;
		    LocalDateTime updateDate;
		}
		
		@RequestMapping(value = "/sampleData/guildEventData", method = RequestMethod.POST)
		@CrossOrigin
		public League guildEventData(Integer eventId) {
			Optional<MLeagueEvent> re = mLeagueEventDao.selectById(eventId);
			
			League league = new League();
			if (re.isPresent()) {
				MLeagueEvent mLeagueEvent = re.get();
				league.eventId = mLeagueEvent.getEventId();
				league.startDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mLeagueEvent.getStartDate());
				league.endDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mLeagueEvent.getEndDate());
				league.startTutorialId = mLeagueEvent.getStartTutorialId();
				league.endTutorialId = mLeagueEvent.getEndTutorialId();
				league.updateDate = mLeagueEvent.getUpdateDate(); 
				league.baseProbability = mLeagueEvent.getBaseProbability(); 
				league.helperFacilityId = mLeagueEvent.getHelperFacilityId(); 
				league.rewardTutorialId = mLeagueEvent.getRewardTutorialId(); 
			}
				return league;
		}
		
		@RequestMapping(value = "/sampleData/guildEventData", method = RequestMethod.GET)
		@CrossOrigin
		public League guildEventData() {
			Integer eventId = 257;
			Optional<MLeagueEvent> re = mLeagueEventDao.selectById(eventId);
			
			League league = new League();
			if (re.isPresent()) {
				MLeagueEvent mLeagueEvent = re.get();
				league.eventId = mLeagueEvent.getEventId();
				league.startDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mLeagueEvent.getStartDate());
				league.endDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mLeagueEvent.getEndDate());
				league.startTutorialId = mLeagueEvent.getStartTutorialId();
				league.endTutorialId = mLeagueEvent.getEndTutorialId();
				league.updateDate = mLeagueEvent.getUpdateDate(); 
				league.baseProbability = mLeagueEvent.getBaseProbability(); 
				league.helperFacilityId = mLeagueEvent.getHelperFacilityId(); 
				league.rewardTutorialId = mLeagueEvent.getRewardTutorialId(); 
			}
				return league;
		}
		
	//ギルド実施期間（MGuildEvent）
		@RequestMapping(value = "/sampleData/guildEventTerm", method = RequestMethod.POST)
		@CrossOrigin
		public Optional<MLeagueEvent> guildEventTerm(Integer eventId) {
			Optional<MLeagueEvent> re = mLeagueEventDao.selectEventTermByEventId(eventId);
			return re;
		}
		
		@RequestMapping(value = "/sampleData/guildEventTerm", method = RequestMethod.GET)
		@CrossOrigin
		public Optional<MLeagueEvent> guildEventTerm() {
			Integer eventId = 257;
			Optional<MLeagueEvent> re = mLeagueEventDao.selectEventTermByEventId(eventId);
			return re;
		}
		
	//紙芝居再生人数 (TTutorialState)	
		@Autowired
		private TTutorialStateDao tTutorialStateDao;
		@RequestMapping(value = "/sampleData/tutorialPlayData", method = RequestMethod.POST)
		@CrossOrigin
		public Optional<TTutorialState> tutorialPlayData(Integer tutorialId) {
			Optional<TTutorialState> re = tTutorialStateDao.selectCountByTutorialId(tutorialId);
					return re;
		}
		
		@RequestMapping(value = "/sampleData/tutorialPlayData", method = RequestMethod.GET)
		@CrossOrigin
		public Optional<TTutorialState> tutorialPlayData() {
			Integer tutorialId = 339;
			Optional<TTutorialState> re = tTutorialStateDao.selectCountByTutorialId(tutorialId);
					return re;
		}
		
	//イベント期間内のコインキャンペーン (TCoinEvent)	
		@Autowired
		private TCoinEventDao tCoinEventDao;
			
		@RequestMapping(value = "/sampleData/coinCampaignData", method = RequestMethod.POST)
		@CrossOrigin
		public Optional<TCoinEvent> coinCampaignData(String startDate, String endDate, String productId) {
			Optional<TCoinEvent> re = tCoinEventDao.selectCoinCampaignByEventId(startDate, endDate, productId);
					return re;
		}
		
		@RequestMapping(value = "/sampleData/coinCampaignData", method = RequestMethod.GET)
		@CrossOrigin
		public Optional<TCoinEvent> coinCampaignData() {
			String startDate = "2018-04-23 15:00:00";
			String endDate = "2018-04-30 15:00:00";
			String productId = "com.unitedfun.cocoppaplay.006";
			Optional<TCoinEvent> re = tCoinEventDao.selectCoinCampaignByEventId(startDate, endDate, productId);
				return re;
		}
		
	//ほかくアクティブユーザー (TCaptureUserState)	
		@Autowired
		private TCaptureUserStateDao tCaptureUserStateDao;
			
		@RequestMapping(value = "/sampleData/captureEventActiveUser", method = RequestMethod.POST)
		@CrossOrigin
		public Optional<TCaptureUserState> captureEventActiveUser(Integer eventId) {
			Optional<TCaptureUserState> re = tCaptureUserStateDao.selectActiveUserByCurrentPoint(eventId);
					return re;
		}
		
		@RequestMapping(value = "/sampleData/captureEventActiveUser", method = RequestMethod.GET)
		@CrossOrigin
		public Optional<TCaptureUserState> captureEventActiveUser() {
			Integer eventId = 199;
			Optional<TCaptureUserState> re = tCaptureUserStateDao.selectActiveUserByCurrentPoint(eventId);
				return re;
		}
		
		
	//納品アクティブユーザー (TDeliveryEventState)	
		@Autowired
		private TDeliveryEventStateDao TDeliveryEventStateDao;
			
		@RequestMapping(value = "/sampleData/deliveryEventActiveUser", method = RequestMethod.POST)
		@CrossOrigin
		public Optional<TDeliveryEventState> deliveryEventActiveUser(Integer eventId) {
			Optional<TDeliveryEventState> re = TDeliveryEventStateDao.selectActiveUserByCurrentPoint(eventId);
					return re;
		}
		
		@RequestMapping(value = "/sampleData/deliveryEventActiveUser", method = RequestMethod.GET)
		@CrossOrigin
		public Optional<TDeliveryEventState> deliveryEventActiveUser() {
			Integer eventId = 260;
			Optional<TDeliveryEventState> re = TDeliveryEventStateDao.selectActiveUserByCurrentPoint(eventId);
				return re;
		}
		
	//納品数 (TDeliveryEventState)	
		@RequestMapping(value = "/sampleData/deliveryCount", method = RequestMethod.POST)
		@CrossOrigin
		public Optional<TDeliveryEventState> deliveryCount(Integer eventId) {
			System.out.println(eventId);
			System.out.println(eventId);
			System.out.println(eventId);
			System.out.println(eventId);
			System.out.println(eventId);
			System.out.println(eventId);
			Optional<TDeliveryEventState> re = TDeliveryEventStateDao.selectDeliveryCountByEventId(eventId);
					return re;
		}
		
		@RequestMapping(value = "/sampleData/deliveryCount", method = RequestMethod.GET)
		@CrossOrigin
		public Optional<TDeliveryEventState> deliveryCount() {
			Integer eventId = 231;
			Optional<TDeliveryEventState> re = TDeliveryEventStateDao.selectDeliveryCountByEventId(eventId);
				return re;
		}
			
			
	//ギルドアクティブユーザー (TLeagueEventAccount)	
		@Autowired
		private TLeagueEventAccountDao tLeagueEventAccountDao;
			
		@RequestMapping(value = "/sampleData/guildEventActiveUser", method = RequestMethod.POST)
		@CrossOrigin
		public Optional<TLeagueEventAccount> guildEventActiveUser(Integer eventId) {
			Optional<TLeagueEventAccount> re = tLeagueEventAccountDao.selectActiveUserByCurrentPoint(eventId);
					return re;
		}
		
		@RequestMapping(value = "/sampleData/guildEventActiveUser", method = RequestMethod.GET)
		@CrossOrigin
		public Optional<TLeagueEventAccount> guildEventActiveUser() {
			Integer eventId = 273;
			Optional<TLeagueEventAccount> re = tLeagueEventAccountDao.selectActiveUserByCurrentPoint(eventId);
				return re;
		}
		
		
	//ほかく数 (TCaptureCaptured)	
		@Autowired
		private TCaptureCapturedDao tCaptureCapturedDao;
			
		@RequestMapping(value = "/sampleData/caputureCount", method = RequestMethod.POST)
		@CrossOrigin
		public Optional<TCaptureCaptured> caputureCount(Integer eventId) {
			Optional<TCaptureCaptured> re = tCaptureCapturedDao.selectCaputureCountByEventId(eventId);
					return re;
		}
		
		@RequestMapping(value = "/sampleData/caputureCount", method = RequestMethod.GET)
		@CrossOrigin
		public Optional<TCaptureCaptured> caputureCount() {
			Integer eventId = 227;
			Optional<TCaptureCaptured> re = tCaptureCapturedDao.selectCaputureCountByEventId(eventId);
				return re;
		}
		
		
	//期間UU数 (TLoginHistory)	
		@Autowired
		private TLoginHistoryDao tLoginHistoryDao;
			
		@RequestMapping(value = "/sampleData/uuCount", method = RequestMethod.POST)
		@CrossOrigin
		public Optional<TLoginHistory> uuCount(String startDate, String endDate) {
			Optional<TLoginHistory> re = tLoginHistoryDao.selectUUByEventId(startDate, endDate);
					return re;
		}
		
		@RequestMapping(value = "/sampleData/uuCount", method = RequestMethod.GET)
		@CrossOrigin
		public Optional<TLoginHistory> uuCount() {
			String startDate = "2018-04-23 15:00:00";
			String endDate = "2018-04-30 15:00:00";
			Optional<TLoginHistory> re = tLoginHistoryDao.selectUUByEventId(startDate, endDate);
				return re;
		}
	}
	