import { Component, OnInit } from '@angular/core';
import * as Chart from 'chart.js';
@Component({
  selector: 'app-pie-chart',
  templateUrl: './pie-chart.component.html',
  styleUrls: ['./pie-chart.component.scss']
})
export class PieChartComponent implements OnInit {
piechart:any
  constructor() { }

  ngOnInit() {
   this.piechart=new Chart('pie',
    {
      type:'pie',
      options:{
        responsive:true,
       legend:{
         position:'top',},
         animation:{
           animateScale:true,
           animateRotate:true
         }
       },
       data:{
         datasets:[{
           data:[45,30,50,25,15],
           backgroundColor:["red","orange","brown","green","blue"],
           label:'dataset'
         }],
         labels:['Human Resource','Finance','Health','External Affairs','General']
       }
      
    })
}

  }


