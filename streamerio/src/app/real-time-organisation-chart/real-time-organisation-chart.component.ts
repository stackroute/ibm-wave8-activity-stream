import { Component, OnInit, ViewChild, ElementRef, AfterViewInit } from '@angular/core';
import * as Chart from 'chart.js';
import { WebsocketService } from 'src/app/service/websocket.service';
import  * as moment from 'moment';

@Component({
  selector: 'app-real-time-organisation-chart',
  templateUrl: './real-time-organisation-chart.component.html',
  styleUrls: ['./real-time-organisation-chart.component.scss']
})
export class RealTimeOrganisationChartComponent implements OnInit,AfterViewInit {

  @ViewChild('realTimeLineOrganisationChart', { static: false })
  canvas: ElementRef

  myChart
  
  constructor(private socket: WebsocketService) { }

  ngOnInit() {
      console.log(this.canvas)
  }

  ngAfterViewInit() {
      this.socket.initializeWebSocketConnection();
      this.socket.IBMSubject.subscribe((data: any) => {
          console.log(data, "????????")
          data = JSON.parse(data)
          console.log(sentimentScore)
          let score = parseInt(data.sentimentResult.sentimentScore)
          console.log(score)
          let singleTimeUnit = moment(parseInt(data.timestamp)).format('HH').toString()
          sentimentScore.unshift(score)
          labels.unshift(singleTimeUnit)
          plot.data.datasets[0].data.push(score)
          plot.data.labels.push(singleTimeUnit)
          labels.push()    
          console.log(sentimentScore)
          console.log(labels)  
          this.myChart.update();
      })
          let sentimentScore = []
          let labels = []
          let plot = {
              type: 'line',
              data: {
                  datasets: [{
                      label: 'Number of Tweets',
                      data: [],
                      fill: false,
                      borderColor: 'rgb(0,0,255)',
                      backgroundColor: "white"
                  }],
                  labels: []
              },
              options: {
                  elements: {
                      line: {
                          tension: 0 // disables bezier curves
                      }
                  },
                  legend:{
                      display:false
                  },
                  scales: {
                      yAxes: [{
                          ticks: {
                              suggestedMin: 0,
                              suggestedMax: 6
                          }
                      }]
                  }
              }
          }
          this.myChart = new Chart(this.canvas.nativeElement, plot);


  }

  //   

}

