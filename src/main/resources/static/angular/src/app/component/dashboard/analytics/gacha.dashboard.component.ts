import {Component, OnInit} from "@angular/core";
import {DataService} from "../../../services/data.service";


@Component({
    selector: 'gacha-dashboard',
    templateUrl: './gacha.dashboard.component.html',
    styleUrls: ['../dashboard.component.css']
})

export class GachaDashboardComponent implements OnInit{

    inputId = "入力してね";

    img_src = "http://sozai.7gates.net/img/icon/loading/loading01_r3_c3.gif";

    gachaId = "loading...";
    gachaTitle = "loading...";
    salesStartDate = "loading...";
    salesEndDate = "loading...";
    kaburazu1 = "loading...";
    kaburazu2 = "loading...";
    kaburazu3 = "loading...";
    playKaisu1 = "loading...";
    playKaisu2 = "loading...";
    playKaisu3 = "loading...";
    playKaisu4 = "loading...";
    playKaisu5 = "loading...";
    playKaisu6 = "loading...";
    playKaisu7 = "loading...";
    playKaisu8 = "loading...";
    playKaisu9 = "loading...";
    playKaisu10 = "loading...";
    playKaisu11 = "loading...";
    playKaisu12 = "loading...";
    playKaisu13 = "loading...";
    playKaisu14 = "loading...";

    totalCountString = "loading...";
    threeDaysCountString = "loading...";
    freeTotalCountString = "loading...";
    freeThreeDaysCountString = "loading...";
    allFreeTotalCountString = "loading...";
    onlyTicketCountString = "loading...";
    onlyCoinCountString = "loading...";
    freeTotalCountRateString = "loading...";
    onlyTicketCountRateString = "loading...";
    allFreeTotalCountRateString = "loading...";
    onlyCoinCountRateString = "loading...";
    TenTwoString = "loading...";
    allFreeThreeDaysCountString = "loading...";
    tenTwoThreeDaysCountString = "loading...";
    stepCountString = "loading...";
    stepCountThreeDaysCountString = "loading...";
    termCountString = "loading...";

    kaburazu1CountString = "loading...";
    kaburazu2CountString = "loading...";
    kaburazu3CountString = "loading...";
    playKaisu1CountString = "loading...";
    playKaisu2CountString = "loading...";
    playKaisu3CountString = "loading...";
    playKaisu4CountString = "loading...";
    playKaisu5CountString = "loading...";
    playKaisu6CountString = "loading...";
    playKaisu7CountString = "loading...";
    playKaisu8CountString = "loading...";
    playKaisu9CountString = "loading...";
    playKaisu10CountString = "loading...";
    playKaisu11CountString = "loading...";
    playKaisu12CountString = "loading...";
    playKaisu13CountString = "loading...";
    playKaisu14CountString = "loading...";
    totalKaburazuCountString = "loading...";
    totalPlayKaisuCountString = "loading...";

    totalCount = 0;
    freeTotalCount = 0;
    allFreeTotalCount = 0;
    termCount = 0;
    clothesOwners = 0;
    threeDaysCount = 0;
    TenTwo = 0;
    freeThreeDaysCount = 0;
    allFreeThreeDaysCount = 0;
    tenTwoThreeDaysCount = 0;
    stepCount = 0;
    stepCountThreeDaysCount = 0;
    kaburazu1Count = 0;
    kaburazu2Count = 0;
    kaburazu3Count = 0;
    playKaisu1Count = 0;
    playKaisu2Count = 0;
    playKaisu3Count = 0;
    playKaisu4Count = 0;
    playKaisu5Count = 0;
    playKaisu6Count = 0;
    playKaisu7Count = 0;
    playKaisu8Count = 0;
    playKaisu9Count = 0;
    playKaisu10Count = 0;
    playKaisu11Count = 0;
    playKaisu12Count = 0;
    playKaisu13Count = 0;
    playKaisu14Count = 0;

    onlyTicketCount = 0;
    onlyCoinCount = 0;
    freeTotalCountRate = 0;
    onlyTicketCountRate = 0;
    allFreeTotalCountRate = 0;
    onlyCoinCountRate = 0;

    gachaCsvCount=47;
    gachaLoading=0;


    constructor(private dataService: DataService){}
    

    ngOnInit(): void {
        
    }

