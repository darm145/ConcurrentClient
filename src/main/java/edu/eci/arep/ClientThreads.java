package edu.eci.arep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class ClientThreads extends Thread{ 
    private URL url;
    public ClientThreads(URL url){
        this.url=url;
    }
    
  public  void run() { 
      for(int i =0;i<20;i++){
          try (BufferedReader reader = new BufferedReader(
          new InputStreamReader(url.openStream()))) { 
            String inputLine = null; 
            while ((inputLine = reader.readLine()) != null) { 
             } 
       } catch (IOException x) { 
               System.err.println(x); 
       } 
          
      }
    } 
}