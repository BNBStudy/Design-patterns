package Proxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class JdbcConnectImpl implements JdbcConnect {

   @Override
   public String getUrl(int rowNumber) {
      InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("application.property");
      if (inputStream == null) {
         throw new NullPointerException("File doesnt exsist");
      }
      InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
      BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
      String url;
      int index = 0;

      try {
         while ((url = bufferedReader.readLine()) != null) {
               if (rowNumber == index++) {
                  return url;
               }
            }
         } catch (IOException e){
            throw new RuntimeException("mistake");
         }
      throw  new NullPointerException("URL mistake");
   }
   }