    onclick(): void {
        this.img_src = "http://sozai.7gates.net/img/icon/loading/loading01_r3_c3.gif";
    
        this.gachaId = "loading...";
        this.gachaTitle = "loading...";
        this.salesStartDate = "loading...";
        this.salesEndDate = "loading...";
        this.kaburazu1 = "loading...";
        this.kaburazu2 = "loading...";
        this.kaburazu3 = "loading...";
        this.playKaisu1 = "loading...";
        this.playKaisu2 = "loading...";
        this.playKaisu3 = "loading...";
        this.playKaisu4 = "loading...";
        this.playKaisu5 = "loading...";
        this.playKaisu6 = "loading...";
        this.playKaisu7 = "loading...";
        this.playKaisu8 = "loading...";
        this.playKaisu9 = "loading...";
        this.playKaisu10 = "loading...";
        this.playKaisu11 = "loading...";
        this.playKaisu12 = "loading...";
        this.playKaisu13 = "loading...";
        this.playKaisu14 = "loading...";
    
        this.totalCountString = "loading...";
        this.threeDaysCountString = "loading...";
        this.freeTotalCountString = "loading...";
        this.freeThreeDaysCountString = "loading...";
        this.allFreeTotalCountString = "loading...";
        this.onlyTicketCountString = "loading...";
        this.onlyCoinCountString = "loading...";
        this.freeTotalCountRateString = "loading...";
        this.onlyTicketCountRateString = "loading...";
        this.allFreeTotalCountRateString = "loading...";
        this.onlyCoinCountRateString = "loading...";
        this.TenTwoString = "loading...";
        this.allFreeThreeDaysCountString = "loading...";
        this.tenTwoThreeDaysCountString = "loading...";
        this.stepCountString = "loading...";
        this.stepCountThreeDaysCountString = "loading...";
        this.termCountString = "loading...";
    
        this.kaburazu1CountString = "loading...";
        this.kaburazu2CountString = "loading...";
        this.kaburazu3CountString = "loading...";
        this.playKaisu1CountString = "loading...";
        this.playKaisu2CountString = "loading...";
        this.playKaisu3CountString = "loading...";
        this.playKaisu4CountString = "loading...";
        this.playKaisu5CountString = "loading...";
        this.playKaisu6CountString = "loading...";
        this.playKaisu7CountString = "loading...";
        this.playKaisu8CountString = "loading...";
        this.playKaisu9CountString = "loading...";
        this.playKaisu10CountString = "loading...";
        this.playKaisu11CountString = "loading...";
        this.playKaisu12CountString = "loading...";
        this.playKaisu13CountString = "loading...";
        this.playKaisu14CountString = "loading...";
        this.totalKaburazuCountString = "loading...";
        this.totalPlayKaisuCountString = "loading...";
    
        this.gachaCsvCount=47;
        this.gachaCsv();
        this.gachaLoading=0;

    //salesデータベース
        // タイトル・画像
        this.dataService.data(this.inputId).subscribe(
            dataResult => this.setDatas(dataResult),
            error => alert('通信エラー' + error)
        );
        //開始日時・終了日時
        this.dataService.salesData(this.inputId).subscribe(
            salesResult => this.setSalesData(salesResult),
            error => alert('通信エラー' + error)
        );
        //総回転数
        this.dataService.countData(this.inputId).subscribe(
            countResult => this.setCountData(countResult),
            error => alert('通信エラー' + error)
        );
        //無料orチケット回転数
        this.dataService.freeCountData(this.inputId).subscribe(
            freeCountResult => this.setFreeCountData(freeCountResult),
            error => alert('通信エラー' + error)
        );
        //無料回転数
        this.dataService.allFreeCountData(this.inputId).subscribe(
            allFreeCountResult => this.setAllFreeCountData(allFreeCountResult),
            error => alert('通信エラー' + error)
        );
        //10+2回転数
        this.dataService.tenTwoData(this.inputId).subscribe(
            tenTwoResult => this.setTenTwoData(tenTwoResult),
            error => alert('通信エラー' + error)
        );

    //operationデータベース
        //ステップ回転報酬
        this.dataService.stepCountData(this.inputId).subscribe(
            stepCountDataResult => this.setStepCountData(stepCountDataResult),
            error => alert('通信エラー' + error)
        );
        //かぶらず交換
        this.dataService.kaburazuData(this.inputId).subscribe(
            kaburazuDataResult => this.setKaburazuData(kaburazuDataResult),
            error => alert('通信エラー' + error)
        );

    //accountデータベース
        //プレイ回数交換
        this.dataService.playKaisuData(this.inputId).subscribe(
            playKaisuDataResult => this.setPlayKaisuData(playKaisuDataResult),
            error => alert('通信エラー' + error)
        );
    }

    setDatas(dataResult): void {
        if(dataResult.error) {
            alert('Web APIエラー' + dataResult.message);
        }
        if(dataResult.data) {
            this.gachaId = dataResult.data.gachaId;
            this.gachaTitle = dataResult.data.gachaTitle;
            this.img_src = "http://www.cocoppaplay.com/image1/ui/" + dataResult.data.bannerImageUrl;
            this.gachaCsvCount --;
            this.gachaCsv()
            this.gachaCsvCount --;
            this.gachaCsv()
        } else {
            window.alert("ガチャIDが間違ってるよ！");
            this.gachaCsvCount --;
            this.gachaCsv()
            this.gachaCsvCount --;
            this.gachaCsv()
        }
    }

