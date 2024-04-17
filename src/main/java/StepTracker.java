import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 int min, totalSteps, totalDays, activeDays;
 StepTracker(int steps){
  min = steps;
  totalSteps = 0;
  totalDays = 0;
  activeDays = 0;
 }
 public addDailySteps(int x){
  totalSteps += x;
  totalDays ++;
  if (x >= min){
   activeDays++;
  }
 }
 public int activeDays(){
  return activeDays;
 }
 public double averageSteps(){
  return (double)totalSteps/totalDays;
 }
} 
 
