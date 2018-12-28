import {Component, OnInit} from "@angular/core";
import {DataService} from "../../../services/data.service";


@Component({
    selector: 'guild-dashboard',
    templateUrl: './guild.dashboard.component.html',
    styleUrls: ['../dashboard.component.css']
})

export class GuildDashboardComponent implements OnInit{ 
    inputGuildEventId = "入力してね";

    img_src = "http://sozai.7gates.net/img/icon/loading/loading01_r3_c3.gif";

    captureEventStartDate = "loading...";
    captureEventEndDate = "loading...";
    captureEventTurtorialId = "loading...";
    captureEventIdString = "loading...";
    captureEventTutorialPlayString = "loading...";
    captureEventActiveUserString = "loading...";
    captureEventTermString = "loading...";
    totalCaptureCountString = "loading...";
    uuCountString = "loading...";
    captureNonActiveUserString = "loading...";
    captureActiveUserRateString = "loading...";

    captureEventId = 0;
    captureEventTutorialPlay = 0;
    captureEventActiveUser = 0;
    captureEventTerm = 0;
    totalCaptureCount = 0;
    uuCount = 0;
    captureNonActiveUser = 0;
    captureActiveUserRate = 0;

    coinCampaign1 = "loading...";
    coinCampaign2 = "loading...";
    coinCampaign3 = "loading...";
    coinCampaign4 = "loading...";
    coinCampaign5 = "loading...";
    coinCampaign6 = "loading...";
    coinCampaign7 = "loading...";
    coinCampaign8 = "loading...";
    

    product1 = "com.unitedfun.android.cocoppaplay.003";
    product2 = "com.unitedfun.android.cocoppaplay.004";
    product3 = "com.unitedfun.android.cocoppaplay.005";
    product4 = "com.unitedfun.android.cocoppaplay.006";
    product5 = "com.unitedfun.cocoppaplay.003";
    product6 = "com.unitedfun.cocoppaplay.004";
    product7 = "com.unitedfun.cocoppaplay.005";
    product8 = "com.unitedfun.cocoppaplay.006";

    guildCsvCount = 17;
    guildLoading = 0;


    constructor(private dataService: DataService){}


    ngOnInit(): void {
    }


