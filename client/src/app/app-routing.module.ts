import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AgeComponent } from './age/age.component';
import { FrequenciesComponent } from './frequencies/frequencies.component';
import { MaxAgeComponent } from './max-age/max-age.component';

const routes: Routes = [
   { path: 'age', component: AgeComponent },
   { path: 'frequencies', component: FrequenciesComponent },
   { path: 'max-age', component: MaxAgeComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
