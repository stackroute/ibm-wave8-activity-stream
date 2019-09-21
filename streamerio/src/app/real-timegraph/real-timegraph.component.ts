import { Component, OnInit, ViewChild, ElementRef, AfterViewInit } from '@angular/core';
import * as Chart from 'chart.js';
import { WebsocketService } from 'src/app/service/websocket.service';
import  * as moment from 'moment';

@Component({
    selector: 'app-real-timegraph',
    templateUrl: './real-timegraph.component.html',
    styleUrls: ['./real-timegraph.component.scss']
})
export class RealTimegraphComponent implements OnInit, AfterViewInit {
    @ViewChild('realTimeLineChart', { static: false })
    canvas: ElementRef

    myChart
    
    constructor(private socket: WebsocketService) { }

    ngOnInit() {
        console.log(this.canvas)
    }

    ngAfterViewInit() {
        // this.socket.initializeWebSocketConnection();
        this.socket.PoliticalSuject.subscribe((data: any) => {
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

// import { Component, OnInit, ViewChild, ElementRef, AfterViewInit } from '@angular/core';
// import * as Chart from 'chart.js';

// @Component({
//   selector: 'app-real-timegraph',
//   templateUrl: './real-timegraph.component.html',
//   styleUrls: ['./real-timegraph.component.scss']
// })
// export class RealTimegraphComponent implements OnInit, AfterViewInit {
//   @ViewChild('realTimeLineChart', {static: false})
//   canvas : ElementRef
//   myChart
//   constructor() { }

//   ngOnInit() {
//     console.log(this.canvas)
//   }

//   ngAfterViewInit() {
//     console.log(this.canvas)

//     this.myChart = new Chart(this.canvas.nativeElement, {
//         type: 'line',
//         data: {
//             datasets: [{
//                 label: 'Number of Tweets',
//                 data: [0, 20, 40, 50,100,450,200],
//                 fill:false,
//                 borderColor:'rgb(0,0,255)',
//                 backgroundColor:"white"
//             }],
//             labels: ['7.0 AM', '8.0 AM', '9.0 AM', '10.0 AM','11.0 AM','12.0 AM','1.0 PM']
//         },
//         options: {
//             legend:{
//                 display:false
//             },
//             elements: {
//                 line: {
//                     tension: 0 // disables bezier curves
//                 }
//             },
//             scales: {
//                 xAxes:[
//                     {
//                         gridLines:{
//                             display:false
//                         }
//                     }
//                 ],
//                 yAxes: [{
//                     ticks: {
//                         suggestedMin: 50,
//                         suggestedMax: 100
//                     }
//                 }]
//             }
//         }
//     });
//   }

// //   

// }
