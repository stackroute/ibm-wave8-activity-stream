// In app.component.ts
import {
  Component,
  // NgZone
} from '@angular/core';
import * as FusionCharts from 'fusioncharts';
import { HttpClient } from '@angular/common/http'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
})
export class AppComponent {
  dataSource: any;
  type: string;
  width: string;
  height: string;
  constructor(private http: HttpClient) {
    this.type = 'timeseries';
    this.width = '50%';
    this.height = '400';
    // This is the dataSource of the chart
    this.dataSource = {
      // Initially data is set as null
      data: null,
      chart: {
        showLegend: 0
      },
      caption: {
        text: 'Daily Visitors Count of a Website'
      },
      yAxis: [
        {
          plot: {
            value: 'Daily Visitors',
            type: 'area'
          },
          title: 'Daily Visitors (in thousand)'
        }
      ]
    };
    this.fetchData();
  }

  // In this method we will create our DataStore and using that we will create a custom DataTable which takes two
  // parameters, one is data another is schema.
  fetchData() {
    // var jsonify = res => res.json();
    // var dataFetch = fetch(
    //   'https://s3.eu-central-1.amazonaws.com/fusion.store/ft/data/area-chart-with-time-axis-data.json'
    // ).then(jsonify);
    // var schemaFetch = fetch(
    //   'https://s3.eu-central-1.amazonaws.com/fusion.store/ft/schema/area-chart-with-time-axis-schema.json'
    // ).then(jsonify);

    // Promise.all([dataFetch, schemaFetch]).then(res => {
    //   const data = res[0];
    //   const schema = res[1];
    //   // First we are creating a DataStore
    //   const fusionDataStore = new FusionCharts.DataStore();
    //   // After that we are creating a DataTable by passing our data and schema as arguments
    //   const fusionTable = fusionDataStore.createDataTable(data, schema);
    //   // Afet that we simply mutated our timeseries datasource by attaching the above
    //   // DataTable into its data property.
    //   this.dataSource.data = fusionTable;
    // });

    this.http.get('assets/data.json').subscribe(( data : []) => {

      console.log(data)
      let data1 = data
      this.http.get('assets/schema.json').subscribe(( schema : []) => {
        console.log(schema)
        const fusionDataStore = new FusionCharts.DataStore();
          // After that we are creating a DataTable by passing our data and schema as arguments
          const fusionTable = fusionDataStore.createDataTable(data1, schema);
          // Afet that we simply mutated our timeseries datasource by attaching the above
          // DataTable into its data property.
          this.dataSource.data = fusionTable;
          console.log(this.dataSource)
      })
    })
  }

  ngOnInit() {
    
  }
}
