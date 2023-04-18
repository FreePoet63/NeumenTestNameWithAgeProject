import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-max-age',
  templateUrl: './max-age.component.html',
  styleUrls: ['./max-age.component.css']
})
export class MaxAgeComponent implements OnInit {

    name: string = "";
    age: number = 0;

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.http.get<Map<string, number>>('http://localhost:8080/max-age').subscribe((data: any) => {
      this.name = Object.keys(data)[0];
      this.age = data[this.name];
    });
  }
}
