import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule,JsonpModule} from '@angular/http';

import { DashboardComponent } from './component/dashboard/dashboard.component';
import { AppComponent } from './app.component';

import {DataService} from './services/data.service';


@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent
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