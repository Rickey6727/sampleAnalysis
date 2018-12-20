import {Component, OnInit} from "@angular/core";
import {DataService} from "../../../services/data.service";


@Component({
    selector: 'capture-dashboard',
    templateUrl: './capture.dashboard.component.html',
    styleUrls: ['../dashboard.component.css']
})

export class CaptureDashboardComponent implements OnInit{

    inputCaptureEventId = "入力してね";

    captureEventStartDate = "0";
    captureEventEndDate = "0";
    captureEventTurtorialId = "0";
    captureEventTutorialPlay = 0;
    captureEventId = 0;
    nextCaptureEventId = 0;
    coinCampaign1 = "0";
    coinCampaign2 = "0";
    coinCampaign3 = "0";
    coinCampaign4 = "0";
    coinCampaign5 = "0";
    coinCampaign6 = "0";
    coinCampaign7 = "0";
    coinCampaign8 = "0";
    captureEventActiveUser = 0;
    captureEventTerm = 0;
    totalCaptureCount = 0;
    uuCount = 0;
    aaaaaaa = "押忍";
    captureDailyCount = 0;
    captureDailyCountString = "0";
    captureTermCount = 0;

    nextCaptureEventIdString =  "0";
    nextCaptureEventStartDate = "0";
    nextCaptureEventEndDate = "0";
    nextCaptureEventTurtorialId = "0";
    nextCaptureEventActiveUser = 0;
    nextCaptureEventTerm = 0;
    nextTotalCaptureCount = 0;
    nextCaptureEventTutorialPlay = 0;
    nextCoinCampaign1 = "0";
    nextCoinCampaign2 = "0";
    nextCoinCampaign3 = "0";
    nextCoinCampaign4 = "0";
    nextCoinCampaign5 = "0";
    nextCoinCampaign6 = "0";
    nextCoinCampaign7 = "0";
    nextCoinCampaign8 = "0";
    nextUuCount = 0;
    nextCaptureDailyCount = 0;
    nextCaptureDailyCountString = "0";
    nextCaptureTermCount = 0;

    product1 = "com.unitedfun.android.cocoppaplay.003";
    product2 = "com.unitedfun.android.cocoppaplay.004";
    product3 = "com.unitedfun.android.cocoppaplay.005";
    product4 = "com.unitedfun.android.cocoppaplay.006";
    product5 = "com.unitedfun.cocoppaplay.003";
    product6 = "com.unitedfun.cocoppaplay.004";
    product7 = "com.unitedfun.cocoppaplay.005";
    product8 = "com.unitedfun.cocoppaplay.006";

    constructor(private dataService: DataService){}
    
    ngOnInit(): void {
        
    }


    OnCaptureEventButtonClick(): void {
        this.captureEventStartDate = "0";
        this.captureEventEndDate = "0";
        this.captureEventTurtorialId = "0";
        this.captureEventTutorialPlay = 0;
        this.captureEventId = 0;
        this.nextCaptureEventId = 0;
        this.coinCampaign1 = "0";
        this.coinCampaign2 = "0";
        this.coinCampaign3 = "0";
        this.coinCampaign4 = "0";
        this.coinCampaign5 = "0";
        this.coinCampaign6 = "0";
        this.coinCampaign7 = "0";
        this.coinCampaign8 = "0";
        this.captureEventActiveUser = 0;
        this.captureEventTerm = 0;
        this.totalCaptureCount = 0;
        this.uuCount = 0;
        this.captureDailyCount = 0;
        this.captureDailyCountString = "0";
        this.captureTermCount = 0;
    
        this.nextCaptureEventIdString =  "0";
        this.nextCaptureEventStartDate = "0";
        this.nextCaptureEventEndDate = "0";
        this.nextCaptureEventTurtorialId = "0";
        this.nextCaptureEventActiveUser = 0;
        this.nextCaptureEventTerm = 0;
        this.nextTotalCaptureCount = 0;
        this.nextCaptureEventTutorialPlay = 0;
        this.nextCoinCampaign1 = "0";
        this.nextCoinCampaign2 = "0";
        this.nextCoinCampaign3 = "0";
        this.nextCoinCampaign4 = "0";
        this.nextCoinCampaign5 = "0";
        this.nextCoinCampaign6 = "0";
        this.nextCoinCampaign7 = "0";
        this.nextCoinCampaign8 = "0";
        this.nextUuCount = 0;
        this.nextCaptureDailyCount = 0;
        this.nextCaptureDailyCountString = "0";
        this.nextCaptureTermCount = 0;

    //eventデータベース
        //イベントID・期間・紙芝居ID
        this.dataService.captureEventData(this.inputCaptureEventId).subscribe(
            captureEventDataResult => this.setCaptureEventData(captureEventDataResult),
            error => alert('通信エラー' + error)
        );

        //実施日数
        this.dataService.captureEventTermData(this.inputCaptureEventId).subscribe(
            captureEventDataTermResult => this.setCaptureEventTermData(captureEventDataTermResult),
            error => alert('通信エラー' + error)
        );

        //参加者数
        this.dataService.ActiveUserData(this.inputCaptureEventId).subscribe(
            captureEventActiveUserDataResult => this.setCaptureEventActiveUserData(captureEventActiveUserDataResult),
            error => alert('通信エラー' + error)
        );
    }
    
