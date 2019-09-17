import { Component, OnInit } from '@angular/core';
import * as Chart from 'chart.js'
@Component({
  selector: 'app-multi-line-chart',
  templateUrl: './multi-line-chart.component.html',
  styleUrls: ['./multi-line-chart.component.scss']
})
export class MultiLineChartComponent implements OnInit {
linechart:any
  constructor() { }

  ngOnInit() {
    this.linechart=new Chart('canvas',{
      type:'line',
      data:{
      labels:['Jan','Feb','March','April','May','June'],
       datasets:[
             {
               label:'Negative Tweets',
               data:[300,600,100,800,200,500],
               backgroundColor:'red',
               borderColor:'red',
               fill:false
              } ,
              {
                label:'Neutral Tweets',
                data:[100,300,500,100,400,100],
                backgroundColor:'blue',
                borderColor:'blue',
                fill:false
              },
              {
                label:'Positive Tweets',
                data:[700,100,300,250,600,300],
                backgroundColor:'green',
                borderColor:'green',
                fill:false
              }
          ]
        },
        options:{
          responsive:true,
          tooltips:{
            mode:'index',
            intersect:false,
          },
          hover:{
            mode:'nearest',
            intersect:true
          },
          scales:{
            xAxes:[{
                display:true,
                scaleLabel:{
                  display:true,
                  labelString:'Month'
                }
              }],
              yAxes:[{
                display:true,
                scaleLabel:{
                  display:true,
                  labelString:'Number of Tweets'
                }
              }]
          }
          }
  
       })
  }

}
