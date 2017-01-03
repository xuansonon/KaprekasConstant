import java.io.*;
import java.lang.Math;
import java.util.*;

class KaprekasRoutine {
  List<Integer> digits;
  int initialNumber;

  KaprekasRoutine(int aNumber) {
    digits = new ArrayList<Integer>();
    initialNumber = aNumber;
    digits = seperateDigits(aNumber);
  }

  public List<Integer> seperateDigits(int aNumber) {
    int number = aNumber;
    List<Integer> allDigts = new ArrayList<Integer>();
    while(number > 0) {
      allDigts.add(number % 10);
      number /= 10;
    }
    return allDigts;
  }

  public Integer returnLargestInteger(List<Integer> aList) {
    return Collections.max(aList);
  }

  public Integer returnSmallestInteger(List<Integer> aList) {
    return Collections.min(aList);
  }

  public List<Integer> duplicateList(List<Integer> aList) {
    List<Integer> newList = new ArrayList<Integer>();
    for(int i = 0; i < aList.size(); i++) {
      newList.add(aList.get(i));
    }
    return newList;
  }

  public Integer returnLargestNumber(List<Integer> aList) {
    List<Integer> allDigits = duplicateList(aList);
    int result = 0;
    while(allDigits.size() != 0) {
      result += returnLargestInteger(allDigits) * Math.pow(10.0, (allDigits.size() - 1) * 1.0);
      allDigits.remove(returnLargestInteger(allDigits));
    }
    return result;
  }

  public Integer returnSmallestNumber(List<Integer> aList) {
    List<Integer> allDigts = duplicateList(aList);
    int result = 0;
    while(allDigts.size() > 0) {
      result += returnSmallestInteger(allDigts) * Math.pow(10.0, (allDigts.size() - 1) * 1.0);
      allDigts.remove(returnSmallestInteger(allDigts));
    }
    return result;
  }

  public void doRoutine() {
    int iterations = 0;
    int result = returnLargestNumber(digits) -  returnSmallestNumber(digits);
    while(result != 6174) {
      List<Integer> newDigits = seperateDigits(result);
      result = returnLargestNumber(newDigits) -  returnSmallestNumber(newDigits);
      iterations++;
    }
    System.out.println("KaprekasRoutine(" + initialNumber + ") = " + iterations + " iterations.");
  }

  public static String getInput(String aMessage) {
    System.out.print(aMessage);
    String result = null;
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      result = br.readLine();
    } catch(IOException e) {
      System.out.println("IOException: Bad input.");
    }
    return result;
  }
  public static Integer stringToInt(String aInput) {
    int result = -1;
    try {
      result = Integer.parseInt(aInput);
    } catch(NumberFormatException e) {
      System.out.println("NumberFormatException: Could not convert string to integer.");
    }
    return result;
  }

  public static void main(String[] args) {
    int userInputNumber = stringToInt(getInput("Enter any 4 digit number: "));
    KaprekasRoutine aRoutine = new KaprekasRoutine(userInputNumber);
    aRoutine.doRoutine();
  }
}
