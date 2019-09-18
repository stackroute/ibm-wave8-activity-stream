import { Component, OnInit, ViewChild, ElementRef, AfterViewInit } from '@angular/core';
import * as Chart from 'chart.js';

@Component({
  selector: 'app-real-timegraph',
  templateUrl: './real-timegraph.component.html',
  styleUrls: ['./real-timegraph.component.scss']
})
export class RealTimegraphComponent implements OnInit, AfterViewInit {
  @ViewChild('realTimeLineChart', {static: false})
  canvas : ElementRef
  myChart
  constructor() { }

  ngOnInit() {
    console.log(this.canvas)
  }

  ngAfterViewInit() {
    console.log(this.canvas)


    // this.myChart = new Chart(this.canvas.nativeElement, {
    //       type: 'line',
    //       data: {
    //           labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
    //           datasets: [{
    //               label: '# of Votes',
    //               data: [100, 20, 50, 200, 436, 800],
    //               backgroundColor: [
    //                   'rgba(255, 99, 132, 0.2)',
    //                   'rgba(54, 162, 235, 0.2)',
    //                   'rgba(255, 206, 86, 0.2)',
    //                   'rgba(75, 192, 192, 0.2)',
    //                   'rgba(153, 102, 255, 0.2)',
    //                   'rgba(255, 159, 64, 0.2)'
    //               ],
    //               borderColor: [
    //                   'rgba(255, 99, 132, 1)',
    //                   'rgba(54, 162, 235, 1)',
    //                   'rgba(255, 206, 86, 1)',
    //                   'rgba(75, 192, 192, 1)',
    //                   'rgba(153, 102, 255, 1)',
    //                   'rgba(255, 159, 64, 1)'
    //               ],
    //               borderWidth: 1
    //           }]
    //       },
    //       options: {
    //           scales: {
    //               yAxes: [{
    //                   ticks: {
    //                       beginAtZero: true
    //                   }
    //               }]
    //           }
    //       }
    //   });
    this.myChart = new Chart(this.canvas.nativeElement, {
        type: 'line',
        data: {
            datasets: [{
                label: 'Number of Tweets',
                data: [0, 20, 40, 50,100,450,200],
                fill:false,
                borderColor:'rgb(0,0,255)',
                backgroundColor:"white"
            }],
            labels: ['7.0 AM', '8.0 AM', '9.0 AM', '10.0 AM','11.0 AM','12.0 AM','1.0 PM']
        },
        options: {
            legend:{
                display:false
            },
            elements: {
                line: {
                    tension: 0 // disables bezier curves
                }
            },
            scales: {
                yAxes: [{
                    ticks: {
                        suggestedMin: 50,
                        suggestedMax: 100
                    }
                }]
            }
        }
    });
  }

//   

}
