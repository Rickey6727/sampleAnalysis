import { Injectable }    from '@angular/core';
import { Http, Jsonp, RequestOptionsArgs, RequestOptions, URLSearchParams} from '@angular/http';
import {Observable} from  "rxjs/Observable";
import "rxjs/add/operator/map";

import { Data } from '../data';
import { SalesData } from '../salesdata';

@Injectable()
export class DataService {

  private datasUrl = 'http://localhost:8080/sampleData/data';
  private salesDataUrl = 'http://localhost:8080/sampleData/salesData';
  
  constructor(private http: Http, private jsonp: Jsonp) { };

  data(): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParam(this.datasUrl);
    return this.http.post(this.datasUrl, "gachaId=10186&countryCd=1", option)
      .map((response) => {
        let content;
        let obj = response.json();
        content = {
          error: null,
          data: obj
        };
        console.log(response);
        return content;

      });    
  }
  private setHttpGetParam(url: string): RequestOptions {
    let param = new URLSearchParams();
    // ■■■■■■■■　結果をここで使いたい　■■■■■■■■
    param.set("gachaId", "10186");
    param.set("countryCd", "1");
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  salesData(): Observable<SalesData> {
    let option : RequestOptions;
    option = this.setHttpGetParamSales(this.salesDataUrl);

    return this.http.post(this.salesDataUrl, "gachaId=10186", option)
      .map((response) => {
        let content;
        let obj = response.json();
        content = {
          error: null,
          data: obj
        };
        console.log(response);
        return content;

      });
  }
  private setHttpGetParamSales(url: string): RequestOptions {
    let param = new URLSearchParams();
    // ■■■■■■■■　結果をここで使いたい　■■■■■■■■
    param.set("gachaId", "10186");
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }
}