    setCaptureEventData(captureEventDataResult): void {
        if(captureEventDataResult.error) {
            alert('Web APIエラー' + captureEventDataResult.message);
        }
        if (captureEventDataResult.data) {
            const captureEventIdString = captureEventDataResult.data.eventId;
            this.captureEventId = parseInt(captureEventIdString);
            this.captureEventStartDate = captureEventDataResult.data.startDate;
            this.captureEventEndDate = captureEventDataResult.data.endDate;
            this.captureEventTurtorialId = captureEventDataResult.data.startTutorialId;
            this.dataService.tutorialPlayData(this.captureEventTurtorialId).subscribe(
                tutorialPlayResult => this.setTutorialPlayData(tutorialPlayResult),
                error => alert('通信エラー' + error)
            );
            this.dataService.uuCountData(this.captureEventStartDate, this.captureEventEndDate).subscribe(
                uuCountResult => this.setUuCountData(uuCountResult),
                error => alert('通信エラー' + error)
            );
            this.dataService.coinCampaignData(this.captureEventStartDate, this.captureEventEndDate, this.product1).subscribe(
                coinCampaignResult => this.setCoinCampaignData1(coinCampaignResult),
                error => alert('通信エラー' + error)
            );
            this.dataService.coinCampaignData(this.captureEventStartDate, this.captureEventEndDate, this.product2).subscribe(
                coinCampaignResult => this.setCoinCampaignData2(coinCampaignResult),
                error => alert('通信エラー' + error)
            );
            this.dataService.coinCampaignData(this.captureEventStartDate, this.captureEventEndDate, this.product3).subscribe(
                coinCampaignResult => this.setCoinCampaignData3(coinCampaignResult),
                error => alert('通信エラー' + error)
            );
            this.dataService.coinCampaignData(this.captureEventStartDate, this.captureEventEndDate, this.product4).subscribe(
                coinCampaignResult => this.setCoinCampaignData4(coinCampaignResult),
                error => alert('通信エラー' + error)
            );
            this.dataService.coinCampaignData(this.captureEventStartDate, this.captureEventEndDate, this.product5).subscribe(
                coinCampaignResult => this.setCoinCampaignData5(coinCampaignResult),
                error => alert('通信エラー' + error)
            );
            this.dataService.coinCampaignData(this.captureEventStartDate, this.captureEventEndDate, this.product6).subscribe(
                coinCampaignResult => this.setCoinCampaignData6(coinCampaignResult),
                error => alert('通信エラー' + error)
            );
            this.dataService.coinCampaignData(this.captureEventStartDate, this.captureEventEndDate, this.product7).subscribe(
                coinCampaignResult => this.setCoinCampaignData7(coinCampaignResult),
                error => alert('通信エラー' + error)
            );
            this.dataService.coinCampaignData(this.captureEventStartDate, this.captureEventEndDate, this.product8).subscribe(
                coinCampaignResult => this.setCoinCampaignData8(coinCampaignResult),
                error => alert('通信エラー' + error)
            );
            this.dataService.CaptureCountData(this.inputCaptureEventId).subscribe(
                captureCountDataResult => this.setCaptureCountData(captureCountDataResult),
                error => alert('通信エラー' + error)
            );

            this.nextCaptureEventId = this.captureEventId + 1;
            this.nextCaptureEventIdString = this.nextCaptureEventId.toString();
            this.dataService.captureEventData(this.nextCaptureEventIdString).subscribe(
                nextCaptureEventDataResult => this.setNextCaptureEventData(nextCaptureEventDataResult),
                error => alert('通信エラー' + error)
            );
            this.dataService.captureEventTermData(this.nextCaptureEventIdString).subscribe(
                nextCaptureEventDataTermResult => this.setNextCaptureEventTermData(nextCaptureEventDataTermResult),
                error => alert('通信エラー' + error)
            );
            this.dataService.ActiveUserData(this.nextCaptureEventIdString).subscribe(
                nextCaptureEventActiveUserDataResult => this.setNextCaptureEventActiveUserData(nextCaptureEventActiveUserDataResult),
                error => alert('通信エラー' + error)
            );
            this.dataService.CaptureCountData(this.nextCaptureEventIdString).subscribe(
                nextCaptureCountDataResult => this.setNextCaptureCountData(nextCaptureCountDataResult),
                error => alert('通信エラー' + error)
            );
        } else {
            this.captureEventId = 0;
            this.captureEventStartDate = "0";
            this.captureEventEndDate = "0";
            this.captureEventTurtorialId = "0";
        }
    }

