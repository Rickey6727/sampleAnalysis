import {Component, OnInit} from "@angular/core";
import {DataService} from "../../../services/data.service";


@Component({
    selector: 'capture-dashboard',
    templateUrl: './capture.dashboard.component.html',
    styleUrls: ['../dashboard.component.css']
})

export class CaptureDashboardComponent implements OnInit{

    inputCaptureEventId = "入力してね";

    img_src = "http://sozai.7gates.net/img/icon/loading/loading01_r3_c3.gif";

    captureEventStartDate = "loading...";
    captureEventEndDate = "loading...";
    captureEventTurtorialId = "loading...";
    coinCampaign1 = "loading...";
    coinCampaign2 = "loading...";
    coinCampaign3 = "loading...";
    coinCampaign4 = "loading...";
    coinCampaign5 = "loading...";
    coinCampaign6 = "loading...";
    coinCampaign7 = "loading...";
    coinCampaign8 = "loading...";
    captureDailyCountString = "loading...";

    captureEventTutorialPlay = 0;
    captureEventId = 0;
    captureEventActiveUser = 0;
    captureEventTerm = 0;
    totalCaptureCount = 0;
    uuCount = 0;
    captureDailyCount = 0;
    captureTermCount = 0;
    captureActiveUserRate = 0;
    captureNonActiveUser = 0;

    captureEventTutorialPlayString = "loading...";
    captureEventIdString = "loading...";
    captureEventActiveUserString = "loading...";
    captureEventTermString = "loading...";
    totalCaptureCountString = "loading...";
    uuCountString = "loading...";
    captureTermCountString = "loading...";
    captureActiveUserRateString = "loading...";
    captureNonActiveUserString = "loading...";

    nextCaptureEventIdString =  "loading...";
    nextCaptureEventStartDate = "loading...";
    nextCaptureEventEndDate = "loading...";
    nextCaptureEventTurtorialId = "loading...";
    nextCoinCampaign1 = "loading...";
    nextCoinCampaign2 = "loading...";
    nextCoinCampaign3 = "loading...";
    nextCoinCampaign4 = "loading...";
    nextCoinCampaign5 = "loading...";
    nextCoinCampaign6 = "loading...";
    nextCoinCampaign7 = "loading...";
    nextCoinCampaign8 = "loading...";
    nextCaptureDailyCountString = "loading...";
    
    nextCaptureEventId = 0;
    nextCaptureEventActiveUser = 0;
    nextCaptureEventTerm = 0;
    nextTotalCaptureCount = 0;
    nextCaptureEventTutorialPlay = 0;
    nextUuCount = 0;
    nextCaptureDailyCount = 0;
    nextCaptureTermCount = 0;
    nextCaptureActiveUserRate = 0;
    nextCaptureNonActiveUser = 0;

    nextCaptureEventTutorialPlayString = "loading...";
    nextCaptureEventActiveUserString = "loading...";
    nextCaptureEventTermString = "loading...";
    nextTotalCaptureCountString = "loading...";
    nextUuCountString = "loading...";
    nextCaptureTermCountString = "loading...";
    nextCaptureActiveUserRateString = "loading...";
    nextCaptureNonActiveUserString = "loading...";

    product1 = "com.unitedfun.android.cocoppaplay.003";
    product2 = "com.unitedfun.android.cocoppaplay.004";
    product3 = "com.unitedfun.android.cocoppaplay.005";
    product4 = "com.unitedfun.android.cocoppaplay.006";
    product5 = "com.unitedfun.cocoppaplay.003";
    product6 = "com.unitedfun.cocoppaplay.004";
    product7 = "com.unitedfun.cocoppaplay.005";
    product8 = "com.unitedfun.cocoppaplay.006";

    captureCsvCount=1;

    constructor(private dataService: DataService){}
    
    ngOnInit(): void {
        
    }


