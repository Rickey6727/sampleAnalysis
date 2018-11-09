/**
game, manage, operation, salesのみ（account, clothes, event, guild, historyは重いため入れていない）

以下の内容を抽出する
【DB】
game

【テーブル】
m_battery

【カラム】
battery_id
sustained_time
sheep_birth_time
appearance_stable_id
use_point
del_flg
start_date
end_date
create_date
update_date


【注意】
Daoを呼び出すときは、Daoファイルに以下の記述が必要
import org.seasar.doma.boot.ConfigAutowireable;
@ConfigAutowireable
*/

package com.example.sample.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.ui.Model;
//import com.example.sample.entity.game.MBattery;
//import com.example.sample.repository.game.MBatteryDao;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RestController;

@Controller
	public class SampleController {
		@RequestMapping("/")
		String home() {
			return "home";
		}
		
//		@Autowired
//			private MBatteryDao Optional<MBatteryDao>;
//		
		@RequestMapping("/sample")
//		public MBattery main(Model model) {
//			model.addAttribute("message", "Hello Thymeleaf!!");
//			MBattery re = null;
//			model.addAttribute("batteryId", re.getBatteryId());
//			return re;
		String sample() {
			return "sample";
		}
	}


//@Autowired
//private MBatteryDao MBatteryDao;
//
//@RequestMapping(value = "/sample", method = RequestMethod.GET)
//public MBattery main(Model model) {
//Integer batteryId = 1;
//	MBattery re = MBatteryDao.selectById(batteryId);
//	model.addAttribute("batteryId", re.getBatteryId());
//		return re;
//	}
//
//}