    setTutorialPlayData(tutorialPlayResult): void {
        if(tutorialPlayResult.error) {
            alert('Web APIエラー' + tutorialPlayResult.message);
        }
        if (tutorialPlayResult.data.totalCount) {
            this.captureEventTutorialPlay = tutorialPlayResult.data.totalCount;
        } else {
            this.captureEventTutorialPlay = 0;
        }
    }

    setCoinCampaignData1(coinCampaignResult): void {
        if(coinCampaignResult.error) {
            alert('Web APIエラー' + coinCampaignResult.message);
        }
        if (coinCampaignResult.data) {
            this.coinCampaign1 = coinCampaignResult.data.totalCount;
        } else {
            this.coinCampaign1 = "0";
        }
    }

    setCoinCampaignData2(coinCampaignResult): void {
        if(coinCampaignResult.error) {
            alert('Web APIエラー' + coinCampaignResult.message);
        }
        if (coinCampaignResult.data) {
            this.coinCampaign2 = coinCampaignResult.data.totalCount;
        } else {
            this.coinCampaign2 = "0";
        }
    }

    setCoinCampaignData3(coinCampaignResult): void {
        if(coinCampaignResult.error) {
            alert('Web APIエラー' + coinCampaignResult.message);
        }
        if (coinCampaignResult.data) {
            this.coinCampaign3 = coinCampaignResult.data.totalCount;
        } else {
            this.coinCampaign3 = "0";
        }
    }

    setCoinCampaignData4(coinCampaignResult): void {
        if(coinCampaignResult.error) {
            alert('Web APIエラー' + coinCampaignResult.message);
        }
        if (coinCampaignResult.data) {
            this.coinCampaign4 = coinCampaignResult.data.totalCount;
        } else {
            this.coinCampaign4 = "0";
        }
    }

    setCoinCampaignData5(coinCampaignResult): void {
        if(coinCampaignResult.error) {
            alert('Web APIエラー' + coinCampaignResult.message);
        }
        if (coinCampaignResult.data) {
            this.coinCampaign5 = coinCampaignResult.data.totalCount;
        } else {
            this.coinCampaign5 = "0";
        }
    }

    setCoinCampaignData6(coinCampaignResult): void {
        if(coinCampaignResult.error) {
            alert('Web APIエラー' + coinCampaignResult.message);
        }
        if (coinCampaignResult.data) {
            this.coinCampaign6 = coinCampaignResult.data.totalCount;
        } else {
            this.coinCampaign6 = "0";
        }
    }

