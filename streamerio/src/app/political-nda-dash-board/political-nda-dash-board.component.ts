import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from 'src/app/service/authentication.service';
import { ActivityService } from '../service/activity.service';
import { Subject } from 'rxjs';

@Component({
  selector: 'app-political-nda-dash-board',
  templateUrl: './political-nda-dash-board.component.html',
  styleUrls: ['./political-nda-dash-board.component.scss']
})
export class PoliticalNDADashBoardComponent implements OnInit {
  barChartData: any = new Subject();

  constructor(private authenticationService: AuthenticationService, private router: Router, private activity: ActivityService) {

  }

  ngOnInit() {

    this.activity.getActivities().subscribe(data => {
      console.log(data)
      this.populateBarChartData(data)

    })

  }

  populateBarChartData(data){
      let ymax = data.length
      let ymin = 0
      let ystepSize = data.length / (data.length/2)
      let responsive = true
      let lables = []
      let xAxisData = new Array(lables.length);
      let Negative = 0
      let Positive = 0
      let Neutral = 0
      let VeryNegative = 0
      let VeryPositive = 0

      data.map(e => {
        if(lables.indexOf(e.sentimentResult.sentimentType) == -1){
          lables.push(e.sentimentResult.sentimentType);
        }
        if(e.sentimentResult.sentimentType == ("Very Negative" || "very negative")) {
          VeryNegative++
        }  else if (e.sentimentResult.sentimentType == ("Negative" || "negative")) {
          Negative++
        }else if (e.sentimentResult.sentimentType == ("Neutral" || "neutral")){
          Neutral++
        }else if(e.sentimentResult.sentimentType == ("Positive" || "positive")){
          Positive++
        }else if (e.sentimentResult.sentimentType == ("Very Postivive" || "very positive")){
          VeryPositive++
        }
      })
      lables = lables.sort();

      console.log(lables)
      console.log("SCORES:::", Negative, Positive, VeryNegative, VeryPositive, Neutral)

      this.barChartData.next({
        xAxisData : [VeryNegative, Negative, Neutral, Positive, VeryPositive],
        lables : lables,
        ymax: ymax,
        ymin: ymin
      }) 
      
  }
  logout() {
    this.authenticationService.logout();
    this.router.navigate(['']);
  }
}
