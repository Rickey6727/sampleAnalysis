import { Injectable }    from '@angular/core';
import { Http, RequestOptionsArgs, RequestOptions, URLSearchParams} from '@angular/http';
import {Observable} from  "rxjs/Observable";
import "rxjs/add/operator/map";
import { Data } from '../data';

@Injectable()
export class DataService {

  private datasUrl = 'http://*****:8080/sampleData/data';
  private salesDataUrl = 'http://*****:8080/sampleData/salesData';
  private countDataUrl = 'http://*****:8080/sampleData/countData';
  private termDataUrl = 'http://*****:8080/sampleData/selectCountData';
  private clothesOwnDataUrl = 'http://*****:8080/sampleData/clothesOwnData';
  private threeDaysDataUrl = 'http://*****:8080/sampleData/threeDaysData';
  private freeCountDataUrl = 'http://*****:8080/sampleData/freeCountData';
  private allFreeCountDataUrl = 'http://*****:8080/sampleData/allFreeCountData';
  private tenTwoDataUrl = 'http://*****:8080/sampleData/tenTwoData';
  private freeThreeDaysDataUrl = 'http://*****:8080/sampleData/freeThreeDaysData';
  private allFreeThreeDaysDataUrl = 'http://*****:8080/sampleData/allFreeThreeDaysData';
  private tenTwoThreeDaysDataUrl = 'http://*****:8080/sampleData/tenTwoThreeDaysData';
  private stepCountDataUrl = 'http://*****:8080/sampleData/stepCountData';
  private stepCountThreeDaysDataUrl = 'http://*****:8080/sampleData/stepCountThreeDaysData';
  private kaburazuDataUrl = 'http://*****:8080/sampleData/exchange1Data';
  private playKaisuDataUrl = 'http://*****:8080/sampleData/exchange2Data';
  private exchangeCountDataUrl = 'http://*****:8080/sampleData/exchangeCount';
  private captureEventDataUrl = 'http://*****:8080/sampleData/captureEventData';
  private tutorialPlayDataUrl = 'http://*****:8080/sampleData/tutorialPlayData';
  private coinCampaignDataUrl = 'http://*****:8080/sampleData/coinCampaignData';
  private captureEventActiveUserUrl = 'http://*****:8080/sampleData/captureEventActiveUser';
  private captureEventTermUrl = 'http://*****:8080/sampleData/captureEventTerm';
  private caputureCountUrl = 'http://*****:8080/sampleData/caputureCount';
  private uuCountUrl = 'http://*****:8080/sampleData/uuCount';
  private guildEventActiveUserUrl = 'http://*****:8080/sampleData/guildEventActiveUser';
  private deliveryEventActiveUserUrl = 'http://*****:8080/sampleData/deliveryEventActiveUser';
  private guildEventTermUrl = 'http://*****:8080/sampleData/guildEventTerm';
  private guildEventDataUrl = 'http://*****:8080/sampleData/guildEventData';
  private deliveryEventTermUrl = 'http://*****:8080/sampleData/deliveryEventTerm';
  private deliveryEventDataUrl = 'http://*****:8080/sampleData/deliveryEventData';
  private deliveryCountUrl = 'http://*****:8080/sampleData/deliveryCount';

  constructor(private http: Http) {};

