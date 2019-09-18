import { Component, OnInit, OnChanges, Input } from '@angular/core';
import * as Chart from 'chart.js';
import { Subject } from 'rxjs';
@Component({
  selector: 'app-bar-chart',
  templateUrl: './bar-chart.component.html',
  styleUrls: ['./bar-chart.component.scss']
})
export class BarChartComponent implements OnInit {
  
 
  barChart: any;
  
  constructor() { 
    
  }

  @Input()
  data: any;
  
  ngOnInit() {
    let inputData = {
      ymax: 0,
      ymin: 0,
      lables: [],
      xAxisData: [],

    }
    this.data.subscribe(data => {
        inputData = data
        console.log(data)
        let plot = {
          type: 'bar',
          options: {
            scales: {
    
              yAxes: [{
                ticks: {
                  max: inputData.ymax,
                  min: inputData.ymin,
                  stepSize: 1
                },
              }]
            },
            responsive: true,
          },
          data: {
            labels: inputData.lables,
            datasets: [
              {
                type: 'bar',
                label: 'sentiment score',
                data: inputData.xAxisData.filter(e => e !== 0),
                backgroundColor: 'rgba(244,67,54)',
                fill: false,
              }
            ]
          },
    
        }
        console.log(inputData.xAxisData)
        this.barChart = new Chart('bar', plot);
    })
    
    
  }

}