    //ここで開始後3日間のデータを取得するために分岐させていく
    setSalesData(salesResult): void {
        if(salesResult.error) {
            alert('Web APIエラー' + salesResult.message);
        }
        this.salesStartDate = salesResult.data.saleStartDate;
        this.salesEndDate = salesResult.data.saleEndDate;
        this.gachaCsvCount --;
        this.gachaCsv()
        this.gachaCsvCount --;
        this.gachaCsv()
        this.dataService.threeDaysData(this.inputId, this.salesStartDate).subscribe(
            threeDaysResult => this.setThreeDaysData(threeDaysResult),
            error => alert('通信エラー' + error)
        );
        this.dataService.freeThreeDaysData(this.inputId, this.salesStartDate).subscribe(
            freeThreeDaysResult => this.setFreeThreeDaysData(freeThreeDaysResult),
            error => alert('通信エラー' + error)
        );
        this.dataService.allFreeThreeDaysData(this.inputId, this.salesStartDate).subscribe(
            allFreeThreeDaysResult => this.setAllFreeThreeDaysData(allFreeThreeDaysResult),
            error => alert('通信エラー' + error)
        );
        this.dataService.tenTwoThreeDaysData(this.inputId, this.salesStartDate).subscribe(
            tenTwoThreeDaysResult => this.setTenTwoThreeDaysData(tenTwoThreeDaysResult),
            error => alert('通信エラー' + error)
        );
    }

    setCountData(countResult): void {
        if(countResult.error) {
            alert('Web APIエラー' + countResult.message);
        }
        if (countResult.data.totalCount) {
            this.totalCount = countResult.data.totalCount;
            this.totalCountString = this.totalCount.toString();
            this.onlyCoinCountString = (this.totalCount - this.freeTotalCount).toString();
            this.onlyTicketCountRateString = Math.round((this.freeTotalCount - this.allFreeTotalCount) / this.totalCount * 100).toString();
            this.allFreeTotalCountRateString = Math.round(this.allFreeTotalCount / this.totalCount * 100).toString();
            this.onlyCoinCountRateString = Math.round((this.totalCount - this.freeTotalCount) / this.totalCount * 100).toString();
            this.freeTotalCountRateString = Math.round(this.freeTotalCount / this.totalCount * 100).toString();
        } else {
            this.totalCountString = "(NO DATA)";
        }
    }

    setFreeCountData(freeCountResult): void {
        if(freeCountResult.error) {
            alert('Web APIエラー' + freeCountResult.message);
        }
        if (freeCountResult.data.totalCount) {
            this.freeTotalCount = freeCountResult.data.totalCount;
            this.freeTotalCountString = this.freeTotalCount.toString();
            this.onlyTicketCountRateString = Math.round((this.freeTotalCount - this.allFreeTotalCount) / this.totalCount * 100).toString();
            this.allFreeTotalCountRateString = Math.round(this.allFreeTotalCount / this.totalCount * 100).toString();
            this.onlyCoinCountRateString = Math.round((this.totalCount - this.freeTotalCount) / this.totalCount * 100).toString();
            this.freeTotalCountRateString = Math.round(this.freeTotalCount / this.totalCount * 100).toString();
            this.onlyTicketCountString = (this.freeTotalCount - this.allFreeTotalCount).toString();
            this.gachaCsvCount --;
            this.gachaCsv()
        } else {
            this.freeTotalCountString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
        }
    }

    setAllFreeCountData(allFreeCountResult): void {
        if(allFreeCountResult.error) {
            alert('Web APIエラー' + allFreeCountResult.message);
        }
        if (allFreeCountResult.data.totalCount) {
            this.allFreeTotalCount = allFreeCountResult.data.totalCount;
            this.allFreeTotalCountString = this.allFreeTotalCount.toString();
            this.onlyTicketCountRateString = Math.round((this.freeTotalCount - this.allFreeTotalCount) / this.totalCount * 100).toString();
            this.allFreeTotalCountRateString = Math.round(this.allFreeTotalCount / this.totalCount * 100).toString();
            this.gachaCsvCount --;
            this.gachaCsv()
        } else {
            this.allFreeTotalCountString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
        }
    }

    setTenTwoData(TenTwoResult): void {
        if(TenTwoResult.error) {
            alert('Web APIエラー' + TenTwoResult.message);
        }
        if (TenTwoResult.data.totalCount) {
            this.TenTwo = TenTwoResult.data.totalCount;
            this.TenTwoString = this.TenTwo.toString();
            this.gachaCsvCount --;
            this.gachaCsv()
        } else {
            this.TenTwoString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
        }
    }

    setTermData(termResult): void {
        if(termResult.error) {
            alert('Web APIエラー' + termResult.message);
        }
        if (termResult.data.totalCount) {
            this.termCount = termResult.data.totalCount;
            this.termCountString = this.termCount.toString();
            this.gachaCsvCount --;
            this.gachaCsv()
        } else {
            this.termCountString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
        }
    }

    setThreeDaysData(threeDaysResult): void {
        if(threeDaysResult.error) {
            alert('Web APIエラー' + threeDaysResult.message);
        }
        if (threeDaysResult.data.totalCount) {
            this.threeDaysCount = threeDaysResult.data.totalCount;
            this.threeDaysCountString = this.threeDaysCount.toString();
            this.gachaCsvCount --;
            this.gachaCsv()
        } else {
            this.threeDaysCountString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
             
        }
    }

