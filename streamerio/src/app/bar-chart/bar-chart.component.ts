import { Component, OnInit } from '@angular/core';
import * as Chart from 'chart.js';
@Component({
  selector: 'app-bar-chart',
  templateUrl: './bar-chart.component.html',
  styleUrls: ['./bar-chart.component.scss']
})
export class BarChartComponent implements OnInit {
barchart:any
  constructor() { }

  ngOnInit() {
    this.barchart=new Chart('bar',
       {
         type:'bar',
         options:{
           responsive:true,
          },
          data:{
            labels:['very negative','negative','neutral','positive','very positive'],
            datasets:[
              {
                type:'bar',
                label:'sentiment score',
                data:[443,256,165,1000,356],
                backgroundColor:'rgba(255,0,255,0.4)',
                fill:false,
              }
            ]
          },
          
       },
       );
  }

}
