import {Component, OnInit} from '@angular/core';
import { ChartOptions, ChartType, ChartDataSets } from 'chart.js';
import { Label } from 'ng2-charts';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  title = 'Average annual software developer salary';

  barChartOptions: ChartOptions = {
    responsive: true,
  };
  barChartLabels: Label[];
  barChartType: ChartType = 'bar';
  barChartLegend = true;
  barChartPlugins = [];

  barChartData: ChartDataSets[] = [];

  constructor(private http: HttpClient) {}

  ngOnInit() {

    this.http.get<any[]>(`http://localhost:8080/api/v1/stats`).subscribe(data=> {
      this.barChartLabels = data.map(item=>item.country);
      this.barChartData =  [
        { data: data.map(item=>item.salary), label: 'Countries' }
      ];

    });

  }



}
