import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-age',
  templateUrl: './age.component.html',
  styleUrls: ['./age.component.css']
})
export class AgeComponent implements OnInit {

  name: string = "";
  age: number = 0;

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  getAge() {
    let url = "http://localhost:8080/age/" + this.name;
    this.http.get<number>(url).subscribe(result => {
      this.age = result;
    }, error => {
      console.log(error);
    });
  }
}
