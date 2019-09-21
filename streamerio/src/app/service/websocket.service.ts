import { Injectable } from '@angular/core';
import * as Stomp from 'stompjs';
import * as SockJS from 'sockjs-client';
import $ from 'jquery';
import { Subject } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class WebsocketService {

  private serverUrl = 'http://13.235.223.235:8091/websocket-example';
  private title = 'WebSockets chat';
  private stompClient;
  public PoliticalSuject = new Subject();
  public IBMSubject =  new Subject();
  constructor() {

    this.initializeWebSocketConnection();
   }

  initializeWebSocketConnection(){
    console.log("here", this.serverUrl)
    let ws = new SockJS(this.serverUrl);
    this.stompClient = Stomp.over(ws);
    let that = this;
    this.stompClient.connect({}, (frame)  => {
      that.stompClient.subscribe("/topic/PoliticalDomainNda", (message) => {
        this.PoliticalSuject.next(message.body)
        console.log(message)
      });
      this.stompClient.subscribe("/topic/OrganizationDomainIbm", message => {
        this.IBMSubject.next(message)
      });
    });
  }
}
