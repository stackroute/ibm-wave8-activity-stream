import { Component, OnInit, OnDestroy } from '@angular/core';
import { Router } from '@angular/router';
import{AuthenticationService} from 'src/app/service/authentication.service'
import { Subscription, from } from 'rxjs';
import {Chart} from 'chart.js'
import { ChartsModule } from 'ng2-charts';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit{
    currentUserSubscription: Subscription;  
    chart:any; 
    barchart:any;
  constructor( 
    private authenticationService: AuthenticationService,
    private router: Router
  ) { }

  ngOnInit() {
    this.chart=new Chart('canvas',{
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
       this.barchart=new Chart('bar',
       {
         type:'bar',
         options:{
           responsive:true,
          //  title:{
          //    display:true,
          //    text:'Sentiment Analysis'
          //  },
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
          }
       });
       new Chart('pie',
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

  logout() {
    this.authenticationService.logout();
    this.router.navigate(['']);
}
}
