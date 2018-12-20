import {Component, OnInit} from "@angular/core";
import {DataService} from "../../../services/data.service";


@Component({
    selector: 'guild-dashboard',
    templateUrl: './guild.dashboard.component.html',
    styleUrls: ['../dashboard.component.css']
})

export class GuildDashboardComponent implements OnInit{ 
    inputGuildEventId = "入力してね";

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


    OnGuildEventButtonClick(): void {
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

        this.dataService.guildEventData(this.inputGuildEventId).subscribe(
            captureEventDataResult => this.setCaptureEventData(captureEventDataResult),
            error => alert('通信エラー' + error)
        );

        this.dataService.guildEventTermData(this.inputGuildEventId).subscribe(
            captureEventDataTermResult => this.setCaptureEventTermData(captureEventDataTermResult),
            error => alert('通信エラー' + error)
        );

        this.dataService.guildActiveUserData(this.inputGuildEventId).subscribe(
            captureEventActiveUserDataResult => this.setCaptureEventActiveUserData(captureEventActiveUserDataResult),
            error => alert('通信エラー' + error)
        );

        this.dataService.CaptureCountData(this.inputGuildEventId).subscribe(
            captureCountDataResult => this.setCaptureCountData(captureCountDataResult),
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
}