    setFreeThreeDaysData(freeThreeDaysResult): void {
        if(freeThreeDaysResult.error) {
            alert('Web APIエラー' + freeThreeDaysResult.message);
        }
        if (freeThreeDaysResult.data.totalCount) {
            this.freeThreeDaysCount = freeThreeDaysResult.data.totalCount;
            this.freeThreeDaysCountString = this.freeThreeDaysCount.toString();
            this.gachaCsvCount --;
            this.gachaCsv()
        } else {
            this.freeThreeDaysCountString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
             
        }
    }

    setAllFreeThreeDaysData(allFreeThreeDaysResult): void {
        if(allFreeThreeDaysResult.error) {
            alert('Web APIエラー' + allFreeThreeDaysResult.message);
        }
        if (allFreeThreeDaysResult.data.totalCount) {
            this.allFreeThreeDaysCount = allFreeThreeDaysResult.data.totalCount;
            this.allFreeThreeDaysCountString = this.allFreeThreeDaysCount.toString();
            this.gachaCsvCount --;
            this.gachaCsv()
        } else {
            this.allFreeThreeDaysCountString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
        }
    }

    setTenTwoThreeDaysData(tenTwoThreeDaysResult): void {
        if(tenTwoThreeDaysResult.error) {
            alert('Web APIエラー' + tenTwoThreeDaysResult.message);
        }
        if (tenTwoThreeDaysResult.data.totalCount) {
            this.tenTwoThreeDaysCount = tenTwoThreeDaysResult.data.totalCount;
            this.tenTwoThreeDaysCountString = this.tenTwoThreeDaysCount.toString();
            this.gachaCsvCount --;
            this.gachaCsv()
        } else {
            this.tenTwoThreeDaysCountString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
        }
    }

    setStepCountData(stepCountDataResult): void {
        if(stepCountDataResult.error) {
            alert('Web APIエラー' + stepCountDataResult.message);
        }
        if (stepCountDataResult.data.totalCount) {
            this.stepCount = stepCountDataResult.data.totalCount;
            this.stepCountString = this.stepCount.toString();
            this.gachaCsvCount --;
            this.gachaCsv()
        } else {
            this.stepCountString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
        }
        this.dataService.stepCountThreeDaysData(this.inputId, this.salesStartDate).subscribe(
            stepCountThreeDaysResult => this.setstepCountThreeDaysData(stepCountThreeDaysResult),
            error => alert('通信エラー' + error)
        );
    }

    setstepCountThreeDaysData(stepCountThreeDaysResult): void {
        if(stepCountThreeDaysResult.error) {
            alert('Web APIエラー' + stepCountThreeDaysResult.message);
        }
        if (stepCountThreeDaysResult.data.totalCount) {
            this.stepCountThreeDaysCount = stepCountThreeDaysResult.data.totalCount;
            this.stepCountThreeDaysCountString = this.stepCountThreeDaysCount.toString();
            this.gachaCsvCount --;
            this.gachaCsv()
        } else {
            this.stepCountThreeDaysCountString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
        }
    }

    setKaburazuData(kaburazuDataResult): void {
        if(kaburazuDataResult.error) {
            alert('Web APIエラー' + kaburazuDataResult.message);
        }
        if (kaburazuDataResult.data[0]) {
            this.kaburazu1 = kaburazuDataResult.data[0].exchangeId;
            this.gachaCsvCount --;
            this.gachaCsv()
            this.dataService.exchangeCountData(this.kaburazu1).subscribe(
                kaburazuCountResult => this.setKaburazuCountData1(kaburazuCountResult),
                error => alert('通信エラー' + error)
            );
        } else {
            this.kaburazu1CountString = "(NO DATA)"
            this.kaburazu1 = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
            this.gachaCsvCount --;
            this.gachaCsv()
            this.totalKaburazuCountString = (this.kaburazu1Count + this.kaburazu2Count + this.kaburazu3Count).toString();
        }
        if (kaburazuDataResult.data[1]) {
            this.kaburazu2 = kaburazuDataResult.data[1].exchangeId;
            this.gachaCsvCount --;
            this.gachaCsv()
            this.dataService.exchangeCountData(this.kaburazu2).subscribe(
                kaburazuCountResult => this.setKaburazuCountData2(kaburazuCountResult),
                error => alert('通信エラー' + error)
            );
        } else {
            this.kaburazu2CountString = "(NO DATA)"
            this.kaburazu2 = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
            this.gachaCsvCount --;
            this.gachaCsv()
            this.totalKaburazuCountString = (this.kaburazu1Count + this.kaburazu2Count + this.kaburazu3Count).toString();
        }
        if (kaburazuDataResult.data[2]) {
            this.kaburazu3 = kaburazuDataResult.data[2].exchangeId;
            this.gachaCsvCount --;
            this.gachaCsv()
            this.dataService.exchangeCountData(this.kaburazu3).subscribe(
                kaburazuCountResult => this.setKaburazuCountData3(kaburazuCountResult),
                error => alert('通信エラー' + error)
            );
        } else {
            this.kaburazu3CountString = "(NO DATA)"
            this.kaburazu3 = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
            this.gachaCsvCount --;
            this.gachaCsv()
            this.totalKaburazuCountString = (this.kaburazu1Count + this.kaburazu2Count + this.kaburazu3Count).toString();
        }
    }