    setCoinCampaignData7(coinCampaignResult): void {
        if(coinCampaignResult.error) {
            alert('Web APIエラー' + coinCampaignResult.message);
        }
        if (coinCampaignResult.data) {
            this.coinCampaign7 = coinCampaignResult.data.totalCount;
        } else {
            this.coinCampaign7 = "0";
        }
    }

    setCoinCampaignData8(coinCampaignResult): void {
        console.log(coinCampaignResult.data);
        if(coinCampaignResult.error) {
            alert('Web APIエラー' + coinCampaignResult.message);
        }
        if (coinCampaignResult.data) {
            this.coinCampaign8 = coinCampaignResult.data.totalCount;
        } else {
            this.coinCampaign8 = "0";
        }
    }

    setCaptureEventActiveUserData(captureEventActiveUserDataResult): void {
        console.log(captureEventActiveUserDataResult.data);
        if(captureEventActiveUserDataResult.error) {
            alert('Web APIエラー' + captureEventActiveUserDataResult.message);
        }
        if (captureEventActiveUserDataResult.data) {
            this.captureEventActiveUser = captureEventActiveUserDataResult.data.totalCount;
        } else {
            this.captureEventActiveUser = 0;
        }
    }

    setCaptureEventTermData(captureEventTermDataResult): void {
        console.log(captureEventTermDataResult.data);
        if(captureEventTermDataResult.error) {
            alert('Web APIエラー' + captureEventTermDataResult.message);
        }
        if (captureEventTermDataResult.data) {
            this.captureEventTerm = captureEventTermDataResult.data.term;
        } else {
            this.captureEventTerm = 0;
        }
    }

    setCaptureCountData(captureCountDataResult): void {
        console.log(captureCountDataResult.data);
        if(captureCountDataResult.error) {
            alert('Web APIエラー' + captureCountDataResult.message);
        }
        if (captureCountDataResult.data) {
            this.totalCaptureCount = captureCountDataResult.data.totalCaptureCount;
            this.captureTermCount = Math.round(this.totalCaptureCount / this.captureEventTerm);
            this.captureDailyCount = Math.round(this.totalCaptureCount / this.captureEventTerm / this.captureEventActiveUser);
            this.captureDailyCountString = this.captureDailyCount.toString();
        } else {
            this.totalCaptureCount = 0;
        }
    }

    setUuCountData(uuCountResult): void {
        console.log(uuCountResult.data);
        if(uuCountResult.error) {
            alert('Web APIエラー' + uuCountResult.message);
        }
        if (uuCountResult.data) {
            this.uuCount = uuCountResult.data.totalCount;
        } else {
            this.uuCount = 0;
        }
    }

