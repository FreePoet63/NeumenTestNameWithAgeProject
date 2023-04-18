import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AgeComponent } from './age/age.component';

import 'bootstrap';
import { FrequenciesComponent } from './frequencies/frequencies.component';
import { MaxAgeComponent } from './max-age/max-age.component';

@NgModule({
  declarations: [
    AppComponent,
    AgeComponent,
    FrequenciesComponent,
    MaxAgeComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