    setPlayKaisuData(playKaisuDataResult): void {
        if(playKaisuDataResult.error) {
            alert('Web APIエラー' + playKaisuDataResult.message);
        }
        if (playKaisuDataResult.data) {
            if (playKaisuDataResult.data[0]) {
                this.playKaisu1 = playKaisuDataResult.data[0].exchangeId;
                this.gachaCsvCount --;
                this.gachaCsv()
                this.dataService.exchangeCountData(this.playKaisu1).subscribe(
                    kaburazuCountResult => this.setPlayKaisuCountData1(kaburazuCountResult),
                    error => alert('通信エラー' + error)
                );
            } else {
                this.playKaisu1CountString = "(NO DATA)"
                this.playKaisu1 = "(NO DATA)"
                this.gachaCsvCount --;
                this.gachaCsv()
                this.gachaCsvCount --;
                this.gachaCsv()
                this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
            }
            if (playKaisuDataResult.data[1]) {
                this.playKaisu2 = playKaisuDataResult.data[1].exchangeId;
                this.gachaCsvCount --;
                this.gachaCsv()
                this.dataService.exchangeCountData(this.playKaisu2).subscribe(
                    kaburazuCountResult => this.setPlayKaisuCountData2(kaburazuCountResult),
                    error => alert('通信エラー' + error)
                );
            } else {
                this.playKaisu2CountString = "(NO DATA)"
                this.playKaisu2 = "(NO DATA)"
                this.gachaCsvCount --;
                this.gachaCsv()
                this.gachaCsvCount --;
                this.gachaCsv()
                this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
            }
            if (playKaisuDataResult.data[2]) {
                this.playKaisu3 = playKaisuDataResult.data[2].exchangeId;
                this.gachaCsvCount --;
                this.gachaCsv()
                this.dataService.exchangeCountData(this.playKaisu3).subscribe(
                    kaburazuCountResult => this.setPlayKaisuCountData3(kaburazuCountResult),
                    error => alert('通信エラー' + error)
                );
            } else {
                this.playKaisu3CountString = "(NO DATA)"
                this.playKaisu3 = "(NO DATA)"
                this.gachaCsvCount --;
                this.gachaCsv()
                this.gachaCsvCount --;
                this.gachaCsv()
                this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
            }
            if (playKaisuDataResult.data[3]) {
                this.playKaisu4 = playKaisuDataResult.data[3].exchangeId;
                this.gachaCsvCount --;
                this.gachaCsv()
                this.dataService.exchangeCountData(this.playKaisu4).subscribe(
                    kaburazuCountResult => this.setPlayKaisuCountData4(kaburazuCountResult),
                    error => alert('通信エラー' + error)
                );
            } else {
                this.playKaisu4CountString = "(NO DATA)"
                this.playKaisu4 = "(NO DATA)"
                this.gachaCsvCount --;
                this.gachaCsv()
                this.gachaCsvCount --;
                this.gachaCsv()
                this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
            }
            if (playKaisuDataResult.data[4]) {
                this.playKaisu5 = playKaisuDataResult.data[4].exchangeId;
                this.gachaCsvCount --;
                this.gachaCsv()
                this.dataService.exchangeCountData(this.playKaisu5).subscribe(
                    kaburazuCountResult => this.setPlayKaisuCountData5(kaburazuCountResult),
                    error => alert('通信エラー' + error)
                );
            } else {
                this.playKaisu5CountString = "(NO DATA)"
                this.playKaisu5 = "(NO DATA)"
                this.gachaCsvCount --;
                this.gachaCsv()
                this.gachaCsvCount --;
                this.gachaCsv()
                this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
            }
            if (playKaisuDataResult.data[5]) {
                this.playKaisu6 = playKaisuDataResult.data[5].exchangeId;
                this.gachaCsvCount --;
                this.gachaCsv()
                this.dataService.exchangeCountData(this.playKaisu6).subscribe(
                    kaburazuCountResult => this.setPlayKaisuCountData6(kaburazuCountResult),
                    error => alert('通信エラー' + error)
                );
            } else {
                this.playKaisu6CountString = "(NO DATA)"
                this.playKaisu6 = "(NO DATA)"
                this.gachaCsvCount --;
                this.gachaCsv()
                this.gachaCsvCount --;
                this.gachaCsv()
                this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
            }
            if (playKaisuDataResult.data[6]) {
                this.playKaisu7 = playKaisuDataResult.data[6].exchangeId;
                this.gachaCsvCount --;
                this.gachaCsv()
                this.dataService.exchangeCountData(this.playKaisu7).subscribe(
                    kaburazuCountResult => this.setPlayKaisuCountData7(kaburazuCountResult),
                    error => alert('通信エラー' + error)
                );
            } else {
                this.playKaisu7CountString = "(NO DATA)"
                this.playKaisu7 = "(NO DATA)"
                this.gachaCsvCount --;
                this.gachaCsv()
                this.gachaCsvCount --;
                this.gachaCsv()
                this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
            }
            if (playKaisuDataResult.data[7]) {
                this.playKaisu8 = playKaisuDataResult.data[7].exchangeId;
                this.gachaCsvCount --;
                this.gachaCsv()
                this.dataService.exchangeCountData(this.playKaisu8).subscribe(
                    kaburazuCountResult => this.setPlayKaisuCountData8(kaburazuCountResult),
                    error => alert('通信エラー' + error)
                );
            } else {
                this.playKaisu8CountString = "(NO DATA)"
                this.playKaisu8 = "(NO DATA)"
                this.gachaCsvCount --;
                this.gachaCsv()
                this.gachaCsvCount --;
                this.gachaCsv()
                this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
            }
            if (playKaisuDataResult.data[8]) {
                this.playKaisu9 = playKaisuDataResult.data[8].exchangeId;
                this.gachaCsvCount --;
                this.gachaCsv()
                this.dataService.exchangeCountData(this.playKaisu9).subscribe(
                    kaburazuCountResult => this.setPlayKaisuCountData9(kaburazuCountResult),
                    error => alert('通信エラー' + error)
                );
            } else {
                this.playKaisu9CountString = "(NO DATA)"
                this.playKaisu9 = "(NO DATA)"
                this.gachaCsvCount --;
                this.gachaCsv()
                this.gachaCsvCount --;
                this.gachaCsv()
                this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
            }
            if (playKaisuDataResult.data[9]) {
                this.playKaisu10 = playKaisuDataResult.data[9].exchangeId;
                this.gachaCsvCount --;
                this.gachaCsv()
                this.dataService.exchangeCountData(this.playKaisu10).subscribe(
                    kaburazuCountResult => this.setPlayKaisuCountData10(kaburazuCountResult),
                    error => alert('通信エラー' + error)
                );
            } else {
                this.playKaisu10CountString = "(NO DATA)"
                this.playKaisu10 = "(NO DATA)"
                this.gachaCsvCount --;
                this.gachaCsv()
                this.gachaCsvCount --;
                this.gachaCsv()
                this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
            }
            if (playKaisuDataResult.data[10]) {
                this.playKaisu11 = playKaisuDataResult.data[10].exchangeId;
                this.gachaCsvCount --;
                this.gachaCsv()
                this.dataService.exchangeCountData(this.playKaisu11).subscribe(
                    kaburazuCountResult => this.setPlayKaisuCountData11(kaburazuCountResult),
                    error => alert('通信エラー' + error)
                );
            } else {
                this.playKaisu11CountString = "(NO DATA)"
                this.playKaisu11 = "(NO DATA)"
                this.gachaCsvCount --;
                this.gachaCsv()
                this.gachaCsvCount --;
                this.gachaCsv()
                this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
            }
            if (playKaisuDataResult.data[11]) {
                this.playKaisu12 = playKaisuDataResult.data[11].exchangeId;
                this.gachaCsvCount --;
                this.gachaCsv()
                this.dataService.exchangeCountData(this.playKaisu12).subscribe(
                    kaburazuCountResult => this.setPlayKaisuCountData12(kaburazuCountResult),
                    error => alert('通信エラー' + error)
                );
            } else {
                this.playKaisu12CountString = "(NO DATA)"
                this.playKaisu12 = "(NO DATA)"
                this.gachaCsvCount --;
                this.gachaCsv()
                this.gachaCsvCount --;
                this.gachaCsv()
                this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
            }
            if (playKaisuDataResult.data[12]) {
                this.playKaisu13 = playKaisuDataResult.data[0].exchangeId;
                this.gachaCsvCount --;
                this.gachaCsv()
                this.dataService.exchangeCountData(this.playKaisu13).subscribe(
                    kaburazuCountResult => this.setPlayKaisuCountData13(kaburazuCountResult),
                    error => alert('通信エラー' + error)
                );
            } else {
                this.playKaisu13CountString = "(NO DATA)"
                this.playKaisu13 = "(NO DATA)"
                this.gachaCsvCount --;
                this.gachaCsv()
                this.gachaCsvCount --;
                this.gachaCsv()
                this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
            }
            if (playKaisuDataResult.data[13]) {
                this.playKaisu14 = playKaisuDataResult.data[0].exchangeId;
                this.gachaCsvCount --;
                this.gachaCsv()
                this.dataService.exchangeCountData(this.playKaisu14).subscribe(
                    kaburazuCountResult => this.setPlayKaisuCountData14(kaburazuCountResult),
                    error => alert('通信エラー' + error)
                );
            } else {
                this.playKaisu14CountString = "(NO DATA)"
                this.playKaisu14 = "(NO DATA)"
                this.gachaCsvCount --;
                this.gachaCsv()
                this.gachaCsvCount --;
                this.gachaCsv()
                this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
            }
        }
    }

