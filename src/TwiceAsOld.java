
public class TwiceAsOld {
    
  public static int TwiceAsOld(int dadYears, int sonYears){    
    for(int i = 0; i <= dadYears; i++){
      if((sonYears + i) * 2 == (dadYears + i))    
        return i;
      else if((sonYears - i) * 2 == (dadYears - i)) 
          return i;
    }
    return -1;
  }
}
    
