// import { Component, OnInit } from '@angular/core';

// @Component({
//   selector: 'app-home',
//   templateUrl: './home.component.html',
//   styleUrls: ['./home.component.scss']
// })
// export class HomeComponent implements OnInit {

//   constructor() { }

//   ngOnInit() {
//   }

// }
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
      labels:['1','2','3','4','5'],
       datasets:[
             {
               data:[0,4,2,1,3,2,0],
               backgroundColor:'red',
               borderColor:'red',
               fill:false
              } 
          ]
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