    setNextCaptureEventData(nextCaptureEventDataResult): void {
        if(nextCaptureEventDataResult.error) {
            alert('Web APIエラー' + nextCaptureEventDataResult.message);
        }
        if (nextCaptureEventDataResult.data) {
            this.nextCaptureEventStartDate = nextCaptureEventDataResult.data.startDate;
            this.nextCaptureEventEndDate = nextCaptureEventDataResult.data.endDate;
            this.nextCaptureEventTurtorialId = nextCaptureEventDataResult.data.startTutorialId;

            this.dataService.tutorialPlayData(this.nextCaptureEventTurtorialId).subscribe(
                nextTutorialPlayResult => this.setNextTutorialPlayData(nextTutorialPlayResult),
                error => alert('通信エラー' + error)
            );
            this.dataService.uuCountData(this.nextCaptureEventStartDate, this.nextCaptureEventEndDate).subscribe(
                nextUuCountResult => this.setNextUuCountData(nextUuCountResult),
                error => alert('通信エラー' + error)
            );
            this.dataService.coinCampaignData(this.nextCaptureEventStartDate, this.nextCaptureEventEndDate, this.product1).subscribe(
                nextCoinCampaignResult => this.setNextCoinCampaignData1(nextCoinCampaignResult),
                error => alert('通信エラー' + error)
            );
            this.dataService.coinCampaignData(this.nextCaptureEventStartDate, this.nextCaptureEventEndDate, this.product2).subscribe(
                nextCoinCampaignResult => this.setNextCoinCampaignData2(nextCoinCampaignResult),
                error => alert('通信エラー' + error)
            );
            this.dataService.coinCampaignData(this.nextCaptureEventStartDate, this.nextCaptureEventEndDate, this.product3).subscribe(
                nextCoinCampaignResult => this.setNextCoinCampaignData3(nextCoinCampaignResult),
                error => alert('通信エラー' + error)
            );
            this.dataService.coinCampaignData(this.nextCaptureEventStartDate, this.nextCaptureEventEndDate, this.product4).subscribe(
                nextCoinCampaignResult => this.setNextCoinCampaignData4(nextCoinCampaignResult),
                error => alert('通信エラー' + error)
            );
            this.dataService.coinCampaignData(this.nextCaptureEventStartDate, this.nextCaptureEventEndDate, this.product5).subscribe(
                nextCoinCampaignResult => this.setNextCoinCampaignData5(nextCoinCampaignResult),
                error => alert('通信エラー' + error)
            );
            this.dataService.coinCampaignData(this.nextCaptureEventStartDate, this.nextCaptureEventEndDate, this.product6).subscribe(
                nextCoinCampaignResult => this.setNextCoinCampaignData6(nextCoinCampaignResult),
                error => alert('通信エラー' + error)
            );
            this.dataService.coinCampaignData(this.nextCaptureEventStartDate, this.nextCaptureEventEndDate, this.product7).subscribe(
                nextCoinCampaignResult => this.setNextCoinCampaignData7(nextCoinCampaignResult),
                error => alert('通信エラー' + error)
            );
            this.dataService.coinCampaignData(this.nextCaptureEventStartDate, this.nextCaptureEventEndDate, this.product8).subscribe(
                nextCoinCampaignResult => this.setNextCoinCampaignData8(nextCoinCampaignResult),
                error => alert('通信エラー' + error)
            );
        } else {
            this.nextCaptureEventId = 0;
            this.nextCaptureEventStartDate = "0";
            this.nextCaptureEventEndDate = "0";
            this.nextCaptureEventTurtorialId = "0";
        }
    }

    setNextCaptureEventActiveUserData(nextCaptureEventActiveUserDataResult): void {
        console.log(nextCaptureEventActiveUserDataResult.data);
        if(nextCaptureEventActiveUserDataResult.error) {
            alert('Web APIエラー' + nextCaptureEventActiveUserDataResult.message);
        }
        if (nextCaptureEventActiveUserDataResult.data) {
            this.nextCaptureEventActiveUser = nextCaptureEventActiveUserDataResult.data.totalCount;
        } else {
            this.nextCaptureEventActiveUser = 0;
        }
    }

    setNextCaptureEventTermData(nextCaptureEventTermDataResult): void {
        console.log(nextCaptureEventTermDataResult.data);
        if(nextCaptureEventTermDataResult.error) {
            alert('Web APIエラー' + nextCaptureEventTermDataResult.message);
        }
        if (nextCaptureEventTermDataResult.data) {
            this.nextCaptureEventTerm = nextCaptureEventTermDataResult.data.term;
        } else {
            this.nextCaptureEventTerm = 0;
        }
    }

    setNextCaptureCountData(nextCaptureCountDataResult): void {
        console.log(nextCaptureCountDataResult.data);
        if(nextCaptureCountDataResult.error) {
            alert('Web APIエラー' + nextCaptureCountDataResult.message);
        }
        if (nextCaptureCountDataResult.data) {
            this.nextTotalCaptureCount = nextCaptureCountDataResult.data.totalCaptureCount;
            this.nextCaptureTermCount = Math.round(this.nextTotalCaptureCount / this.nextCaptureEventTerm);
            this.nextCaptureDailyCount = Math.round(this.nextTotalCaptureCount / this.nextCaptureEventTerm / this.nextCaptureEventActiveUser);
            this.nextCaptureDailyCountString = this.nextCaptureDailyCount.toString();
        } else {
            this.nextTotalCaptureCount = 0;
        }
    }