    setKaburazuCountData1(kaburazuCountResult): void {
        if(kaburazuCountResult.error) {
            alert('Web APIエラー' + kaburazuCountResult.message);
        }
        if (kaburazuCountResult.data.totalCount) {
            this.kaburazu1Count = kaburazuCountResult.data.totalCount;
            this.kaburazu1CountString = this.kaburazu1Count.toString();
            this.gachaCsvCount --;
            this.gachaCsv()
            this.totalKaburazuCountString = (this.kaburazu1Count + this.kaburazu2Count + this.kaburazu3Count).toString();
        } else {
            this.kaburazu1CountString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
        }
    }

    setKaburazuCountData2(kaburazuCountResult): void {
        if(kaburazuCountResult.error) {
            alert('Web APIエラー' + kaburazuCountResult.message);
        }
        if (kaburazuCountResult.data.totalCount) {
            this.kaburazu2Count = kaburazuCountResult.data.totalCount;
            this.kaburazu2CountString = this.kaburazu2Count.toString();
            this.gachaCsvCount --;
            this.gachaCsv()
            this.totalKaburazuCountString = (this.kaburazu1Count + this.kaburazu2Count + this.kaburazu3Count).toString();
        } else {
            this.kaburazu2CountString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
        }
    }

    setKaburazuCountData3(kaburazuCountResult): void {
        if(kaburazuCountResult.error) {
            alert('Web APIエラー' + kaburazuCountResult.message);
        }
        if (kaburazuCountResult.data.totalCount) {
            this.kaburazu3Count = kaburazuCountResult.data.totalCount;
            this.kaburazu3CountString = this.kaburazu3Count.toString();
            this.gachaCsvCount --;
            this.gachaCsv()
            this.totalKaburazuCountString = (this.kaburazu1Count + this.kaburazu2Count + this.kaburazu3Count).toString();
        } else {
            this.kaburazu3CountString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
        }
    }

