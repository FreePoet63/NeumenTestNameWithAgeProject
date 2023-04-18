import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-frequencies',
  templateUrl: './frequencies.component.html',
  styleUrls: ['./frequencies.component.css']
})
export class FrequenciesComponent implements OnInit {
  frequencies: any;

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.http.get<any>('http://localhost:8080/frequencies').subscribe(data => {
      this.frequencies = data;
    });
  }
}