    setNextTutorialPlayData(nextTutorialPlayResult): void {
        if(nextTutorialPlayResult.error) {
            alert('Web APIエラー' + nextTutorialPlayResult.message);
        }
        if (nextTutorialPlayResult.data.totalCount) {
            this.nextCaptureEventTutorialPlay = nextTutorialPlayResult.data.totalCount;
        } else {
            this.nextCaptureEventTutorialPlay = 0;
        }
    }

    setNextCoinCampaignData1(nextCoinCampaignResult): void {
        if(nextCoinCampaignResult.error) {
            alert('Web APIエラー' + nextCoinCampaignResult.message);
        }
        if (nextCoinCampaignResult.data) {
            this.nextCoinCampaign1 = nextCoinCampaignResult.data.totalCount;
        } else {
            this.nextCoinCampaign1 = "0";
        }
    }

    setNextCoinCampaignData2(nextCoinCampaignResult): void {
        if(nextCoinCampaignResult.error) {
            alert('Web APIエラー' + nextCoinCampaignResult.message);
        }
        if (nextCoinCampaignResult.data) {
            this.nextCoinCampaign2 = nextCoinCampaignResult.data.totalCount;
        } else {
            this.nextCoinCampaign2 = "0";
        }
    }

    setNextCoinCampaignData3(nextCoinCampaignResult): void {
        if(nextCoinCampaignResult.error) {
            alert('Web APIエラー' + nextCoinCampaignResult.message);
        }
        if (nextCoinCampaignResult.data) {
            this.nextCoinCampaign3 = nextCoinCampaignResult.data.totalCount;
        } else {
            this.nextCoinCampaign3 = "0";
        }
    }

    setNextCoinCampaignData4(nextCoinCampaignResult): void {
        if(nextCoinCampaignResult.error) {
            alert('Web APIエラー' + nextCoinCampaignResult.message);
        }
        if (nextCoinCampaignResult.data) {
            this.nextCoinCampaign4 = nextCoinCampaignResult.data.totalCount;
        } else {
            this.nextCoinCampaign4 = "0";
        }
    }

    setNextCoinCampaignData5(nextCoinCampaignResult): void {
        if(nextCoinCampaignResult.error) {
            alert('Web APIエラー' + nextCoinCampaignResult.message);
        }
        if (nextCoinCampaignResult.data) {
            this.nextCoinCampaign5 = nextCoinCampaignResult.data.totalCount;
        } else {
            this.nextCoinCampaign5 = "0";
        }
    }

    setNextCoinCampaignData6(nextCoinCampaignResult): void {
        if(nextCoinCampaignResult.error) {
            alert('Web APIエラー' + nextCoinCampaignResult.message);
        }
        if (nextCoinCampaignResult.data) {
            this.nextCoinCampaign6 = nextCoinCampaignResult.data.totalCount;
        } else {
            this.nextCoinCampaign6 = "0";
        }
    }

    setNextCoinCampaignData7(nextCoinCampaignResult): void {
        if(nextCoinCampaignResult.error) {
            alert('Web APIエラー' + nextCoinCampaignResult.message);
        }
        if (nextCoinCampaignResult.data) {
            this.nextCoinCampaign7 = nextCoinCampaignResult.data.totalCount;
        } else {
            this.nextCoinCampaign7 = "0";
        }
    }

    setNextCoinCampaignData8(nextCoinCampaignResult): void {
        console.log(nextCoinCampaignResult.data);
        if(nextCoinCampaignResult.error) {
            alert('Web APIエラー' + nextCoinCampaignResult.message);
        }
        if (nextCoinCampaignResult.data) {
            this.nextCoinCampaign8 = nextCoinCampaignResult.data.totalCount;
        } else {
            this.nextCoinCampaign8 = "0";
        }
    }

    setNextUuCountData(nextUuCountResult): void {
        console.log(nextUuCountResult.data);
        if(nextUuCountResult.error) {
            alert('Web APIエラー' + nextUuCountResult.message);
        }
        if (nextUuCountResult.data) {
            this.nextUuCount = nextUuCountResult.data.totalCount;
        } else {
            this.nextUuCount = 0;
        }
    }
}
