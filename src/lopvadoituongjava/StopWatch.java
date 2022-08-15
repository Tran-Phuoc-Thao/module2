package lopvadoituongjava;
import java.time.LocalTime;
public class StopWatch {
    private LocalTime startTime, endTime;


    public StopWatch(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void start(){
        startTime=LocalTime.now();
    }

    public void stop(){
        endTime=LocalTime.now();
    }

    public int getElapsedTime(){
        int miliSecond = ((endTime.getHour()-startTime.getHour())*3600 + (endTime.getMinute()-startTime.getMinute())*60 + (endTime.getSecond()-startTime.getSecond())*1000);
        return miliSecond;
    }
    public static int[] selectionSort(int...a){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[i]){
                    int tempt = a[i];
                    a[i]=a[j];
                    a[j]=tempt;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int Arr[]= new int [100000];
        for (int i = 0; i < 100000; i++) {
            Arr[i]=(int)(Math.random()*10000);
        }
        LocalTime start = LocalTime.now();
        Arr = selectionSort(Arr);
        LocalTime end = LocalTime.now();
        StopWatch sw = new StopWatch(start, end);
        System.out.println("Time: "+sw.getElapsedTime());

    }
}