    setPlayKaisuCountData1(playKaisuCountResult): void {
        if(playKaisuCountResult.error) {
            alert('Web APIエラー' + playKaisuCountResult.message);
        }
        if (playKaisuCountResult.data.totalCount) {
            this.playKaisu1Count = playKaisuCountResult.data.totalCount;
            this.playKaisu1CountString = this.playKaisu1Count.toString();
            this.gachaCsvCount --;
            this.gachaCsv()
            this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
        } else {
            this.playKaisu1CountString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
        }
    }

    setPlayKaisuCountData2(playKaisuCountResult): void {
        if(playKaisuCountResult.error) {
            alert('Web APIエラー' + playKaisuCountResult.message);
        }
        if (playKaisuCountResult.data.totalCount) {
            this.playKaisu2Count = playKaisuCountResult.data.totalCount;
            this.playKaisu2CountString = this.playKaisu2Count.toString();
            this.gachaCsvCount --;
            this.gachaCsv()
            this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
        } else {
            this.playKaisu2CountString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
        }
    }

    setPlayKaisuCountData3(playKaisuCountResult): void {
        if(playKaisuCountResult.error) {
            alert('Web APIエラー' + playKaisuCountResult.message);
        }
        if (playKaisuCountResult.data.totalCount) {
            this.playKaisu3Count = playKaisuCountResult.data.totalCount;
            this.playKaisu3CountString = this.playKaisu3Count.toString();
            this.gachaCsvCount --;
            this.gachaCsv()
            this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
        } else {
            this.playKaisu3CountString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
        }
    }

    setPlayKaisuCountData4(playKaisuCountResult): void {
        if(playKaisuCountResult.error) {
            alert('Web APIエラー' + playKaisuCountResult.message);
        }
        if (playKaisuCountResult.data.totalCount) {
            this.playKaisu4Count = playKaisuCountResult.data.totalCount;
            this.playKaisu4CountString = this.playKaisu4Count.toString();
            this.gachaCsvCount --;
            this.gachaCsv()
            this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
        } else {
            this.playKaisu4CountString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
        }
    }

    setPlayKaisuCountData5(playKaisuCountResult): void {
        if(playKaisuCountResult.error) {
            alert('Web APIエラー' + playKaisuCountResult.message);
        }
        if (playKaisuCountResult.data.totalCount) {
            this.playKaisu5Count = playKaisuCountResult.data.totalCount;
            this.playKaisu5CountString = this.playKaisu5Count.toString();
            this.gachaCsvCount --;
            this.gachaCsv()
            this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
        } else {
            this.playKaisu5CountString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
        }
    }

    setPlayKaisuCountData6(playKaisuCountResult): void {
        if(playKaisuCountResult.error) {
            alert('Web APIエラー' + playKaisuCountResult.message);
        }
        if (playKaisuCountResult.data.totalCount) {
            this.playKaisu6Count = playKaisuCountResult.data.totalCount;
            this.playKaisu6CountString = this.playKaisu6Count.toString();
            this.gachaCsvCount --;
            this.gachaCsv()
            this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
        } else {
            this.playKaisu6CountString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
        }
    }

