import {Component, OnInit} from "@angular/core";
import {DataService} from "../../../services/data.service";

@Component({
    selector: 'clothes-dashboard',
    templateUrl: './clothes.dashboard.component.html',
    styleUrls: ['../dashboard.component.css']
})

export class ClothesDashboardComponent implements OnInit{

    inputClothesId = "入力してね";
    clothesOwners = 0;
    clothesOwnersString = "loading...";

    constructor(private dataService: DataService){}

    ngOnInit(): void {
        
    }

    OnButtonClick(): void {
        this.resetLoading();
        this.clothesOwners = 0;
        this.clothesOwnersString = "loading...";
        
    //clothesデータベース
        //所有者リスト
        this.dataService.clothesOwnData(this.inputClothesId).subscribe(
            clothesOwnResult => this.setClothesOwnData(clothesOwnResult),
            error => alert('通信エラー' + error)
        );
    }

    setClothesOwnData(clothesOwnResult): void {
        if(clothesOwnResult.error) {
            alert('Web APIエラー' + clothesOwnResult.message);
        }
        if (clothesOwnResult.data) {
            for ( var i=0; i<clothesOwnResult.data.length; i++) {
                var li = document.createElement('li');
                li.textContent = clothesOwnResult.data[i];
                document.getElementById('list').appendChild(li);
            }
            this.clothesOwners = clothesOwnResult.data.length;
            this.clothesOwnersString = this.clothesOwners.toString();
            this.loading();
        } else {
            this.clothesOwnersString = "searching...";
        }
    }

    loading(): void {
        document.getElementById('loading_clothes_owners').style.display="none";
        document.getElementById('loading_download_clothes').style.display="none";
        document.getElementById('download_clothes').style.display='block';
    }

    resetLoading(): void {
        document.getElementById('loading_clothes_owners').style.display="block";
        document.getElementById('loading_download_clothes').style.display="block";
        document.getElementById('download_clothes').style.display='none';
    }
}