  data(inputId: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParam(this.datasUrl, inputId);
    return this.http.post(this.datasUrl, "", option)
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
  private setHttpGetParam(url: string, inputId: string): RequestOptions {
    let param = new URLSearchParams();
    param.set("gachaId", inputId);
    param.set("countryCd", "1");
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  salesData(inputId: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamSales(this.salesDataUrl, inputId);
    return this.http.post(this.salesDataUrl, "", option)
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
  private setHttpGetParamSales(url: string, inputId: string): RequestOptions {
    let param = new URLSearchParams();
    param.set("gachaId", inputId);
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  countData(inputId: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamCount(this.countDataUrl, inputId);
    return this.http.post(this.countDataUrl, "", option)
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
  private setHttpGetParamCount(url: string, inputId: string): RequestOptions {
    let param = new URLSearchParams();
    param.set("gachaId", inputId);
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  freeCountData(inputId: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamFreeCount(this.freeCountDataUrl, inputId);
    return this.http.post(this.freeCountDataUrl, "", option)
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
  private setHttpGetParamFreeCount(url: string, inputId: string): RequestOptions {
    let param = new URLSearchParams();
    param.set("gachaId", inputId);
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  allFreeCountData(inputId: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamAllFreeCount(this.allFreeCountDataUrl, inputId);
    return this.http.post(this.allFreeCountDataUrl, "", option)
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
  private setHttpGetParamAllFreeCount(url: string, inputId: string): RequestOptions {
    let param = new URLSearchParams();
    param.set("gachaId", inputId);
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  termData(inputId: string, selectStartDate: string, selectEndDate: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamTerm(this.termDataUrl, inputId, selectStartDate, selectEndDate);
    return this.http.post(this.termDataUrl, "", option)
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
  private setHttpGetParamTerm(url: string, inputId: string, selectStartDate: string, selectEndDate: string): RequestOptions {
    let param = new URLSearchParams();
    param.set("gachaId", inputId);
    param.set("selectStartDate", selectStartDate + ":00.000");
    param.set("selectEndDate", selectEndDate + ":00.000");
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  clothesOwnData(inputClothesId): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamClothesOwn(this.clothesOwnDataUrl, inputClothesId);
    return this.http.post(this.termDataUrl, "", option)
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
  private setHttpGetParamClothesOwn(url: string, inputClothesId: string): RequestOptions {
    let param = new URLSearchParams();
    param.set("clothesId", inputClothesId);
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  threeDaysData(inputId: string, salesStartDate: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamThreeDays(this.threeDaysDataUrl, inputId, salesStartDate);
    return this.http.post(this.threeDaysDataUrl, "", option)
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
  private setHttpGetParamThreeDays(url: string, inputId: string, salesStartDate: string): RequestOptions {
    let param = new URLSearchParams();
    var selectEndDate = new Date(salesStartDate);
    selectEndDate.setDate(selectEndDate.getDate() + 3);
    param.set("gachaId", inputId);
    param.set("salesStartDate", salesStartDate);
    param.set("selectEndDate", selectEndDate + ":00.000");
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  freeThreeDaysData(inputId: string, salesStartDate: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamFreeThreeDays(this.freeThreeDaysDataUrl, inputId, salesStartDate);
    return this.http.post(this.freeThreeDaysDataUrl, "", option)
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
  private setHttpGetParamFreeThreeDays(url: string, inputId: string, salesStartDate: string): RequestOptions {
    let param = new URLSearchParams();
    var selectEndDate = new Date(salesStartDate);
    selectEndDate.setDate(selectEndDate.getDate() + 3);
    param.set("gachaId", inputId);
    param.set("salesStartDate", salesStartDate);
    param.set("selectEndDate", selectEndDate + ":00.000");
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  allFreeThreeDaysData(inputId: string, salesStartDate: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamAllFreeThreeDays(this.allFreeThreeDaysDataUrl, inputId, salesStartDate);
    return this.http.post(this.allFreeThreeDaysDataUrl, "", option)
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
  private setHttpGetParamAllFreeThreeDays(url: string, inputId: string, salesStartDate: string): RequestOptions {
    let param = new URLSearchParams();
    var selectEndDate = new Date(salesStartDate);
    selectEndDate.setDate(selectEndDate.getDate() + 3);
    param.set("gachaId", inputId);
    param.set("salesStartDate", salesStartDate);
    param.set("selectEndDate", selectEndDate + ":00.000");
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  tenTwoThreeDaysData(inputId: string, salesStartDate: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamTenTwoThreeDays(this.tenTwoThreeDaysDataUrl, inputId, salesStartDate);
    return this.http.post(this.tenTwoThreeDaysDataUrl, "", option)
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
  private setHttpGetParamTenTwoThreeDays(url: string, inputId: string, salesStartDate: string): RequestOptions {
    let param = new URLSearchParams();
    var selectEndDate = new Date(salesStartDate);
    selectEndDate.setDate(selectEndDate.getDate() + 3);
    param.set("gachaId", inputId);
    param.set("salesStartDate", salesStartDate);
    param.set("selectEndDate", selectEndDate + ":00.000");
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  tenTwoData(inputId: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamTenTwo(this.tenTwoDataUrl, inputId);
    return this.http.post(this.tenTwoDataUrl, "", option)
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
  private setHttpGetParamTenTwo(url: string, inputId: string): RequestOptions {
    let param = new URLSearchParams();
    param.set("gachaId", inputId);
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  stepCountData(inputId: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamStepCount(this.stepCountDataUrl, inputId);
    return this.http.post(this.stepCountDataUrl, "", option)
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
  private setHttpGetParamStepCount(url: string, inputId: string): RequestOptions {
    let param = new URLSearchParams();
    param.set("gachaId", inputId);
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  stepCountThreeDaysData(inputId: string, salesStartDate: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamStepCountThreeDays(this.stepCountThreeDaysDataUrl, inputId, salesStartDate);
    return this.http.post(this.stepCountThreeDaysDataUrl, "", option)
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
  private setHttpGetParamStepCountThreeDays(url: string, inputId: string, salesStartDate: string): RequestOptions {
    let param = new URLSearchParams();
    var selectEndDate = new Date(salesStartDate);
    selectEndDate.setDate(selectEndDate.getDate() + 3);
    param.set("gachaId", inputId);
    param.set("salesStartDate", salesStartDate);
    param.set("selectEndDate", selectEndDate + ":00.000");
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  kaburazuData(inputId: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamKaburazu(this.kaburazuDataUrl, inputId);
    return this.http.post(this.kaburazuDataUrl, "", option)
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
  private setHttpGetParamKaburazu(url: string, inputId: string): RequestOptions {
    let param = new URLSearchParams();
    param.set("gachaId", inputId);
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  playKaisuData(inputId: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamPlayKaisu(this.playKaisuDataUrl, inputId);
    return this.http.post(this.playKaisuDataUrl, "", option)
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
  private setHttpGetParamPlayKaisu(url: string, inputId: string): RequestOptions {
    let param = new URLSearchParams();
    param.set("gachaId", inputId);
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  exchangeCountData(exchangeId: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamExchangeCount(this.exchangeCountDataUrl, exchangeId);
    return this.http.post(this.exchangeCountDataUrl, "", option)
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
  private setHttpGetParamExchangeCount(url: string, exchangeId: string): RequestOptions {
    let param = new URLSearchParams();
    param.set("exchangeId", exchangeId);
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  captureEventData(inputCaptureEventId: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamCaptureEventData(this.captureEventDataUrl, inputCaptureEventId);
    return this.http.post(this.captureEventDataUrl, "", option)
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
  private setHttpGetParamCaptureEventData(url: string, inputCaptureEventId: string): RequestOptions {
    let param = new URLSearchParams();
    param.set("eventId", inputCaptureEventId);
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  deliveryEventData(inputCaptureEventId: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamDeliveryEventData(this.deliveryEventDataUrl, inputCaptureEventId);
    return this.http.post(this.deliveryEventDataUrl, "", option)
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
  private setHttpGetParamDeliveryEventData(url: string, inputCaptureEventId: string): RequestOptions {
    let param = new URLSearchParams();
    param.set("eventId", inputCaptureEventId);
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  guildEventData(inputCaptureEventId: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamGuildEventData(this.guildEventDataUrl, inputCaptureEventId);
    return this.http.post(this.guildEventDataUrl, "", option)
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
  private setHttpGetParamGuildEventData(url: string, inputCaptureEventId: string): RequestOptions {
    let param = new URLSearchParams();
    param.set("eventId", inputCaptureEventId);
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  tutorialPlayData(tutorialId: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamTutorialPlay(this.tutorialPlayDataUrl, tutorialId);
    return this.http.post(this.tutorialPlayDataUrl, "", option)
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
  private setHttpGetParamTutorialPlay(url: string, tutorialId: string): RequestOptions {
    let param = new URLSearchParams();
    param.set("tutorialId", tutorialId);
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  coinCampaignData(startDate: string, endDate: string, productId: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamCoinCampaign(this.coinCampaignDataUrl, startDate, endDate, productId);
    return this.http.post(this.coinCampaignDataUrl, "", option)
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
  private setHttpGetParamCoinCampaign(url: string, startDate: string, endDate: string, productId: string): RequestOptions {
    let param = new URLSearchParams();
    param.set("startDate", startDate);
    param.set("endDate", endDate);
    param.set("productId", productId);
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  ActiveUserData(eventId: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamActiveUser(this.captureEventActiveUserUrl, eventId);
    return this.http.post(this.captureEventActiveUserUrl, "", option)
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
  private setHttpGetParamActiveUser(url: string, eventId: string): RequestOptions {
    let param = new URLSearchParams();
    param.set("eventId", eventId);
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  deliveryActiveUserData(eventId: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamDeliveryActiveUser(this.deliveryEventActiveUserUrl, eventId);
    return this.http.post(this.captureEventActiveUserUrl, "", option)
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
  private setHttpGetParamDeliveryActiveUser(url: string, eventId: string): RequestOptions {
    let param = new URLSearchParams();
    param.set("eventId", eventId);
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  guildActiveUserData(eventId: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamGuildActiveUser(this.guildEventActiveUserUrl, eventId);
    return this.http.post(this.guildEventActiveUserUrl, "", option)
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
  private setHttpGetParamGuildActiveUser(url: string, eventId: string): RequestOptions {
    let param = new URLSearchParams();
    param.set("eventId", eventId);
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  captureEventTermData(eventId: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamCaptureEventTerm(this.captureEventTermUrl, eventId);
    return this.http.post(this.captureEventTermUrl, "", option)
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
  private setHttpGetParamCaptureEventTerm(url: string, eventId: string): RequestOptions {
    let param = new URLSearchParams();
    param.set("eventId", eventId);
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  deliveryEventTermData(eventId: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamDeliveryEventTerm(this.deliveryEventTermUrl, eventId);
    return this.http.post(this.deliveryEventTermUrl, "", option)
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
  private setHttpGetParamDeliveryEventTerm(url: string, eventId: string): RequestOptions {
    let param = new URLSearchParams();
    param.set("eventId", eventId);
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  guildEventTermData(eventId: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamGuildEventTerm(this.guildEventTermUrl, eventId);
    return this.http.post(this.guildEventTermUrl, "", option)
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
  private setHttpGetParamGuildEventTerm(url: string, eventId: string): RequestOptions {
    let param = new URLSearchParams();
    param.set("eventId", eventId);
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  CaptureCountData(eventId: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamTotalCaptureCount(this.caputureCountUrl, eventId);
    return this.http.post(this.caputureCountUrl, "", option)
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
  private setHttpGetParamTotalCaptureCount(url: string, eventId: string): RequestOptions {
    let param = new URLSearchParams();
    param.set("eventId", eventId);
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  uuCountData(startDate: string, endDate: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamUUCount(this.uuCountUrl, startDate, endDate);
    return this.http.post(this.uuCountUrl, "", option)
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
  private setHttpGetParamUUCount(url: string, startDate: string, endDate: string): RequestOptions {
    let param = new URLSearchParams();
    param.set("startDate", startDate);
    param.set("endDate", endDate);
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }

  deliveryCountData(eventId: string): Observable<Data> {
    let option : RequestOptions;
    option = this.setHttpGetParamTotalDeliveryCount(this.deliveryCountUrl, eventId);
    return this.http.post(this.deliveryCountUrl, "", option)
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
  private setHttpGetParamTotalDeliveryCount(url: string, eventId: string): RequestOptions {
    let param = new URLSearchParams();
    param.set("eventId", eventId);
    let options: RequestOptionsArgs = {
      method: "post",
      url: url,
      search: param,
    };
    return new RequestOptions(options);
  }
}
