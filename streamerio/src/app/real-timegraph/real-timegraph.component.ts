import { Component, OnInit, ViewChild, ElementRef, AfterViewInit } from '@angular/core';
import * as Chart from 'chart.js';
import { WebsocketService } from '../websocket.service';
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
        this.socket.initializeWebSocketConnection();
        this.socket.PoliticalSuject.subscribe((data: any) => {
            console.log(data, "????????")
            data = JSON.parse(data)
            console.log(sentimentScore)
            let score = parseInt(data.sentimentResult.sentimentScore)
            console.log(score)
            let singleTimeUnit = moment(parseInt(data.timestamp)).format('HH-MM-SS').toString()
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