    OnGuildEventButtonClick(): void {
        this.img_src = "http://sozai.7gates.net/img/icon/loading/loading01_r3_c3.gif";
    
        this.captureEventStartDate = "loading...";
        this.captureEventEndDate = "loading...";
        this.captureEventTurtorialId = "loading...";
        this.captureEventIdString = "loading...";
        this.captureEventTutorialPlayString = "loading...";
        this.captureEventActiveUserString = "loading...";
        this.captureEventTermString = "loading...";
        this.totalCaptureCountString = "loading...";
        this.uuCountString = "loading...";
        this.captureNonActiveUserString = "loading...";
        this.captureActiveUserRateString = "loading...";
    
        this.coinCampaign1 = "loading...";
        this.coinCampaign2 = "loading...";
        this.coinCampaign3 = "loading...";
        this.coinCampaign4 = "loading...";
        this.coinCampaign5 = "loading...";
        this.coinCampaign6 = "loading...";
        this.coinCampaign7 = "loading...";
        this.coinCampaign8 = "loading...";

        this.guildCsvCount = 17;
        this.guildCsv();
        this.guildLoading = 0;

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
            this.img_src = "http://www.cocoppaplay.com/image1/ui/update/" + this.captureEventStartDate.slice(0,4) + "/" + this.captureEventStartDate.slice(5,7) + "/" + this.captureEventStartDate.slice(2,4) + this.captureEventStartDate.slice(5,7) + this.captureEventStartDate.slice(8,10) + "_banner/ja/bnrL_" + this.captureEventStartDate.slice(2,4) + this.captureEventStartDate.slice(5,7) + this.captureEventStartDate.slice(8,10) + "_leagueEV.png";
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
            this.guildCsvCount --;
            this.guildCsv();
            this.guildCsvCount --;
            this.guildCsv();
            this.guildCsvCount --;
            this.guildCsv();
        } else {
            this.captureEventIdString = "(NO DATA)";
            this.captureEventStartDate = "(NO DATA)";
            this.captureEventEndDate = "(NO DATA)";
            this.captureEventTurtorialId = "(NO DATA)";
            this.guildCsvCount --;
            this.guildCsv();
            this.guildCsvCount --;
            this.guildCsv();
            this.guildCsvCount --;
            this.guildCsv();
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
            this.guildCsvCount --;
            this.guildCsv();
            this.guildCsvCount --;
            this.guildCsv();
            this.guildCsvCount --;
            this.guildCsv();
        } else {
            this.captureEventTutorialPlayString = "(NO DATA)";
            this.guildCsvCount --;
            this.guildCsv();
            this.guildCsvCount --;
            this.guildCsv();
            this.guildCsvCount --;
            this.guildCsv();
        }
    }

    setCoinCampaignData1(coinCampaignResult): void {
        if(coinCampaignResult.error) {
            alert('Web APIエラー' + coinCampaignResult.message);
        }
        if (coinCampaignResult.data) {
            this.coinCampaign1 = coinCampaignResult.data.totalCount;
            this.guildCsvCount --;
            this.guildCsv();
        } else {
            this.coinCampaign1 = "(NO DATA)";
            this.guildCsvCount --;
            this.guildCsv();
        }
    }

    setCoinCampaignData2(coinCampaignResult): void {
        if(coinCampaignResult.error) {
            alert('Web APIエラー' + coinCampaignResult.message);
        }
        if (coinCampaignResult.data) {
            this.coinCampaign2 = coinCampaignResult.data.totalCount;
            this.guildCsvCount --;
            this.guildCsv();
        } else {
            this.coinCampaign2 = "(NO DATA)";
            this.guildCsvCount --;
            this.guildCsv();
        }
    }

    setCoinCampaignData3(coinCampaignResult): void {
        if(coinCampaignResult.error) {
            alert('Web APIエラー' + coinCampaignResult.message);
        }
        if (coinCampaignResult.data) {
            this.coinCampaign3 = coinCampaignResult.data.totalCount;
            this.guildCsvCount --;
            this.guildCsv();
        } else {
            this.coinCampaign3 = "(NO DATA)";
            this.guildCsvCount --;
            this.guildCsv();
        }
    }

    setCoinCampaignData4(coinCampaignResult): void {
        if(coinCampaignResult.error) {
            alert('Web APIエラー' + coinCampaignResult.message);
        }
        if (coinCampaignResult.data) {
            this.coinCampaign4 = coinCampaignResult.data.totalCount;
            this.guildCsvCount --;
            this.guildCsv();
        } else {
            this.coinCampaign4 = "(NO DATA)";
            this.guildCsvCount --;
            this.guildCsv();
        }
    }

    setCoinCampaignData5(coinCampaignResult): void {
        if(coinCampaignResult.error) {
            alert('Web APIエラー' + coinCampaignResult.message);
        }
        if (coinCampaignResult.data) {
            this.coinCampaign5 = coinCampaignResult.data.totalCount;
            this.guildCsvCount --;
            this.guildCsv();
        } else {
            this.coinCampaign5 = "(NO DATA)";
            this.guildCsvCount --;
            this.guildCsv();
        }
    }

    setCoinCampaignData6(coinCampaignResult): void {
        if(coinCampaignResult.error) {
            alert('Web APIエラー' + coinCampaignResult.message);
        }
        if (coinCampaignResult.data) {
            this.coinCampaign6 = coinCampaignResult.data.totalCount;
            this.guildCsvCount --;
            this.guildCsv();
        } else {
            this.coinCampaign6 = "(NO DATA)";
            this.guildCsvCount --;
            this.guildCsv();
        }
    }

    setCoinCampaignData7(coinCampaignResult): void {
        if(coinCampaignResult.error) {
            alert('Web APIエラー' + coinCampaignResult.message);
        }
        if (coinCampaignResult.data) {
            this.coinCampaign7 = coinCampaignResult.data.totalCount;
            this.guildCsvCount --;
            this.guildCsv();
        } else {
            this.coinCampaign7 = "(NO DATA)";
            this.guildCsvCount --;
            this.guildCsv();
        }
    }

    setCoinCampaignData8(coinCampaignResult): void {
        console.log(coinCampaignResult.data);
        if(coinCampaignResult.error) {
            alert('Web APIエラー' + coinCampaignResult.message);
        }
        if (coinCampaignResult.data) {
            this.coinCampaign8 = coinCampaignResult.data.totalCount;
            this.guildCsvCount --;
            this.guildCsv();
        } else {
            this.coinCampaign8 = "(NO DATA)";
            this.guildCsvCount --;
            this.guildCsv();
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
            this.guildCsvCount --;
            this.guildCsv();
        } else {
            this.captureEventActiveUserString = "(NO DATA)";
            this.guildCsvCount --;
            this.guildCsv();
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
            this.guildCsvCount --;
            this.guildCsv();
        } else {
            this.captureEventTermString = "(NO DATA)";
            this.guildCsvCount --;
            this.guildCsv();
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
            this.guildCsvCount --;
            this.guildCsv();
        } else {
            this.uuCountString = "(NO DATA)";
            this.guildCsvCount --;
            this.guildCsv();
        }
    }

    guildCsv(): void {
        console.log(this.guildCsvCount)
        this.guildLoading = Math.round((17-this.guildCsvCount)/17*100);
        if (this.guildCsvCount < 1) {
            document.getElementById('download_guild').style.display='block';
            document.getElementById('loading_download_guild').style.display='none';
        } else {
            document.getElementById('download_guild').style.display='none';
            document.getElementById('loading_download_guild').style.display='block';
        }
    }
}