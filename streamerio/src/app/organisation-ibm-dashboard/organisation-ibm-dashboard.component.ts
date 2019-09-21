import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from 'src/app/service/authentication.service';
import { ActivityService } from '../service/activity.service';
import { Subject } from 'rxjs';
@Component({
  selector: 'app-organisation-ibm-dashboard',
  templateUrl: './organisation-ibm-dashboard.component.html',
  styleUrls: ['./organisation-ibm-dashboard.component.scss']
})
export class OrganisationIbmDashboardComponent implements OnInit {
  barChartData: any = new Subject();
  pieChartData:any =new Subject();
  constructor(
    private authenticationService: AuthenticationService,
     private router: Router, private activity: ActivityService) { 

     }

  ngOnInit() {

    this.activity.getActivities().subscribe(data => {
      console.log(data)
      this.populateBarChartData(data)
      this.populatePieChartData(data)
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
    console.log(lables)
    console.log("SCORES:::", Negative, Positive, VeryNegative, VeryPositive, Neutral)

    this.barChartData.next({
      xAxisData : [VeryNegative, Negative, Neutral, Positive, VeryPositive],
      lables : ["Very Negative", "Negative", "Neutral", "Positive", "Very Positive"],
      ymax: ymax,
      ymin: ymin
    }) 
}
populatePieChartData(data){
  let general=0
  let hr=0
  let product=0
  let marketing=0
  let labels=[]
  let plotData=new Array(labels.length)
  data.map(e=>{
    if(labels.indexOf(e.subdomain) ==-1){
      labels.push(e.subdomain);
    }
    if(e.subdomain == "HUMAN RESOURCES"){
      hr++
    }else if(e.subdomain == "Products And Services"){
      product++
    }
    else if(e.subdomain == "Marketing"){
      marketing++
    }else if(e.subdomain == "General"){
      general++
    }    
})
console.log(labels)
console.log(general,hr,product,marketing)

this.pieChartData.next({
plotData:[hr,product,marketing,general],
labels : ["Human Resource","Producta & Services","Marketing","General"],
}) 
}
logout() {
  this.authenticationService.logout();
  this.router.navigate(['']);
}

}
