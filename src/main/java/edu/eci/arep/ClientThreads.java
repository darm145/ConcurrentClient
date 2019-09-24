package edu.eci.arep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ClientThreads extends Thread{ 
    private URL url;
    private long duration;
  
    public ClientThreads(URL url){
        this.url=url;
       
    }
    
  public  void run() {
      long start=System.nanoTime();
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
      long end=System.nanoTime();
      duration=end-start;
      System.out.println(TimeUnit.NANOSECONDS.toSeconds(duration));
    }
  
}