    OnCaptureEventButtonClick(): void {

        this.captureCsvCount=1;
        this.captureCsv();

        this.img_src = "http://sozai.7gates.net/img/icon/loading/loading01_r3_c3.gif";
    
        this.captureEventStartDate = "loading...";
        this.captureEventEndDate = "loading...";
        this.captureEventTurtorialId = "loading...";
        this.coinCampaign1 = "loading...";
        this.coinCampaign2 = "loading...";
        this.coinCampaign3 = "loading...";
        this.coinCampaign4 = "loading...";
        this.coinCampaign5 = "loading...";
        this.coinCampaign6 = "loading...";
        this.coinCampaign7 = "loading...";
        this.coinCampaign8 = "loading...";
        this.captureDailyCountString = "loading...";
    
        this.captureEventTutorialPlayString = "loading...";
        this.captureEventIdString = "loading...";
        this.captureEventActiveUserString = "loading...";
        this.captureEventTermString = "loading...";
        this.totalCaptureCountString = "loading...";
        this.uuCountString = "loading...";
        this.captureTermCountString = "loading...";
        this.captureActiveUserRateString = "loading...";
        this.captureNonActiveUserString = "loading...";
    
        this.nextCaptureEventIdString =  "loading...";
        this.nextCaptureEventStartDate = "loading...";
        this.nextCaptureEventEndDate = "loading...";
        this.nextCaptureEventTurtorialId = "loading...";
        this.nextCoinCampaign1 = "loading...";
        this.nextCoinCampaign2 = "loading...";
        this.nextCoinCampaign3 = "loading...";
        this.nextCoinCampaign4 = "loading...";
        this.nextCoinCampaign5 = "loading...";
        this.nextCoinCampaign6 = "loading...";
        this.nextCoinCampaign7 = "loading...";
        this.nextCoinCampaign8 = "loading...";
        this.nextCaptureDailyCountString = "loading...";
    
        this.nextCaptureEventTutorialPlayString = "loading...";
        this.nextCaptureEventActiveUserString = "loading...";
        this.nextCaptureEventTermString = "loading...";
        this.nextTotalCaptureCountString = "loading...";
        this.nextUuCountString = "loading...";
        this.nextCaptureTermCountString = "loading...";
        this.nextCaptureActiveUserRateString = "loading...";
        this.nextCaptureNonActiveUserString = "loading...";

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
            this.captureEventIdString = this.captureEventId.toString();
            this.captureEventStartDate = captureEventDataResult.data.startDate;
            this.captureEventEndDate = captureEventDataResult.data.endDate;
            this.captureEventTurtorialId = captureEventDataResult.data.startTutorialId;
            this.img_src = "http://www.cocoppaplay.com/image1/ui/update/" + this.captureEventStartDate.slice(0,4) + "/" + this.captureEventStartDate.slice(5,7) + "/" + this.captureEventStartDate.slice(2,4) + this.captureEventStartDate.slice(5,7) + this.captureEventStartDate.slice(8,10) + "_banner/ja/bnrL_" + this.captureEventStartDate.slice(2,4) + this.captureEventStartDate.slice(5,7) + this.captureEventStartDate.slice(8,10) + "_captureEV.png";
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
            this.captureEventIdString = "(NO DATA)";
            this.captureEventStartDate = "(NO DATA)";
            this.captureEventEndDate = "(NO DATA)";
            this.captureEventTurtorialId = "(NO DATA)";
            this.nextCaptureEventIdString = "(NO DATA)";
        }
    }

    setTutorialPlayData(tutorialPlayResult): void {
        if(tutorialPlayResult.error) {
            alert('Web APIエラー' + tutorialPlayResult.message);
        }
        if (tutorialPlayResult.data.totalCount) {
            this.captureEventTutorialPlay = tutorialPlayResult.data.totalCount;
            this.captureEventTutorialPlayString = this.captureEventTutorialPlay.toString();
            this.captureNonActiveUser = this.captureEventActiveUser - this.captureEventTutorialPlay;
            this.captureNonActiveUserString = this.captureNonActiveUser.toString();
            this.captureActiveUserRate = Math.round(this.captureEventActiveUser / this.captureEventTutorialPlay * 100);
            this.captureActiveUserRateString = this.captureActiveUserRate.toString();
        } else {
            this.captureEventTutorialPlayString = "(NO DATA)";
        }
    }

    setCoinCampaignData1(coinCampaignResult): void {
        if(coinCampaignResult.error) {
            alert('Web APIエラー' + coinCampaignResult.message);
        }
        if (coinCampaignResult.data) {
            this.coinCampaign1 = coinCampaignResult.data.totalCount;
        } else {
            this.coinCampaign1 = "(NO DATA)";
        }
    }

    setCoinCampaignData2(coinCampaignResult): void {
        if(coinCampaignResult.error) {
            alert('Web APIエラー' + coinCampaignResult.message);
        }
        if (coinCampaignResult.data) {
            this.coinCampaign2 = coinCampaignResult.data.totalCount;
        } else {
            this.coinCampaign2 = "(NO DATA)";
        }
    }

    setCoinCampaignData3(coinCampaignResult): void {
        if(coinCampaignResult.error) {
            alert('Web APIエラー' + coinCampaignResult.message);
        }
        if (coinCampaignResult.data) {
            this.coinCampaign3 = coinCampaignResult.data.totalCount;
        } else {
            this.coinCampaign3 = "(NO DATA)";
        }
    }

    setCoinCampaignData4(coinCampaignResult): void {
        if(coinCampaignResult.error) {
            alert('Web APIエラー' + coinCampaignResult.message);
        }
        if (coinCampaignResult.data) {
            this.coinCampaign4 = coinCampaignResult.data.totalCount;
        } else {
            this.coinCampaign4 = "(NO DATA)";
        }
    }

    setCoinCampaignData5(coinCampaignResult): void {
        if(coinCampaignResult.error) {
            alert('Web APIエラー' + coinCampaignResult.message);
        }
        if (coinCampaignResult.data) {
            this.coinCampaign5 = coinCampaignResult.data.totalCount;
        } else {
            this.coinCampaign5 = "(NO DATA)";
        }
    }

    setCoinCampaignData6(coinCampaignResult): void {
        if(coinCampaignResult.error) {
            alert('Web APIエラー' + coinCampaignResult.message);
        }
        if (coinCampaignResult.data) {
            this.coinCampaign6 = coinCampaignResult.data.totalCount;
        } else {
            this.coinCampaign6 = "(NO DATA)";
        }
    }

    setCoinCampaignData7(coinCampaignResult): void {
        if(coinCampaignResult.error) {
            alert('Web APIエラー' + coinCampaignResult.message);
        }
        if (coinCampaignResult.data) {
            this.coinCampaign7 = coinCampaignResult.data.totalCount;
        } else {
            this.coinCampaign7 = "(NO DATA)";
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
            this.coinCampaign8 = "(NO DATA)";
        }
    }

    setCaptureEventActiveUserData(captureEventActiveUserDataResult): void {
        console.log(captureEventActiveUserDataResult.data);
        if(captureEventActiveUserDataResult.error) {
            alert('Web APIエラー' + captureEventActiveUserDataResult.message);
        }
        if (captureEventActiveUserDataResult.data) {
            this.captureEventActiveUser = captureEventActiveUserDataResult.data.totalCount;
            this.captureEventActiveUserString = this.captureEventActiveUser.toString();
        } else {
            this.captureEventActiveUserString = "(NO DATA)";
        }
    }

    setCaptureEventTermData(captureEventTermDataResult): void {
        console.log(captureEventTermDataResult.data);
        if(captureEventTermDataResult.error) {
            alert('Web APIエラー' + captureEventTermDataResult.message);
        }
        if (captureEventTermDataResult.data) {
            this.captureEventTerm = captureEventTermDataResult.data.term;
            this.captureEventTermString = this.captureEventTerm.toString();
            this.captureTermCount = Math.round(this.totalCaptureCount / this.captureEventTerm);
            this.captureTermCountString = this.captureTermCount.toString();
            this.captureDailyCount = Math.round(this.totalCaptureCount / this.captureEventTerm / this.captureEventActiveUser);
        } else {
            this.captureEventTermString = "(NO DATA)";
        }
    }

    setCaptureCountData(captureCountDataResult): void {
        console.log(captureCountDataResult.data);
        if(captureCountDataResult.error) {
            alert('Web APIエラー' + captureCountDataResult.message);
        }
        if (captureCountDataResult.data) {
            this.totalCaptureCount = captureCountDataResult.data.totalCaptureCount;
            this.totalCaptureCountString = this.totalCaptureCount.toString();
            this.captureTermCount = Math.round(this.totalCaptureCount / this.captureEventTerm);
            this.captureTermCountString = this.captureTermCount.toString();
            this.captureDailyCount = Math.round(this.totalCaptureCount / this.captureEventTerm / this.captureEventActiveUser);
            this.captureDailyCountString = this.captureDailyCount.toString();
        } else {
            this.totalCaptureCountString = "(NO DATA)";
        }
    }

    setUuCountData(uuCountResult): void {
        console.log(uuCountResult.data);
        if(uuCountResult.error) {
            alert('Web APIエラー' + uuCountResult.message);
        }
        if (uuCountResult.data) {
            this.uuCount = uuCountResult.data.totalCount;
            this.uuCountString = this.uuCount.toString();
            this.captureDailyCount = Math.round(this.totalCaptureCount / this.captureEventTerm / this.captureEventActiveUser);
            this.captureDailyCountString = this.captureDailyCount.toString();
            this.captureActiveUserRate = Math.round(this.captureEventActiveUser / this.captureEventTutorialPlay * 100);
            this.captureActiveUserRateString = this.captureActiveUserRate.toString();
        } else {
            this.uuCountString = "(NO DATA)";
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
            this.nextCaptureEventIdString = "(NO DATA)";
            this.nextCaptureEventStartDate = "(NO DATA)";
            this.nextCaptureEventEndDate = "(NO DATA)";
            this.nextCaptureEventTurtorialId = "(NO DATA)";
        }
    }

    setNextCaptureEventActiveUserData(nextCaptureEventActiveUserDataResult): void {
        console.log(nextCaptureEventActiveUserDataResult.data);
        if(nextCaptureEventActiveUserDataResult.error) {
            alert('Web APIエラー' + nextCaptureEventActiveUserDataResult.message);
        }
        if (nextCaptureEventActiveUserDataResult.data) {
            this.nextCaptureEventActiveUser = nextCaptureEventActiveUserDataResult.data.totalCount;
            this.nextCaptureEventActiveUserString = this.nextCaptureEventActiveUser.toString();
        } else {
            this.nextCaptureEventActiveUserString = "(NO DATA)";
        }
    }

    setNextCaptureEventTermData(nextCaptureEventTermDataResult): void {
        console.log(nextCaptureEventTermDataResult.data);
        if(nextCaptureEventTermDataResult.error) {
            alert('Web APIエラー' + nextCaptureEventTermDataResult.message);
        }
        if (nextCaptureEventTermDataResult.data) {
            this.nextCaptureEventTerm = nextCaptureEventTermDataResult.data.term;
            this.nextCaptureEventTermString = this.nextCaptureEventTerm.toString();
            this.nextCaptureTermCount = Math.round(this.nextTotalCaptureCount / this.nextCaptureEventTerm);
            this.nextCaptureTermCountString = this.nextCaptureTermCount.toString();
            this.nextCaptureDailyCount = Math.round(this.nextTotalCaptureCount / this.nextCaptureEventTerm / this.nextCaptureEventActiveUser);
        } else {
            this.nextCaptureEventTermString = "(NO DATA)";
        }
    }

    setNextCaptureCountData(nextCaptureCountDataResult): void {
        console.log(nextCaptureCountDataResult.data);
        if(nextCaptureCountDataResult.error) {
            alert('Web APIエラー' + nextCaptureCountDataResult.message);
        }
        if (nextCaptureCountDataResult.data) {
            this.nextTotalCaptureCount = nextCaptureCountDataResult.data.totalCaptureCount;
            this.nextTotalCaptureCountString = this.nextTotalCaptureCount.toString();
            this.nextCaptureTermCount = Math.round(this.nextTotalCaptureCount / this.nextCaptureEventTerm);
            this.nextCaptureTermCountString = this.nextCaptureTermCount.toString();
            this.nextCaptureDailyCount = Math.round(this.nextTotalCaptureCount / this.nextCaptureEventTerm / this.nextCaptureEventActiveUser);
            this.nextCaptureDailyCountString = this.nextCaptureDailyCount.toString();
        } else {
            this.nextTotalCaptureCountString = "(NO DATA)";
        }
    }

    setNextTutorialPlayData(nextTutorialPlayResult): void {
        if(nextTutorialPlayResult.error) {
            alert('Web APIエラー' + nextTutorialPlayResult.message);
        }
        if (nextTutorialPlayResult.data.totalCount) {
            this.nextCaptureEventTutorialPlay = nextTutorialPlayResult.data.totalCount;
            this.nextCaptureEventTutorialPlayString = this.nextCaptureEventTutorialPlay.toString();
            this.nextCaptureNonActiveUser = this.nextCaptureEventActiveUser - this.nextCaptureEventTutorialPlay;
            this.nextCaptureNonActiveUserString = this.nextCaptureNonActiveUser.toString();
            this.nextCaptureActiveUserRate = Math.round(this.nextCaptureEventActiveUser / this.nextCaptureEventTutorialPlay * 100);
            this.nextCaptureActiveUserRateString = this.nextCaptureActiveUserRate.toString();
        } else {
            this.nextCaptureEventTutorialPlayString = "(NO DATA)";
        }
    }

    setNextCoinCampaignData1(nextCoinCampaignResult): void {
        if(nextCoinCampaignResult.error) {
            alert('Web APIエラー' + nextCoinCampaignResult.message);
        }
        if (nextCoinCampaignResult.data) {
            this.nextCoinCampaign1 = nextCoinCampaignResult.data.totalCount;
        } else {
            this.nextCoinCampaign1 = "(NO DATA)";
        }
    }

    setNextCoinCampaignData2(nextCoinCampaignResult): void {
        if(nextCoinCampaignResult.error) {
            alert('Web APIエラー' + nextCoinCampaignResult.message);
        }
        if (nextCoinCampaignResult.data) {
            this.nextCoinCampaign2 = nextCoinCampaignResult.data.totalCount;
        } else {
            this.nextCoinCampaign2 = "(NO DATA)";
        }
    }

    setNextCoinCampaignData3(nextCoinCampaignResult): void {
        if(nextCoinCampaignResult.error) {
            alert('Web APIエラー' + nextCoinCampaignResult.message);
        }
        if (nextCoinCampaignResult.data) {
            this.nextCoinCampaign3 = nextCoinCampaignResult.data.totalCount;
        } else {
            this.nextCoinCampaign3 = "(NO DATA)";
        }
    }

    setNextCoinCampaignData4(nextCoinCampaignResult): void {
        if(nextCoinCampaignResult.error) {
            alert('Web APIエラー' + nextCoinCampaignResult.message);
        }
        if (nextCoinCampaignResult.data) {
            this.nextCoinCampaign4 = nextCoinCampaignResult.data.totalCount;
        } else {
            this.nextCoinCampaign4 = "(NO DATA)";
        }
    }

    setNextCoinCampaignData5(nextCoinCampaignResult): void {
        if(nextCoinCampaignResult.error) {
            alert('Web APIエラー' + nextCoinCampaignResult.message);
        }
        if (nextCoinCampaignResult.data) {
            this.nextCoinCampaign5 = nextCoinCampaignResult.data.totalCount;
        } else {
            this.nextCoinCampaign5 = "(NO DATA)";
        }
    }

    setNextCoinCampaignData6(nextCoinCampaignResult): void {
        if(nextCoinCampaignResult.error) {
            alert('Web APIエラー' + nextCoinCampaignResult.message);
        }
        if (nextCoinCampaignResult.data) {
            this.nextCoinCampaign6 = nextCoinCampaignResult.data.totalCount;
        } else {
            this.nextCoinCampaign6 = "(NO DATA)";
        }
    }

    setNextCoinCampaignData7(nextCoinCampaignResult): void {
        if(nextCoinCampaignResult.error) {
            alert('Web APIエラー' + nextCoinCampaignResult.message);
        }
        if (nextCoinCampaignResult.data) {
            this.nextCoinCampaign7 = nextCoinCampaignResult.data.totalCount;
        } else {
            this.nextCoinCampaign7 = "(NO DATA)";
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
            this.nextCoinCampaign8 = "(NO DATA)";
        }
    }

    setNextUuCountData(nextUuCountResult): void {
        console.log(nextUuCountResult.data);
        if(nextUuCountResult.error) {
            alert('Web APIエラー' + nextUuCountResult.message);
        }
        if (nextUuCountResult.data) {
            this.nextUuCount = nextUuCountResult.data.totalCount;
            this.nextUuCountString = this.nextUuCount.toString();
            this.captureCsv();
            this.nextCaptureDailyCount = Math.round(this.nextTotalCaptureCount / this.nextCaptureEventTerm / this.nextCaptureEventActiveUser);
            this.nextCaptureDailyCountString = this.nextCaptureDailyCount.toString();
            this.nextCaptureActiveUserRate = Math.round(this.nextCaptureEventActiveUser / this.nextCaptureEventTutorialPlay * 100);
            this.nextCaptureActiveUserRateString = this.nextCaptureActiveUserRate.toString();
        } else {
            this.nextUuCountString = "(NO DATA)";
            this.captureCsv();
        }
    }

    captureCsv(): void {
        this.captureCsvCount --;
        if (this.captureCsvCount < 0) {
            document.getElementById('download_capture').style.display='block';
            document.getElementById('loading_download_capture').style.display='none';
        } else {
            document.getElementById('download_capture').style.display='none';
            document.getElementById('loading_download_capture').style.display='block';
        }
    }
}