    setPlayKaisuCountData7(playKaisuCountResult): void {
        if(playKaisuCountResult.error) {
            alert('Web APIエラー' + playKaisuCountResult.message);
        }
        if (playKaisuCountResult.data.totalCount) {
            this.playKaisu7Count = playKaisuCountResult.data.totalCount;
            this.playKaisu7CountString = this.playKaisu7Count.toString();
            this.gachaCsvCount --;
            this.gachaCsv()
            this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
        } else {
            this.playKaisu7CountString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
        }
    }

    setPlayKaisuCountData8(playKaisuCountResult): void {
        if(playKaisuCountResult.error) {
            alert('Web APIエラー' + playKaisuCountResult.message);
        }
        if (playKaisuCountResult.data.totalCount) {
            this.playKaisu8Count = playKaisuCountResult.data.totalCount;
            this.playKaisu8CountString = this.playKaisu8Count.toString();
            this.gachaCsvCount --;
            this.gachaCsv()
            this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
        } else {
            this.playKaisu8CountString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
        }
    }

    setPlayKaisuCountData9(playKaisuCountResult): void {
        if(playKaisuCountResult.error) {
            alert('Web APIエラー' + playKaisuCountResult.message);
        }
        if (playKaisuCountResult.data.totalCount) {
            this.playKaisu9Count = playKaisuCountResult.data.totalCount;
            this.playKaisu9CountString = this.playKaisu9Count.toString();
            this.gachaCsvCount --;
            this.gachaCsv()
            this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
        } else {
            this.playKaisu9CountString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
        }
    }

    setPlayKaisuCountData10(playKaisuCountResult): void {
        if(playKaisuCountResult.error) {
            alert('Web APIエラー' + playKaisuCountResult.message);
        }
        if (playKaisuCountResult.data.totalCount) {
            this.playKaisu10Count = playKaisuCountResult.data.totalCount;
            this.playKaisu10CountString = this.playKaisu10Count.toString();
            this.gachaCsvCount --;
            this.gachaCsv()
            this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
        } else {
            this.playKaisu10CountString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
        }
    }

    setPlayKaisuCountData11(playKaisuCountResult): void {
        if(playKaisuCountResult.error) {
            alert('Web APIエラー' + playKaisuCountResult.message);
        }
        if (playKaisuCountResult.data.totalCount) {
            this.playKaisu11Count = playKaisuCountResult.data.totalCount;
            this.playKaisu11CountString = this.playKaisu11Count.toString();
            this.gachaCsvCount --;
            this.gachaCsv()
            this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
        } else {
            this.playKaisu11CountString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
        }
    }

    setPlayKaisuCountData12(playKaisuCountResult): void {
        if(playKaisuCountResult.error) {
            alert('Web APIエラー' + playKaisuCountResult.message);
        }
        if (playKaisuCountResult.data.totalCount) {
            this.playKaisu12Count = playKaisuCountResult.data.totalCount;
            this.playKaisu12CountString = this.playKaisu12Count.toString();
            this.gachaCsvCount --;
            this.gachaCsv()
            this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
        } else {
            this.playKaisu12CountString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
        }
    }

    setPlayKaisuCountData13(playKaisuCountResult): void {
        if(playKaisuCountResult.error) {
            alert('Web APIエラー' + playKaisuCountResult.message);
        }
        if (playKaisuCountResult.data.totalCount) {
            this.playKaisu13Count = playKaisuCountResult.data.totalCount;
            this.playKaisu13CountString = this.playKaisu13Count.toString();
            this.gachaCsvCount --;
            this.gachaCsv()
            this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
        } else {
            this.playKaisu13CountString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
        }
    }

    setPlayKaisuCountData14(playKaisuCountResult): void {
        if(playKaisuCountResult.error) {
            alert('Web APIエラー' + playKaisuCountResult.message);
        }
        if (playKaisuCountResult.data.totalCount) {
            this.playKaisu14Count = playKaisuCountResult.data.totalCount;
            this.playKaisu14CountString = this.playKaisu14Count.toString();
            this.gachaCsvCount --;
            this.gachaCsv()
            this.totalPlayKaisuCountString = (this.playKaisu1Count + this.playKaisu2Count + this.playKaisu3Count + this.playKaisu4Count + this.playKaisu5Count + this.playKaisu6Count + this.playKaisu7Count + this.playKaisu8Count + this.playKaisu9Count + this.playKaisu10Count + this.playKaisu11Count + this.playKaisu12Count + this.playKaisu13Count + this.playKaisu14Count).toString();
        } else {
            this.playKaisu14CountString = "(NO DATA)"
            this.gachaCsvCount --;
            this.gachaCsv()
        }
    }

    gachaCsv(): void {
        console.log(this.gachaCsvCount);
        this.gachaLoading=Math.round((47-this.gachaCsvCount)/47*100);
        if (this.gachaCsvCount < 1) {
            document.getElementById('download_gacha').style.display='block';
            document.getElementById('loading_download_gacha').style.display='none';
        } else {
            document.getElementById('download_gacha').style.display='none';
            document.getElementById('loading_download_gacha').style.display='block';
        }
    }
}
