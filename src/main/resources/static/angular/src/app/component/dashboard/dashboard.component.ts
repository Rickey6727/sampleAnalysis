import {Component, OnInit} from "@angular/core";
import {Data} from "../../data";
import {DataService} from "../../services/data.service";
import {SalesData} from "../../salesdata";

@Component({
    selector: 'my-dashboard',
    templateUrl: './dashboard.component.html',
    styleUrls: ['./dashboard.component.css']
})

export class DashboardComponent implements OnInit{

    gachaId = '検索結果';
    gachaTitle = '検索結果';
    bannerImageUrl = '検索結果';
    salesStartDate = '検索結果';
    salesEndDate = '検索結果';

    constructor(private dataService: DataService){}

    //商品リスト
    dataList : Data[];
    salesDataList : SalesData[];

    //画面初期表示イベント処理
    ngOnInit(): void {
        this.dataService.data().subscribe(
            dataresult => this.setDatas(dataresult),
            error => alert('通信エラー' + error)
        );
        this.dataService.salesData().subscribe(
            salesresult => this.setSalesData(salesresult),
            error => alert('通信エラー' + error)
        );
    }

    //Web APIから取得したデータを商品リストにセットする
    setDatas(dataresult): void {
        if(dataresult.error) {
            alert('Web APIエラー' + dataresult.message);
        }
        this.gachaId = dataresult.data.gachaId;
        this.gachaTitle = dataresult.data.gachaTitle;
        this.bannerImageUrl = dataresult.data.bannerImageUrl;
    }

    setSalesData(salesresult): void {
        if(salesresult.error) {
            alert('Web APIエラー' + salesresult.message);
        }
        this.salesStartDate = salesresult.data.saleStartDate;
        this.salesEndDate = salesresult.data.saleEndDate;
    }
}