import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule,JsonpModule} from '@angular/http';

import { DashboardComponent } from './component/dashboard/dashboard.component';
import { ClothesDashboardComponent } from './component/dashboard/analytics/clothes.dashboard.component';
import { GachaDashboardComponent } from './component/dashboard/analytics/gacha.dashboard.component';
import { CaptureDashboardComponent } from './component/dashboard/analytics/capture.dashboard.component';
import { DeliveryDashboardComponent } from './component/dashboard/analytics/delivery.dashboard.component';
import { GuildDashboardComponent } from './component/dashboard/analytics/guild.dashboard.component';
import { AppComponent } from './app.component';

import {DataService} from './services/data.service';


@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    ClothesDashboardComponent,
    CaptureDashboardComponent,
    DeliveryDashboardComponent,
    GuildDashboardComponent,
    GachaDashboardComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    JsonpModule,
    FormsModule
  ],
  providers: [
    DataService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }